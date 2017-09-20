var trgModelMeta = {
	
   Layout:function(gridSize, blocks, groups, height, height, width){
	   this.gridSize = gridSize;
	   this.blocks = blocks;
	   this.groups = groups; 
	   this.height = height;
	   this.width = width;
	   
	   this.clearGroups = function(){
		 this.groups = [];  
	   };
	   this.setGridSize = function(gridSize){	
		   this.gridSize = gridSize;
	   };
	   
	   this.getGridSize = function(){
		   return this.gridSize;
	   };
	   this.addGroup = function(group){
		   this.groups.push(group);		   
	   };
	   this.addBlock = function(block){
		   this.blocks.push(block);		   
	   };
	   this.getBlockById = function(id){
		   for (i = 0; i < this.blocks.length; i++) { 
			    if(this.blocks[i].id === id)return blocks[i];
			}
	   };
	   this.removeAllBlocksByPosition = function(xIndex, yIndex){
		   var i;
		   for (i = 0; i < this.groups.length; i++) { 
			    while(this.groups[i].containsBlockByPosition(xIndex, yIndex)){
			    	this.groups[i].removeBlockByPosition(xIndex, yIndex);
			    }
			    
			}
	   };
	   
	   this.containsBlockByPosition = function(xIndex, yIndex){
		   for (i = 0; i < this.groups.length; i++) { 
			    if(this.groups[i].containsBlockByPosition(xIndex, yIndex))
			    	return true;
			    
			}
		   return false;
	   };
	   this.setOpacityOfGroup = function(fillColor, opacity){
		    var group = this.findGroupByColor(fillColor);
		    if(group != undefined)
		    	group.setOpacity(opacity);
	   };
	   
	   this.findGroupByColor = function(fillColor){
		   var i;
		   for (i = 0; i < this.groups.length; i++) { 
			    if(this.groups[i].getFillColor() === fillColor)
			    	return this.groups[i];
			    
			}
		   return undefined;
	   };
	   this.addBlock = function(xIndex, yIndex, fillColor){
		   var group = this.findGroupByColor(fillColor);
		   if(group == undefined){
			   group = this.addGroup(fillColor, false);
		   }
		   var rec = new trgModelMeta.Rectangle(undefined, xIndex, yIndex, fillColor);
		   group.addBlock(rec);
	   };
	   this.addGroup = function(fillColor, opacity){
		   var group  = new trgModelMeta.UIGroup([], fillColor, opacity);
		   this.groups.push(group);
		   
		   return group;
	   };
	   
   },
	
   UIGroup:function (blocks, fillColor, opacity){
	  this.blocks = blocks;
	  this.fillColor = fillColor;		 
	  this.opacity = opacity;
	  
	  this.setOpacity = function(opacity){
		  this.opacity = opacity;
	  };   
	  this.removeBlockByPosition = function(xIndex, yIndex){
		  for (i = 0; i < this.blocks.length; i++) { 
			    if(this.blocks[i].xIndex === xIndex && this.blocks[i].yIndex === yIndex){
			    	this.blocks.splice(i, 1);
			    	return;
			    }
			    
			}
	  };
	  this.containsBlockByPosition = function(xIndex, yIndex){
		  for (i = 0; i < this.blocks.length; i++) { 
			    if(this.blocks[i].xIndex === xIndex && this.blocks[i].yIndex === yIndex)return true;
			    
			}
		  return false;
	  };
	  this.getBlockById = function (id){
		  for (i = 0; i < this.blocks.length; i++) { 
			    if(this.blocks[i].id === id)return this.blocks[i];
			}
	  };
	  this.addBlock = function(block){
		  this.blocks.push(block);  
	  };
	  this.getFillColor = function(){
		  return this.fillColor;
	  };
	},
	
	Rectangle:function (id, xIndex, yIndex, fillColor){
		this.id = id;
		this.xIndex = xIndex;
		this.yIndex = yIndex;
		this.fillColor = fillColor;
		
		this.setXindex = function(xIndex){
			this.xIndex = xIndex;
		};
		this.getXindex = function(){
			return this.xIndex;
		};
		this.setYindex = function(yIndex){
			this.yIndex = yIndex;
		};
		this.getYindex = function(){
			return this.yIndex;
		};
		
		this.getFillColor = function(){
			return this.fillColor;
		};
		this.setFillColor = function(fillColor){
			this.fillColor = fillColor;
		};
		
		this.getId = function(){
			return this.id;
		};
		
	}
};






