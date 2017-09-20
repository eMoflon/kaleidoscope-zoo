package com.bxtooldemo.artefactadapter;

import java.util.List;
import java.util.Optional;

import com.bxtooldemo.delta.FailedDeltaToStringAdapter;
import com.bxtooldemo.uimodels.Layout;
import com.bxtooldemo.uimodels.UIModels;
import com.bxtooldemo.uimodels.Workspace;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationContinuationResult;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import GridLanguage.Grid;
import KitchenLanguage.Kitchen;

public class SyncResultToUIModelArtefactAdapter implements ArtefactAdapter<UIModels, SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>>>{

	protected UIModels model;
	protected SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> result;
	
	
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
	
	private String generateStringFromFailedDelta(OperationalDelta opDelta) {
		
		FailedDeltaToStringAdapter failedDeltaToStringAdapter = new FailedDeltaToStringAdapter();
		return failedDeltaToStringAdapter.unparse(opDelta, new Object());
	}
	
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
		
		String failedDeltaMsg = generateStringFromFailedDelta(result.getFailedDelta());
		
		model.setLayout(layout);
		model.setWorkspace(workspace);
		model.setFailedDeltasMessage(failedDeltaMsg);		
	}

	@Override
	public void unparse() {
		throw new UnsupportedOperationException();		
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
