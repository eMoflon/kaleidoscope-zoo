/**
 * 
 */

function visualiseGrid(uiModels){
	//Visualize Grid
	Layout.clear();
	drawGrid();

	stopDeltaDiscoverer();
	restartDeltaDiscoverer();
	uiClientModels.layout.clearGroups();
	
	if (uiModels!= null && uiModels.layout.groups.length > 0) {
		// fillColor into blocks for groups
		for (var i = 0; i < uiModels.layout.groups.length; i++) {
			for (var j = 0; j < uiModels.layout.groups[i].blocks.length; j++) {
				
				var xIndex = uiModels.layout.groups[i].blocks[j].xIndex;// ADDED
				var yIndex = uiModels.layout.groups[i].blocks[j].yIndex;// ADDED
				var fillColor = uiModels.layout.groups[i].fillColor;// ADDED
				uiClientModels.layout.addBlock(xIndex, yIndex, fillColor); // ADDED
				
				for (var k = 0; k < Layout.getObjects().length; k++) {
					if (Layout.getObjects()[k].get('id') === uiModels.layout.groups[i].blocks[j].id) {
						Layout.getObjects()[k].setFill(uiModels.layout.groups[i].fillColor);
						Layout.renderAll();
					}

				}
			}
		}
	}
	
	startDeltaDiscoverer();
}

function setOpacityOfClickedGroup(colorBeforeChange, opacityValue){
	
	for(var i = 0; i < Layout._objects.length; i++) {
		if (Layout._objects[i].fill == colorBeforeChange){
			Layout._objects[i].set({
		        opacity: opacityValue
		    });
		}
	}
}

/*
 * check if a block exists on the x and y position in the list of created blocks
 */
function blockExistinCreateGroup(e){
	return gridKitchenDeltaOperations.containsBlockByPosition(e.target.xPos, e.target.yPos); // ADDED	
}


/*
 * Action performed on used click on Rectangle
 * 
 */

Layout.on('mouse:down', function(e) {
	var noOfClick = 1;
	var newGeneratedColor = null;
	if (e.target.get('subType') == 'block') {
		
		// block id
		var currentClickedBlock = e.target.id;
		// current color
		var colorBeforeChange = e.target.fill;
		console.log('block ' + e.target.id + ' was clicked');
		
		if(previousClickedBlock != null && currentClickedBlock == previousClickedBlock )
			noOfClick = 2;
		
		if (noOfClick == 1){
			if(colorBeforeChange == 'transparent'){
				newGeneratedColor = lastAssignedColor != null ? lastAssignedColor : genColor();
				e.target.setFill(newGeneratedColor);
				uiClientModels.layout.addBlock(e.target.xPos, e.target.yPos, e.target.fill); // ADDED
			}
			else if (colorBeforeChange != 'transparent' && blockExistinCreateGroup(e)){
				e.target.setFill("transparent");
				uiClientModels.layout.removeAllBlocksByPosition(e.target.xPos, e.target.yPos); // ADDED				
			}
			else if (colorBeforeChange != 'transparent' && e.target.opacity < 1){				
				uiClientModels.layout.setOpacityOfGroup(colorBeforeChange, false); // ADDED
				setOpacityOfClickedGroup(colorBeforeChange, 0.5);
			}
			else if (colorBeforeChange != 'transparent' && !blockExistinCreateGroup(e)){				
				uiClientModels.layout.setOpacityOfGroup(colorBeforeChange, true); // ADDED
				setOpacityOfClickedGroup(colorBeforeChange, 0.5);
			}
		}
		else if (noOfClick == 2){
			if(colorBeforeChange == 'transparent'){
				newGeneratedColor =  genColor();
				e.target.setFill(newGeneratedColor);		       
		       uiClientModels.layout.addBlock(e.target.xPos, e.target.yPos, e.target.fill); // ADDED
			}
			else if (colorBeforeChange != 'transparent' && blockExistinCreateGroup(e)){
				e.target.setFill("transparent");				
				uiClientModels.layout.removeAllBlocksByPosition(e.target.xPos, e.target.yPos); // ADDED
			}
			else if (colorBeforeChange != 'transparent' && e.target.opacity < 1){				
				uiClientModels.layout.setOpacityOfGroup(colorBeforeChange, false); // ADDED
				setOpacityOfClickedGroup(colorBeforeChange, 1);
			}
			else if (colorBeforeChange != 'transparent' && !blockExistinCreateGroup(e)) {				
				uiClientModels.layout.setOpacityOfGroup(colorBeforeChange, true); // ADDED
				setOpacityOfClickedGroup(colorBeforeChange, 0.5);
			}
			noOfClick = 1;
		}
			
		Layout.renderAll();
		
		previousClickedBlock = e.target.id;
		lastAssignedColor = newGeneratedColor;
	}
});


