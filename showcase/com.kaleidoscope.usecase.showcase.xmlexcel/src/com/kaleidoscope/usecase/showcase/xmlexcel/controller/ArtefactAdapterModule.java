/**
 * 
 */
package com.kaleidoscope.usecase.showcase.xmlexcel.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter.EmployeeArtefactAdapter;
import com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter.PersonArtefactAdapter;

import com.kaleidoscope.usecase.showcase.xmlexcel.eclipse.*;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class ArtefactAdapterModule extends AbstractModule {
	protected Path sourceArtefactAdapterPath;
	protected Path targetArtefactAdapterPath;

	public ArtefactAdapterModule(Path projectPath) {
		this.sourceArtefactAdapterPath = projectPath.resolve(Paths.get("models", XmlExcelBuilder.srcArtefact));
		this.targetArtefactAdapterPath = projectPath.resolve(Paths.get("models", XmlExcelBuilder.trgArtefact));
	}
	
	@Provides
	@Src
	protected ArtefactAdapter<PersonContainer, Path> provideSourceArtefactAdapter() {
		return new PersonArtefactAdapter(sourceArtefactAdapterPath);
	}

	@Provides
	@Trg
	protected ArtefactAdapter<EmployeeContainer, Path> provideTargetArtefactAdapter() {
		return new EmployeeArtefactAdapter(targetArtefactAdapterPath);
	}

	@Override
	protected void configure() {
	}
}
