package CryptoConfigToJava.org.moflon;

import java.nio.file.Path;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.runtime.CorrespondenceModel;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;

import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;



public class EMoflonTool extends SynchronizationHelper implements  PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path> {

	
	private Path persistanceDirectory = null;
	private String sourceModelFileName = "fwd.src.xmi";
	private String targetModelFileName = "fwd.trg.xmi";
	private String corrModelFileName = "fwd.corr.xmi";
	private String syncProtocolFileName = "fwd.protocol.xmi";
	
	public  EMoflonTool(EPackage corrPackage, String pathToProject, ResourceSet resourceSet) {
		
		super(corrPackage, pathToProject, resourceSet);
				
	}
	
	private void loadTriple(Path corrPath) {
		try {
			loadCorr(corrPath.toString());
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();						
			setTrg(corrModel.getTarget());
			setSrc(corrModel.getSource());
			
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corrPath + ", " + iae.getMessage());
		}
	}
	
	@Override
	public void restoreState(Path path){
		persistanceDirectory = path;
		loadTriple(path.resolve(corrModelFileName));
	}
	
	@Override
	public void persistState(Path path) {
		
		persistanceDirectory = path;
		
		getSrc().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(sourceModelFileName).toString()));
		getTrg().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(targetModelFileName).toString()));
		getCorr().eResource().setURI(URI.createFileURI(persistanceDirectory.resolve(corrModelFileName).toString()));
		
		saveCorr(persistanceDirectory.resolve(corrModelFileName).toString());
		saveSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		saveSrc(persistanceDirectory.resolve(sourceModelFileName).toString());		
		saveTrg(persistanceDirectory.resolve(targetModelFileName).toString());
	}
	
	@Override
	public Task getSourceModel(){
		
		if(getSrc() == null){
			loadTriple(persistanceDirectory.resolve(corrModelFileName));
		}
		return (Task)getSrc();
	}
	
	public JavaPackage getTargetModel(){
		if(getTrg() == null){
			loadTriple(persistanceDirectory.resolve(corrModelFileName));
		}
		return (JavaPackage)getTrg();
	}
	
	
	public void syncForward(OperationalDelta javaBasedDelta){
		 
		Consumer<EObject> delta = javaBasedDelta.executeOperationalDelta();
		
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		setChangeSrc(delta);
		
		integrateForward();			
	 }
	 
	 @Override
	 public void syncBackward(OperationalDelta javaBasedDelta){		 
		 
		Consumer<EObject> delta = javaBasedDelta.executeOperationalDelta();
		
		loadTriple(persistanceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistanceDirectory.resolve(syncProtocolFileName).toString());
		setChangeTrg(delta);
			
		integrateBackward();	
						
	}

	@Override 
	public OperationalDelta getFailedDelta() {
		return null;
	}
	
	@Override
	public void setUpdatePolicy(String updatePolicy) {
		
	}
	
	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
