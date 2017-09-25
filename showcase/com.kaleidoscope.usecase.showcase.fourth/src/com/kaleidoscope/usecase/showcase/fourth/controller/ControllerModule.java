package com.kaleidoscope.usecase.showcase.fourth.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.fourth.deltaadapter.OpaqueToOperationalDeltaAdapter;
import com.kaleidoscope.usecase.showcase.fourth.synchroniser.SynchroniserImpl;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule {

	private Path sourceArtefactAdapterPath;
	private Path targetArtefactAdapterPath;
	private Path destination;

	private PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path> controller = null;

	public ControllerModule(Path destination) {

		this.sourceArtefactAdapterPath = Paths.get("instances",  "src.xmi");
		this.targetArtefactAdapterPath = Paths.get("instances", "trg.xmi");
		this.destination = destination;

	}

	@Provides
	@Src
	DeltaAdapter<OperationalDelta, OpaqueDelta<PersonContainer>, PersonContainer> provideSourceDeltaAdapter() {
		return new OpaqueToOperationalDeltaAdapter<PersonContainer>();
	}

	@Provides
	@Trg
	DeltaAdapter<OperationalDelta, OpaqueDelta<EmployeeContainer>, EmployeeContainer> provideTargetDeltaAdapter() {
		return new OpaqueToOperationalDeltaAdapter<EmployeeContainer>();
	}

	@Provides
	@Src
	ArtefactAdapter<PersonContainer, Path> provideSourceArtefactAdapter() {
		return new XMIArtefactAdapter<PersonContainer>(sourceArtefactAdapterPath);
	}

	@Provides
	@Trg
	ArtefactAdapter<EmployeeContainer, Path> provideTargetArtefactAdapter() {

		return new XMIArtefactAdapter<EmployeeContainer>(targetArtefactAdapterPath);
	}

	@Provides
	PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> provideSynchroniser() {

		PersonContainer sourceModel = PersonsFactory.eINSTANCE.createPersonContainer();
		EmployeeContainer targetModel = EmployeesFactory.eINSTANCE.createEmployeeContainer();

		PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path> tool = new SynchroniserImpl(
				sourceModel, targetModel);

		tool.initialize();
		return tool;
	}

	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}

	public PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path> getControllerInstance() {

		Injector injector = Guice.createInjector(this);
		controller = injector.getInstance(Key.get(
				new TypeLiteral<PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path>>() {
				}));

		return controller;
	}

}
