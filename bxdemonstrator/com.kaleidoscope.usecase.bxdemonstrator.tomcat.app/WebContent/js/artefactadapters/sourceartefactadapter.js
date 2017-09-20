/**
 * 
 */

Workspace.on('object:moving', function(e) {
	handleMove();
	
});

function visualiseKitchen(uiModels){
//Visualize Kitchen
	Workspace.clear();
	drawBorder();
	
	stopDeltaDiscoverer();
	restartDeltaDiscoverer();
	
	if (uiModels!= null && uiModels.workspace.objects.length > 0) {
		 //create items 
		for (var i = 0; i < uiModels.workspace.objects.length; i++) {
			
			var id = uiModels.workspace.objects[i].id; //ADDED
			var type = uiModels.workspace.objects[i].type;//ADDED
			var posX = uiModels.workspace.objects[i].posX;//ADDED
			var posY = uiModels.workspace.objects[i].posY;//ADDED
			
			var element = new srcModelMeta.Element(posX, posY, type, id, undefined);//ADDED
			element.sentFromServer = true;
			uiClientModels.workspace.addObject(element);//ADDED		
			
			if(uiModels.workspace.objects[i].type == 'Sink'){
			    addSinkVisualize(uiModels, i);			    			    					    			  
			}
			else if(uiModels.workspace.objects[i].type == 'Table') {
				addTableVisualize(uiModels, i);				
			}
			else {
				addFridgeVisualize(uiModels, i);				
			}
		}
	}	
	startDeltaDiscoverer();
}
function deleteObject() {
	if(Workspace.getActiveObject() == null)
		$('#messageDialog').text("Nothing to delete. Please select an item to delete.");
	else{
		//var itemID = Workspace.getActiveObject().id;
		//kitchen.getItemById(itemID).remove();
		
		handleDelete();
		Workspace.getActiveObject().remove();
	}
	
}
function handleDelete(){
	var itemCreated = false;
	var itemMoved = false;
	
	var id =  Workspace.getActiveObject().id; //ADDED
	uiClientModels.workspace.removeById(id);//ADDED
	
}
function handleMove(){
	var itemCreated = false;
	var itemMoved = false;
	
	var id =  Workspace.getActiveObject().id; //ADDED
	var type = Workspace.getActiveObject().subType;//ADDED
	var posX = Math.ceil(Workspace.getActiveObject().left);//ADDED
	var posY = Math.ceil(Workspace.getActiveObject().top);//ADDED
	
	var object = uiClientModels.workspace.getObjectById(id);//ADDED
	object.setPosX(posX);//ADDED
	object.setPosY(posY);//ADDED
	
}


function addObject() {
	var objectType = $("#objectSelect").val();
	
	if(objectType == "Sink"){
	    addSink(objectType, object_counter);}
	else if(objectType == "Table") {
		addTable(objectType, object_counter);}
	else {
		addFridge(objectType, object_counter);}
	
	
	var id = objectType + "_" + object_counter; //ADDED
	var type = objectType;//ADDED
	var posX = x - 584;//ADDED
	var posY = y - 92;//ADDED
	
	var element = new srcModelMeta.Element(posX, posY, type, id, undefined);//ADDED
	uiClientModels.workspace.addObject(element);//ADDED
	
	object_counter++;
}

function addSink(objectType, object_counter){
	fabric.Image.fromURL('assets/sink.png', function(img) {
		var oImg = img.set({ left: x - 584, top: y - 92, subType: objectType, id: objectType + "_" + object_counter}).scale(0.1);
        Workspace.add(oImg);
        });
}

function addSinkVisualize(uiModels, val){
	fabric.Image.fromURL('assets/sink.png', function(img) {
		var oImg = img.set({ left: uiModels.workspace.objects[val].posX, top: uiModels.workspace.objects[val].posY, subType: uiModels.workspace.objects[val].type, id: uiModels.workspace.objects[val].id}).scale(0.1);
        Workspace.add(oImg);
        });
}

function addTable(objectType, object_counter){
	fabric.Image.fromURL('assets/table.png', function(img) {
		var oImg = img.set({ left: x - 584, top: y - 92, subType: objectType, id: objectType + "_" + object_counter}).scale(0.15);
        Workspace.add(oImg);
        });
}

function addTableVisualize(uiModels, val){
	fabric.Image.fromURL('assets/table.png', function(img) {
		var oImg = img.set({ left: uiModels.workspace.objects[val].posX, top: uiModels.workspace.objects[val].posY, subType: uiModels.workspace.objects[val].type, id: uiModels.workspace.objects[val].id}).scale(0.15);
        Workspace.add(oImg);
        });
}

function addFridge(objectType, object_counter){
	fabric.Image.fromURL('assets/fridge.png', function(img) {
		var oImg = img.set({ left: x - 584, top: y - 92, subType: objectType, id: objectType + "_" + object_counter}).scale(0.1);
        Workspace.add(oImg);
        });
}

function addFridgeVisualize(uiModels, val){
	fabric.Image.fromURL('assets/fridge.png', function(img) {
		var oImg = img.set({ left: uiModels.workspace.objects[val].posX, top: uiModels.workspace.objects[val].posY, subType: uiModels.workspace.objects[val].type, id: uiModels.workspace.objects[val].id}).scale(0.1);
        Workspace.add(oImg);
        });
}
