package org.builder;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.ControllerModule;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;

import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;
/**
 * @author Dusko
 * The class is used to build projects, which created by the NewCryptoAPIProject wizard.
 * The main role of the builer is to keep in sync Configuration model /models/config.xmi and SimpleJava model /src/java.xmi.
 * Each time a user makes a change in one of the file a corresponding methods has to be called in order to perform synchronization. 
 * In the beginning the project has only /models/config.xmi and /src/java.xmi needs to be generated.   
 */
public class CryptoAPIProjectBuilder extends IncrementalProjectBuilder implements IResourceDeltaVisitor {
	
	private IProject project;
	private Path projectPath;
	
	private ConfigJavaFilesRelation configJavaFilesRelation;
	private final ResourceSet set;
	
	private static final Logger logger = Logger.getLogger(CryptoAPIProjectBuilder.class);
	
	
	public CryptoAPIProjectBuilder() {
		set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    BasicConfigurator.configure();
	}
	
	
	/**
	 * Does the building of the project. First it checks whether  a src/java.xmi exists and if not it does initial transformation which transforms
	 * models/config.xmi to java.xmi. Then it checks if the model/config.xmi file exists and if not it transforms src/java.xmi into the models/config.xmi.
	 * After this step method visit is used to do synchronization when a change in files occurs.
	 */
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {		
		logger.info("Build is being performed.");
		
		project = getProject();
		projectPath = Paths.get(project.getLocation().toString());
		
		this.configJavaFilesRelation  = new ConfigJavaFilesRelation(project, set);
		
		switch (kind) {
		case CLEAN_BUILD:
			performClean();
			break;
		case FULL_BUILD:
			logger.info("Performing full build!");
			
			configJavaFilesRelation.reconstructRelations();
			Set<String> configurationModelsName = configJavaFilesRelation.getAllConfigurationModels();
			
			for (String configurationModelName : configurationModelsName) {
				// performs forward transformation on every configuration model for which  
				// there isn't corresponding java model
				if(configJavaFilesRelation.getJavaFiles(configurationModelName).isEmpty()){ 
					//syncForward(configurationModelName);	
				}
			}
			break;
		case AUTO_BUILD:
		case INCREMENTAL_BUILD:
			generateFilesIfchangeIsRelevant();
		default:
			break;
		}
		return null;
	}
	
	private void generateFilesIfchangeIsRelevant() throws CoreException {
		getDelta(getProject()).accept(this);
	}


	private void performClean() {
		
	}
	/**
	 * The method synchronizes the SimpleJava model located in /src/java.xmi with the Configuration model in /models/config.xmi. It is called
	 * each time a user performs a change inside the /models/config.xmi file and saves the file. 
	 * @throws CoreException
	 */
	private void syncForward(String configFileName, Optional<Path> initialSourceModelPath)throws CoreException{
		
		logger.info("Sync a java model with the configuration model " + configFileName + " is performed!");
		
		Path persistenceDestination = projectPath.resolve(Paths.get("models", "gen", configFileName));
		Path configAbsPath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		
		Injector injector = Guice.createInjector(new ControllerModule(set, persistenceDestination, null, projectPath, initialSourceModelPath));
		PersistentStateBasedController<Task, Path, JavaPackage, List<Path>, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, List<Path>, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		
		controller.syncForward(configAbsPath);
		
		refreshProject();
		logger.info("Sync a java model with the configuration model " + configFileName + " is done!");
	}
	
	/**
	 * The method synchronizes the Configuration model located in /src/java.xmi with the SimpleJava model in /src/java.xmi. It is called
	 * each time a user performs a change inside the /src/java.xmi file and saves the file. 
	 * @throws CoreException
	 */
	private void syncBackward(String configFileName)throws CoreException{
		logger.info("Sync configuration model " + configFileName + " with a java model is performed!");
		
		ArrayList<Path>javaFilePaths = configJavaFilesRelation.getJavaFiles(configFileName);	
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		Path persistenceDestination = projectPath.resolve(Paths.get("models", "gen", configFileName));
		
		Injector injector = Guice.createInjector(new ControllerModule(set, persistenceDestination, absConfigFilePath, projectPath, Optional.empty()));
		PersistentStateBasedController<Task, Path, JavaPackage, List<Path>, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, List<Path>, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		controller.syncBackward(javaFilePaths);
		
		refreshProject();
		logger.info("Sync configuration model " + configFileName + " with a java model is done!");
	}
	private void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		configJavaFilesRelation.reconstructRelations();
		
	}
	
	/**
	 * It is called for every change in a project. The method ignores changes in files that are located inside a bin folder.
	 * The methods responses only on changes inside the config files or .java. After the change is detected depending on the file, 
	 * a suitable synchronization is performed, forward or backward.
	 * @param delta is the resource that was changed
	 */
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		Pattern configFilePattern = Pattern.compile("models/[a-zA-Z]*[.]xmi", Pattern.CASE_INSENSITIVE);
		Pattern javaFilePattern = Pattern.compile(".+[.]java", Pattern.CASE_INSENSITIVE);
		
		String relFilePath = delta.getResource().getProjectRelativePath().toString();
		Path absFilePath = projectPath.resolve(Paths.get(relFilePath));
		
		Matcher configFileMatcher = configFilePattern.matcher(relFilePath);
	    Matcher javaFileMatcher = javaFilePattern.matcher(relFilePath);
	    		
		if(delta.getResource().getName().equals("bin")){
			return false;
		}
		
		if(delta.getResource().getType() != IResource.FILE)
			return true;		
		
		String fileName =delta.getResource().getFullPath().removeFileExtension().lastSegment(); 
		configJavaFilesRelation.reconstructRelations();
		
		if(configFileMatcher.matches()){
			
			if(delta.getKind() == IResourceDelta.ADDED){
				
				logger.info("ADDED change on a configuration model is detected!");					
				syncForward(fileName, Optional.of(absFilePath));	
			}
			if(delta.getKind() == IResourceDelta.CHANGED  && 
				configJavaFilesRelation.configurationExists(fileName)){
		
				logger.info("CHANGED change on a configuration model is detected!");
				syncForward(fileName, Optional.empty());				
			}
			
		}else if(javaFileMatcher.matches() && 
				configJavaFilesRelation.javaFileExists(absFilePath)){
			
			if(delta.getKind() == IResourceDelta.CHANGED){
				logger.info("CHANGED change on the java file is detected!");
				String configFileName = configJavaFilesRelation.getConfigurationModel(absFilePath);
				syncBackward(configFileName);
			}			
			
		}
		return true;
	}
}
