package org.benchmarx.examples.familiestopersons.implementations.bxtend;

import java.io.IOException;

import org.benchmarx.Configurator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import bitrafo.eval.familyperson.rules.Family2PersonTransformation;
import bitrafo.eval.familyperson.rules.decisions.ConfigurableTargetToSourceDecision;

public class UbtXtendFamiliesToPersonsKaleidoscope implements Synchroniser<
													FamilyRegister, 
													PersonRegister, 
													Configurator<Decisions>, 
													OperationalDelta, 
													OperationalDelta
													> {
	private ResourceSet set = new ResourceSetImpl();
	private Resource source;
	private Resource target;
	private Resource corr;
	private Family2PersonTransformation f2pt;
	private Configurator<Decisions> conf;
	private Configurator<Decisions> defaultConf;
	
	private static final String RESULTPATH = "results/BXtend";
	
	public UbtXtendFamiliesToPersonsKaleidoscope() {		
	}
	
	public String getName() {
		return "BXtend";
	}
	
	/**
	 * Initiates a synchronization between a source and a target model. The BXtend Transformation is
	 * initialized and empty source, target and correspondence models are created.
	 * Finally a FamilyRegister is added to the source model and an initial forward transformation is issued
	 * to create a corresponding PersonRegister.
	 */
	@Override
	public void initialise() {
		// Fix default preferences (which can be overwritten)
		setUpdatePolicy(new Configurator<Decisions>()
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
		    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true));			
		
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("family", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("person", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("corr", new XMIResourceFactoryImpl());		
		
		source = set.createResource(URI.createURI("sourceModel.family"));
		target = set.createResource(URI.createURI("targetModel.person"));
		corr = set.createResource(URI.createURI("corrModel.corr"));
		FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE.createFamilyRegister();
		source.getContents().add(familiesRoot);
		f2pt = new Family2PersonTransformation(source, target, corr);
		// Fix default preferences (which can be overwritten)
		setUpdatePolicy(new Configurator<Decisions>()
				.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
			    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true));
		
		// perform batch to establish consistent starting state
		f2pt.Family2Person();
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
		if(defaultConf == null)
			defaultConf = configurator;
		conf = configurator;
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
		f2pt.configure(new ConfigurableTargetToSourceDecision(!conf.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW), conf.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD), false, false));
		f2pt.Family2Person();
		
	}

	@Override
	public void syncBackward(OperationalDelta trgDelta) throws SynchronisationFailedException {
		
		trgDelta.transformToOpaqueDelta().execute(getTargetModel());
		f2pt.configure(new ConfigurableTargetToSourceDecision(!conf.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW), conf.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD), false, false));
		f2pt.Person2Family();
		
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
