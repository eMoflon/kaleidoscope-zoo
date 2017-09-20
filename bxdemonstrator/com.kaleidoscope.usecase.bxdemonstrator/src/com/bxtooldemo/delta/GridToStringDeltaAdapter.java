package com.bxtooldemo.delta;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.bxtooldemo.uimodels.Rectangle;
import com.bxtooldemo.uimodels.UIGroup;
import com.google.gson.Gson;
import com.kaleidoscope.core.delta.javabased.JavaBasedEdge;
import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AddNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.CompositeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteNodeOp;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import GridLanguage.Group;

public class GridToStringDeltaAdapter implements DeltaAdapter<OperationalDelta, String, Grid>{

	private OperationalDelta transformGridDeltaOpeartionIntoOperationalDelta(GridKitchenDeltaOperation delta, Grid grid) {
		OperationalDelta operationalDelta = new OperationalDelta();
		List<DeltaGridOperation> gridOperations = delta.getGridOperations();
		
		for(DeltaGridOperation deltaGridOperation : gridOperations) {
			
			switch(deltaGridOperation.getOperationType()) {
			
				case GridKitchenDeltaOperation.GROUP_CREATED_OPERATION:{	
					transGroupCreatedOpIntoOpDelta(deltaGridOperation, grid, operationalDelta);
					break;
				}
				case GridKitchenDeltaOperation.GRUPD_DELETED_OPERATION:{
					transGroupDeletedOpIntoOpDelta(deltaGridOperation, grid, operationalDelta);
					break;
				}
				default:
					break;
					
			}
		}
		return operationalDelta;
	}
	
	private OperationalDelta transGroupCreatedOpIntoOpDelta(DeltaGridOperation deltaGridOperation, Grid grid, OperationalDelta operationalDelta) {
		
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
		return operationalDelta;
	}
		
	private OperationalDelta transGroupDeletedOpIntoOpDelta(DeltaGridOperation deltaGridOperation, Grid grid, OperationalDelta operationalDelta) {
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
		return operationalDelta;
	}
	@Override
	public OperationalDelta parse(String deltaJson, Grid grid) {
		
		Gson gson = new Gson();
		GridKitchenDeltaOperation delta = gson.fromJson(deltaJson, GridKitchenDeltaOperation.class);
		
		if(delta == null) 
			delta = new GridKitchenDeltaOperation();
		
		return transformGridDeltaOpeartionIntoOperationalDelta(delta, grid);
	}

	@Override
	public String unparse(OperationalDelta d, Grid a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private EReference toReference(EObject src, String refName){
		   return src.eClass().getEAllReferences()
				   .stream()
				   .filter(r -> r.getName().equals(refName))
				   .findAny()
				   .get();   
	}

}
