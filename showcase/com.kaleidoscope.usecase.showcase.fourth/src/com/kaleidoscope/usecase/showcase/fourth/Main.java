package com.kaleidoscope.usecase.showcase.fourth;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;

import Employees.EmployeeContainer;
import Persons.Person;
import Persons.PersonContainer;
import Persons.PersonsFactory;

public class Main {

	public static void main(String[] args) {

		OpaqueDelta<PersonContainer> delta = (m) -> {
			Person newPerson = PersonsFactory.eINSTANCE.createPerson();
			newPerson.setName("Nikola Tesla");
			m.getPersons().add(newPerson);
			
			Person newPersonEdison = PersonsFactory.eINSTANCE.createPerson();
			newPersonEdison.setName("Thomas Edison");
			m.getPersons().add(newPersonEdison);
		};

		ControllerModule controllerModule = new ControllerModule(Paths.get("instances", "gen"));
		PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path> controller = controllerModule
				.getControllerInstance();
		controller.syncForward(delta);
	}

}
