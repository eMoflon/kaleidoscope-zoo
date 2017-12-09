package CryptoConfigToJava.org.moflon;

import java.nio.file.Path;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.language.algorithm.TempOutputContainer;
import org.moflon.tgg.runtime.CorrespondenceModel;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;

import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;



public class EMoflonTool extends SynchronizationHelper implements  PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path> {

	
	private Path persistenceDirectory = null;
	private String sourceModelFileName = "fwd.src.xmi";
	private String targetModelFileName = "fwd.trg.xmi";
	private String corrModelFileName = "fwd.corr.xmi";
	private String syncProtocolFileName = "fwd.protocol.xmi";
	private Task initialTask;
	private JavaPackage initialJavaPackage;
	
	public  EMoflonTool(EPackage corrPackage, String pathToProject, ResourceSet resourceSet, Task initialTask, JavaPackage initialJavaPackage, Path persistenceDirectory) {
		
		super(corrPackage, pathToProject, resourceSet);
		this.initialTask = initialTask;
		this.initialJavaPackage = initialJavaPackage;
		this.persistenceDirectory = persistenceDirectory;
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
		persistenceDirectory = path;
		loadTriple(path.resolve(corrModelFileName));
	}
	
	@Override
	public void persistState(Path path) {
		
		persistenceDirectory = path;
		
		if(getSrc() == null || getTrg() == null || getCorr() == null )
			return;
		
		getSrc().eResource().setURI(URI.createFileURI(persistenceDirectory.resolve(sourceModelFileName).toString()));
		getTrg().eResource().setURI(URI.createFileURI(persistenceDirectory.resolve(targetModelFileName).toString()));
		getCorr().eResource().setURI(URI.createFileURI(persistenceDirectory.resolve(corrModelFileName).toString()));
		
		saveCorr(persistenceDirectory.resolve(corrModelFileName).toString());
		saveSynchronizationProtocol(persistenceDirectory.resolve(syncProtocolFileName).toString());
		saveSrc(persistenceDirectory.resolve(sourceModelFileName).toString());		
		saveTrg(persistenceDirectory.resolve(targetModelFileName).toString());
	}
	
	@Override
	public Task getSourceModel(){

		return (Task)getSrc();
	}
	
	@Override
	public JavaPackage getTargetModel(){
	
		return (JavaPackage)getTrg();
	}
	
	@Override
	public void syncForward(OperationalDelta javaBasedDelta)throws SynchronisationFailedException{
		
		Consumer<EObject> delta = (model) -> {javaBasedDelta.transformToOpaqueDelta().execute(model);};
		
		loadTriple(persistenceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistenceDirectory.resolve(syncProtocolFileName).toString());
		setChangeSrc(delta);
		
		integrateForward();		
		
		if(getSrc() == null || getTrg() == null ||
				getSrc() instanceof TempOutputContainer || getTrg() instanceof TempOutputContainer){
			
			throw new SynchronisationFailedException("Unable to propagate change!");
		}
	 }
	 
	 @Override
	 public void syncBackward(OperationalDelta javaBasedDelta)throws SynchronisationFailedException{		 
		 
		 Consumer<EObject> delta = (model) -> {javaBasedDelta.transformToOpaqueDelta().execute(model);};
		
		loadTriple(persistenceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistenceDirectory.resolve(syncProtocolFileName).toString());
		setChangeTrg(delta);
			
		integrateBackward();	
		
		if(getSrc() == null || getTrg() == null ||
				getSrc() instanceof TempOutputContainer || getTrg() instanceof TempOutputContainer){
			
			throw new SynchronisationFailedException("Unable to propagate change!");
		}
	}

	@Override 
	public OperationalDelta getFailedDelta() {
		return new OperationalDelta();
	}
	
	@Override
	public void setUpdatePolicy(String updatePolicy) {
		
	}
	
	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initialize() throws SynchronisationFailedException{

				
		if(initialTask != null) {
			
			transformSourceIntoTargetModel();
			persistState(persistenceDirectory);
			
		}else if(initialJavaPackage != null) {
			
			transformTargetIntoSourceModel();
			persistState(persistenceDirectory);
		}			
		
	}
	
	private void transformTargetIntoSourceModel()throws SynchronisationFailedException {
		
		Resource target = set.createResource(URI.createURI("target.java.package"));
		target.getContents().add(initialJavaPackage);
		setTrg(initialJavaPackage);
		integrateBackward();
		
		if(getSrc() == null || getSrc() instanceof TempOutputContainer) {
			throw new SynchronisationFailedException("Failed to initialize source and target models!");
		}

	}
	private void transformSourceIntoTargetModel()throws SynchronisationFailedException {
		
		Resource source = set.createResource(URI.createURI("source.java.package"));
		source.getContents().add(initialTask);
		setSrc(initialTask);
		integrateForward();
		
		if(getTrg() == null || getTrg() instanceof TempOutputContainer) {
			throw new SynchronisationFailedException("Failed to initialize source and target models!");
		}
	}

}
