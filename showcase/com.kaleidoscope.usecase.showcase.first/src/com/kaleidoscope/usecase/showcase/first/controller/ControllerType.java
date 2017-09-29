package com.kaleidoscope.usecase.showcase.first.controller;

import java.nio.file.Path;

import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class ControllerType extends 
	TypeLiteral<PersistentStateBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String, 
		OperationalDelta,	
		OperationalDelta, 
		Path>
	>{}