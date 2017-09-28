package com.kaleidoscope.usecase.showcase.third.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.third.controller.ControllerModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;


  
public class Builder extends com.kaleidoscope.usecase.showcase.first.eclipse.Builder{
	
	private Path projectPath;
	
	private class ControllerType extends 
	TypeLiteral<PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path>>{}
	
	
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
	
	private void generateFilesIfchangeIsRelevant() throws CoreException {
		getDelta(getProject()).accept(this);
	}


	private void performClean() {
		
	}
	
	@Override
	public void syncForward()	throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");
		
		getControllerInstancee().syncForward(projectPath.resolve(Paths.get("models", "src.delta.xmi")));
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");
	}
	
	@Override
	public void syncBackward()	throws CoreException{
		logger.info("Sync configuration model with a java model is performed!");
		
		getControllerInstancee().syncBackward(projectPath.resolve(Paths.get("models", "trg.delta.xmi")));
		refreshProject();
		logger.info("Sync configuration model with a java model is done!");
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
	
	public PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path>
	getControllerInstancee() {
		Injector injector = Guice.createInjector(
				new ControllerModule(projectPath.resolve(Paths.get("models"))), 
				new ArtefactAdapterModule(projectPath)
			);
		return injector.getInstance(Key.get(new ControllerType()));
	}
}
