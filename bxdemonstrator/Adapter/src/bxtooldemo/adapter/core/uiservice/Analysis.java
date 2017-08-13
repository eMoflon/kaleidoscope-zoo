package bxtooldemo.adapter.core.uiservice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.ContinuableSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import GridLanguage.Grid;
import GridLanguage.Group;
import KitchenLanguage.Kitchen;
import bxdemonstrator.implemenation.DemoBxtendTool;
import bxtooldemo.adapter.artefactadapter.GridUIArtefactAdapter;
import bxtooldemo.adapter.artefactadapter.KitchenUIArtefactAdapter;
import bxtooldemo.adapter.core.delta.DeltaAdapter;
import bxtooldemo.adapter.uimodels.Layout;
import bxtooldemo.adapter.uimodels.UIModels;
import bxtooldemo.adapter.uimodels.Workspace;


public class Analysis {

	DeltaAdapter deltaAdapter = new DeltaAdapter();
	private UIModels uiModelsAdapter;
	public static int blockArrayNo;
	
	OperationalDelta sourceDeltaOperation;
	OperationalDelta targetDeltaOperation;
	ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta> bxTool = new DemoBxtendTool();
	
	public void initeMoflonTool(int blockArrayNo) {
		Analysis.blockArrayNo = blockArrayNo;
		bxTool.initialize();
	}

	public UIModels getUIModels() {
		return generateUIModel(new OperationalDelta(), new OperationalDelta());
	}
	
	public UIModels continueSynchronisation(String decision){
		
		bxTool.setUpdatePolicy(Arrays.asList(decision));
		bxTool.continueSync();
		return getUIModelsAfterAtomicDeltaPropagation(Optional.empty()); 
	}
    private UIModels generateUIModel(OperationalDelta fwdFailedDelta, OperationalDelta bwdFailedDelta){
    	
    	Layout layoutAdapter = new Layout();
		Workspace workspaceAdapter = new Workspace();
		UIModels uiModelAdapter = new UIModels();
		Grid grid = this.bxTool.getSourceModel();
		Kitchen kitchen = this.bxTool.getTargetModel();
		
		//For user choices
		if (bxTool.getContinuationPolicy().size() > 0) {
			uiModelAdapter.setUserChoices(bxTool.getContinuationPolicy());
			return uiModelAdapter;
		}
		ArtefactAdapter<Grid, Layout> gridToLayourAdapter = new GridUIArtefactAdapter();
		gridToLayourAdapter.setModel(grid);
		gridToLayourAdapter.setArtefact(layoutAdapter);
		gridToLayourAdapter.unparse();
		
		ArtefactAdapter<Kitchen, Workspace>kitchenToWorkspace = new KitchenUIArtefactAdapter();
		kitchenToWorkspace.setModel(kitchen);
		kitchenToWorkspace.setArtefact(workspaceAdapter);
		kitchenToWorkspace.unparse();

		String failedDeltaMsg = "";
		
		
		if(fwdFailedDelta.getOperations().size() > 0 || bwdFailedDelta.getOperations().size() > 0){
			// deal with failed deltas message
			failedDeltaMsg = "";
			String fwdSyncReportMessage = deltaAdapter.generateFailedDeltaOperationMessage(fwdFailedDelta);
			String bwdSyncReportMessage = deltaAdapter.generateFailedDeltaOperationMessage(bwdFailedDelta);
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
		bxTool.syncForward(sourceDeltaOperation);
		OperationalDelta forwardSyncReport = bxTool.getFailedDelta();
		
		bxTool.syncBackward(targetDeltaOperation);
		OperationalDelta backwardSyncReport = bxTool.getFailedDelta();
		
		gridModel = bxTool.getSourceModel();
		setColorsToUnassignedBlocks(gridModel);
		
		this.uiModelsAdapter = generateUIModel(forwardSyncReport, backwardSyncReport);
		
		return this.uiModelsAdapter;
	}

}
