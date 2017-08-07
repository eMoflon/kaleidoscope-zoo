package bxtendDemonstratorImpl.rules

import GridLanguage.Grid
import GridLanguage.GridLanguagePackage
import KitchenLanguage.Kitchen
import KitchenLanguage.KitchenLanguagePackage
import org.eclipse.emf.ecore.resource.Resource

class Grid2Kitchen  extends Elem2Elem{
	
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	
	override sourceToTarget(String s) {
		sourceModel.allContents.filter(typeof(Grid))							    					          
		.forEach[g | 			
				val corrTarget = g.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.grid2Kitchen)
				val targetElement = corrTarget.getOrCreateTargetElem(KitchenLanguagePackage.eINSTANCE.kitchen) as Kitchen
				
				if(g.blockSize == 0)
					g.blockSize = 100;
				
				if(targetElement.XSize == 0)
					targetElement.XSize = 500;
					
				if(targetElement.YSize == 0)
					targetElement.YSize = 500;
					
					
				if(!targetModel.contents.contains(targetElement))	
					targetModel.contents.add(targetElement)
				
		]
	}	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(Kitchen))
		.forEach[k | 
				val corrTarget = k.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.grid2Kitchen)
				val targetElement = corrTarget.getOrCreateSourceElem(GridLanguagePackage.eINSTANCE.grid) as Grid
				
				if(targetElement.blockSize == 0)
					targetElement.blockSize = 100;
				
				if(k.XSize == 0)
					k.XSize = 100;
					
				if(k.YSize == 0)
					k.YSize = 100;
										
		]
	}
	
}