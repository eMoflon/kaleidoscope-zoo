/**
 * 
 */

function visualiseFailedDeltas(){
	
	//Visualize Failed Deltas
	if (uiModels!= null && uiModels.failedDeltas!= null && (uiModels.failedDeltas.created.length > 0 
			|| uiModels.failedDeltas.deleted.length > 0 
			|| uiModels.failedDeltas.moved.length > 0
			|| uiModels.failedDeltas.groupCreated.length > 0
			|| uiModels.failedDeltas.groupDeleted.length > 0) ) {
		var failedDeltaMsg = "The following changes were rejected: ";
		if(uiModels.failedDeltas.created.length > 0){
			for(var i = 0; i < uiModels.failedDeltas.created.length; i++) {
				failedDeltaMsg = failedDeltaMsg + " Creation of " + uiModels.failedDeltas.created[i].type;
			}	
		}
		
		if(uiModels.failedDeltas.deleted.length > 0){
			for(var i = 0; i < uiModels.failedDeltas.deleted.length; i++) {
				failedDeltaMsg = failedDeltaMsg + " Deletion of " + uiModels.failedDeltas.deleted[i].type;
			}	
		}
		
		if(uiModels.failedDeltas.moved.length > 0){
			for(var i = 0; i < uiModels.failedDeltas.moved.length; i++) {
				failedDeltaMsg = failedDeltaMsg + " Movement of " + uiModels.failedDeltas.moved[i].type;
			}	
		}
		
		if(uiModels.failedDeltas.groupCreated.length > 0){
			for(var i = 0; i < uiModels.failedDeltas.groupCreated.length; i++) {
				failedDeltaMsg = failedDeltaMsg + " Creation of Group";
			}	
		}
		
		if(uiModels.failedDeltas.groupDeleted.length > 0){
			for(var i = 0; i < uiModels.failedDeltas.groupDeleted.length; i++) {
				failedDeltaMsg = failedDeltaMsg + " Deletion of Group";
			}	
		}
		$('#messageDialog').text(failedDeltaMsg);
	}
}