package org.builder;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private final ResourceSet set;	
	
	// every configuration path is related to one java package path
	private HashMap<String, String> confPathToJavaPackagePath = new HashMap<String, String>();
	private static final Logger logger = Logger.getLogger(CryptoAPIProjectBuilder.class);
	
	private void initializeConfFilenameToJavaPackage() {
		
		confPathToJavaPackagePath.put(Paths.get("models", "SymmEnc.xmi").toString(),  Paths.get("src", "crypto").toString());
	}
	
	public CryptoAPIProjectBuilder() {
		
		initializeConfFilenameToJavaPackage();
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
		
		switch (kind) {
			case CLEAN_BUILD:
				performClean();
				break;
			case FULL_BUILD:
				logger.info("Performing full build!");
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
	
	private String getSyncPersistanceDestinationRelPath(String sourceArtefactRelativeFilePath) {
		
		String splitter = File.separator.replace("\\","\\\\");
		String[] filePathSegments = sourceArtefactRelativeFilePath.split(splitter);
		List<String> filePathSegmentsList = new ArrayList<String>(Arrays.asList(filePathSegments));
		
		filePathSegmentsList.add(filePathSegments.length - 1, "gen");
		
		return  String.join(File.separator, filePathSegmentsList);
	}
	private void syncForward(IResource sourceArtefactResource, int kindOfChange)throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");
		
		String sourceArtefactRelativeFilePath = sourceArtefactResource.getProjectRelativePath().toOSString();
		String targetArtefactRelativeFilePath = confPathToJavaPackagePath.get(sourceArtefactRelativeFilePath);
		String syncPersistaneDestinationRelativePath = getSyncPersistanceDestinationRelPath(sourceArtefactRelativeFilePath);
		
		Injector injector = Guice.createInjector(new ControllerModule(set,
																	  projectPath.resolve(sourceArtefactRelativeFilePath),
																	  projectPath.resolve(targetArtefactRelativeFilePath),
																	  projectPath.resolve(syncPersistaneDestinationRelativePath)));
		
		PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		controller.syncForward(projectPath.resolve(sourceArtefactRelativeFilePath));
		
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");
	}
	
	/**
	 * The method synchronizes the Configuration model located in /src/java.xmi with the SimpleJava model in /src/java.xmi. It is called
	 * each time a user performs a change inside the /src/java.xmi file and saves the file. 
	 * @throws CoreException
	 */
	private void syncBackward(IResource targetArtefactResource, int kindOfChange)throws CoreException{
		logger.info("Sync configuration model  with a java model is performed!");
		
		String targetArtefactRelativeFilePath = targetArtefactResource.getProjectRelativePath().toOSString();
		String sourceArtefactRelativeFilePath = confPathToJavaPackagePath.entrySet().stream()
																					.filter(e -> e.getValue().equals(targetArtefactRelativeFilePath))
																					.findFirst()
																					.get()
																					.getKey();
		String syncPersistaneDestinationRelativePath = getSyncPersistanceDestinationRelPath(sourceArtefactRelativeFilePath);
		
		Injector injector = Guice.createInjector(new ControllerModule(set,
																	  projectPath.resolve(sourceArtefactRelativeFilePath),
																	  projectPath.resolve(targetArtefactRelativeFilePath),
																	  projectPath.resolve(syncPersistaneDestinationRelativePath)));
		
		PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		controller.syncBackward(projectPath.resolve(targetArtefactRelativeFilePath));
		
		refreshProject();
		logger.info("Sync configuration model  with a java model is done!");
	}
	private void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		
	}
	
	protected boolean isResourceTargetArtefact(IResource resource) {
		
		String changedResourceRelativeFilePath= resource.getProjectRelativePath().toOSString();
		boolean isResourceTargetArtefact = confPathToJavaPackagePath.containsValue(changedResourceRelativeFilePath);
		
		return isResourceTargetArtefact;
	}
	protected boolean isResourceSourceArtefact(IResource resource) {
		
		String changedResourceRelativeFilePath= resource.getProjectRelativePath().toOSString();
		boolean isResourceSourceArtefact = confPathToJavaPackagePath.containsKey(changedResourceRelativeFilePath);
		
		return isResourceSourceArtefact;
	}
	protected boolean isResourceToBeIgnored(IResource resource) {
		
		if(resource.getName().equals("bin")){
			return true;
		}
		
		return false;
	}
	/**
	 * It is called for every change in a project. The method ignores changes in files that are located inside a bin folder.
	 * The methods responses only on changes inside the config files or .java. After the change is detected depending on the file, 
	 * a suitable synchronization is performed, forward or backward.
	 * @param delta is the resource that was changed
	 */
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource changedResource = delta.getResource();
		
		delta.getKind();
		//IResourceDelta.ADDED;
		
		if(isResourceToBeIgnored(changedResource)) {
			return false;
		}
		
		if(isResourceSourceArtefact(changedResource)) {
		
			syncForward(changedResource, delta.getKind());
			
		}else if(isResourceTargetArtefact(changedResource)) {
			
			syncBackward(changedResource, delta.getKind());
		}
		
		return true;
	}
}
