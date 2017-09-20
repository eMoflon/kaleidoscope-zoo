/**
 * 
 */

function genColor(){
	return '#'+(0x1000000+(Math.random())*0xffffff).toString(16).substr(1,6);
}

function drawGrid() {

	var noOfBlocks = ($("#arrayNumber").val() === "") ? 5 : $("#arrayNumber")
			.val();
	var blockHeight = Layout.height / noOfBlocks;
	var blockWidth = Layout.width / noOfBlocks;
	for (var i = 0; i < noOfBlocks; i++) {
		for (var j = 0; j < noOfBlocks; j++) {
			var gOptions = {
				width : blockWidth,
				height : blockHeight,
				top : blockHeight * j,
				left : blockWidth * i,
				hasControls : false,
				stroke : '#000000',
				fill : 'transparent',
				lockMovementX : true,
				lockMovementY : true,
				borderColor : 'transparent',
			};
			var rOptions = {
				width : blockWidth,
				height : blockHeight,
				top : blockHeight * j,
				left : blockWidth * i,
				//rx: 10,
				//ry: 10,
				hasControls : false,
				stroke : '#000000',
				fill : 'transparent',
				lockMovementX : true,
				lockMovementY : true,
				borderColor : 'transparent',
				subType : 'block',
				xPos: i,
				yPos: j,
				id : 'block_' + i + '_' + j
			};
			//var c = new fabric.Rect(gOptions);
			var r = new fabric.Rect(rOptions);

			//canvas.add(c);
			Layout.add(r);
		}
	}
	//	$("#grid_btn").disabled = false;
	//	$("#arrayNumber").attr("disabled", "disabled");
}


function drawBorder() {

	Workspace.add(new fabric.Rect({
		width : 5,
		height : 500,
		left : 0,
		top : 0,
		hasControls : false,
		stroke : '#000000',
		fill : 'blue',
		lockMovementX : true,
		lockMovementY : true,
		borderColor : 'transparent',
		subType : 'fitting'
	}));    

	Workspace.add(new fabric.Rect({
		width : 500,
		height : 5,
		left : 0,
		top : 0,
		hasControls : false,
		stroke : '#000000',
		fill : 'red',
		lockMovementX : true,
		lockMovementY : true,
		borderColor : 'transparent',
		subType : 'fitting'
	}));
}