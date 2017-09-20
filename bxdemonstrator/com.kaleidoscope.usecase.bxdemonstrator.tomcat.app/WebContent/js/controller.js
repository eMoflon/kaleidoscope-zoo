/**
 * 
 */
var srcModel; //ADDED
var targetModel;//ADDED

var Layout = new fabric.Canvas('canvasLayout');
var Workspace = new fabric.Canvas('canvasWorkspace');
var Uid = null;
var object_counter;
var noOfBlocks;

var previousClickedBlock = null;
var lastAssignedColor = null;
var GuiUserChoice = null;
var x = 584;
var y = 92;
$('[data-toggle="tooltip"]').tooltip({
    trigger : 'hover'
}) 

window.onload = init;
window.onunload = close;

function init() {
	Uid = generateUUID();
	object_counter = 0;
	
	if (isNaN($("#arrayNumber").val()) || $("#arrayNumber").val() < 5 || $("#arrayNumber").val() > 10 ){
		$("#arrayNumber").val("");
	}
	noOfBlocks = ($("#arrayNumber").val() === "") ? 5 : $("#arrayNumber").val();
	previousClickedBlock = null;
	lastAssignedColor = null;
	GuiUserChoice = null;
	$('#messageDialog').text("");
	$('#divItemList').hide();
	$.ajax({
		url : 'InitController',
		type : 'POST',
		dataType : 'json',
		data : {
			initCanvas : 1,
			userID: Uid,
			blockArrayNo : noOfBlocks
		},
		success : function(data) {		
			initVisualize(data);
		}
	});
}

function reInit() {
	init();
	Layout.clear();
	Workspace.clear();
	drawGrid();
}

function close() {
	$.ajax({
		url : 'InitController',
		type : 'POST',
		dataType : 'json',
		data : {
			exitDemo : 1,
			userID: Uid,
		},
		success : function(data) {
			Uid = null;
		}
	});
}


function undo() {
	if (LayoutBlocksCreated.length <= 0 && LayoutBlocksDeleted.length <= 0){
		$('#messageDialog').text("There is currently no change to be undone in Layout.");
	}
	else {
		
		restartDeltaDiscoverer(); // ADDED
		previousClickedBlock = null;
		lastAssignedColor = null;
		GuiUserChoice = null;
		propagateChanges();
		$('#messageDialog').text("Changes undone in Layout.");
	}
}

function sychro() {
	if((gridKitchenDeltaOperations.kitchenOperations.length > 0) && (gridKitchenDeltaOperations.gridOperations.length > 0)){
		restartDeltaDiscoverer(); // ADDED
		previousClickedBlock = null;
		lastAssignedColor = null;
		GuiUserChoice = null;
		propagateChanges();
		$('#messageDialog').text("You cannot make changes on both side.");
		
	}
	else if(gridKitchenDeltaOperations.kitchenOperations.length <= 0 && gridKitchenDeltaOperations.gridOperations.length <= 0){
		$('#messageDialog').text("There is currently no change to propagate.");
	}
	else{
		$('#messageDialog').text("");
		propagateChanges();
	}
	
}

function propagateChanges(){
	$.ajax({
		url : 'InitController',
		type : 'POST',
		dataType : 'json',
		data : {
			loadChanges : 1,
			userID: Uid,			
			OperationalDelta: JSON.stringify(gridKitchenDeltaOperations),
			noOfSourceDeltaOperations: gridKitchenDeltaOperation.gridOperations.length,
			noOfTargetDeltaOperations: gridKitchenDeltaOperation.kitchenOperations.length
		},
		success : function(data) {
			if(data.userChoices.length > 0){
				userChoiceVisualize(data);
			}
			else{				
				changeVisualize(data);
			}
			
		}
	});

	previousClickedBlock = null;
	lastAssignedColor = null;
	GuiUserChoice = null;
}

function propagateUserChoices(){
	$.ajax({
		url : 'InitController',
		type : 'POST',
		dataType : 'json',
		data : {
			userChoice : 1,
			userID: Uid,
			UserChoice : JSON.stringify(GuiUserChoice),
		},
		success : function(data) {
			if(data.userChoices.length > 0){
				userChoiceVisualize(data);
			}
			else{
				changeVisualize(data);
			}
		}
	});
	
	GuiUserChoice = null;
}

function userChoiceVisualize(uiModels) {
	var options = "";
	var selection = 0;
	for (var i = 0; i < uiModels.userChoices.length; i++) {
		if(i < uiModels.userChoices.length - 1)
		options = options + " " + i + " to " + uiModels.userChoices[i] + ", or";
		else 
			options = options + " " + i + " to " + uiModels.userChoices[i] + ".";
	}
	selection = prompt("Please enter" + options);
	
	if(selection === null || selection > (uiModels.userChoices.length - 1) || isNaN(selection) || selection === "")
		GuiUserChoice = uiModels.userChoices[0];
	else
	    GuiUserChoice = uiModels.userChoices[selection];
	
	propagateUserChoices();
}

function initVisualize(uiModels) {
	initializeUImodel();
	startDeltaDiscoverer();
	Layout.setDimensions({
		width : uiModels.layout.width,
		height : uiModels.layout.height
	});
	Workspace.setDimensions({
		width : uiModels.workspace.width,
		height : uiModels.workspace.width
	});
	drawGrid();
	drawBorder();
	console.log("Visualization done after initialization");
}

function changeVisualize(uiModels) {
	
	initializeUImodel();
	//Visualize Kitchen
	visualiseKitchen(uiModels);
	
	//Visualize Grid
	visualiseGrid(uiModels); // ADDED
		
	//Visualize Failed Deltas
	var failedDeltaMsg = "";
	if(uiModels.failedDeltasMessage != undefined && uiModels.failedDeltasMessage.length > 1)
	failedDeltaMsg = "The following changes were rejected:" +uiModels.failedDeltasMessage;
	
	$('#messageDialog').text(failedDeltaMsg);
	console.log("Visualization done after change propagation");
}


function showInfo(val) {
	$('#messageHover').text(val);
}

Layout.hoverCursor = 'pointer';
Workspace.hoverCursor = 'pointer';

Workspace.on('mouse:down', function(options) {
//	$("#cursorx").val(options.e.clientX);
//	$("#cursory").val(options.e.clientY);
	x = options.e.clientX;
	y = options.e.clientY;
});

Workspace.on('mouse:move', function(options) {
	var pt = {
		x : options.e.clientX,
		y : options.e.clientY
	};

	if (options.target != null) {
		if (options.target.get('subType') == 'fitting' && options.target.get('fill') == 'blue') {
			showInfo('western wall with water outlet');
		}
		else if (options.target.get('subType') == 'fitting' && options.target.get('fill') == 'red') {
			showInfo('northern wall with electrical outlet');
		}
		else
		showInfo(options.target.subType);
	}
});

Workspace.on('mouse:out', function(e) {
	$('#messageHover').text("");
});

Workspace.on('object:added', function(e) {
	if (e.target != null) {
		console.log(e.target.subType + " created");
	}
});

Workspace.on('object:removed', function(e) {
	if (e.target != null) {
		console.log(e.target.subType + " deleted");
	}
});


function clearInstruction(){
	$('#divItemList').hide();
}


Workspace.renderAll();