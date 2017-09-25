package com.kaleidoscope.usecase.showcase.second.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.auxiliary.emfcompare.EMFCompareDeltaDiscoverer;
import com.kaleidoscope.core.delta.discovery.OfflineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.second.artefactadapter.EmployeeArtefactAdapter;
import com.kaleidoscope.usecase.showcase.second.artefactadapter.PersonArtefactAdapter;
import com.kaleidoscope.usecase.showcase.second.synchroniser.SynchroniserImpl;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule{

	private Path sourceArtefactAdapterPath;
	private Path targetArtefactAdapterPath;
	private Path destination;
	
	private PersistentStateBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path>  controller = null;
	
	public ControllerModule(Path projectPath, Path destination) {
		
		this.sourceArtefactAdapterPath = projectPath.resolve(Paths.get("models", "src.persons"));
		this.targetArtefactAdapterPath = projectPath.resolve(Paths.get("models", "trg.employees"));	
		this.destination = destination;
	}
	
	@Provides @Src
	ArtefactAdapter<PersonContainer, Path> provideSourceArtefactAdapter() {		
		return new PersonArtefactAdapter(sourceArtefactAdapterPath);
	}

	@Provides @Trg
	ArtefactAdapter<EmployeeContainer, Path> provideTargetArtefactAdapter() {		
		return new EmployeeArtefactAdapter(targetArtefactAdapterPath);
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
		
		
		bind(new TypeLiteral<OfflineDeltaDiscoverer<PersonContainer, OperationalDelta>>() {}). 
								annotatedWith(Src.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<PersonContainer>>() {});
		bind(new TypeLiteral<OfflineDeltaDiscoverer<EmployeeContainer, OperationalDelta>>() {}). annotatedWith(Trg.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<EmployeeContainer>>() {});
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
	
	public PersistentStateBasedController<PersonContainer, Path, EmployeeContainer, Path, String,  OperationalDelta, OperationalDelta, Path> getControllerInstance() {
		
		Injector injector = Guice.createInjector(this);
		controller = 
			injector.getInstance(Key.get(new TypeLiteral<PersistentStateBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path>>(){}));
		
		return controller;
	}
	
}
