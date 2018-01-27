package org.benchmarx.examples.familiestopersons.testsuite.batch.fwd;

import org.benchmarx.BXTool;
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


public class BatchForward extends FamiliesToPersonsTestCaseController {

	public BatchForward(Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool,
			ModelAssertation<FamilyRegister, PersonRegister> modelAssertation) {
		super(tool, modelAssertation);
	}
	
	/**
	 * <b>Test</b> for agreed upon starting state.<br/>
	 * <b>Expect</b> root elements of both source and target models.<br/>
	 * <b>Features</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testInitialiseSynchronisation() throws SynchronisationFailedException
	{
		// No precondition!
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward((t) -> {}); 
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("RootElementFamilies"),
				getExpectedPersonRegister("RootElementPersons"),
				syncResult); 		
	}
	
	/**
	 * <b>Test</b> for name change of an empty family, i.e, a family without any family members.<br/>
	 * <b>Expect</b> no change in the persons model.<br/>
	 * <b>Features</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testFamilyNameChangeOfEmpty() throws SynchronisationFailedException
	{
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward(helperFamily::createSimpsonFamily); 

		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("Pre_NameChangeFamilyEmpty"),
				getExpectedPersonRegister("Pre_NameChangePersonEmpty"),
				syncResult); 
		
		//------------ 
		syncResult = controller.syncForward(helperFamily::renameEmptySimpsonToBouvier); 
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("NameChangeFamilyEmpty"),
				getExpectedPersonRegister("NameChangePersonEmpty"),
				syncResult); 		
	}
	
	/**
	 * <b>Test</b> for creation of a single family (Skinner) in an empty root container.
	 * <br/>
	 * <b>Expect</b> nothing to be changed in the person model.
	 * <br/>
	 * <b>Features:</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testCreateFamily() throws SynchronisationFailedException
	{
		// No precondition!
		//------------
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward(helperFamily::createSkinnerFamily);
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("OneFamily"),
				getExpectedPersonRegister("PersonsForOneFamily"),
				syncResult); 		
	}

	/**
	 * <b>Test</b> for creation of a single family member (a son - Rod) in a new family (Flanders). <br/>
	 * <b>Expect</b> the creation of a new male person in the persons model,
	 * with full name consisting of the first name and family name of the
	 * associated family member. <br/>
	 * <b>Features:</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testCreateFamilyMember() throws SynchronisationFailedException
	{
		// No precondition!
		//------------
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward((t)->{
				execute(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.accept(t);});
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("OneFamilyWithOneFamilyMemberSon"),
				getExpectedPersonRegister("PersonOneMaleMember"),
				syncResult); 		
	}
	
	/**
	 * Analogous to @link {@link #testCreateFamilyMember()}, but now for
	 * multiple new family members (Simpsons Family).<br/>
	 * <b>Features:</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test 
	public void testNewFamilyWithMultiMembers() throws SynchronisationFailedException{
		// No precondition!
		//------------
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward((t) -> {
				execute(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createNewFamilySimpsonWithMembers)
				.accept(t);});
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("NewFamilyWithMembers"),
				getExpectedPersonRegister("PersonsMulti"),
				syncResult); 		
	}
	
	/**
	 * <b>Test</b> for creation of another Family with the same name (Simpson).<br/>
	 * In the new Simpson family, Bart is the father. 
	 * <b>Expect</b> a new male Person with the name "Simpson, Bart" is created in the person register.<br/>
	 * <b>Features:</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testNewDuplicateFamilyNames() throws SynchronisationFailedException {
		// No precondition!
		//------------
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward((t) -> {
				execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart)
				.accept(t);});
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamiliesWithSameName"),
				getExpectedPersonRegister("PersonWithSameName"),
				syncResult); 		
	}
	
	/**
	 * <b>Test</b> for creation of another family member with the same name (Bart).<br/>
	 * <b>Expect</b> a new male Person with the name "Simpson, Bart" is created in the person register.<br/>
	 * <b>Features:</b>: fwd, fixed
	 * @throws SynchronisationFailedException 
	 */
	@Test
	public void testDuplicateFamilyMemberNames() throws SynchronisationFailedException {
		// No precondition!
		//------------
		SynchronisationResult<FamilyRegister, FamilyRegister, PersonRegister, PersonRegister, OperationalDelta> 
		syncResult = controller.syncForward((t) ->{
				execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSonBart)
				.accept(t);});
		//------------
		modelAssertation.assertPostcondition(
				getExpectedFamilyRegister("FamilyWithDuplicateMember"),
				getExpectedPersonRegister("PersonWithSameName"),
				syncResult); 		
	}
}
