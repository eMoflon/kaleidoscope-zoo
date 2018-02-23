package com.kaleidoscope.usecase.showcase.fourth.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaInputAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.fourth.delta.OpaqueToOperationalDeltaAdapter;
import com.kaleidoscope.usecase.showcase.fourth.synchroniser.SynchroniserImpl;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule {
	private Path destination;
	private class ControllerType extends TypeLiteral<
		PersistentDeltaBasedController<
		PersonContainer,
		Path,
		EmployeeContainer,
		Path,
		String,
		OperationalDelta,
		OperationalDelta,
		OpaqueDelta<PersonContainer>,
		OpaqueDelta<EmployeeContainer>,
		Path
		>
	>{};
	
	public ControllerModule(Path destination) {
		this.destination = destination;
	}

	@Provides
	@Src
	DeltaInputAdapter<
		OperationalDelta, 
		OpaqueDelta<PersonContainer>, 
		PersonContainer
		> 
	provideSourceDeltaAdapter() {
		return new OpaqueToOperationalDeltaAdapter<PersonContainer>();
	}

	@Provides
	@Trg
	DeltaInputAdapter<
		OperationalDelta, 
		OpaqueDelta<EmployeeContainer>, 
		EmployeeContainer
		> 
	provideTargetDeltaAdapter() {
		return new OpaqueToOperationalDeltaAdapter<EmployeeContainer>();
	}

	@Provides
	PersistentSynchroniser<
		PersonContainer, 
		EmployeeContainer,
		String,
		OperationalDelta,
		OperationalDelta,
		Path> 
	provideSynchroniser() {
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

	public PersistentDeltaBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String, 
		OperationalDelta, 
		OperationalDelta, 
		OpaqueDelta<PersonContainer>, 
		OpaqueDelta<EmployeeContainer>, 
		Path>
	getControllerInstance() {
		Injector injector = Guice.createInjector(this, new ArtefactAdapterModule(Paths.get(".")));
		return injector.getInstance(Key.get(new ControllerType()));
	}
}