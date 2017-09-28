package com.kaleidoscope.usecase.showcase.first.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;
  
public class Builder extends IncrementalProjectBuilder implements IResourceDeltaVisitor {
	
	protected IProject project;
	protected Path projectPath;
	
	private class ControllerType extends 
	TypeLiteral<PersistentStateBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String, 
		OperationalDelta,
		OperationalDelta, 
		Path>>{}
	
	protected static final Logger logger = Logger.getLogger(Builder.class);
	
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
	
	public 
	PersistentStateBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String,  
		OperationalDelta, 
		OperationalDelta, 
		Path
		> 
	getControllerInstance() {
		Injector injector = Guice.createInjector(
				new ControllerModule(projectPath.resolve(Paths.get("models"))), 
				new ArtefactAdapterModule(projectPath)
			);
		return injector.getInstance(Key.get(new ControllerType()));
	}
	
	private void generateFilesIfchangeIsRelevant() throws CoreException {
		getDelta(getProject()).accept(this);
	}


	private void performClean() {
		
	}
	
	
	public void syncForward()	throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");
		getControllerInstance().syncForward(projectPath.resolve(Paths.get("models", "src.xmi")));
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");
	}
	
	public void syncBackward()	throws CoreException{
		logger.info("Sync configuration model with a java model is performed!");		
		getControllerInstance().syncBackward(projectPath.resolve(Paths.get("models", "trg.xmi")));
		refreshProject();
		logger.info("Sync configuration model with a java model is done!");
	}
	
	public void refreshProject() throws CoreException{
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
		

		if(relFilePath.contentEquals("models/src.xmi")){
			
			syncForward();
			
		}else if(relFilePath.contentEquals("models/trg.xmi")){
			
			syncBackward();		
			
		}
		return true;
	}
}
