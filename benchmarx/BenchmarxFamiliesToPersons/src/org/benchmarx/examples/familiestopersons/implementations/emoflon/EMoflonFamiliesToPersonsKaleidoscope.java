package org.benchmarx.examples.familiestopersons.implementations.emoflon;
import java.io.IOException;
import java.util.Collection;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.Configurator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.RuleResult;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import FamiliesToPersons.FamiliesToPersonsPackage;
import Persons.PersonRegister;

/**
 * This class implements the bx tool interface for the eMoflon tool. eMoflon is
 * structural-delta-based and corr-based.
 * 
 * The test runner is implemented by delegating to an internal helper. The
 * initial state is established by creating an empty family register and forward
 * transforming it. Idle edits are handled and propagated exactly as normal
 * edits.
 * 
 * @author anthony anjorin
 */
public class EMoflonFamiliesToPersonsKaleidoscope implements Synchroniser<
																		FamilyRegister, 
																		PersonRegister, 
																		Configurator<Decisions>, 
																		OperationalDelta, 
																		OperationalDelta
																		>    {
	
	private static final String RESULTPATH = "results/emoflon";
	
	public EMoflonFamiliesToPersonsKaleidoscope() {		
	}

	private SynchronizationHelper helper;
	
	
	
	@Override
	public FamilyRegister getSourceModel() {
		return (FamilyRegister) helper.getSrc();
	} 

	@Override
	public PersonRegister getTargetModel() {
		return (PersonRegister) helper.getTrg();
	}

	
	private void handleChoices(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		boolean handleExisting = alternatives.stream().anyMatch(rr -> rr.getRule().contains("ExistingFamily"));
		if(handleExisting) restrictMatchesToExisting(configurator, alternatives);
	
		boolean handleParentOrChild = alternatives.stream().anyMatch(rr -> rr.getRule().contains("Mother") || rr.getRule().contains("Father"));
		if(handleParentOrChild) restrictMatchesForParents(configurator, alternatives);
	}

	private void restrictMatchesForParents(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		if (configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD)) {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> rr.getRule().contains("Mother") || rr.getRule().contains("Father")));
		} else {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> !(rr.getRule().contains("Mother") || rr.getRule().contains("Father"))));
		}
		
		alternatives.removeIf(rr -> rr.isEmpty());
	}

	private void restrictMatchesToExisting(Configurator<Decisions> configurator, Collection<RuleResult> alternatives) {
		if (configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW)) {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> rr.getRule().contains("ExistingFamily")));
		} else {
			alternatives.forEach(rr -> rr.restrictMatchesTo(m -> !rr.getRule().contains("ExistingFamily")));
		}
		
		alternatives.removeIf(rr -> rr.isEmpty());
	}
	
	public void persistState(String name) {
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
	
	
	class F2PSyncHelper extends SynchronizationHelper {
		public F2PSyncHelper() {
			this.set = eMoflonEMFUtil.createDefaultResourceSet();

			projectName = FamiliesToPersonsPackage.eINSTANCE.getName();

			corrPackageResource = FamiliesToPersonsPackage.eINSTANCE.eResource();

			loadRulesFromJarArchive("./lib/eMoflon/eMoflonFamilies2Persons.jar", "/model/FamiliesToPersons.sma.xmi");

			configurator = new org.moflon.tgg.algorithm.configuration.Configurator() {
			};
			changeSrc = (root -> {
			});
			changeTrg = (root -> {
			});
		}
	}

	@Override
	public void syncForward(OperationalDelta srcDelta) throws SynchronisationFailedException {
		
		helper.setChangeSrc((EObject root) ->  srcDelta.transformToOpaqueDelta().execute((FamilyRegister) root));
		helper.integrateForward();
		
	}
	

	@Override
	public void syncBackward(OperationalDelta trgDelta) throws SynchronisationFailedException {
		
		Consumer<EObject> delta = (model) -> {trgDelta.transformToOpaqueDelta().execute(model);};
		helper.setChangeTrg(delta);
		helper.integrateBackward();
	}

	@Override
	public OperationalDelta getFailedDelta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdatePolicy(Configurator<Decisions> updatePolicy) {
		helper.setConfigurator(new org.moflon.tgg.algorithm.configuration.Configurator() {
			@Override
			public RuleResult chooseOne(Collection<RuleResult> alternatives) {
				if(alternatives.size() > 1)
					handleChoices(updatePolicy, alternatives);
				return org.moflon.tgg.algorithm.configuration.Configurator.super.chooseOne(alternatives);
			}
		});
		
	}

	@Override
	public void initialise() throws SynchronisationFailedException {
		BasicConfigurator.configure();
		helper = new F2PSyncHelper();		
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE.createFamilyRegister();
		r.getContents().add(familiesRoot);
		
		// Fix default preferences (which can be overwritten)
		setUpdatePolicy(new Configurator<Decisions>()
				.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
			    .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true));
		
		// perform batch to establish consistent starting state
		helper.setSrc(familiesRoot);
		helper.integrateForward();	
		
		helper.setMute(true);
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}

}
