package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;


import Employees.EmployeeContainer;
import Persons.PersonContainer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerModule;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerType;
import com.kaleidoscope.usecase.showcase.first.eclipse.Builder;
import com.kaleidoscope.usecase.showcase.xmlexcel.controller.ArtefactAdapterModule;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XmlExcelBuilder extends Builder {
	public static String srcArtefact = "src.xml";
	public static String trgArtefact = "trg.xml";
	
	public XmlExcelBuilder(){
		super(Paths.get("models", srcArtefact), Paths.get("models", trgArtefact));
	}
	
	@Override
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
		Injector injector = Guice.createInjector(
				new ControllerModule(projectPath.resolve(Paths.get("models"))), 
				new ArtefactAdapterModule(projectPath)
			);
		
		return injector.getInstance(Key.get(new ControllerType()));
	}
}