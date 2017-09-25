package com.kaleidoscope.usecase.showcase.third.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.third.controller.ControllerModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;


  
public class Builder extends IncrementalProjectBuilder implements IResourceDeltaVisitor {
	
	private IProject project;
	private Path projectPath;
	private ControllerModule controllerModule;
	
	private static final Logger logger = Logger.getLogger(Builder.class);
	
	
	public Builder() {
	    BasicConfigurator.configure();
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {		
		logger.info("Build is being performed.");
		project = getProject();
		projectPath = Paths.get(project.getLocation().toString());
		controllerModule = new ControllerModule(projectPath, projectPath.resolve(Paths.get("models", "gen")));
		
		switch (kind) {
			case CLEAN_BUILD:
				performClean();
				break;
			case FULL_BUILD:			
				syncForward();
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
	
	
	private void syncForward()	throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");
		PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path> controller = controllerModule.getControllerInstance();
		
		controller.syncForward(projectPath.resolve(Paths.get("models", "src.delta.xmi")));
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");
	}
	
	private void syncBackward()	throws CoreException{
		logger.info("Sync configuration model with a java model is performed!");
		PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path> controller = controllerModule.getControllerInstance();
		
		controller.syncBackward(projectPath.resolve(Paths.get("models", "trg.delta.xmi")));
		refreshProject();
		logger.info("Sync configuration model with a java model is done!");
	}
	
	private void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		
		String relFilePath = delta.getResource().getProjectRelativePath().toString();
			
		if(delta.getResource().getName().equals("bin")){
			return false;
		}
		
		if(delta.getResource().getType() != IResource.FILE)
			return true;		
		

		if(relFilePath.contentEquals("models/src.delta.xmi")){
			
			syncForward();
			
		}else if(relFilePath.contentEquals("models/trg.delta.xmi")){
			
			syncBackward();		
			
		}
		return true;
	}
}
