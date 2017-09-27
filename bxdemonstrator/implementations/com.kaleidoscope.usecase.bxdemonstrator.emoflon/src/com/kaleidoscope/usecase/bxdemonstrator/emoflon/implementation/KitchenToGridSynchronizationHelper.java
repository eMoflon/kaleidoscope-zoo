package com.kaleidoscope.usecase.bxdemonstrator.emoflon.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tgg.algorithm.configuration.Configurator;
import org.moflon.tgg.algorithm.datastructures.PrecedenceStructure;
import org.moflon.tgg.algorithm.datastructures.SynchronizationProtocol;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;
import org.moflon.tgg.runtime.CorrespondenceModel;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;

import GridLanguage.Grid;
import KitchenLanguage.Kitchen;
import KitchenToGridLanguage.KitchenToGridLanguagePackage;

public class KitchenToGridSynchronizationHelper extends SynchronizationHelper {

	private Collection<EObject> root = new ArrayList<>();
	private Copier objectMapping; 
	private OperationalDelta javaBasedDelta;
	
	public void setJavaBasedOperationalDelta(OperationalDelta javaBasedDelta){
		this.javaBasedDelta = javaBasedDelta;
	}
	
	public OperationalDelta getJavaBasedOperationalDelta(OperationalDelta javaBasedDelta){
		return javaBasedDelta;
	}
	
	public KitchenToGridSynchronizationHelper(String location) {
		this.set = eMoflonEMFUtil.createDefaultResourceSet();
		EPackage corrPackage = KitchenToGridLanguagePackage.eINSTANCE;
		projectName = corrPackage.getName();

		// Set mapping for correspondence package to ecore file
		corrPackageResource = corrPackage.eResource();

		configurator = new Configurator() {
		};
		changeSrc = (root -> {
		});
		changeTrg = (root -> {
		});

		loadRulesFromJarArchive(location, "/KitchenToGridLanguage.sma.xmi");
		EcoreUtil.resolveAll(rules);
	}
	
	private void performSynchronization(ContinuableSynchronizer synchronizer) {
		 try
	      {
	         synchronizer.synchronize();
	      } catch (Exception e)
	      {
	    	  rollback();
	    	  throw new SynchronisationFailedException("Delta is not consistent", objectMapping);
	      }
	}

	public void updateConsistentState() {
		List<EObject> copy = new ArrayList<>();
		copy.add(src);
		copy.add(trg);
		copy.add(corr);
		copy.add(protocol.save());
		copy.add(javaBasedDelta.toEMF());
		root = EcoreUtil.copyAll(copy);
		
		objectMapping = new Copier();
		root = objectMapping.copyAll(copy);
		objectMapping.copyReferences(); 
	}
	
	private void rollback() {
		EObject oldSrc = root.stream().filter(o -> o instanceof Grid).findFirst().get();
		EObject oldTrg = root.stream().filter(o -> o instanceof Kitchen).findFirst().get();
		EObject oldCorr = root.stream().filter(o -> o instanceof CorrespondenceModel).findFirst().get();
		EObject oldProt = root.stream().filter(o -> o instanceof PrecedenceStructure).findFirst().get();
		EObject oldDelta = root.stream().filter(o -> o instanceof KaleidoscopeDelta.OperationalDelta).findFirst().get();
		
		src.eResource().getContents().add(oldSrc);
		src.eResource().getContents().remove(src);
		src = oldSrc;
		
		trg.eResource().getContents().add(oldTrg);
		trg.eResource().getContents().remove(trg);
		trg = oldTrg;
		
		corr.eResource().getContents().add(oldCorr);
		corr.eResource().getContents().remove(corr);
		corr = (CorrespondenceModel) oldCorr;
		
		protocol = new SynchronizationProtocol();
		protocol.load((org.moflon.tgg.runtime.PrecedenceStructure) oldProt);
		
		javaBasedDelta = OperationalDelta.fromEMF((KaleidoscopeDelta.OperationalDelta)oldDelta);
		System.out.println("Performed rollback!");
	}
	
	@Override
	public void integrateForward() {
		 if (src == null)
	         throw new IllegalArgumentException("Source model must be set");

	      init();
	      establishForwardDelta();
	      establishTranslationProtocol();

	      performSynchronization(new ForwardContinuableSynchronizer(corr, delta, protocol, configurator, determineLookupMethods(), tempOutputContainer));

	      if (trg == null)
	         trg = corr.getTarget();
	}
	
	@Override
	public void integrateBackward() {
		 if (trg == null)
	         throw new IllegalArgumentException("Target model must be set");

	      init();
	      establishBackwardDelta();
	      establishTranslationProtocol();

	      performSynchronization(new BackwardContinuableSynchronizer(corr, delta, protocol, configurator, determineLookupMethods(), tempOutputContainer));

	      if (src == null)
	         src = corr.getSource();
	}
}
