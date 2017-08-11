package BxtendCryptoImpl.rules;

import org.eclipse.emf.ecore.resource.Resource
import java.util.List

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Map
import CryptoAPIConfig.CryptoAPIConfigFactory
import SimpleJava.SimpleJavaFactory
import CryptoAPIConfig.CryptoAPIConfigPackage
import SimpleJava.SimpleJavaPackage
import BxtendCryptoImpl.BxtendCryptoImplFactory
import BxtendCryptoImpl.Transformation
import BxtendCryptoImpl.Corr
import java.util.ArrayList

abstract class Elem2Elem {
	
	protected Resource sourceModel
	protected Resource targetModel
	protected Resource corrModel
	
	protected val sourceFactory = CryptoAPIConfigFactory::eINSTANCE
	protected val targetFactory = SimpleJavaFactory::eINSTANCE
	protected val corrFactory = BxtendCryptoImplFactory::eINSTANCE
	protected val sourcePackage = CryptoAPIConfigPackage::eINSTANCE
	protected val targetPackage = SimpleJavaPackage::eINSTANCE
	
	protected var String ruleID
	
	protected static Map<EObject, List<Corr>> elementsToCorr = newHashMap
	
	new(Resource src, Resource trgt, Resource corr) {
		sourceModel = src
		targetModel = trgt
		corrModel = corr	
		ruleID = "base"
		(corrModel.contents.get(0) as Transformation).correspondences.forEach[c |
			
			val sourceCorrList = elementsToCorr.get(c.sourceElement) as List<Corr>
			
			if(sourceCorrList == null){
				var newCorrList = newArrayList
				newCorrList.add(c)
				elementsToCorr.put(c.sourceElement, newCorrList)
				
			} else{
				sourceCorrList.add(c)
			}
			
			
			val targetCorrList = elementsToCorr.get(c.targetElement) as List<Corr>
			
			if(targetCorrList == null){
				var newCorrList = newArrayList
				newCorrList.add(c)
				elementsToCorr.put(c.targetElement, newCorrList)
				
			} else{
				targetCorrList.add(c)
			}
		]
	}
	
	def void sourceToTarget(String s) {
	}
	
	def void targetToSource(String s) {
	}
	
	def getCorrModelElem(EObject obj) {
		return elementsToCorr.get(obj)
	}
	def getCorrModelElement(EObject obj, String description) {
		var List<Corr> corr = obj.getCorrModelElem
		if(corr == null)return null
		return corr.findFirst[c | c.desc.equals(description)]
	}
	def getOrCreateCorrModelElement(EObject obj, String description) {
		var List<Corr> corrList = obj.getCorrModelElem
		
		if(corrList == null){
			corrList = new ArrayList<Corr>	
		}
		var corr = corrList.findFirst[c | c.desc.equals(description)]
		
		if(corr == null){
			corr = corrFactory.createBasicElem => [
			if (obj.eClass.EPackage instanceof CryptoAPIConfigPackage)
				sourceElement = obj
			if (obj.eClass.EPackage instanceof SimpleJavaPackage)
				targetElement = obj
			desc = description
			]
			(corrModel.contents.get(0) as Transformation).correspondences += corr
			
			corrList.add(corr) 
			elementsToCorr.put(corr.sourceElement, corrList)
			elementsToCorr.put(corr.targetElement, corrList)			
			
		}

		return corr
	}
		

	def createSourceElement(EClass clazz) {
		sourceFactory.create(clazz)
	}
	
	def createTargetElement(EClass clazz) {
		targetFactory.create(clazz)
	}
	
	def getOrCreateSourceElem(Corr corr, EClass clazz) {
		
		var EObject source  = corr.sourceElement
		if (corr.sourceElement == null){
			source = createSourceElement(clazz)
			corr.sourceElement = source
			
			var List<Corr> corrList = corr.sourceElement.getCorrModelElem
		
			if(corrList == null){
				corrList = new ArrayList<Corr>	
			}
			corrList.add(corr)
			elementsToCorr.put(corr.sourceElement, corrList)
		}
		return source
	}

	def getOrCreateTargetElem(Corr corr, EClass clazz) {
		var EObject target = corr.targetElement 
		if (target == null) {
			target = createTargetElement(clazz)
			corr.targetElement = target
			
			var List<Corr> corrList = corr.targetElement.getCorrModelElem
		
			if(corrList == null){
				corrList = new ArrayList<Corr>	
			}
			corrList.add(corr)
			elementsToCorr.put(corr.targetElement, corrList)
		}
		return target
	}
	
	
}