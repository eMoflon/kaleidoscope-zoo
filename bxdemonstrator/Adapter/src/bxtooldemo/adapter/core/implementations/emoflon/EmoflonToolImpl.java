package bxtooldemo.adapter.core.implementations.emoflon;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.kaleidoscope.extensionpoint.UpdatePolicy;
import com.kaleidoscope.extensionpoint.bxtool.ContinuableBXtool;
import com.kaleidoscope.extensionpoint.bxtool.SynchronizationReport;
import com.kaleidoscope.ui.delta.javabased.JavaBasedDelta;
import com.kaleidoscope.ui.delta.javabased.operational.Operation;
import com.kaleidoscope.ui.delta.javabased.operational.OperationalJavaBasedDelta;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import KitchenLanguage.Kitchen;
import KitchenToGridLanguage.KitchenToGridLanguagePackage;
import bxtooldemo.adapter.core.uiservice.Analysis;

public class EmoflonToolImpl implements ContinuableBXtool<Grid, Kitchen, String, String>{

	private SynchronizationReport fwdSyncReport;
	private SynchronizationReport bwdSyncReport;
	private KitchenToGridSynchronizationHelper helper;
	private KitchenToGridConfigurator configurator;
	private ResourceSet set;
	
	@Override
	public Grid getSourceModel() {
		return (Grid) helper.getSrc();
	}

	@Override
	public Kitchen getTargetModel() {
		return (Kitchen) helper.getTrg();
	}

	@Override
	public void setSourceModel(Grid sourceModel) {
		helper.setSrc(sourceModel);
	}

	@Override
	public void setTargetModel(Kitchen targetModel) {
		helper.setTrg(targetModel);
		
	}

	@Override
	public void sourceToTargetTransformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void targetToSourceTransformation() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		this.set = resourceSet;
	}


	@Override
	public Optional<SynchronizationReport> syncForwardFromJavaBasedDelta(JavaBasedDelta javaBasedDelta, Optional<UpdatePolicy<?>> updatePolicy) {
		clear();
		OperationalJavaBasedDelta sourceDeltaOperation = (OperationalJavaBasedDelta)javaBasedDelta;
		helper.setJavaBasedOperationalDelta(sourceDeltaOperation);
		
		
		while(sourceDeltaOperation.getOperations().size() > 0) {
			
			if(bwdSyncReport.getFailedlOperations().contains(sourceDeltaOperation.getOperations().get(0)))
				continue;
			
			if(bwdSyncReport.getSuccessfulOperations().contains(sourceDeltaOperation.getOperations().get(0)))
				continue;
			
			try{
				performAndPropagateSourceEdit(sourceDeltaOperation.getOperations().get(0).toJavaConsumer());
				fwdSyncReport.addSuccessfulOperation(sourceDeltaOperation.getOperations().get(0));
				
		      } catch (SynchronisationFailedException e){
		    	  
		    	  fwdSyncReport.addFailedOperation(sourceDeltaOperation.getOperations().get(0));
		      }
			
			
			sourceDeltaOperation.getOperations().remove(0);
			
			if(configurator.hasContinuation()){
				return Optional.of(fwdSyncReport);
			}
			
		}
		return Optional.of(fwdSyncReport);
	}

	@Override
	public Optional<SynchronizationReport> syncBackwardFromJavaBasedDelta(JavaBasedDelta javaBasedDelta, Optional<UpdatePolicy<?>> updatePolicy) {
		clear();
		OperationalJavaBasedDelta targetDeltaOperation = (OperationalJavaBasedDelta)javaBasedDelta;
		helper.setJavaBasedOperationalDelta(targetDeltaOperation);
		
		while(targetDeltaOperation.getOperations().size() > 0) {
			
			if(bwdSyncReport.getFailedlOperations().contains(targetDeltaOperation.getOperations().get(0)))
				continue;
			
			if(bwdSyncReport.getSuccessfulOperations().contains(targetDeltaOperation.getOperations().get(0)))
				continue;
			
			try{
				performAndPropagateTargetEdit(targetDeltaOperation.getOperations().get(0).toJavaConsumer());
				bwdSyncReport.addSuccessfulOperation(targetDeltaOperation.getOperations().get(0));
				
		      } catch (SynchronisationFailedException e){
		    	  
		    	  bwdSyncReport.addFailedOperation(targetDeltaOperation.getOperations().get(0));
		      }
			
			targetDeltaOperation.getOperations().remove(0);
			if(configurator.hasContinuation()){
				return Optional.of(bwdSyncReport);
			}
		}
		return Optional.of(bwdSyncReport);
	}

	@Override
	public void persistState(String toDestination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreState(String fromDestination) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		fwdSyncReport = new SynchronizationReport();
		bwdSyncReport = new SynchronizationReport();
		
	}

	@Override
	public void initialize() {
		fwdSyncReport = new SynchronizationReport();
		bwdSyncReport = new SynchronizationReport();
		configurator = new KitchenToGridConfigurator();
		
		initiateSynchronisationDialogue();
		helper.setConfigurator(configurator);
		
		
	}

	@Override
	public boolean hasContinuation() {
		
		return configurator.hasContinuation();
	}

	@Override
	public List<String> getChoicesForContinuation() {
		return configurator.getChoices();
	}

	@Override
	public void continueSync(String choice) {
		configurator.continueSynchronisation(choice);	
	}
	
	
	private void initiateSynchronisationDialogue() {
		
		BasicConfigurator.configure();
		
		//for accessing jar
		URL location = KitchenToGridLanguagePackage.class.getProtectionDomain().getCodeSource().getLocation();
		helper = new KitchenToGridSynchronizationHelper(location.getFile());
		
		Resource r = helper.getResourceSet().createResource(URI.createURI("sourceModel"));
		
		Grid gridRoot = initialiseGrid();
		r.getContents().add(gridRoot);
		
		// perform batch to establish consistent starting state
		helper.setSrc(gridRoot);
		helper.integrateForward();	
		
		helper.setVerbose(true);
	}

	private Grid initialiseGrid() {
		//initialize grid with block structure
		Grid gridRoot = GridLanguageFactory.eINSTANCE.createGrid();
		int noOfBlocks = Analysis.blockArrayNo;
		gridRoot.setBlockSize((double)500/noOfBlocks);
		
		Block topLeft = createTopLeft(gridRoot);
		createFirstRow(gridRoot, topLeft, noOfBlocks);
		createFirstCol(gridRoot, topLeft, noOfBlocks);
		createInternalBlocks(gridRoot, topLeft, noOfBlocks);
		
		return gridRoot;
	}

	private Block createTopLeft(Grid gridRoot) {
		Block block = GridLanguageFactory.eINSTANCE.createBlock();
		block.setXIndex(0);
		block.setYIndex(0);
		gridRoot.getBlocks().add(block);
		
		return block;
	}

	private void createFirstRow(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block west = topLeft;
		for (int i = 1; i < noOfBlocks; i++) {
			Block block = GridLanguageFactory.eINSTANCE.createBlock();
			block.setXIndex(i);
			block.setYIndex(0);
			block.setW(west);
			gridRoot.getBlocks().add(block);
			
			west = block;
		}
	}
	
	private void createFirstCol(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block north = topLeft;
		for (int i = 1; i < noOfBlocks; i++) {
			Block block = GridLanguageFactory.eINSTANCE.createBlock();
			block.setXIndex(0);
			block.setYIndex(i);
			block.setN(north);
			gridRoot.getBlocks().add(block);
			
			north = block;
		}
	}
	
	private void createInternalBlocks(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block northwest = topLeft;
		Block north = northwest.getE();
		Block west = northwest.getS();
		for (int i = 1; i < noOfBlocks; i++) {
			
			for (int j = 1; j < noOfBlocks; j++) {
				Block block = GridLanguageFactory.eINSTANCE.createBlock();
				block.setXIndex(j);
				block.setYIndex(i);
				block.setNw(northwest);
				block.setN(north);
				block.setW(west);
				gridRoot.getBlocks().add(block);
				
				northwest = north;
				north = northwest.getE();
				west = block;
			}
			
				topLeft = topLeft.getS();
				northwest = topLeft;
				north = northwest.getE();
				west = northwest.getS();
			
		}
	}

	private  void performAndPropagateTargetEdit(Consumer<EObject> edit) {
		helper.updateConsistentState();
		helper.setChangeTrg((EObject root) ->  edit.accept((Kitchen) root));
		helper.integrateBackward();
	}

	private void performAndPropagateSourceEdit(Consumer<EObject> edit) {
		helper.updateConsistentState();
		helper.setChangeSrc((EObject root) ->  edit.accept((Grid) root));
		helper.integrateForward();
	}
}
