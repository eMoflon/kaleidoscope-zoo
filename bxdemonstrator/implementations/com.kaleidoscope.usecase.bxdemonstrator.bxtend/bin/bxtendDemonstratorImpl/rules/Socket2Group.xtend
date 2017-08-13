package bxtendDemonstratorImpl.rules

import GridLanguage.Grid
import GridLanguage.GridLanguagePackage
import KitchenLanguage.Kitchen
import KitchenLanguage.KitchenLanguagePackage
import org.eclipse.emf.ecore.resource.Resource
import KitchenLanguage.ItemSocket
import GridLanguage.Group
import java.util.UUID

class Socket2Group  extends Elem2Elem{
	
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	
	override sourceToTarget(String s) {
		sourceModel.allContents.filter(typeof(Group))	
							   .filter[g | g.eContainer instanceof Grid && g.eContainer.getCorrModelElement(BxtendDemonstratorImplTransformation.grid2Kitchen).targetElement instanceof Kitchen] 						    					          
		.forEach[g | 			
				val corrTarget = g.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.socket2Group)
				val targetItemSocket = corrTarget.getOrCreateTargetElem(KitchenLanguagePackage.eINSTANCE.itemSocket) as ItemSocket
				
				if(targetItemSocket.id.equals(""))
					targetItemSocket.id = UUID.randomUUID().toString();
					
				var kitchen = (targetModel.contents.get(0)) as Kitchen;
				kitchen.itemSockets.add(targetItemSocket);											
		]
	}	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(ItemSocket))
								.filter[g | g.eContainer instanceof Kitchen && g.eContainer.getCorrModelElement(BxtendDemonstratorImplTransformation.grid2Kitchen).sourceElement instanceof Grid] 
		.forEach[i | 
				val corrTarget = i.getOrCreateCorrModelElement(BxtendDemonstratorImplTransformation.socket2Group)
				val groupElement = corrTarget.getOrCreateSourceElem(GridLanguagePackage.eINSTANCE.group) as Group
				val grid = getCorrModelElement(i.eContainer, BxtendDemonstratorImplTransformation.grid2Kitchen).sourceElement as Grid
				grid.groups.add(groupElement) 									
		]
	}
	
}
						