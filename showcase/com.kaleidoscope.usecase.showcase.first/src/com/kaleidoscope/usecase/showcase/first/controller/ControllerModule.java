package com.kaleidoscope.usecase.showcase.first.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.auxiliary.emfcompare.EMFCompareDeltaDiscoverer;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.discovery.OfflineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.first.synchroniser.SynchroniserImpl;

import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class ControllerModule extends AbstractModule{
	protected Path sourceArtefactAdapterPath;
	protected Path targetArtefactAdapterPath;
	protected Path destination;
	
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
		
	protected ControllerModule(Path destination) {
		this.destination = destination;		
	}
	
	public ControllerModule(Path projectPath, Path destination) {	
		this(destination);
		this.sourceArtefactAdapterPath = projectPath.resolve(Paths.get("models", "src.xmi"));
		this.targetArtefactAdapterPath = projectPath.resolve(Paths.get("models", "trg.xmi"));	
	}
	

	@Provides @Src
	protected 
	ArtefactAdapter<
		PersonContainer, 
		Path
		> 
	provideSourceArtefactAdapter() {		
		return new XMIArtefactAdapter<PersonContainer>(sourceArtefactAdapterPath);
	}

	@Provides @Trg
	protected 
	ArtefactAdapter<
		EmployeeContainer, 
		Path
		> 
	provideTargetArtefactAdapter() {	
		return new XMIArtefactAdapter<EmployeeContainer>(targetArtefactAdapterPath);
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
		tool.initialize();
		
		return tool;
	}
	
	@Provides @Src
	private 
	OfflineDeltaDiscoverer<
		PersonContainer, 
		OperationalDelta
		> 
	provideSourceOfflineDeltaDiscoverer(){
		return new EMFCompareDeltaDiscoverer<PersonContainer>();
	}
	
	@Provides @Trg
	private 
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
		Injector injector = Guice.createInjector(this);
		return injector.getInstance(Key.get(new ControllerType()));
	}
}
