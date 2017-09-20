package com.bxtooldemo.delta;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.bxtooldemo.uimodels.Element;
import com.google.gson.Gson;
import com.kaleidoscope.core.delta.javabased.JavaBasedEdge;
import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AddNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.AttributeChangeOp;
import com.kaleidoscope.core.delta.javabased.operational.CompositeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;

import KitchenLanguage.Item;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.KitchenLanguagePackage;

public class KitchenToStringDeltaAdapter implements DeltaAdapter<OperationalDelta, String, Kitchen>{

	@Override
	public OperationalDelta parse(String deltaJson, Kitchen kitchen) {
		Gson gson = new Gson();
		GridKitchenDeltaOperation delta = gson.fromJson(deltaJson, GridKitchenDeltaOperation.class);
		return transGridKitchenDeltaOpIntoOpDelta(delta, kitchen);
	}

	@Override
	public String unparse(OperationalDelta d, Kitchen a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private OperationalDelta transGridKitchenDeltaOpIntoOpDelta(GridKitchenDeltaOperation delta, Kitchen kitchen) {
		OperationalDelta operationalDelta = new OperationalDelta();
		List<DeltaKitchenOperation> kitchenOperations = delta.getKitchenOperations();
		
		for(DeltaKitchenOperation deltaKitchenOperation : kitchenOperations) {
			Element element = deltaKitchenOperation.getAffectedElement();
			
			switch(deltaKitchenOperation.getOperationType()) {
			
				case GridKitchenDeltaOperation.ELEMENT_CREATED_OPERATION: {
					transElemCreatedOpIntoOpDeltaOperation(element, kitchen, operationalDelta);
					break;
				}
				case GridKitchenDeltaOperation.ELEMENT_DELETED_OPERATION: {
					transformElementDeletedOperationIntoOpDeltaOperation(element, kitchen, operationalDelta);
					break;
				}
				case GridKitchenDeltaOperation.ELEMENT_MOVED_OPERATION: {
					transformElementMovedOperationIntoOpDeltaOperation(element, kitchen, operationalDelta);
					break;
				}
				default:
					break;
			}
		}
		
		
		return operationalDelta;
	}
	
	private OperationalDelta transElemCreatedOpIntoOpDeltaOperation(Element element, Kitchen kitchen, OperationalDelta operationalDelta) {
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
		return operationalDelta;
	}
	
	private OperationalDelta transformElementDeletedOperationIntoOpDeltaOperation(Element element, Kitchen kitchen, OperationalDelta operationalDelta) {
		CompositeOp compositeOperation = new CompositeOp();
		
		ItemSocket itemSocket =  kitchen.getItemSockets().stream().filter(x -> x.getId().equals(element.getId())).findFirst().orElse(null);
		EReference itemRef = toReference(itemSocket, "item");
		compositeOperation.addOperation(new DeleteEdgeOp(new JavaBasedEdge(itemSocket, itemSocket.getItem(), itemRef)));
		compositeOperation.addOperation(new DeleteNodeOp(itemSocket.getItem()));
		
		EReference itemSocketsRef = toReference(kitchen, "itemSockets");
		compositeOperation.addOperation(new DeleteEdgeOp(new JavaBasedEdge(kitchen, itemSocket, itemSocketsRef)));
		compositeOperation.addOperation(new DeleteNodeOp(itemSocket));
		
		operationalDelta.addOperation(compositeOperation);
		
		return operationalDelta;
	}
	
	private OperationalDelta transformElementMovedOperationIntoOpDeltaOperation(Element element, Kitchen kitchen, OperationalDelta operationalDelta) {
		CompositeOp compositeOperation = new CompositeOp();
		
		ItemSocket itemSocket = kitchen.getItemSockets().stream().filter(x -> x.getId().equals(element.getId())).findFirst().orElse(null);
		EAttribute xSizeAttr = toAttribute(itemSocket.getItem(), "xPos");
		EAttribute ySizeAttr = toAttribute(itemSocket.getItem(), "yPos");
		
		compositeOperation.addOperation(new AttributeChangeOp(xSizeAttr, element.getPosX(), itemSocket.getItem()));
		compositeOperation.addOperation(new AttributeChangeOp(ySizeAttr, element.getPosY(), itemSocket.getItem()));					
		
		operationalDelta.addOperation(compositeOperation);
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
}