package BxtendCryptoImpl.rules

import org.eclipse.emf.ecore.resource.Resource
import CryptoAPIConfig.Import
import CryptoJava.JavaImport
import CryptoJava.CryptoJavaPackage
import CryptoAPIConfig.CryptoAPIConfigPackage
import CryptoAPIConfig.SymmetricBlockCipher
import CryptoAPIConfig.Task
import CryptoJava.JavaCompilationUnit

class Import2JavaImport  extends Elem2Elem{
	
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	
	override sourceToTarget(String s) {
		sourceModel.allContents.filter(typeof(SymmetricBlockCipher))
							   .filter[p | p.eContainer instanceof Task 
					              && (p.eContainer as Task).description.equals("SymmetricEncryption")]
		.forEach[c | 
			c.imports.forEach[i |
				val corrTarget = i.getOrCreateCorrModelElement(BxtendCryptoImplTransformation.import2JavaImport)
				val targetElement = corrTarget.getOrCreateTargetElem(CryptoJavaPackage.eINSTANCE.javaImport) as JavaImport
				targetElement.value = i.value
				val targetModelContents = targetModel.contents
				if(!targetModel.contents.contains(targetElement)){
					
					
					var javaCompilationUnit = c.getCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaCompilationUnitCorr)
												.targetElement as JavaCompilationUnit
					
					var maxIndex = -1
					if(javaCompilationUnit.imports != null && javaCompilationUnit.imports.size != 0)
						maxIndex = javaCompilationUnit.imports.maxBy[index].index	
					
					targetElement.index = maxIndex + 1												
					javaCompilationUnit.imports.add(targetElement)
				}					
			]			
		]
	}	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(JavaCompilationUnit))
		.forEach[c | 
			c.imports.forEach[i |
				val corrTarget = i.getOrCreateCorrModelElement(BxtendCryptoImplTransformation.import2JavaImport)
				val targetElement = corrTarget.getOrCreateSourceElem(CryptoAPIConfigPackage.eINSTANCE.import) as Import
				
				if(!sourceModel.contents.contains(targetElement)){
					var symmBlockCipher = c.getCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaCompilationUnitCorr)
												.sourceElement as SymmetricBlockCipher
					symmBlockCipher.imports.add(targetElement)										
				}
				targetElement.value = i.value					
			]			
		]
	}
	
}