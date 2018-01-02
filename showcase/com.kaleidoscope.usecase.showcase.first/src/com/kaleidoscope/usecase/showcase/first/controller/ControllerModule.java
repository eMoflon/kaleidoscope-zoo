package com.kaleidoscope.usecase.showcase.first.controller;

import java.nio.file.Path;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kaleidoscope.core.auxiliary.emfcompare.EMFCompareDeltaDiscoverer;
import com.kaleidoscope.core.delta.discovery.OfflineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.usecase.showcase.first.synchroniser.SynchroniserImpl;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule {
	private Path destination;
		
	public ControllerModule(Path destination) {
		this.destination = destination;
	}

	@Provides
	protected 
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
	
	@Provides @Src
	protected
	OfflineDeltaDiscoverer<
		PersonContainer, 
		OperationalDelta
		> 
	provideSourceOfflineDeltaDiscoverer(){
		return new EMFCompareDeltaDiscoverer<PersonContainer>();
	}
	
	@Provides @Trg
	protected 
	OfflineDeltaDiscoverer<
		EmployeeContainer, 
		OperationalDelta
		> 
	provideTargetOfflineDeltaDiscoverer(){
		return new EMFCompareDeltaDiscoverer<EmployeeContainer>();
	}
	
	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
}
