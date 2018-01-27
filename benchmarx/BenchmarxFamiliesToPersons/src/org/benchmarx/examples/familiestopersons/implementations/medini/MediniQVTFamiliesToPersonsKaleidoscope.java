package org.benchmarx.examples.familiestopersons.implementations.medini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.output.NullOutputStream;
import org.benchmarx.Configurator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamiliesFactory;
import Families.FamiliesPackage;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsPackage;
import de.ikv.emf.qvt.EMFQvtProcessorImpl;
import de.ikv.medini.qvt.QVTProcessorConsts;
import uk.ac.kent.cs.kmf.util.ILog;
import uk.ac.kent.cs.kmf.util.OutputStreamLog;

public class MediniQVTFamiliesToPersonsKaleidoscope implements Synchroniser<
																FamilyRegister, 
																PersonRegister, 
																Configurator<Decisions>, 
																OperationalDelta, 
																OperationalDelta
																>    {
	private static final String RULESET = "families2persons2.qvt";
	// Version as presented in the BX 2017 paper
	// Switch to families2persons.qvt for the version with top level relations only

	private ILog logger;
	private EMFQvtProcessorImpl processorImpl;
	private ResourceSet resourceSet;
	private Resource source;
	private Resource target;
	private String basePath;
	private String transformation;
	private FileReader qvtRuleSet;
	private static final String fwdDir = "perDB";
	private static final String bwdDir = "famDB";
	
	private static final String RESULTPATH = "results/medini";
	
	
	public String getName() {
		return "MediniQVT";
	}
	
	public MediniQVTFamiliesToPersonsKaleidoscope() {
		
		logger = new OutputStreamLog(new PrintStream(new NullOutputStream())); 
		// logger = new OutputStreamLog(System.err); 
		
		processorImpl = new EMFQvtProcessorImpl(this.logger);
		processorImpl.setProperty(QVTProcessorConsts.PROP_DEBUG, "true");
		basePath = "./src/org/benchmarx/examples/familiestopersons/implementations/medini/base/";
		
		// Tell the QVT engine, which transformation to execute
		transformation = "families2persons";

		// Tell the QVT engine a directory to work in - e.g. to store the trace (meta)models
		File tracesFile = new File(basePath + "traces/trace.trafo");
		tracesFile.delete();
	}
	
	/**
	 * Initiates a synchronization between a source and a target model. The medini QVT engine is initialized,
	 * the required metamodels are registered and empty source and target models are created.
	 * Finally a FamilyRegister is added to the source model and an initial forward transformation is issued
	 * to create a corresponding PersonRegister.
	 */
	@Override
	public void initialise() throws SynchronisationFailedException {
		// delete content of traces folder
		File tracesFolder = new File("./src/org/benchmarx/examples/familiestopersons/implementations/medini/base/traces");
		final File[] files = tracesFolder.listFiles();
		if (files != null) {
			for (File f : files) {
				if (f != null)
					f.delete();
			}
		}
		
		// Initialise resource set of models
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Collect all necessary packages from the metamodel(s)
		Collection<EPackage> metaPackages = new ArrayList<EPackage>();
		this.collectMetaModels(metaPackages);

		// Make these packages known to the QVT engine
		init(metaPackages);
		
		// Create resources for models
		source = resourceSet.createResource(URI.createURI("source.xmi"));
		target = resourceSet.createResource(URI.createURI("target.xmi"));
		
		// Collect the models, which should participate in the transformation.
		// You can provide a list of models for each direction.
		// The models must be added in the same order as defined in your transformation!
		Collection<Collection<Resource>> modelResources = new ArrayList<Collection<Resource>>();
		Collection<Resource> firstSetOfModels = new ArrayList<Resource>();
		Collection<Resource> secondSetOfModels = new ArrayList<Resource>();
		Collection<Resource> thirdSetOfModels = new ArrayList<Resource>();
		modelResources.add(firstSetOfModels);
		modelResources.add(secondSetOfModels);
		modelResources.add(thirdSetOfModels);
		firstSetOfModels.add(source);
		secondSetOfModels.add(target);
		
		URI directory = URI.createFileURI(basePath + "traces");
		this.preExecution(modelResources, directory);
		
		source.getContents().add(FamiliesFactory.eINSTANCE.createFamilyRegister());
		launchFWD();
	}

	private void launchFWD() {
		launch(fwdDir);
	}
	
	private void launchBWD() {
		launch(bwdDir);
	}

	@Override
	public FamilyRegister getSourceModel() {
		return (FamilyRegister) source.getContents().get(0);
	}

	@Override
	public PersonRegister getTargetModel() {
		return (PersonRegister) target.getContents().get(0);
	}
	
	@Override
	public void setUpdatePolicy(Configurator<Decisions> configurator) {
		// the version of the QVT-R script does not support configuration or interatcion
	}

	/**
	 * Provide the information about the metamodels, which are involved in the transformation
	 * 
	 * @param ePackages
	 *            the metamodel packages
	 */
	public void init(Collection<EPackage> ePackages) {
		Iterator<EPackage> iterator = ePackages.iterator();
		while (iterator.hasNext()) {
			this.processorImpl.addMetaModel(iterator.next());
		}
	}

	/**
	 * Before transforming, the engine has to know the model to perform the transformation on, as
	 * well as a directory for the traces to store.
	 * 
	 * @param modelResources
	 *            models for the execution - take care of the right order!
	 * @param workingDirectory
	 *            working directory of the QVT engine
	 */
	public void preExecution(Collection<?> modelResources, URI workingDirectory) {
		this.processorImpl.setWorkingLocation(workingDirectory);
		this.processorImpl.setModels(modelResources);
	}

	/**
	 * Transform a QVT script in a specific direction.
	 * 
	 * @param qvtRuleSet
	 *            the QVT transformation
	 * @param transformation
	 *            name of the transformation
	 * @param direction
	 *            name of the target - must conform to your QVT transformation definition
	 * @throws Throwable
	 */
	public void transform(Reader qvtRuleSet, String transformation, String direction) throws Throwable {
		processorImpl.evaluateQVT(qvtRuleSet, transformation, true, direction, new Object[0], null, this.logger);
	}

	/**
	 * launch the transformation in the QVT execution engine
	 * 
	 * @param direction : the desired execution direction
	 */
	public void launch(String direction) {
		PrintStream ps = System.out;
		PrintStream ps_err = System.err;
		
		// Load the QVT relations
		try {
			System.setOut(new PrintStream(new NullOutputStream()));
			System.setErr(new PrintStream(new NullOutputStream()));

			qvtRuleSet = new FileReader(basePath + RULESET);
			this.transform(qvtRuleSet, transformation, direction);
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
			return;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			System.out.println(throwable.getMessage());
		} finally {		
			System.setOut(ps);
			System.setErr(ps_err);
		}
	}

	/**
	 * Add all metamodel packages of models/qvt script
	 * 
	 * @param metaPackages
	 * @return
	 */
	protected void collectMetaModels(Collection<EPackage> metaPackages) {
		metaPackages.add(PersonsPackage.eINSTANCE);
		metaPackages.add(FamiliesPackage.eINSTANCE);
	}
	
	/**
	 * Allows to save the current state of the source and target models
	 * 
	 * @param name : Filename 
	 */
	public void saveModels(String name) {
		ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		URI srcURI = URI.createFileURI(RESULTPATH + "/" + name + "Family.xmi");
		URI trgURI = URI.createFileURI(RESULTPATH + "/" + name + "Person.xmi");
		Resource resSource = set.createResource(srcURI);
		Resource resTarget = set.createResource(trgURI);
		
		EObject colSource = EcoreUtil.copy(getSourceModel());
		EObject colTarget = EcoreUtil.copy(getTargetModel());
		
		resSource.getContents().add(colSource);
		resTarget.getContents().add(colTarget);
		
		try {
			resSource.save(null);
			resTarget.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}			
	}

	

	@Override
	public void syncForward(OperationalDelta srcDelta) throws SynchronisationFailedException {
		srcDelta.transformToOpaqueDelta().execute(getSourceModel());		
		launchFWD();
		
	}

	@Override
	public void syncBackward(OperationalDelta trgDelta) throws SynchronisationFailedException {
		trgDelta.transformToOpaqueDelta().execute(getTargetModel());
		launchBWD();
		
	}

	@Override
	public OperationalDelta getFailedDelta() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}
}
