package com.kaleidoscope.usecase.showcase.third.controller;

import java.nio.file.Path;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.usecase.showcase.first.synchroniser.SynchroniserImpl;
import com.kaleidoscope.usecase.showcase.third.deltaadapter.XMIdeltaAdapter;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule{

	private Path destination;
	
	public ControllerModule(Path destination) {
		this.destination = destination;
	}
	
	@Provides @Src
	DeltaAdapter<OperationalDelta, Path, PersonContainer>provideSourceDeltaAdapter(){
		return new XMIdeltaAdapter<PersonContainer>();
	}
	
	@Provides @Trg
	DeltaAdapter<OperationalDelta, Path, EmployeeContainer>provideTargetDeltaAdapter(){
		return new XMIdeltaAdapter<EmployeeContainer>();
	}
	
	

	@Provides
	PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> provideSynchroniser(){
		
		PersonContainer sourceModel = PersonsFactory.eINSTANCE.createPersonContainer();
		EmployeeContainer targetModel = EmployeesFactory.eINSTANCE.createEmployeeContainer();
		 
		PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> tool = 
				new SynchroniserImpl(sourceModel, targetModel);
	
		tool.initialize();
		return tool;
	}
	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
	
	
}
