/**
 * 
 */
var watchFlag = false;

gridKitchenDeltaOperations  = new GridKitchenDeltaOperation([], []);

function initializeDeltaDiscover(){
	gridKitchenDeltaOperations  = new GridKitchenDeltaOperation([], []);
	
}
function restartDeltaDiscoverer(){
	gridKitchenDeltaOperations  = new GridKitchenDeltaOperation([], []);
}

function startDeltaDiscoverer(){
	watchFlag= true;
	
		watch(uiClientModels.workspace, "objects", sourceOnlineDeltaDiscoverer);
		watch(uiClientModels.layout.groups, targetOnlineDeltaDiscoverer);
	
	
}
function stopDeltaDiscoverer(){
	watchFlag= false;
}

/*
 * If user adds a new block(rectangle) to the model then new operation should be generated
 * 
 * 
 */
function targetOnlineDeltaDiscoverer(prop, action, newvalue, oldvalue){
	if(!watchFlag)return;
	console.log(prop+" - action: "+action+" - new: "+newvalue+", old: "+oldvalue+"... and the context: "+JSON.stringify(this));
	if(action === "push" && newvalue instanceof trgModelMeta.Rectangle){
		var object = newvalue;
		var group = this;
		
		gridKitchenDeltaOperations.addCreateBlockOperation(object.xIndex, object.yIndex, object.fillColor);
	}else if (action === "splice"){
		var object = oldvalue[0];
		gridKitchenDeltaOperations.removeBlockFromAllOperations(object.xIndex, object.yIndex);
	}else if(prop === "opacity"){
		
		if(!newvalue)
				gridKitchenDeltaOperations.removeRemoveGroupOperation(this);
		else
				gridKitchenDeltaOperations.addRemoveGroupOperation(this);	
	}
}
function sourceOnlineDeltaDiscoverer(prop, action, newvalue, oldvalue){
	if(!watchFlag)return;
	//console.log(prop+" - action: "+action+" - new: "+newvalue+", old: "+oldvalue+"... and the context: "+JSON.stringify(this));
	
	if(action === "push" && newvalue.sentFromServer == undefined){				
		gridKitchenDeltaOperations.addKitchenOperation("ADDED", newvalue);
	}
	else if(action === "set"){
		
		if(!gridKitchenDeltaOperations.operationExists(this.id))
			gridKitchenDeltaOperations.addKitchenOperation("CHANGED", this);
		else
			var operations = gridKitchenDeltaOperations.returnAllOperationsOnElement(this.id);
		
	}
	else if(action === "splice"){
		
		while(gridKitchenDeltaOperations.operationExists(oldvalue[0].id))
			gridKitchenDeltaOperations.removeKitchenOperation(oldvalue[0].id);
		
		if(oldvalue[0].sentFromServer != undefined)
			gridKitchenDeltaOperations.addKitchenOperation("REMOVED", oldvalue[0]);
		
	}		
}
