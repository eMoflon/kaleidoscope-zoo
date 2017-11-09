package com.kaleidoscope.usecase.showcase.third.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.CoreException;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.third.controller.ControllerModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class Builder extends com.kaleidoscope.usecase.showcase.first.eclipse.Builder {
	private class ControllerType extends TypeLiteral<
		PersistentDeltaBasedController<
			PersonContainer, 
			Path, 
			EmployeeContainer, 
			Path, 
			String, 
			OperationalDelta, 
			OperationalDelta, 
			Path, 
			Path, 
			Path>> {}

	public Builder() {
		super(Paths.get("models", "src.delta.xmi"), Paths.get("models", "trg.delta.xmi"));
	}

	public void syncForward() throws CoreException {
		Path syncForwardAbsoluteSourcePath = projectPath.resolve(super.syncForwardRealtiveSourcePath);
		try {
			getDeltaControllerInstance().syncForward(syncForwardAbsoluteSourcePath);
		} catch (SynchronisationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refreshProject();
	}

	public void syncBackward() throws CoreException {
		Path syncBacwardAbsoulteTargetPath = projectPath.resolve(super.syncBacwardRelativeTargetPath);
		try {
			getDeltaControllerInstance().syncBackward(syncBacwardAbsoulteTargetPath);
		} catch (SynchronisationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refreshProject();
	}

	public 
	PersistentDeltaBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String, 
		OperationalDelta, 
		OperationalDelta, 
		Path, 
		Path, 
		Path
		> 
	getDeltaControllerInstance() {
		Injector injector = Guice.createInjector(new ControllerModule(projectPath.resolve(Paths.get("models", "gen"))),
												new ArtefactAdapterModule(projectPath));
		return injector.getInstance(Key.get(new ControllerType()));
	}
}
