package com.kaleidoscope.usecase.bxdemonstrator.emoflon.implementation;

import java.net.URL;
import java.util.List;


import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.ContinuableSynchroniser;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import KitchenLanguage.Kitchen;
import KitchenToGridLanguage.KitchenToGridLanguagePackage;

public class EmoflonToolImpl implements ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta> {

	private OperationalDelta failedDelta;
	private KitchenToGridSynchronizationHelper helper;
	private KitchenToGridConfigurator configurator;
	private String choice;
	private int noOfBlocks;

	public EmoflonToolImpl(int noOfBlocks) {
		this.noOfBlocks = noOfBlocks;
	}
	@Override
	public Grid getSourceModel() {
		return (Grid) helper.getSrc();
	}

	@Override
	public Kitchen getTargetModel() {
		return (Kitchen) helper.getTrg();
	}

	@Override 
	public void terminate() {
		
	}
	
	@Override
	public OperationalDelta getFailedDelta() {
		return failedDelta;
	}
	
	@Override
	public void syncForward(OperationalDelta javaBasedDelta) {
		clear();
		OperationalDelta sourceDeltaOperation = (OperationalDelta) javaBasedDelta;
		helper.setJavaBasedOperationalDelta(sourceDeltaOperation);

		while (sourceDeltaOperation.getOperations().size() > 0) {

			if (failedDelta.getOperations().contains(sourceDeltaOperation.getOperations().get(0)))
				continue;

			try {
				performAndPropagateSourceEdit(sourceDeltaOperation.getOperations().get(0).toJavaConsumer());

			} catch (SynchronisationFailedException e) {

				failedDelta.getOperations().add(sourceDeltaOperation.getOperations().get(0));
			}

			sourceDeltaOperation.getOperations().remove(0);

			if (configurator.hasContinuation()) {
				return;
			}

		}

	}

	@Override
	public void syncBackward(OperationalDelta javaBasedDelta) {
		clear();
		OperationalDelta targetDeltaOperation = (OperationalDelta) javaBasedDelta;
		helper.setJavaBasedOperationalDelta(targetDeltaOperation);

		while (targetDeltaOperation.getOperations().size() > 0) {

			if (failedDelta.getOperations().contains(targetDeltaOperation.getOperations().get(0)))
				continue;

			try {
				performAndPropagateTargetEdit(targetDeltaOperation.getOperations().get(0).toJavaConsumer());

			} catch (SynchronisationFailedException e) {

				failedDelta.getOperations().add(targetDeltaOperation.getOperations().get(0));
			}

			targetDeltaOperation.getOperations().remove(0);
			if (configurator.hasContinuation()) {
				return;
			}
		}
		return;
	}

	private void clear() {
		failedDelta = new OperationalDelta();

	}

	@Override
	public void initialize() {
		failedDelta = new OperationalDelta();
		configurator = new KitchenToGridConfigurator();

		initiateSynchronisationDialogue();
		helper.setConfigurator(configurator);

	}

	@Override
	public boolean hasContinuation() {

		return configurator.hasContinuation();
	}

	@Override
	public List<String> getContinuationPolicy() {
		return configurator.getChoices();
	}

	@Override
	public void setUpdatePolicy(List<String> choice) {
		this.choice = choice.get(0);
	}

	@Override
	public void continueSync() {
		configurator.continueSynchronisation(choice);
	}

	private void initiateSynchronisationDialogue() {

		BasicConfigurator.configure();

		// for accessing jar
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
		// initialize grid with block structure
		Grid gridRoot = GridLanguageFactory.eINSTANCE.createGrid();
		gridRoot.setBlockSize((double) 500 / noOfBlocks);

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

	private void performAndPropagateTargetEdit(Runnable edit) {
		helper.updateConsistentState();
		helper.setChangeTrg((EObject root) -> edit.run());
		helper.integrateBackward();
	}

	private void performAndPropagateSourceEdit(Runnable edit) {
		helper.updateConsistentState();
		helper.setChangeSrc((EObject root) -> edit.run());
		helper.integrateForward();
	}
}
