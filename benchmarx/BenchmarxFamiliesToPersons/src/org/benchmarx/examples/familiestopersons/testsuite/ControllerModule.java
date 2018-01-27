package org.benchmarx.examples.familiestopersons.testsuite;

import org.benchmarx.Configurator;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.EMFOpaqueToOperationalDeltaAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.IdentityArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.DeltaBasedController;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class ControllerModule extends AbstractModule {

	private Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool;

	private class ControllerType extends
			TypeLiteral<DeltaBasedController<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta, OpaqueDelta<FamilyRegister>, OpaqueDelta<PersonRegister>>> {
	};

	public ControllerModule(
			Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool) {
		this.tool = tool;
	}

	@Provides
	@Src
	protected ArtefactAdapter<FamilyRegister, FamilyRegister> provideSourceArtefactAdapter() {
		return new IdentityArtefactAdapter<FamilyRegister, FamilyRegister>();
	}

	@Provides
	@Trg
	protected ArtefactAdapter<PersonRegister, PersonRegister> provideTargetArtefactAdapter() {
		return new IdentityArtefactAdapter<PersonRegister, PersonRegister>();
	}

	@Provides
	@Src
	DeltaAdapter<OperationalDelta, OpaqueDelta<FamilyRegister>, FamilyRegister> provideSourceDeltaAdapter() {
		return new EMFOpaqueToOperationalDeltaAdapter<FamilyRegister>();
	}

	@Provides
	@Trg
	DeltaAdapter<OperationalDelta, OpaqueDelta<PersonRegister>, PersonRegister> provideTargetDeltaAdapter() {
		return new EMFOpaqueToOperationalDeltaAdapter<PersonRegister>();
	}

	@Provides
	Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> provideSynchroniser() {
		return tool;
	}

	@Override
	protected void configure() {

	}

	public DeltaBasedController<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta, OpaqueDelta<FamilyRegister>, OpaqueDelta<PersonRegister>> getControllerInstance() {
		Injector injector = Guice.createInjector(this);
		return injector.getInstance(Key.get(new ControllerType()));
	}
}