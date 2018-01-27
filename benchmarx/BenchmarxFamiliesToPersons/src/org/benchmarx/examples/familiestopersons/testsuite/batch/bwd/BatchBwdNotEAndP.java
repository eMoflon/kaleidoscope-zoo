package org.benchmarx.examples.familiestopersons.testsuite.batch.bwd;

import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.emf.ModelAssertation;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.examples.familiestopersons.testsuite.FamiliesToPersonsTestCaseController;
import org.junit.Test;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationResult;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class BatchBwdNotEAndP extends FamiliesToPersonsTestCaseController {

	public BatchBwdNotEAndP(Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool,
			ModelAssertation<FamilyRegister, PersonRegister> modelAssertation) {
		super(tool, modelAssertation);
	}
	
	/**
	 * <b>Test</b> for creation of a single male person (Flanders, Rod).<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of parents is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testCreateMalePersonAsParent() throws SynchronisationFailedException {
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward(helperPerson::createRod);
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("OneFamilyWithOneFamilyMember"),
				getExpectedPersonRegister("PersonOneMaleMember"),
				syncResult);  
	}
	
	/**
	 * <b>Test</b> for creation of family members in existing families.<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of parents is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testCreateFamilyMembersInNewFamilyAsParents() throws SynchronisationFailedException {
		// No precondition!		
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult =  controller.syncBackward((t)->{ 
			execute(helperPerson::createRod)
			.andThen(helperPerson::createHomer)
			.andThen(helperPerson::createBart)
			.andThen(helperPerson::createMarge)
			.andThen(helperPerson::createLisa)
			.andThen(helperPerson::createMaggie)
			.accept(t);});
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("MultiFamiliesParents"),
				getExpectedPersonRegister("PersonsMulti"),
				syncResult); 
	}
	public <X> Consumer<X> execute(Consumer<X> a){
		return a;
	}
	
	@Test
	public void testCreateDuplicateFamilyMembersInNewFamilyAsParents() throws SynchronisationFailedException {
		
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward((t)->{ 
			execute(helperPerson::createRod)
			.andThen(helperPerson::createBart)
			.andThen(helperPerson::createHomer)
			.andThen(helperPerson::createBart)
			.andThen(helperPerson::createBart)
			.andThen(helperPerson::createMarge)
			.andThen(helperPerson::createLisa)
			.andThen(helperPerson::createMaggie)
			.accept(t);});
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("MultiFamiliesWithDuplicateNamesParents"),
				getExpectedPersonRegister("PersonsDuplicateMulti"),
				syncResult);  
	}
}
