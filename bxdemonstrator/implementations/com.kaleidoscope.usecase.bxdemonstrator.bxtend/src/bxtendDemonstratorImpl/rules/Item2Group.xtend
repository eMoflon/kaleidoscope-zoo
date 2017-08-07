package bxtendDemonstratorImpl.rules

import GridLanguage.Block
import GridLanguage.Grid
import GridLanguage.Group
import KitchenLanguage.Fridge
import KitchenLanguage.Item
import KitchenLanguage.ItemSocket
import KitchenLanguage.KitchenLanguageFactory
import KitchenLanguage.KitchenLanguagePackage
import KitchenLanguage.Sink
import KitchenLanguage.Table
import java.util.Arrays
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import bxtendDemonstratorImpl.Corr

class Item2Group  extends Elem2Elem{
	
	protected String ruleID = "item2group";
	
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	def boolean checkIfBlockIsOccupiedByOtherGroup(Grid grid, Group group, Block block){
		
		return grid.groups.filter[g | !g.equals(group)].exists[g | g.occupies == block];
		
	}
	
	// check if it is possible to add horizontal table as a correspondence to the group
	def boolean chkAddHorzTableToCorrGroupPsbl(Grid grid, Block firstBlock, Block secondBlock){
	
		if(firstBlock.e != secondBlock && secondBlock.e != firstBlock)
			return false;
			
		
		return true;
	}
	
	// check if it is possible to add vertical table as a correspondence to the group
	def boolean chkAddVertTableToCorrGroupPsbl(Grid grid, Block firstBlock, Block secondBlock){

		if(firstBlock.s != secondBlock && secondBlock.s != firstBlock)
			return false;
			
		return true;
	}
	
	// check if it is possible to add fridge as a correspondence to the group
	def boolean chkAddFridgeToCorrGroupPsbl(Grid grid, Block firstBlock, Block secondBlock){
		
		if(firstBlock.s != secondBlock && secondBlock.s != firstBlock)
			return false;
			
    	if(firstBlock.n != null)
    		return false;
    		
		return true;
	}
	// check if it is possible to add sink as a correspondence to the group
	def boolean chkAddSinkToCorrGroupPsbl(Grid grid, Block firstBlock, Block secondBlock){
		
		
		if(firstBlock.e != secondBlock && secondBlock.e != firstBlock)
			return false;
			
    	if(firstBlock.w != null)
    		return false;
    		
		return true;
	}
	// check if it is possible to add a group as a correspondence to the horizontal table
	def boolean chkAddingCorrGroupToHrzTablePsbl(Grid grid, Table table, Group corrGroup){		
		var firstBlock = grid.blocks.findFirst[b | b.XIndex == (table.XPos as int)/(grid.blockSize as int) && 
		b.YIndex == (table.YPos as int)/(grid.blockSize as int)] as Block;
		
		
		if(firstBlock.e == null || (firstBlock.isOccupiedBy != null && firstBlock.isOccupiedBy != corrGroup)
			 || (firstBlock.e.isOccupiedBy != null && firstBlock.e.isOccupiedBy != corrGroup)
		){
			return false;
		}
		
		
		return true;
	}
	// check if it is possible to add a group as a correspondence to the vertical table
	def boolean chkAddingCorrGroupToVertTablePsbl(Grid grid, Table table, Group corrGroup){
		var firstBlock = grid.blocks.findFirst[b | b.XIndex == (table.XPos as int)/(grid.blockSize as int) && 
		b.YIndex == (table.YPos as int)/(grid.blockSize as int)] as Block;
		
		if(firstBlock.s == null || (firstBlock.isOccupiedBy != null && firstBlock.isOccupiedBy != corrGroup) 
			 || (firstBlock.s.isOccupiedBy != null && firstBlock.s.isOccupiedBy != corrGroup)
		){
			return false;
		}

		return true;
	}
	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(Item))
							   .filter[p | p.eContainer instanceof ItemSocket]					              
		.forEach[f | 
			
			    var itemSocket = f.eContainer;
			    var corrElement = itemSocket.getCorrModelElement(BxtendDemonstratorImplTransformation.socket2Group);
			    var corrGroup = corrElement.sourceElement as Group;
			    var grid = (sourceModel.contents.get(0)) as Grid;			    			    
			    
			    val int lookForXIndex = (f.XPos as int)/(grid.blockSize as int)
			    val int lookForYIndex = (f.YPos as int)/(grid.blockSize as int)		
			    // every item corresponds to two blocks. The first block has the same position as the item, while the second is placed next to the first
		    	var firstBlock = grid.blocks.findFirst[b | b.XIndex == lookForXIndex && 
		    												b.YIndex == lookForYIndex ] as Block;
		    												
		    	
		    	var firstBlockCorr = f.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.item2FirstBlock);
		    	var secondBlockCorr = f.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.item2SecondBlock);
		    	
				var oldFirstBlock = firstBlockCorr.sourceElement as Block
				var oldSecondBlock = secondBlockCorr.sourceElement as Block
				
				
					
				if(firstBlock != oldFirstBlock){
					
					if(oldFirstBlock != null && oldSecondBlock != null){
						oldFirstBlock.isOccupiedBy = null
						oldSecondBlock.isOccupiedBy = null						
					}

					// check of which type is f(Item)
			    	switch (f) {
			    		Sink: {
			    			
			    				
			    			// check if it is possible to set blocks to correspond to the f		    						    		
			    			if(firstBlock.w != null || (firstBlock.isOccupiedBy != null && firstBlock.isOccupiedBy != corrGroup) 
			    				|| firstBlock.e == null || (firstBlock.e.isOccupiedBy != null && firstBlock.e.isOccupiedBy != corrGroup)
			    			){			    					
								throw new SynchronizationError();
									
							}else{
								firstBlockCorr.sourceElement = firstBlock
								secondBlockCorr.sourceElement = firstBlock.e
								
								if(!corrGroup.occupies.contains(firstBlock)){					
									corrGroup.occupies.add(firstBlock)
								}
								if(!corrGroup.occupies.contains(firstBlock.e)){									
					    			corrGroup.occupies.add(firstBlock.e)
					    		}
							}
						
						
						
			    		}
			    		Fridge:{
			    			
			    			
			    				
				    			if((firstBlock.isOccupiedBy != null && firstBlock.isOccupiedBy != corrGroup) || firstBlock.n != null || 
				    									firstBlock.s == null || (firstBlock.s.isOccupiedBy != null && firstBlock.s.isOccupiedBy != corrGroup)
				    			){			    											
									throw new SynchronizationError();
									
								}else{
									firstBlockCorr.sourceElement = firstBlock
									secondBlockCorr.sourceElement = firstBlock.s
									
									if(!corrGroup.occupies.contains(firstBlock))
										corrGroup.occupies.add(firstBlock)
									if(!corrGroup.occupies.contains(firstBlock.s))
						    			corrGroup.occupies.add(firstBlock.s)
								}
							
							
			    		}
			    		
			    		Table:{
			    			
			    			if(chkAddingCorrGroupToHrzTablePsbl(grid, f as Table, corrGroup as Group) &&
			    								chkAddingCorrGroupToVertTablePsbl(grid, f as Table, corrGroup as Group)){
			    									
			    				CONTINUATION.choices =  Arrays.asList("create_a_horizontal_table", "create_a_vertical_table");
						
								var HashMap<String, EObject> functionContext = new HashMap<String, EObject>();
								functionContext.put("group", corrGroup);
								functionContext.put("firstBlock", firstBlock);
								functionContext.put("firstBlockCorr", firstBlockCorr);
								functionContext.put("secondBlockCorr", secondBlockCorr);
								CONTINUATION.context = functionContext
								
								val continuationFunction = [ HashMap<String, EObject> context, String decision | 
									
									if(decision.equals("create_a_horizontal_table")){
										var group =(context.get("group") as Group)
										var firstBlockContext = context.get("firstBlock") as Block
										var secondBlockContext = firstBlockContext.e as Block;
								 		var firstBlockCorrContext = context.get("firstBlockCorr") as Corr
								 		var secondBlockCorrContext = context.get("secondBlockCorr") as Corr
								 		
								 		firstBlockCorrContext.sourceElement = firstBlockContext
										secondBlockCorrContext.sourceElement = secondBlockContext
										
								 		if(!group.occupies.contains(firstBlockContext))
											group.occupies.add(firstBlockContext)
										if(!group.occupies.contains(secondBlockContext))
					    					group.occupies.add(secondBlockContext)
					    															
									}else if(decision.equals("create_a_vertical_table")){
										var group =(context.get("group") as Group)
										var firstBlockContext = (context.get("firstBlock") as Block) as Block
										var secondBlockContext = firstBlockContext.s as Block;
										var firstBlockCorrContext = context.get("firstBlockCorr") as Corr
								 		var secondBlockCorrContext = context.get("secondBlockCorr") as Corr
								 
								 		firstBlockCorrContext.sourceElement = firstBlockContext
										secondBlockCorrContext.sourceElement = secondBlockContext
										
										
								 		if(!group.occupies.contains(firstBlockContext))
											group.occupies.add(firstBlockContext)
										if(!group.occupies.contains(secondBlockContext))
					    					group.occupies.add(secondBlockContext)
									}
									return;
								]
								CONTINUATION.function = continuationFunction
								
			    			}else if(chkAddingCorrGroupToHrzTablePsbl(grid, f as Table, corrGroup as Group)){
			    				
			    				firstBlockCorr.sourceElement = firstBlock
								secondBlockCorr.sourceElement = firstBlock.e
									
			    				if(!corrGroup.occupies.contains(firstBlock))
			    					corrGroup.occupies.add(firstBlock)
			    				if(!corrGroup.occupies.contains(firstBlock.e))
					    			corrGroup.occupies.add(firstBlock.e)
					    		
			    			}else if(chkAddingCorrGroupToVertTablePsbl(grid, f as Table, corrGroup as Group)){
			    				
			    				firstBlockCorr.sourceElement = firstBlock
								secondBlockCorr.sourceElement = firstBlock.s
									
			    				if(!corrGroup.occupies.contains(firstBlock))
			    					corrGroup.occupies.add(firstBlock)
			    				if(!corrGroup.occupies.contains(firstBlock.s))
					    			corrGroup.occupies.add(firstBlock.s)
			    			}else{			    							    				
			    				throw new SynchronizationError();
			    			}
			    		}
			    		default: {
			    			
			    		}
			    	}
			    }
		]
	}	
	
	override sourceToTarget(String s) {
		sourceModel.allContents.filter(typeof(Group))
		.forEach[g | 
			
				val corrSource = g.getCorrModelElement(BxtendDemonstratorImplTransformation.socket2Group)
				val itemSocket = corrSource.targetElement as ItemSocket
				var item = itemSocket.item as Item
				var grid = (sourceModel.contents.get(0)) as Grid;
				
				if(item == null){
						var i = 0;
						var j = 0;
						
						for(i = 0; i < g.occupies.size();i++){
							for(j = 0; j<g.occupies.size;j++){
								
							
								var firstBlock = g.occupies.get(i);
								var secondBlock = g.occupies.get(j);
								
								
									if(checkIfBlockIsOccupiedByOtherGroup(grid, g, firstBlock) ||
											checkIfBlockIsOccupiedByOtherGroup(grid, g, secondBlock)){
										
										
													
									}else if(chkAddFridgeToCorrGroupPsbl(grid, firstBlock, secondBlock) && chkAddVertTableToCorrGroupPsbl(grid, firstBlock, secondBlock)){
																
										CONTINUATION.choices =  Arrays.asList("create_a_fridge", "create_a_vertical_table");
										
										var HashMap<String, EObject> functionContext = new HashMap<String, EObject>();
										functionContext.put("grid", grid);
										functionContext.put("firstBlock", firstBlock);
										functionContext.put("firstBlock", firstBlock);
										functionContext.put("secondBlock", secondBlock);
										
										val continuationFunction = [ HashMap<String, EObject> context, String decision | 
											var firstBlockContext = (context.get("firstBlock") as Block)
											var secondBlockContext = (context.get("secondBlock") as Block)
												
											if(decision.equals("create_a_fridge")){
												var Fridge fridge = KitchenLanguageFactory.eINSTANCE.createFridge();
												fridge.XPos = (context.get("firstBlock") as Block).XIndex * (context.get("grid") as Grid).blockSize
												fridge.YPos = (context.get("firstBlock") as Block).YIndex * (context.get("grid") as Grid).blockSize						
												itemSocket.item = fridge
												makeCorrBetweenItemBlock(fridge, firstBlockContext, secondBlockContext);	
											}else if(decision.equals("create_a_vertical_table")){
												var Table table = KitchenLanguageFactory.eINSTANCE.createTable();
												table.XPos = (context.get("firstBlock") as Block).XIndex * (context.get("grid") as Grid).blockSize
												table.YPos = (context.get("firstBlock") as Block).YIndex * (context.get("grid") as Grid).blockSize						
												itemSocket.item = table
												makeCorrBetweenItemBlock(table, firstBlockContext, secondBlockContext);	
											}
										]
										CONTINUATION.context = functionContext
										CONTINUATION.function = continuationFunction
										return;
										
									}else if(chkAddSinkToCorrGroupPsbl(grid, firstBlock, secondBlock) && chkAddHorzTableToCorrGroupPsbl(grid, firstBlock, secondBlock)){
										
										CONTINUATION.choices =  Arrays.asList("create_a_sink", "create_a_horizontal_table");
										
										var HashMap<String, EObject> functionContext = new HashMap<String, EObject>();
										functionContext.put("grid", grid);
										functionContext.put("firstBlock", firstBlock);
										functionContext.put("secondBlock", secondBlock);
										functionContext.put("itemSocket", itemSocket);
										
										val continuationFunction = [ HashMap<String, EObject> context, String decision | 
											
											if(decision.equals("create_a_sink")){
												var Sink sink = KitchenLanguageFactory.eINSTANCE.createSink();
												var firstBlockContext = (context.get("firstBlock") as Block)
												var secondBlockContext = (context.get("secondBlock") as Block)
												var itemSocketContext = context.get("itemSocket") as ItemSocket;
												sink.XPos = firstBlockContext.XIndex * (context.get("grid") as Grid).blockSize
												sink.YPos = firstBlockContext.YIndex * (context.get("grid") as Grid).blockSize						
												itemSocketContext.item = sink
												
												makeCorrBetweenItemBlock(sink, firstBlockContext, secondBlockContext);											
												
											}else if(decision.equals("create_a_horizontal_table")){
												var Table table = KitchenLanguageFactory.eINSTANCE.createTable();
												var firstBlockContext = (context.get("firstBlock") as Block)
												var secondBlockContext = (context.get("secondBlock") as Block)
												
												table.XPos = (context.get("firstBlock") as Block).XIndex * (context.get("grid") as Grid).blockSize
												table.YPos = (context.get("firstBlock") as Block).YIndex * (context.get("grid") as Grid).blockSize						
												itemSocket.item = table
												
												makeCorrBetweenItemBlock(table, firstBlockContext, secondBlockContext);
											}
										]
										CONTINUATION.context = functionContext
										CONTINUATION.function = continuationFunction
										return;
										
									}else if(chkAddFridgeToCorrGroupPsbl(grid, firstBlock, secondBlock)){
										var Fridge fridge = KitchenLanguageFactory.eINSTANCE.createFridge();
										fridge.XPos = firstBlock.XIndex * grid.blockSize
										fridge.YPos = firstBlock.YIndex * grid.blockSize						
										itemSocket.item = fridge
										
										makeCorrBetweenItemBlock(fridge, firstBlock, secondBlock);											
										return;
										
									}else if(chkAddSinkToCorrGroupPsbl(grid, firstBlock, secondBlock)){
										var Sink sink = KitchenLanguageFactory.eINSTANCE.createSink();
										sink.XPos = firstBlock.XIndex * grid.blockSize
										sink.YPos = firstBlock.YIndex * grid.blockSize						
										itemSocket.item = sink
										
										makeCorrBetweenItemBlock(sink, firstBlock, secondBlock);											
										return;
										
									}else if(chkAddVertTableToCorrGroupPsbl(grid, firstBlock, secondBlock)){
										var Table table = KitchenLanguageFactory.eINSTANCE.createTable();
										table.XPos = firstBlock.XIndex * grid.blockSize
										table.YPos = firstBlock.YIndex * grid.blockSize						
										itemSocket.item = table
										
										makeCorrBetweenItemBlock(table, firstBlock, secondBlock);											
										return;
										
									}else if(chkAddHorzTableToCorrGroupPsbl(grid, firstBlock, secondBlock)){
										var Table table = KitchenLanguageFactory.eINSTANCE.createTable();
										table.XPos = firstBlock.XIndex * grid.blockSize
										table.YPos = firstBlock.YIndex * grid.blockSize						
										itemSocket.item = table
									
										makeCorrBetweenItemBlock(table, firstBlock, secondBlock);											
										return;										
								}
						}
					}	
					
				}										
		]
	}
	def void makeCorrBetweenItemBlock(Item item, Block firstBlock, Block secondBlock){
		var firstBlockCorr = item.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.item2FirstBlock);
		var secondBlockCorr = item.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.item2SecondBlock);
		
		firstBlockCorr.sourceElement = firstBlock
		secondBlockCorr.sourceElement = secondBlock
	}
}