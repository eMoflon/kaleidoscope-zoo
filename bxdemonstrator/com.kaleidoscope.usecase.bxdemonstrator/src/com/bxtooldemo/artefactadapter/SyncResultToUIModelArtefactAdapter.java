package com.bxtooldemo.artefactadapter;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import com.bxtooldemo.uimodels.Layout;
import com.bxtooldemo.uimodels.UIModels;
import com.bxtooldemo.uimodels.Workspace;
import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AttributeChangeOp;
import com.kaleidoscope.core.delta.javabased.operational.CompositeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.Operation;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationContinuationResult;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import GridLanguage.Block;
import GridLanguage.Grid;
import KitchenLanguage.Fridge;
import KitchenLanguage.Item;
import KitchenLanguage.Kitchen;
import KitchenLanguage.Sink;
import KitchenLanguage.Table;

public class SyncResultToUIModelArtefactAdapter implements ArtefactAdapter<UIModels, SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>>>{

	protected UIModels model;
	protected SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> result;
	
	@Override
	public void parse() {
		model = new UIModels();	
		Layout layout = new Layout();
		Workspace workspace = new Workspace();
		
		Grid grid = result.getSourceArtefactAdapter().getModel().get();
		Kitchen kitchen = result.getTargetArtefactAdapter().getModel().get();
		
		if(result.isHasContinuation()) {
			model.setUserChoices(result.getUpdatePolicy());
			return;
		}
		transformLayoutToGrid(layout, grid);
		transformWorkspaceToKitchen(workspace, kitchen);
		
		String failedDeltaMsg = generateStringFromFailedDelta(result.getFailedDelta(), new Object());
		
		model.setLayout(layout);
		model.setWorkspace(workspace);
		model.setFailedDeltasMessage(failedDeltaMsg);		
	}

	@Override
	public void unparse() {
		throw new UnsupportedOperationException();		
	}
	
	private void transformLayoutToGrid(Layout layout, Grid grid) {
		ArtefactAdapter<Grid, Layout> gridToLayourAdapter = new GridToLayoutArtefactAdapter();
		gridToLayourAdapter.setModel(grid);
		gridToLayourAdapter.setArtefact(layout);
		gridToLayourAdapter.unparse();
	}
	
	private void transformWorkspaceToKitchen(Workspace workspace, Kitchen kitchen) {
		ArtefactAdapter<Kitchen, Workspace>kitchenToWorkspace = new KitchenToWorkspaceArtefactAdapter();
		kitchenToWorkspace.setModel(kitchen);
		kitchenToWorkspace.setArtefact(workspace);
		kitchenToWorkspace.unparse();
	}
	
	private String transformOperationIntoErrorMsg(Operation atomicOperation) {
		
		String failedDeltaMsg = "";
		
		if(atomicOperation instanceof AddEdgeOp){
			EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
			
			if(edgeTarget instanceof Block)
				failedDeltaMsg +=  " Creation of Group";				
			
			else if(edgeTarget instanceof Item)
				failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
		}
		else if(atomicOperation instanceof DeleteEdgeOp){
			EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
			
			if(edgeTarget instanceof Block)
				failedDeltaMsg +=  " Deletion of Group";
				
			else if(edgeTarget instanceof Item)
				failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
			
		}
		else if(atomicOperation instanceof AttributeChangeOp){
			EObject affectedNode = ((AttributeChangeOp) atomicOperation).getAffectedNode();
			if(affectedNode instanceof Item)
				failedDeltaMsg +=  " Movement of " + getItemName((Item)affectedNode);
			
		}
		return failedDeltaMsg;
	}
	
	private String generateStringFromFailedDelta(OperationalDelta failedDelta, Object model) {
			
		String failedDeltaMsg = "";
		
		for (Operation op : failedDelta.getOperations()) {
			if(op instanceof CompositeOp){
				
				CompositeOp compositeOp = (CompositeOp) op;
			
				for(Operation atomicOperation : compositeOp.getOperations())
					failedDeltaMsg += transformOperationIntoErrorMsg(atomicOperation);	
			}				
		}
		return failedDeltaMsg;
		
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

	@Override
	public void setModel(UIModels m) {
		this.model = m;
		
	}

	@Override
	public void setArtefact(SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> a) {
		this.result = a;
		
	}

	@Override
	public Optional<UIModels> getModel() {
		return Optional.of(model);
	}

	@Override
	public Optional<SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>>> getArtefact() {
		return Optional.of(result);
	}

}
