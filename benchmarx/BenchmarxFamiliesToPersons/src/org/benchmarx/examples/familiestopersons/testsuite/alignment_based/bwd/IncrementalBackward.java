package org.benchmarx.examples.familiestopersons.testsuite.alignment_based.bwd;

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

public class IncrementalBackward extends FamiliesToPersonsTestCaseController {

	public IncrementalBackward(Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool,
			ModelAssertation<FamilyRegister, PersonRegister> modelAssertation) {
		super(tool, modelAssertation);
	}
	
	/**
	 * <b>Test</b> for inserting of a Person in a PersonRegister after the initial
	 * register has been transformed into a family model. Please note: In order to
	 * avoid a combinatorial explosion of the number of test cases, we only supply
	 * a test case for the parameter configuration "e ^ p". A new person "Skinner, Seymour
	 * (male) is inserted. Then the backward transformation is called. Afterwards another
	 * person with the same name is introduced in the person register.<br/>
	 * <b>Expect</b> : After the first backward propagation, a new Family "Skinner" with
	 * father "Seymour" is introduced to the family model. The second run then must create a
	 * son "Seymor" in the now already existing family "Skinner".<br/>
	 * <b>Features</b>: bwd, add, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalInsertsFixedConfig() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta>
		syncResult = controller.syncBackward((t)->{
					execute(helperPerson::createHomer)
					.andThen(helperPerson::createMaggie)
					.accept(t);});	
		
		helperPerson.setBirthdaysOfSimpson(syncResult.getTargetArtefactAdapter().getModel().get());

		modelAssertation.assertPrecondition(
				getExpectedFamilyRegister("Pre_IncrBwdFamily"),
				getExpectedPersonRegister("Pre_IncrBwdPerson"),
				syncResult); 
		//------------		
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion1"),
				getExpectedPersonRegister("PersonAfterBwdInsertion1"),
				syncResult); 
		
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion2"),
				getExpectedPersonRegister("PersonAfterBwdInsertion2"),
				syncResult); 
		//------------			
	}
	
	/**
	 * <b>Test</b> for inserting of a Persons in a PersonRegister after the initial
	 * register has been transformed into a family model.<br/>
	 * <b>Expect</b> : FamilyRegister and Person model are structured as specified in the corresponding
	 * assertPostcondition statements.<br/>
	 * <b>Features</b>: bwd, add, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalInsertsDynamicConfig() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward((t) -> {
					execute(helperPerson::createHomer)
					.andThen(helperPerson::createMaggie)
					.accept(t);});	
		helperPerson.setBirthdaysOfSimpson(syncResult.getTargetArtefactAdapter().getModel().get());
		modelAssertation.assertPrecondition(
				getExpectedFamilyRegister("Pre_IncrBwdFamily"),
				getExpectedPersonRegister("Pre_IncrBwdPerson"),
				syncResult); 

		//------------		
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion1"),
				getExpectedPersonRegister("PersonAfterBwdInsertion1"),
				syncResult); 
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion2"),
				getExpectedPersonRegister("PersonAfterBwdInsertion2"),
				syncResult); 
		// now setting !e^p
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion3"),
				getExpectedPersonRegister("PersonAfterBwdInsertion3"),
				syncResult); 
		
		// now setting !e^!p
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion4"),
				getExpectedPersonRegister("PersonAfterBwdInsertion4"),
				syncResult); 
		// now setting e^p
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::createSeymour);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion5"),
				getExpectedPersonRegister("PersonAfterBwdInsertion5"),
				syncResult); 
		// now setting e^!p
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward((t) -> {
				execute(helperPerson::createBart)
				.andThen(helperPerson::createLisa)
				.accept(t);});
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdInsertion6"),
				getExpectedPersonRegister("PersonAfterBwdInsertion6"),
				syncResult); 
		//------------			
	}
	
	/**
	 * <b>Test</b> for deleting Persons from the PersonRegister.<br/>
	 * <b>Expect</b> : FamilyRegister and Person model are structured as specified in the corresponding
	 * assertPostcondition statements.<br/>
	 * <b>Features</b>: bwd, del
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalDeletions() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward(helperPerson::createHomer);
		// reconfigure, to allow the creation of a child in the existing family
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward(helperPerson::createMaggie);	
		helperPerson.setBirthdaysOfSimpson(syncResult.getTargetArtefactAdapter().getModel().get());

		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("Pre_IncrBwdFamilyFatherChild"),
				getExpectedPersonRegister("Pre_IncrBwdPerson"),
				syncResult); 
		//------------		
		syncResult = controller.syncBackward(helperPerson::deleteHomer);
		syncResult = controller.syncBackward(helperPerson::deleteMaggie);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdDeletion"),
				getExpectedPersonRegister("PersonAfterBwdDeletion"),
				syncResult); 
		//------------
	}
	
	/**
	 * <b>Test</b> for renaming of a Person in a PersonRegister after the initial
	 * register has been transformed into a family model.<br/>
	 * <b>Expect</b> : Model states as described in the postcondition.<br/>
	 * <b>Features</b>: bwd, attribute, structural, corr-based, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalRenamingDynamic() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward(helperPerson::createRod);
		//tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);		
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::createHomer);
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward((t) ->{
				execute(helperPerson::createMarge)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createLisa)
				.andThen(helperPerson::createMaggie)
				.accept(t);});
		syncResult = controller.syncBackward(helperPerson::changeAllBirthdays);
		syncResult = controller.syncBackward(helperPerson::createBart);
		
		helperPerson.setBirthdayOfYoungerBart(syncResult.getTargetArtefactAdapter().getModel().get());
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::createBart);
		helperPerson.setBirthdayOfFatherBart(syncResult.getTargetArtefactAdapter().getModel().get());
		modelAssertation.assertPrecondition(
				getExpectedFamilyRegister("Pre_IncrBwdFamilyRenameDynamic"),
				getExpectedPersonRegister("Pre_IncrBwdPersonRenameDynamic"),
				syncResult); 
		//----------------------
		syncResult = controller.syncBackward(helperPerson::firstNameChangeOfBart);
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::fullNameChangeOfOtherBart);
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward(helperPerson::fullNameChangeOfFatherBart);
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward(helperPerson::familyNameChangeOfLisa);
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::fullNameChangeOfMarge);
		
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdIncrRenameDynamic"),
				getExpectedPersonRegister("PersonAfterBwdIncrRenameDynamic"),
				syncResult); 
		//----------------------
	}
	
	/**
	 * <b>Test</b> for deleting and recreating a Person in a PersonRegister after the initial
	 * register has been transformed into a family model.<br/>
	 * <b>Expect</b> : Model states as described in the postcondition.<br/>
	 * <b>Features</b>: bwd, del+add, structural, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalMixedDynamic() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward(helperPerson::createMaggie);	
		syncResult = controller.syncBackward(helperPerson::createHomer);
		helperPerson.setBirthdaysOfSimpson(syncResult.getTargetArtefactAdapter().getModel().get());
	
		modelAssertation.assertPrecondition(
				getExpectedFamilyRegister("Pre_IncrBwdFamily"),
				getExpectedPersonRegister("Pre_IncrBwdPerson"),
				syncResult);
		//------------		
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		syncResult = controller.syncBackward((t) -> {
				execute(helperPerson::deleteHomer)
				.andThen(helperPerson::createHomer)
				.accept(t);});
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterBwdMixed"),
				getExpectedPersonRegister("PersonAfterBwdMixed"),
				syncResult); 
	}
	
	/**
	 * <b>Test</b> for creating Persons in a PersonRegister after the initial
	 * register has been transformed into a family model. In the subsequent
	 * backward transformations, the order of inserting the persons affects
	 * the target model. <br/>
	 * <b>Expect</b> : Model states as described in the postcondition.<br/>
	 * <b>Features</b>: bwd, add, operational, runtime
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testIncrementalOperational() throws SynchronisationFailedException {
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward(helperPerson::createMaggie);
		helperPerson.setBirthdayOfMaggie(syncResult.getTargetArtefactAdapter().getModel().get());

		modelAssertation.assertPrecondition(
				getExpectedFamilyRegister("Pre_IncrBwdOpFamily"),
				getExpectedPersonRegister("Pre_IncrBwdOpPerson"),
				syncResult); 
		//------------		
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)); 
		syncResult = controller.syncBackward((t)->{ 
				execute(helperPerson::createMarge)
				.andThen(helperPerson::createLisa)				
				.andThen(helperPerson::createHomer)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createMaggie)
				.andThen(helperPerson::createLisa)
				.accept(t);});
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		syncResult = controller.syncBackward(helperPerson::createLisa);		
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyAfterIncrOp"),
				getExpectedPersonRegister("PersonAfterIncrOp"),
				syncResult); 
	}
	
	/**
	 * <b>Test</b> for stability of the transformation.<br/>
	 * <b>Expect</b> Nothing should be changed after an idle target delta.<br/>
	 * <b>Features</b>: bwd, runtime
	 * @throws SynchronisationFailedException 
	 */
	//@Test
	public void testStability() throws SynchronisationFailedException {
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward((t)->{ 
				execute(helperPerson::createRod)
				.andThen(helperPerson::createHomer)				
				.andThen(helperPerson::createMarge)
				.accept(t);});
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithParentsOnly"),
				getExpectedPersonRegister("PersonsMultiDeterministic"),
				syncResult);  
		
		// issue the same transformation a second time
		syncResult = controller.syncBackward(helperPerson::idleDelta);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithParentsOnly"),
				getExpectedPersonRegister("PersonsMultiDeterministic"),
				syncResult);  
	}
	
	//@Test
	public void testHippocraticness() throws SynchronisationFailedException {
		// No precondition!
		// ---------------------------------
		controller.setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true));
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncBackward((t)->{ 
				execute(helperPerson::createRod)
				.andThen(helperPerson::createHomer)				
				.andThen(helperPerson::createMarge)
				.accept(t);});
		// ---------------------------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithParentsOnly"),
				getExpectedPersonRegister("PersonsMultiDeterministic"),
				syncResult); 		
		
		syncResult = controller.syncBackward(helperPerson::hippocraticDelta);
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithParentsOnly"),
				getExpectedPersonRegister("PersonsMultiDeterministic2"),
				syncResult);  
	}

}
