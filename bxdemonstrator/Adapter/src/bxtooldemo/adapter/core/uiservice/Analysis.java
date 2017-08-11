package bxtooldemo.adapter.core.uiservice;

import java.util.Optional;
import java.util.Random;

import com.kaleidoscope.extensionpoint.bxtool.ContinuableBXtool;
import com.kaleidoscope.extensionpoint.bxtool.SynchronizationReport;
import com.kaleidoscope.ui.delta.javabased.operational.OperationalJavaBasedDelta;

import GridLanguage.Grid;
import GridLanguage.Group;
import KitchenLanguage.Kitchen;
import bxdemonstrator.implemenation.DemoBxtendTool;
import bxtooldemo.adapter.artefactadapter.GridUIArtefactAdapter;
import bxtooldemo.adapter.artefactadapter.KitchenUIArtefactAdapter;
import bxtooldemo.adapter.core.delta.DeltaAdapter;
import bxtooldemo.adapter.core.implementations.emoflon.EmoflonToolImpl;
import bxtooldemo.adapter.uimodels.Layout;
import bxtooldemo.adapter.uimodels.UIModels;
import bxtooldemo.adapter.uimodels.Workspace;


public class Analysis {

	DeltaAdapter deltaAdapter = new DeltaAdapter();
	private UIModels uiModelsAdapter;
	public static int blockArrayNo;
	
	OperationalJavaBasedDelta sourceDeltaOperation;
	OperationalJavaBasedDelta targetDeltaOperation;
	ContinuableBXtool<Grid, Kitchen, String, String> bxTool = new DemoBxtendTool();
	
	public void initeMoflonTool(int blockArrayNo) {
		Analysis.blockArrayNo = blockArrayNo;
		bxTool.initialize();
	}

	public UIModels getUIModels() {
		return generateUIModel(Optional.empty(), Optional.empty());
	}
	
	public UIModels continueSynchronisation(String decision){
		bxTool.continueSync(decision);
		return getUIModelsAfterAtomicDeltaPropagation(Optional.empty()); 
	}
    private UIModels generateUIModel(Optional<SynchronizationReport> fwdSyncReport, Optional<SynchronizationReport> bwdSyncReport){
    	
    	Layout layoutAdapter = new Layout();
		Workspace workspaceAdapter = new Workspace();
		UIModels uiModelAdapter = new UIModels();
		Grid grid = this.bxTool.getSourceModel();
		Kitchen kitchen = this.bxTool.getTargetModel();
		
		//For user choices
		if (bxTool.getChoicesForContinuation().size() > 0) {
			uiModelAdapter.setUserChoices(bxTool.getChoicesForContinuation());
			return uiModelAdapter;
		}
		new GridUIArtefactAdapter().unparse(layoutAdapter, grid);
		new KitchenUIArtefactAdapter().unparse(workspaceAdapter, kitchen);

		String failedDeltaMsg = "";
		
		
		if(fwdSyncReport.isPresent() || bwdSyncReport.isPresent()){
			// deal with failed deltas message
			failedDeltaMsg = "";
			String fwdSyncReportMessage = deltaAdapter.generateFailedDeltaOperationMessage(fwdSyncReport.get());
			String bwdSyncReportMessage = deltaAdapter.generateFailedDeltaOperationMessage(bwdSyncReport.get());
			failedDeltaMsg = failedDeltaMsg + fwdSyncReportMessage + bwdSyncReportMessage;
			System.out.println(fwdSyncReportMessage + bwdSyncReportMessage);
		}
		
		// setting the UIModels
		uiModelAdapter.setLayout(layoutAdapter);
		uiModelAdapter.setWorkspace(workspaceAdapter);
		uiModelAdapter.setFailedDeltasMessage(failedDeltaMsg);
		return uiModelAdapter;
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
	
	public UIModels getUIModelsAfterAtomicDeltaPropagation(Optional<String> deltaString) {
		
		Grid gridModel = bxTool.getSourceModel();
		Kitchen kitchenModel = bxTool.getTargetModel();
		
		if(deltaString.isPresent()){
			sourceDeltaOperation = deltaAdapter.transformIntoSourceOpDelta(deltaString.get(), gridModel);
			targetDeltaOperation = deltaAdapter.transformIntoTargetOpDelta(deltaString.get(), kitchenModel);
		}
		SynchronizationReport forwardSyncReport = bxTool.syncForwardFromJavaBasedDelta(sourceDeltaOperation, Optional.empty()).get();
		SynchronizationReport backwardSyncReport = bxTool.syncBackwardFromJavaBasedDelta(targetDeltaOperation, Optional.empty()).get();
		
		gridModel = bxTool.getSourceModel();
		setColorsToUnassignedBlocks(gridModel);
		
		this.uiModelsAdapter = generateUIModel(Optional.of(forwardSyncReport), Optional.of(backwardSyncReport));
		
		return this.uiModelsAdapter;
	}

}
