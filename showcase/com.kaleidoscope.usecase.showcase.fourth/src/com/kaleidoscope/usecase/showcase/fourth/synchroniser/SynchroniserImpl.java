package com.kaleidoscope.usecase.showcase.fourth.synchroniser;
import Employees.EmployeeContainer;
import Persons.PersonContainer;


public class SynchroniserImpl extends com.kaleidoscope.usecase.showcase.first.synchroniser.SynchroniserImpl{

	public SynchroniserImpl(PersonContainer sourceModel, EmployeeContainer targetModel) {
		super(sourceModel, targetModel);
		
		sourceModelFileName = "src.xmi";
		targetModelFileName = "trg.xmi";
	}
}
