package CryptoConfigToJava.org.moflon;

import java.net.URL;
import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.moflon.core.utilities.MoflonUtilitiesActivator;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.runtime.AttributeDelta;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.DeltaSpecification;
import org.moflon.tgg.runtime.EMoflonEdge;

import com.kaleidoscope.extensionpoint.BXtool;
import com.kaleidoscope.ui.delta.javabased.JavaBasedDelta;
import com.kaleidoscope.ui.delta.javabased.operational.OperationalJavaBasedDelta;

import CryptoConfigToJava.CryptoConfigToJavaPackage;
import Deltameta.OperationalDelta;



public class EMoflonTool implements BXtool{

	
	private Path persistanceDirectory = null;
	private String sourceModelFileName = "fwd.src.xmi";
	private String targetModelFileName = "fwd.trg.xmi";
	private String corrModelFileName = "fwd.corr.xmi";
	private String syncProtocolFileName = "fwd.protocol.xmi";
	
	private ResourceSet set;
	private SynchronizationHelper helper;
	
	public EMoflonTool() {		
	}
	
	
	public void syncForwardFromDelta(Path absPathToDeltaSpec){
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		helper.loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		helper.setChangeSrc(executeDeltaSpec(absPathToDeltaSpec.toString()));
		
		helper.integrateForward();	
	}
	public void syncBackwardFromDelta(Path absPathToDeltaSpec){
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		helper.loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		helper.setChangeTrg(executeDeltaSpec(absPathToDeltaSpec.toString()));
			
		helper.integrateBackward();	
	}
	private void loadTriple(Path corrPath) {
		try {
			helper.loadCorr(corrPath.toString());
			CorrespondenceModel corrModel = (CorrespondenceModel) helper.getCorr();						
			helper.setTrg(corrModel.getTarget());
			helper.setSrc(corrModel.getSource());
			
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corrPath + ", " + iae.getMessage());
		}
	}
	public void persistModels() {
		helper.getSrc().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(sourceModelFileName).toString()));
		helper.getTrg().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(targetModelFileName).toString()));
		helper.getCorr().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(corrModelFileName).toString()));
		
		helper.saveCorr(persistanceDirectory.resolve(corrModelFileName).toString());
		helper.saveSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		helper.saveSrc(persistanceDirectory.resolve(sourceModelFileName).toString());		
		helper.saveTrg(persistanceDirectory.resolve(targetModelFileName).toString());
	}
	public void sourceToTargetTransformation(){
		helper.integrateForward();
		
	}
	public void targetToSourceTransformation(){
		helper.integrateBackward();		
	}
	public EObject getSourceModel(){
		if(helper.getSrc() == null){
			loadTriple(persistanceDirectory.resolve(corrModelFileName));
		}
		return helper.getSrc();
	}
	public EObject getTargetModel(){
		if(helper.getTrg() == null){
			loadTriple(persistanceDirectory.resolve(corrModelFileName));
		}
		return helper.getTrg();
	}
	public void setSourceModel(EObject sourceModel){
		Resource resource = set.createResource(URI.createURI("sourceModel.configuration"));	
		resource.getContents().add(0,(EObject) sourceModel);
		helper.setSrc(sourceModel);
	}
	public void setTargetModel(EObject targetModel){
		Resource resource = set.createResource(URI.createURI("targetModel.java"));	
		resource.getContents().add(0, (EObject) targetModel);
		helper.setTrg(targetModel);
	}
	public void setWorkingDirectory(Path persistanceDirectory){
		this.persistanceDirectory = persistanceDirectory;
	}
	public Path getWorkingDirectory(){
		return persistanceDirectory;
	}
	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		this.set = resourceSet;
		URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava");
		helper = new SynchronizationHelper(CryptoConfigToJavaPackage.eINSTANCE, pathToTGGtransProjet.getPath(), set);
	}
	private void performActionOnFeature(EMoflonEdge e, BiConsumer<EStructuralFeature, EObject> actionMany, BiConsumer<EStructuralFeature, EObject> actionOne) {
		EStructuralFeature feature = e.getSrc().eClass().getEStructuralFeature(e.getName());
		if(!feature.isDerived()){
			if (feature.isMany()) {
				actionMany.accept(feature, e.getTrg());
			} else
				actionOne.accept(feature, e.getTrg());
		}

	}
	protected Consumer<EObject> executeDeltaSpec(String pathToDelta)
	   {
	      DeltaSpecification localDeltaSpec = (DeltaSpecification) loadModel(pathToDelta);
	      EcoreUtil.resolveAll(localDeltaSpec);
	      //DeltaSpecification deltaSpec = EcoreUtil.copy(localDeltaSpec);
	      
	      return (input) -> {    	  
	    	  // Added edges (nodes are indirectly added)
	    	  for (EMoflonEdge ae : localDeltaSpec.getAddedEdges())
	    		  performActionOnFeature(ae, (f, o) -> ((EList) ae.getSrc().eGet(f)).add(o), ae.getSrc()::eSet);
	    	  
	         // Edge deletion
	         for (EMoflonEdge de : localDeltaSpec.getDeletedEdges())
	            performActionOnFeature(de, (f, o) -> ((EList) de.getSrc().eGet(f)).remove(o), (f, o) -> de.getSrc().eUnset(f));

	         // Node deletion
	         for (EObject delObj : localDeltaSpec.getDeletedNodes())
	            EcoreUtil.delete(delObj);

	         // Attribute deltas
	         for (AttributeDelta ac : localDeltaSpec.getAttributeChanges())
	            ac.getAffectedNode().eSet(ac.getAffectedAttribute(), EcoreUtil.createFromString(ac.getAffectedAttribute().getEAttributeType(), ac.getNewValue()));
	      };
	   }
	 private EObject loadModel(final String path)
	   {
	      Resource r = set.getResource(eMoflonEMFUtil.createFileURI(path, true), true);
	      return r.getContents().get(0);
	   }


	@Override
	public void syncForwardFromPathToDelta(Path absPathToDeltaSpec) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void syncForwardFromJavaBasedDelta(JavaBasedDelta javaBasedDelta) {
		OperationalJavaBasedDelta operationalJavaBasedDelta = (OperationalJavaBasedDelta)javaBasedDelta;
		Consumer<EObject> delta = operationalJavaBasedDelta.executeOperationalDelta();
		
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		helper.loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		helper.setChangeSrc(delta);
		
		helper.integrateForward();
	}


	@Override
	public void syncForwardFromOperationalDelta(OperationalDelta operationalDelta) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void syncBackwardFromJavaBasedDelta(JavaBasedDelta javaBasedDelta) {
		OperationalJavaBasedDelta operationalJavaBasedDelta = (OperationalJavaBasedDelta)javaBasedDelta;
		Consumer<EObject> delta = operationalJavaBasedDelta.executeOperationalDelta();
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		helper.loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		helper.setChangeTrg(delta);
			
		helper.integrateBackward();	
	}


	@Override
	public void syncBackwardFromOperationalDelta(Deltameta.OperationalDelta operatinalDelta) {
		// TODO Auto-generated method stub
		
	}
}
