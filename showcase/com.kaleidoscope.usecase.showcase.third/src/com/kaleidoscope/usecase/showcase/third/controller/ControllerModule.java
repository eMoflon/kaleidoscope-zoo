package com.kaleidoscope.usecase.showcase.third.controller;

import java.nio.file.Path;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaInputAdapter;
import com.kaleidoscope.usecase.showcase.third.synchroniser.SynchroniserImpl;
import com.kaleidoscope.usecase.showcase.third.deltaadapter.XMIDeltaAdapter;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule {
	private Path destination;
	
	public ControllerModule(Path destination) {
		this.destination = destination;
	}
	
	@Provides @Src
	private 
	DeltaInputAdapter<
		OperationalDelta, 
		Path, 
		PersonContainer
		>
	provideSourceDeltaAdapter(){
		return new XMIDeltaAdapter<PersonContainer>();
	}
	
	@Provides @Trg
	private 
	DeltaInputAdapter<
		OperationalDelta, 
		Path, 
		EmployeeContainer
		>
	provideTargetDeltaAdapter(){
		return new XMIDeltaAdapter<EmployeeContainer>();
	}

	@Provides
	private
	PersistentSynchroniser<
		PersonContainer, 
		EmployeeContainer, 
		String, 
		OperationalDelta, 
		OperationalDelta, 
		Path
		> 
	provideSynchroniser(){	
		PersonContainer sourceModel = PersonsFactory.eINSTANCE.createPersonContainer();
		EmployeeContainer targetModel = EmployeesFactory.eINSTANCE.createEmployeeContainer();
		SynchroniserImpl tool = new SynchroniserImpl(sourceModel, targetModel);
		tool.initialise();
		return tool;
	}
	
	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
}
