package com.bxtooldemo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.bxtooldemo.artefactadapter.SyncResultToUIModelArtefactAdapter;
import com.bxtooldemo.uimodels.UIModels;
import com.google.inject.Inject;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.ContinuableSynchroniser;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationContinuationResult;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.ContinuableDeltaBasedController;

import GridLanguage.Grid;
import GridLanguage.Group;
import KitchenLanguage.Kitchen;


public class BxDemoController extends ContinuableDeltaBasedController<Grid, Object, Kitchen, Object, List<String>, OperationalDelta, OperationalDelta, String, String> {

	private UIModels uiModelsAdapter;	
	
	public UIModels initialise() {
		synchroniser.initialize();

		SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> fwdSyncResult = syncForward("");
		SyncResultToUIModelArtefactAdapter syncResultToUIModelArtefactAdapter = new SyncResultToUIModelArtefactAdapter();
		syncResultToUIModelArtefactAdapter.setArtefact(fwdSyncResult);
		syncResultToUIModelArtefactAdapter.parse();
		return syncResultToUIModelArtefactAdapter.getModel().get();		
	}
	@Inject
	public BxDemoController(@Src ArtefactAdapter<Grid, Object> sourceArtefactAdapter,
			@Trg ArtefactAdapter<Kitchen, Object> targetArtefactAdapter,
			ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta> continuableSynchroniser,
			@Src DeltaAdapter<OperationalDelta, String, Grid> sourceDeltaAdapter,
			@Trg DeltaAdapter<OperationalDelta, String, Kitchen> targetDeltaAdapter) {
		
		super(sourceArtefactAdapter, targetArtefactAdapter, continuableSynchroniser, sourceDeltaAdapter, targetDeltaAdapter);		
	}
	
	
	public UIModels continueSynchronisation(String decision){
		setUpdatePolicy(Arrays.asList(decision));
		continueSync();
		return uiModelsAdapter;
	}


	private void setColorsToUnassignedBlocks(Grid grid){
		for (Group group : grid.getGroups()) {
			
			if(group.getFillColor() != null)
				continue;
			Random random = new Random();
	        // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
	        int nextInt = random.nextInt(256*256*256);
	        // format it as hexadecimal string (with hashtag and leading zeros)
	        String color = String.format("#%06x", nextInt);
	        
	        //Push Group-Color mapping for newly created Group()
			group.setFillColor(color);
		}
	}

	public UIModels workflow(Optional<String> sourceDelta, Optional<String> targetDelta) {
			
		if(sourceDelta.isPresent()) {
			SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> fwdSyncResult = syncForward(sourceDelta.get());
			
			setColorsToUnassignedBlocks(fwdSyncResult.getSourceArtefactAdapter().getModel().get());
			SyncResultToUIModelArtefactAdapter syncResultToUIModelArtefactAdapter = new SyncResultToUIModelArtefactAdapter();
			syncResultToUIModelArtefactAdapter.setArtefact(fwdSyncResult);
			return syncResultToUIModelArtefactAdapter.getModel().get();
		}
		else if (targetDelta.isPresent()) {
			SynchronisationContinuationResult<Grid, Object, Kitchen, Object, OperationalDelta, List<String>> bwdSyncResult = syncForward(targetDelta.get());
			
			setColorsToUnassignedBlocks(bwdSyncResult.getSourceArtefactAdapter().getModel().get());
			SyncResultToUIModelArtefactAdapter syncResultToUIModelArtefactAdapter = new SyncResultToUIModelArtefactAdapter();
			syncResultToUIModelArtefactAdapter.setArtefact(bwdSyncResult);
			return syncResultToUIModelArtefactAdapter.getModel().get();
			
		}else {
			return new UIModels();
		}
				
	}
	
}
