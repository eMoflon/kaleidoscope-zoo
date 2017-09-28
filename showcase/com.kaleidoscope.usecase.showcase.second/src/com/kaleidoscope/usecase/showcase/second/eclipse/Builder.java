package com.kaleidoscope.usecase.showcase.second.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerModule;
import com.kaleidoscope.usecase.showcase.second.controller.ArtefactAdapterModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;
  
public class Builder extends com.kaleidoscope.usecase.showcase.first.eclipse.Builder {	
	
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
	
	@Override
	public void syncForward()	throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");		
		getControllerInstance().syncForward(projectPath.resolve(Paths.get("models", "src.persons")));
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");
	}
	
	@Override
	public void syncBackward()	throws CoreException{
		logger.info("Sync configuration model with a java model is performed!");		
		getControllerInstance().syncBackward(projectPath.resolve(Paths.get("models", "trg.employees")));
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
		

		if(relFilePath.contentEquals("models/src.persons")) {
			syncForward();
			
		}else if(relFilePath.contentEquals("models/trg.employees")) {
			syncBackward();
			
		}
		return true;
	}
	
	@Override
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
}
