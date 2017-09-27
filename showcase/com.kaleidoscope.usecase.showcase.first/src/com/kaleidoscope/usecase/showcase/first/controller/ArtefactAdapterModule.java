package com.kaleidoscope.usecase.showcase.first.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class ArtefactAdapterModule extends AbstractModule {
	protected Path sourceArtefactAdapterPath;
	protected Path targetArtefactAdapterPath;
	
	public ArtefactAdapterModule(Path projectPath) {	
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

	@Override
	protected void configure() {}
}
