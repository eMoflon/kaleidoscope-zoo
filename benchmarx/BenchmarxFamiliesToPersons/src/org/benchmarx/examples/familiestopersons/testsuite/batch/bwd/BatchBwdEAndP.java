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

/**
 * Test cases for backward transformations with parameters E and P set to true
 * Please note, that in general this leads to a non-deterministic behavior, 
 * which is hard to test. Thus, we restricted ourselves to a PersonRegister
 * configuration, which allows to deterministically execute the backward
 * transformation. (c.f., Test Case 2d on GitHub).
 */
public class BatchBwdEAndP extends FamiliesToPersonsTestCaseController {

	public BatchBwdEAndP(Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool,
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
	public void testCreateMalePersonAsSon() throws SynchronisationFailedException {
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
				.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
				.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
			syncResult = controller.syncBackward(helperPerson::createRod);
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("OneFamilyWithOneFamilyMember"),
				getExpectedPersonRegister("PersonOneMaleMember"),
				syncResult); 
	}
	public <X> Consumer<X> execute(Consumer<X> a){
		return a;
	}
	/**
	 * <b>Test</b> for creation of family members in existing families.<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of Children is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testCreateFamilyMembersInExistingFamilyAsParents() throws SynchronisationFailedException {
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
				.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
				.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward((t) -> {
				execute(helperPerson::createRod)
				.andThen(helperPerson::createHomer)				
				.andThen(helperPerson::createMarge)
				.accept(t);});
		// ---------------------------------
		
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithParentsOnly"),
				getExpectedPersonRegister("PersonsMultiDeterministic"),
				syncResult); 
	}
}
