package BxtendCryptoImpl.rules;

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import java.util.List
import BxtendCryptoImpl.BxtendCryptoImplFactory
import BxtendCryptoImpl.Corr

public class BxtendCryptoImplTransformation {
	
	private Resource sourceModel
	private Resource targetModel
	private Resource corrModel
	
	private List<Elem2Elem> rules = new ArrayList<Elem2Elem>();
	
	
	public final static String symmetricEncryption2JavaLiteralCorr = "SymmetricEncryption2JavaLiteral";
	public final static String task2JavaCompilationUnitCorr = "Task2JavaCompilationUnit";
	public final static String task2JavaPackageCorr = "Task2JavaPackage";
	public final static String symmetricEncryption2JavaCompilationUnitCorr = "SymmetricEncryption2JavaCompilationUnitCorr"
	public final static String import2JavaImport = "Import2JavaImport"
	
	new(URI source, URI target, URI correspondence) {
		val ResourceSet set = new ResourceSetImpl();
		sourceModel = set.getResource(source, true)
		targetModel = set.getResource(target, true)
		corrModel = set.getResource(correspondence, true)
		
		if (corrModel.contents.size == 0) {
			corrModel.contents.add(BxtendCryptoImplFactory.eINSTANCE.createTransformation)	
		}

		// TODO: add your rules in the proper order to the 'rules' List				
	}
	
	new(Resource source, Resource target, Resource correspondence) {
		
		sourceModel = source
		targetModel = target
		corrModel = correspondence
		
		if (corrModel.contents.size == 0) {
			corrModel.contents.add(BxtendCryptoImplFactory.eINSTANCE.createTransformation)	
		}
		
		addRules();
	}
	
	/**
	 * Fuegt alle Regeln zum rules-Set hinzu. Sollte im Konstruktor aufgerufen werden.
	 */
	def private void addRules() {
		//Falls das corrModel noch keine Transformation enthaelt.
		if (corrModel.contents.isEmpty()) {
			corrModel.contents.add(BxtendCryptoImplFactory::eINSTANCE.createTransformation)
		}
		rules.add(new SymmetricEncryption2Class(sourceModel, targetModel, corrModel))
		rules.add(new SymmetricEncryption2JavaLiteral(sourceModel, targetModel, corrModel))
		rules.add(new Import2JavaImport(sourceModel, targetModel, corrModel))		
	}
	
	def void sourceToTarget() {
		if (sourceModel.contents.size != 0)
		for (Elem2Elem e : rules) {
			e.sourceToTarget("Import")
		}
		
		// handle deletions
		deleteUnreferencedTargetElements
	}
	
	def void targetToSource() {		
		if (targetModel.contents.size != 0)
		for (Elem2Elem e: rules) {
			e.targetToSource("Import")
		}
		
		// handle deletions
		deleteUnreferencedSourceElements
	}
	
	def boolean checkCorrespondences() {
		true
	}
	
	def detectSourceDeletions() {
		corrModel.allContents.filter(typeof(Corr)).filter[ c |
			c.sourceElement === null
		]
	}
		
	def detectTargetDeletions() {
		corrModel.allContents.filter(typeof(Corr)).filter[ c |
			c.targetElement === null 
		]
	}
	
	def deleteUnreferencedTargetElements(){
		val List<EObject> deletionList = newArrayList; 
		
		detectSourceDeletions().forEach[c |
			// TODO: add handling of contained and referenced Elements here if appropriate			
			// end
			deletionList += c.targetElement
			deletionList += c
		]
		deletionList.forEach[e | EcoreUtil.delete(e, true)]
	}
	
	def deleteUnreferencedSourceElements(){
		val List<EObject> deletionList = newArrayList; 
		
		detectTargetDeletions().forEach[c |
			// TODO: add handling of contained and referenced Elements here if appropriate
			
			// end
			deletionList += c.sourceElement
			deletionList += c
		]
		deletionList.forEach[e | EcoreUtil.delete(e, true)]
	}
}