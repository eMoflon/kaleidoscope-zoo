function GridKitchenDeltaOperation(kitchenOperations, gridOperations){

	this.kitchenOperations = kitchenOperations;
	this.gridOperations = gridOperations;
	
	this.removeOperation = function(fillColor){
		 var i;
		   for (i = 0; i < this.gridOperations.length; i++) { 
			    if(this.gridOperations[i].affectedGroup.getFillColor() === fillColor)
			    	return gridOperations.splice(i, 1);
			    
			}
	};
	this.containsBlockByPosition = function(xIndex, yIndex){
		
		var i;
	   for (i = 0; i < this.gridOperations.length; i++) { 
		    if(this.gridOperations[i].affectedGroup.containsBlockByPosition(xIndex, yIndex))
		    	return true;
		    
		}
	   return false;
	};
	this.findGroupByColor = function(fillColor){
		   var i;
		   for (i = 0; i < this.gridOperations.length; i++) { 
			    if(this.gridOperations[i].affectedGroup.getFillColor() === fillColor)
			    	return this.gridOperations[i].affectedGroup;
			    
			}
		   return undefined;
	};
	
	this.findOperationByColor = function(fillColor){
		   var i;
		   for (i = 0; i < this.gridOperations.length; i++) { 
			    if(this.gridOperations[i].affectedGroup.getFillColor() === fillColor)
			    	return this.gridOperations[i];
			    
			}
		   return undefined;
	 }; 
	   
	this.addGridOperation = function(operationType, affectedGroup){
		this.gridOperations.push(new DeltaGridOperation(operationType, affectedGroup));
	};
	
	this.removeBlockFromAllOperations = function(xIndex, yIndex){
	   var i;
	   for (i = 0; i < this.gridOperations.length; i++) { 			  				   
		   while(gridOperations[i].affectedGroup.containsBlockByPosition(xIndex, yIndex)){
			   gridOperations[i].affectedGroup.removeBlockByPosition(xIndex, yIndex);
		   }				   						    
		}
	};
	this.addCreateBlockOperation = function(xIndex, yIndex, fillColor){
		var operationType = "group_created";
		var group = this.findGroupByColor(fillColor);
		
		if(group == undefined){
			group  = new trgModelMeta.UIGroup([], fillColor, false);			  
			var gridOperation = new DeltaGridOperation(operationType, group);
			this.gridOperations.push(gridOperation);
		}
		var rec = new trgModelMeta.Rectangle(undefined, xIndex, yIndex, fillColor);
		 group.addBlock(rec);
	}
	
	
	this.addRemoveGroupOperation = function(group){
		this.removeOperation(group.fillColor);		
		this.addGridOperation("group_remove",group);
		
	}
	this.removeRemoveGroupOperation = function(group){
		this.removeOperation(group.fillColor);
	}
	
	
	
	
	
	
	
	
	
	
	
	this.addKitchenOperation = function(operationType, affectedElement){
		
		this.kitchenOperations.push(new DeltaKitchenOperation(operationType, affectedElement));
	};
	this.operationExists = function(elementId){
		 for (i = 0; i < this.kitchenOperations.length; i++) { 
			    if(this.kitchenOperations[i].affectedElement.id === elementId){
			    	return true;
			    }
			}
		 return false;
	};
	this.removeKitchenOperation = function(elementId){
		 for (i = 0; i < this.kitchenOperations.length; i++) { 
			    if(this.kitchenOperations[i].affectedElement.id === elementId){
			    	this.kitchenOperations.splice(i, 1);
			    	return;
			    }
			}
	};
	this.returnAllOperationsOnElement = function(elementId){
		 var operations = [];
		 
		 for (i = 0; i < this.kitchenOperations.length; i++) { 
			    if(this.kitchenOperations[i].affectedElement.id === elementId){
			    	operations.push(kitchenOperations[i]);
			    }
		}
		return operations;
	};
}
function DeltaGridOperation(operationType, affectedGroup){
	this.operationType = operationType;
	this.affectedGroup = affectedGroup;
}

function DeltaKitchenOperation(operationType, affectedElement){
	this.operationType = operationType;
	this.affectedElement = affectedElement;
}
