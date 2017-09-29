package com.kaleidoscope.usecase.showcase.third.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.CoreException;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.third.controller.ControllerModule;

import Employees.EmployeeContainer;
import Persons.PersonContainer;

public class Builder extends com.kaleidoscope.usecase.showcase.first.eclipse.Builder {

	private class ControllerType extends
			TypeLiteral<PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path>> {
	}

	public Builder() {
		super(Paths.get("models", "src.delta.xmi"), Paths.get("models", "trg.delta.xmi"));
	}

	public void syncForward() throws CoreException {

		logger.info("Sync a java model with the configuration model is performed!");

		Path syncForwardAbsoluteSourcePath = projectPath.resolve(super.syncForwardRealtiveSourcePath);

		getDeltaControllerInstance().syncForward(syncForwardAbsoluteSourcePath);
		refreshProject();
		logger.info("Sync a java model with the configuration model is done!");

	}

	public void syncBackward() throws CoreException {
		logger.info("Sync configuration model with a java model is performed!");

		Path syncBacwardAbsoulteTargetPath = projectPath.resolve(super.syncBacwardRelativeTargetPath);

		getDeltaControllerInstance().syncBackward(syncBacwardAbsoulteTargetPath);
		refreshProject();

	}

	public PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, Path, Path, Path> getDeltaControllerInstance() {
		Injector injector = Guice.createInjector(new ControllerModule(projectPath.resolve(Paths.get("models", "gen"))),
				new ArtefactAdapterModule(projectPath));
		return injector.getInstance(Key.get(new ControllerType()));
	}
}
