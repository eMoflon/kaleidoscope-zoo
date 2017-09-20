/**
 * 
 */


var srcModelMeta = {
	
	Workspace:function (objects, objectTypeList, height, width){
		  this.height = height;
		  this.width = width;
		  this.objects = objects;
		  this.objectTypeList = objectTypeList;			  
		  
		  this.getObjectById = function (id){
			  for (i = 0; i < this.objects.length; i++) { 
				    if(objects[i].id === id)return objects[i];
				}
		  };
		  this.addObject = function(object){
			  this.objects.push(object);  
		  };
		  this.removeById = function(id){
			  for (i = 0; i < this.objects.length; i++) { 
				    if(objects[i].id === id){
				    	objects.splice(i, 1);
				    }
				}
		  }
		},
	
	Element:function (posX, posY, type, id, fillColor){
		  this.posX = posX;
		  this.posY = posY;
		  this.type = type;
		  this.id = id;
		  this.fillColor = fillColor;
		  
		  this.setPosX = function(posX){
			this.posX = posX;  
			  
		  };
		  
		  this.setPosY = function(posY){
			  this.posY = posY;
		  };
		  
		  this.setType = function(type){
			  this.type = type;
		  };
		  
		  this.setId = function(id){
			  this.id = id;
		  };
	},
};

