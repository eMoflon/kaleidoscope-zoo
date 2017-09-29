package com.kaleidoscope.usecase.showcase.second.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;

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
	
	public Builder(){
		super(Paths.get("models", "src.persons"), Paths.get("models", "trg.employees"));
	}
	
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
