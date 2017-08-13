package bxtooldemo.adapter.core.delta;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.gson.Gson;
import com.kaleidoscope.core.delta.javabased.JavaBasedEdge;
import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AddNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.AttributeChangeOp;
import com.kaleidoscope.core.delta.javabased.operational.CompositeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.Operation;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import GridLanguage.Group;
import KitchenLanguage.Fridge;
import KitchenLanguage.Item;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.KitchenLanguagePackage;
import KitchenLanguage.Sink;
import KitchenLanguage.Table;
import bxtooldemo.adapter.uimodels.Element;
import bxtooldemo.adapter.uimodels.Rectangle;
import bxtooldemo.adapter.uimodels.UIGroup;;


public class DeltaAdapter {

	
	public OperationalDelta transformIntoSourceOpDelta(String deltaJson, EObject sourceModel){
		
		Gson gson = new Gson();
		Grid grid = (Grid)sourceModel;
		
		GridKitchenDeltaOperation delta = gson.fromJson(deltaJson, GridKitchenDeltaOperation.class);
		OperationalDelta operationalDelta = new OperationalDelta();
		
		List<DeltaGridOperation> gridOperations = delta.getGridOperations();
		
		for (DeltaGridOperation deltaGridOperation : gridOperations) {
			
			switch (deltaGridOperation.getOperationType()) {
			
			case GridKitchenDeltaOperation.GROUP_CREATED_OPERATION:{
				
				
				CompositeOp compositeOperation = new CompositeOp();
				
				UIGroup uiGroup = deltaGridOperation.getAffectedGroup();
				Group group = (Group) GridLanguageFactory.eINSTANCE.createGroup();
				group.setFillColor(uiGroup.getFillColor());
				
				EReference refGridGroups = toReference(grid, "groups");
				JavaBasedEdge gridGroupEdge = new JavaBasedEdge(grid, group, refGridGroups);
				compositeOperation.addOperation(new AddEdgeOp(gridGroupEdge));
				compositeOperation.addOperation(new AddNodeOp(group));
				
				for(Rectangle rect : uiGroup.getBlocks()){
						
					Block block = grid.getBlocks().stream().filter(x -> x.getXIndex() == rect.getxIndex() && x.getYIndex() == rect.getyIndex()).findFirst().orElse(null);
	
					EReference ref = toReference(group, "occupies");	
					JavaBasedEdge javaBasedEdge = new JavaBasedEdge(group, block, ref);
					compositeOperation.addOperation(new AddEdgeOp(javaBasedEdge));																			
				}
				operationalDelta.addOperation(compositeOperation);
				break;
			}	
			case GridKitchenDeltaOperation.GRUPD_DELETED_OPERATION:{
				CompositeOp compositeOperation = new CompositeOp();
				
				UIGroup uiAffectedGroup = deltaGridOperation.getAffectedGroup();
				Group matchGroup = null;							
				out:
				for (Group group : grid.getGroups()){
					for (Block block : group.getOccupies()){
						if (block.getXIndex() == uiAffectedGroup.getBlocks().get(0).getxIndex() && block.getYIndex() == uiAffectedGroup.getBlocks().get(0).getyIndex()){
							matchGroup = group;
							break out;
						}
					}
				}
				EReference ref = toReference(grid, "groups");
				compositeOperation.addOperation(new DeleteEdgeOp(new JavaBasedEdge(grid, matchGroup, ref)));
				compositeOperation.addOperation(new DeleteNodeOp(matchGroup));		
				
				operationalDelta.addOperation(compositeOperation);
				break;
			}	
			default:
				break;
				
			}			
		}
		
		return operationalDelta;
	}
	
	public OperationalDelta transformIntoTargetOpDelta(String deltaJson, EObject targetModel){
		
		Gson gson = new Gson();
		GridKitchenDeltaOperation delta = gson.fromJson(deltaJson, GridKitchenDeltaOperation.class);
		List<DeltaKitchenOperation> kitchenOperations = delta.getKitchenOperations();
		OperationalDelta operationalDelta = new OperationalDelta();
		Kitchen kitchen = (Kitchen)targetModel;
		
		
		for (DeltaKitchenOperation deltaKitchenOperation : kitchenOperations) {
			Element element = deltaKitchenOperation.getAffectedElement();
			
			switch (deltaKitchenOperation.getOperationType()) {
			
				case GridKitchenDeltaOperation.ELEMENT_CREATED_OPERATION:{
						
					CompositeOp compositeOperation = new CompositeOp();
					
					ItemSocket itemSocket = KitchenLanguageFactory.eINSTANCE.createItemSocket();
					itemSocket.setId(element.getId());
										
					String type = element.getType();
					EClass eClass = (EClass) KitchenLanguagePackage.eINSTANCE.getEClassifier(type);			
					Item item = (Item) KitchenLanguageFactory.eINSTANCE.create(eClass);
					item.setXPos(element.getPosX());
					item.setYPos(element.getPosY());
					
					EReference itemSocketRef = toReference(kitchen, "itemSockets");
					compositeOperation.addOperation(new AddEdgeOp(new JavaBasedEdge(kitchen, itemSocket, itemSocketRef)));
					compositeOperation.addOperation(new AddNodeOp(itemSocket));
					
					EReference itemRef = toReference(itemSocket, "item");
					compositeOperation.addOperation(new AddEdgeOp(new JavaBasedEdge(itemSocket, item, itemRef)));
					compositeOperation.addOperation(new AddNodeOp(item));
					
					operationalDelta.addOperation(compositeOperation);
					break;
				}
				case GridKitchenDeltaOperation.ELEMENT_DELETED_OPERATION:{
					CompositeOp compositeOperation = new CompositeOp();
					
					
					ItemSocket itemSocket =  kitchen.getItemSockets().stream().filter(x -> x.getId().equals(element.getId())).findFirst().orElse(null);
					EReference itemRef = toReference(itemSocket, "item");
					compositeOperation.addOperation(new DeleteEdgeOp(new JavaBasedEdge(itemSocket, itemSocket.getItem(), itemRef)));
					compositeOperation.addOperation(new DeleteNodeOp(itemSocket.getItem()));
					
					EReference itemSocketsRef = toReference(kitchen, "itemSockets");
					compositeOperation.addOperation(new DeleteEdgeOp(new JavaBasedEdge(kitchen, itemSocket, itemSocketsRef)));
					compositeOperation.addOperation(new DeleteNodeOp(itemSocket));
					
					operationalDelta.addOperation(compositeOperation);
					break;
				}
				case GridKitchenDeltaOperation.ELEMENT_MOVED_OPERATION:{
					CompositeOp compositeOperation = new CompositeOp();
					
					ItemSocket itemSocket = kitchen.getItemSockets().stream().filter(x -> x.getId().equals(element.getId())).findFirst().orElse(null);
					EAttribute xSizeAttr = toAttribute(itemSocket.getItem(), "xPos");
					EAttribute ySizeAttr = toAttribute(itemSocket.getItem(), "yPos");
					
					compositeOperation.addOperation(new AttributeChangeOp(xSizeAttr, element.getPosX(), itemSocket.getItem()));
					compositeOperation.addOperation(new AttributeChangeOp(ySizeAttr, element.getPosY(), itemSocket.getItem()));					
					
					operationalDelta.addOperation(compositeOperation);
					break;
				}
				default:
					break;
			}
		}
		return operationalDelta;
		
	}
	private EReference toReference(EObject src, String refName){
		   return src.eClass().getEAllReferences()
				   .stream()
				   .filter(r -> r.getName().equals(refName))
				   .findAny()
				   .get();   
	}
	private EAttribute toAttribute(EObject src, String attributeName){
		return src.eClass().getEAllAttributes()
						.stream()
						.filter(a -> a.getName().equals(attributeName))
						.findAny()
						.get();
	}
	private String getItemName(Item item){
		if(item instanceof Fridge)
			  return "Fridge";
			else if(item instanceof Table)
				return "Tabe";
			else if(item instanceof Sink)
				return "Sink";
			else
				return "";
	}
	public String generateFailedDeltaOperationMessage(OperationalDelta syncReport){
		
		String failedDeltaMsg = "";
		
		for (Operation op : syncReport.getOperations()) {
			if(op instanceof CompositeOp){
				
				CompositeOp compositeOp = (CompositeOp) op;
				
				for(Operation atomicOperation : compositeOp.getOperations()){
					
					if(atomicOperation instanceof AddEdgeOp){
						EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
						
						if(edgeTarget instanceof Block){
							failedDeltaMsg +=  " Creation of Group";
							break;
						}
						else if(edgeTarget instanceof Item){
							failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
							break;							
						}
					}
					
					else if(atomicOperation instanceof DeleteEdgeOp){
						EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
						
						if(edgeTarget instanceof Block){
							failedDeltaMsg +=  " Deletion of Group";
							break;
						}
						else if(edgeTarget instanceof Item){
							failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
							break;
						}
					}
					else if(atomicOperation instanceof AttributeChangeOp){
						EObject affectedNode = ((AttributeChangeOp) atomicOperation).getAffectedNode();
						if(affectedNode instanceof Item){
							failedDeltaMsg +=  " Movement of " + getItemName((Item)affectedNode);
							break;
						}
					}
				}
				
				

			}				
		}
		return failedDeltaMsg;
	}
}
