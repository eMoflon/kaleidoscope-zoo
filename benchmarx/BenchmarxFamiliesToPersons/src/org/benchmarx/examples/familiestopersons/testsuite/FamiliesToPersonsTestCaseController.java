package org.benchmarx.examples.familiestopersons.testsuite;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;

import org.benchmarx.Configurator;
import org.benchmarx.emf.Comparator;
import org.benchmarx.emf.EMFModelAssertation;
import org.benchmarx.emf.ModelAssertation;
import org.benchmarx.examples.familiestopersons.implementations.bigul.BiGULFamiliesToPersonsKaleidoscope;
import org.benchmarx.examples.familiestopersons.implementations.bxtend.UbtXtendFamiliesToPersonsKaleidoscope;
import org.benchmarx.examples.familiestopersons.implementations.emoflon.EMoflonFamiliesToPersonsKaleidoscope;
import org.benchmarx.examples.familiestopersons.implementations.funnyqt.FunnyQTFamiliesToPersonKaleidoscope;
import org.benchmarx.examples.familiestopersons.implementations.medini.MediniQVTFamiliesToPersonsKaleidoscope;
import org.benchmarx.examples.familiestopersons.implementations.nmf.NMFFamiliesToPersonsIncrementalKaleidoscope;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.families.core.FamilyHelper;
import org.benchmarx.persons.core.PersonHelper;
import org.benchmarx.persons.core.PersonsComparator;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.controllers.deltabased.DeltaBasedController;

import Families.FamiliesPackage;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsPackage;

@Ignore
@RunWith(Parameterized.class)
public class FamiliesToPersonsTestCaseController {

	
	
	protected DeltaBasedController<FamilyRegister, FamilyRegister,
	 PersonRegister, PersonRegister, Configurator<Decisions>, OperationalDelta,
	 OperationalDelta, OpaqueDelta<FamilyRegister>, OpaqueDelta<PersonRegister>>
	  controller;
	 
	protected Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool;	
	protected Comparator<FamilyRegister> familiesComparator;
	protected Comparator<PersonRegister> personsComparator;
	protected ModelAssertation<FamilyRegister, PersonRegister> util;
	protected FamilyHelper helperFamily;
	protected PersonHelper helperPerson;
	protected ModelAssertation<FamilyRegister, PersonRegister> modelAssertation;
	
	
	public <X> Consumer<X> execute(Consumer<X> a){
		return a;
	}
	
	protected FamilyRegister getExpectedFamilyRegister(String path) {
		Path relativePath = FileSystems.getDefault().getPath("resources", path + ".xmi");
		Path absolutePath = relativePath.normalize();
		
		ArtefactAdapter<FamilyRegister, Path> artefactAdapter = new XMIArtefactAdapter<FamilyRegister>(absolutePath);
		artefactAdapter.parse();
		return artefactAdapter.getModel().get();
	}
	
	protected PersonRegister getExpectedPersonRegister(String path) {
		Path relativePath = FileSystems.getDefault().getPath("resources", path + ".xmi");
		Path absolutePath = relativePath.normalize();
		
		ArtefactAdapter<PersonRegister, Path> artefactAdapter = new XMIArtefactAdapter<PersonRegister>(absolutePath);
		artefactAdapter.parse();
		return artefactAdapter.getModel().get();
	}
	

	@Before
	public void initialise() {
		// Make sure packages are registered
		FamiliesPackage.eINSTANCE.getName();
		PersonsPackage.eINSTANCE.getName();

		// Initialise all helpers
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		util = null;
		helperFamily = new FamilyHelper();
		helperPerson = new PersonHelper();

		// Initialise the bx tool
		try {
			tool.initialise();
		} catch (SynchronisationFailedException e) {
			e.printStackTrace();
		}
	}

	@After
	public void terminate() {
		tool.terminate();
	}

	@Parameters
	public static Collection<Object[]> data() {
		
		Synchroniser<FamilyRegister,
					PersonRegister,
					Configurator<Decisions>,
					OperationalDelta,
					OperationalDelta> nmfTool  =new NMFFamiliesToPersonsIncrementalKaleidoscope();	
		
		Synchroniser<FamilyRegister,
		PersonRegister,
		Configurator<Decisions>,
		OperationalDelta,
		OperationalDelta> bigulTool  =new BiGULFamiliesToPersonsKaleidoscope();	
		 
		return Arrays.asList(new Object[][] { 
			{
				new EMoflonFamiliesToPersonsKaleidoscope(),
				new EMFModelAssertation< FamilyRegister, PersonRegister>(new FamiliesComparator(), new PersonsComparator()) 
			},
			
			{
				new UbtXtendFamiliesToPersonsKaleidoscope(),
				new EMFModelAssertation< FamilyRegister, PersonRegister>(new FamiliesComparator(), new PersonsComparator()) 
			},
			
			{
				nmfTool,
				nmfTool 
			},
			
			{
				new FunnyQTFamiliesToPersonKaleidoscope(),
				new EMFModelAssertation< FamilyRegister, PersonRegister>(new FamiliesComparator(), new PersonsComparator()) 
			},
			
			{
				bigulTool,
				bigulTool 
			},
			
			{
				new MediniQVTFamiliesToPersonsKaleidoscope(),
				new EMFModelAssertation< FamilyRegister, PersonRegister>(new FamiliesComparator(), new PersonsComparator()) 
			}
		
		});
	}

	public FamiliesToPersonsTestCaseController(
			Synchroniser<FamilyRegister, PersonRegister, Configurator<Decisions>, OperationalDelta, OperationalDelta> tool,
			ModelAssertation<FamilyRegister, PersonRegister> modelAssertation) {
		this.tool = tool;
		this.modelAssertation = modelAssertation;
		this.controller = new ControllerModule(tool).getControllerInstance();
	}
}
