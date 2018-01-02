package org.kaleidoscope.usecase.kaleidocrypt.builder;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.kaleidoscope.usecase.kaleidocrypt.ControllerModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;

import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;


public class CryptoAPIProjectBuilder extends IncrementalProjectBuilder implements IResourceDeltaVisitor, Builder {
	
	private IProject project;
	private Path projectPath;	
	
	// every configuration path is related to one java package path
	private HashMap<String, String> confPathToJavaPackagePath = new HashMap<String, String>();
	private static final Logger logger = Logger.getLogger(CryptoAPIProjectBuilder.class);
	
	private void initializeConfFilenameToJavaPackage() {
		
		confPathToJavaPackagePath.put(Paths.get("models", "SymmEnc.xmi").toString(),  Paths.get("src", "crypto").toString());
	}
	
	public CryptoAPIProjectBuilder() {
		 
		initializeConfFilenameToJavaPackage();	    
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {		
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
		logger.info("Clean project!");
	}
	
	private String getSyncPersistanceDestinationRelPath(String sourceArtefactRelativeFilePath) {
		
		String splitter = File.separator.replace("\\","\\\\");
		String[] filePathSegments = sourceArtefactRelativeFilePath.split(splitter);
		List<String> filePathSegmentsList = new ArrayList<String>(Arrays.asList(filePathSegments));
		
		filePathSegmentsList.add(filePathSegments.length - 1, "gen");
		
		return  String.join(File.separator, filePathSegmentsList);
	}
	
	private ResourceSet createNewResourceSet() {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());	
		return set;
	}
	
	@Override
	public void syncForward(IResource sourceArtefactResource)throws CoreException{
		
		logger.info("===================SYNC FORWARD STARTED===================");
		
		String sourceArtefactRelativeFilePath = sourceArtefactResource.getProjectRelativePath().toOSString();
		String targetArtefactRelativeFilePath = confPathToJavaPackagePath.get(sourceArtefactRelativeFilePath);
		String syncPersistaneDestinationRelativePath = getSyncPersistanceDestinationRelPath(sourceArtefactRelativeFilePath);

		logger.info("Target artefact relative file path:" + targetArtefactRelativeFilePath);
		logger.info("Source artefact relative file path:" + sourceArtefactRelativeFilePath);
		
		Injector injector = Guice.createInjector(new ControllerModule(createNewResourceSet(),
																	  projectPath.resolve(sourceArtefactRelativeFilePath),
																	  projectPath.resolve(targetArtefactRelativeFilePath),
																	  projectPath.resolve(syncPersistaneDestinationRelativePath)));
		
		PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		try {
			controller.initialise();
			controller.syncForward(projectPath.resolve(sourceArtefactRelativeFilePath));
		} catch (SynchronisationFailedException e) {
			logger.error("Synchronisation failed: "+ e.getMessage());
			e.printStackTrace();
		}
		
		
		refreshProject();
		logger.info("===================SYNC FORWARD FINISHED===================");
	}
	
	@Override
	public void syncBackward(IResource targetArtefactResource)throws CoreException{
		logger.info("===================SYNC BACWARD STARTED===================");
		
		String targetArtefactRelativeFilePath = targetArtefactResource.getProjectRelativePath().toOSString();
		String sourceArtefactRelativeFilePath = confPathToJavaPackagePath.entrySet().stream()
																					.filter(e -> e.getValue().equals(targetArtefactRelativeFilePath))
																					.findFirst()
																					.get()
																					.getKey();
		String syncPersistaneDestinationRelativePath = getSyncPersistanceDestinationRelPath(sourceArtefactRelativeFilePath);
		
		logger.info("Target artefact relative file path:" + targetArtefactRelativeFilePath);
		logger.info("Source artefact relative file path:" + sourceArtefactRelativeFilePath);
		
		Injector injector = Guice.createInjector(new ControllerModule(createNewResourceSet(),
																	  projectPath.resolve(sourceArtefactRelativeFilePath),
																	  projectPath.resolve(targetArtefactRelativeFilePath),
																	  projectPath.resolve(syncPersistaneDestinationRelativePath)));
		
		PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path> controller = 
				injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		try {
			controller.initialise();
			controller.syncBackward(projectPath.resolve(targetArtefactRelativeFilePath));
		} catch (SynchronisationFailedException e1) {
			logger.error("Synchronisation failed: "+ e1.getMessage());
			e1.printStackTrace();
		}
		
		refreshProject();
		logger.info("===================SYNC BACWARD FINISHED===================");
	}
	private void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		
	}
	
	@Override
	public boolean isResourceTargetArtefact(IResource resource) {
		
		String changedResourceRelativeFilePath= resource.getProjectRelativePath().toOSString();
		boolean isResourceTargetArtefact = confPathToJavaPackagePath.containsValue(changedResourceRelativeFilePath);
		
		return isResourceTargetArtefact;
	}
	
	@Override
	public boolean isResourceSourceArtefact(IResource resource) {
		
		String changedResourceRelativeFilePath= resource.getProjectRelativePath().toOSString();
		boolean isResourceSourceArtefact = confPathToJavaPackagePath.containsKey(changedResourceRelativeFilePath);
		
		return isResourceSourceArtefact;
	}
	
	@Override
	public boolean isResourceToBeIgnored(IResource resource) {
		
		if(resource.getName().equals("bin")){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource changedResource = delta.getResource();
		
		if(isResourceToBeIgnored(changedResource)) {
			return false;
		}
		
		if(isResourceSourceArtefact(changedResource)) {
			
			syncForward(changedResource);
			
		}else if(isResourceTargetArtefact(changedResource)) {
			
			syncBackward(changedResource);
		}
		
		return true;
	}
}
