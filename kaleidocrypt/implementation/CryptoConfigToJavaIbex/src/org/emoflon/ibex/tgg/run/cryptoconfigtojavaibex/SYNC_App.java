package org.emoflon.ibex.tgg.run.cryptoconfigtojavaibex;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class SYNC_App extends SYNC {

	protected String sourceModelFileName = "fwd.src.xmi";
	protected String targetModelFileName = "fwd.trg.xmi";
	protected String corrModelFileName = "fwd.corr.xmi";
	protected String syncProtocolFileName = "fwd.protocol.xmi";
	protected Path persistenceDirectory;
	
	public SYNC_App(ResourceSet resourceSet, Path persistenceDirectory) throws IOException {
		super(createIbexOptions());
		this.persistenceDirectory = persistenceDirectory;
		this.rs = resourceSet;

		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	/*
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		SYNC_App sync = new SYNC_App();

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");

		sync.saveModels();
		sync.terminate();
	}*/

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);

		// Register correspondence metamodel last
		loadAndRegisterMetamodel(
				"platform:/plugin/CryptoConfigToJavaIbex" + "/model/" + options.projectName() + ".ecore");
	}

	protected Resource loadFlattenedTGGResource() throws IOException {
		return loadResource("platform:/plugin/CryptoConfigToJavaIbex" + "/model/" + options.projectName() + "_flattened.tgg.xmi");
	}

	protected Resource loadTGGResource() throws IOException {
		return loadResource("platform:/plugin/CryptoConfigToJavaIbex" + "/model/"  + options.projectName() + ".tgg.xmi");
	}

	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}
