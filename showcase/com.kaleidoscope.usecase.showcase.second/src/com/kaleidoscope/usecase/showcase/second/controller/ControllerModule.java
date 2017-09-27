package com.kaleidoscope.usecase.showcase.second.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.Provides;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.usecase.showcase.second.artefactadapter.EmployeeArtefactAdapter;
import com.kaleidoscope.usecase.showcase.second.artefactadapter.PersonArtefactAdapter;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class ControllerModule extends com.kaleidoscope.usecase.showcase.first.controller.ControllerModule {
	
	public ControllerModule(Path projectPath, Path destination) {	
		super(destination);
		this.sourceArtefactAdapterPath = projectPath.resolve(Paths.get("models", "src.persons"));
		this.targetArtefactAdapterPath = projectPath.resolve(Paths.get("models", "trg.employees"));
	}
	
	@Provides @Src
	private 
	ArtefactAdapter<
		PersonContainer, 
		Path
		> 
	provideSourceArtefactAdapter() {		
		return new PersonArtefactAdapter(sourceArtefactAdapterPath);
	}

	@Provides @Trg
	private 
	ArtefactAdapter<
		EmployeeContainer, 
		Path
		> 
	provideTargetArtefactAdapter() {		
		return new EmployeeArtefactAdapter(targetArtefactAdapterPath);
	}	
}
