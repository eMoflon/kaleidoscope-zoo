package CryptoConfigToJava.org.moflon;

import java.io.File;
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

import CryptoAPIConfig.CryptoAPIConfigFactory;
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
	
	private boolean isStatePersisted(Path persistenceDirectory) {
		
		File sourceModelFile = persistenceDirectory.resolve(sourceModelFileName).toFile();
		File targetModelFile = persistenceDirectory.resolve(targetModelFileName).toFile();
		File correspondentModelFile = persistenceDirectory.resolve(corrModelFileName).toFile();
		
		if(!sourceModelFile.exists() || !targetModelFile.exists() || !correspondentModelFile.exists())
			return false;
		
		return true;
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
		
		if(getSrc() == null || getSrc() instanceof TempOutputContainer){
			Task task = CryptoAPIConfigFactory.eINSTANCE.createTask();
			Resource resource = getResourceSet().createResource(URI.createURI("source.model"));
			resource.getContents().add(task);
			setSrc(task);
		}
		return (Task)getSrc();
	}
	
	@Override
	public JavaPackage getTargetModel(){
		if(getTrg() == null){
			loadTriple(persistenceDirectory.resolve(corrModelFileName));
		}
		return (JavaPackage)getTrg();
	}
	
	@Override
	public void syncForward(OperationalDelta javaBasedDelta){
		 
		Consumer<EObject> delta = (model) -> {javaBasedDelta.transformToOpaqueDelta().execute(model);};
		
		loadTriple(persistenceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistenceDirectory.resolve(syncProtocolFileName).toString());
		setChangeSrc(delta);
		
		integrateForward();			
	 }
	 
	 @Override
	 public void syncBackward(OperationalDelta javaBasedDelta){		 
		 
		 Consumer<EObject> delta = (model) -> {javaBasedDelta.transformToOpaqueDelta().execute(model);};
		
		loadTriple(persistenceDirectory.resolve(corrModelFileName));
		loadSynchronizationProtocol(persistenceDirectory.resolve(syncProtocolFileName).toString());
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

		if(isStatePersisted(persistenceDirectory))
			return;
				
		if(initialTask != null) {
			
			set.getResources().add(initialTask.eResource());
			setSrc(initialTask);
			integrateForward();
			persistState(persistenceDirectory);
		}else if(initialJavaPackage != null) {
			
			Resource target = set.createResource(URI.createURI("target.java.package"));
			target.getContents().add(initialJavaPackage);
			setTrg(initialJavaPackage);
			integrateBackward();
			persistState(persistenceDirectory);
		}			
	}
	/*
	@Override
	public void initialize() {
		initialSourceModelPath.ifPresent((p) -> {
			if(p.toFile().exists()) {
			loadSrc(p.toString());			
			integrateForward();	
			}
		});
		
		
		initialSourceModelFile = initialSourceModelPath.
		if(initialSourceModelPath.isPresent()) {
			
		}
		
	}*/

}
