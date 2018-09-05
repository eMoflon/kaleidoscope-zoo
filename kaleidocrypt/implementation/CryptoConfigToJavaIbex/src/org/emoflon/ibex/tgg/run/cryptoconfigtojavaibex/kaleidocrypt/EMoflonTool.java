package org.emoflon.ibex.tgg.run.cryptoconfigtojavaibex.kaleidocrypt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.run.cryptoconfigtojavaibex.SYNC_App;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;

import CryptoAPIConfig.Task;
import Simplejava.JavaPackage;

public class EMoflonTool extends SYNC_App
		implements PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path> {

	private Task initialTask;
	private JavaPackage initialJavaPackage;

	public EMoflonTool(ResourceSet resourceSet, Optional<Task> initialSource, Optional<JavaPackage> initialTarget,
			Path persistenceDirectory) throws IOException {
		super(resourceSet, persistenceDirectory);
		this.initialTask = initialSource.orElse(null);
		this.initialJavaPackage = initialTarget.orElse(null);
	}

	@Override
	public void loadModels() {
		try {
			Path corrPath = persistenceDirectory.resolve(corrModelFileName);
			Path protocolPath = persistenceDirectory.resolve(syncProtocolFileName);
			Path srcPath = persistenceDirectory.resolve(sourceModelFileName);
			Path trgPath = persistenceDirectory.resolve(targetModelFileName);

			if (s == null)
				s = createLoadResources(srcPath);
			if (t == null)
				t = createLoadResources(trgPath);
			if (c == null)
				c = createLoadResources(corrPath);
			if (p == null)
				p = createLoadResources(protocolPath);

			EcoreUtil.resolveAll(rs);
		} catch (IllegalArgumentException | IOException iae) {
			System.err.println("Unable to load input triple: " + iae.getMessage());
			iae.printStackTrace();
		}
	}

	public Resource createLoadResources(Path path) throws IOException {
		File f = new File(path.toString());
		Resource r = rs.createResource(URI.createFileURI(path.toString()));
		if (f.exists())
			r.load(null);

		return r;
	}

	@Override
	public void restoreState(Path path) {
		persistenceDirectory = path;
		try {
			loadModels();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void persistState(Path path) {
		persistenceDirectory = path;

		if (getSourceResource() == null || getTargetResource() == null || getCorrResource() == null)
			return;

		getSourceResource().setURI(URI.createFileURI(persistenceDirectory.resolve(sourceModelFileName).toString()));
		getTargetResource().setURI(URI.createFileURI(persistenceDirectory.resolve(targetModelFileName).toString()));
		getCorrResource().setURI(URI.createFileURI(persistenceDirectory.resolve(corrModelFileName).toString()));
		getProtocolResource().setURI(URI.createFileURI(persistenceDirectory.resolve(syncProtocolFileName).toString()));

		try {
			saveModels();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Task getSourceModel() {
		if(getSourceResource() == null || getSourceResource().getContents().isEmpty())
			return null;
		
		return (Task) getSourceResource().getContents().get(0);
	}

	@Override
	public JavaPackage getTargetModel() {
		return (JavaPackage) getTargetResource().getContents().get(0);
	}

	@Override
	public void syncForward(OperationalDelta javaBasedDelta) throws SynchronisationFailedException {
		try {
			javaBasedDelta.transformToOpaqueDelta().execute(getSourceModel());
			forward();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (getTargetModel() == null)
			throw new SynchronisationFailedException("Failed to propagate source delta!");
	}

	@Override
	public void syncBackward(OperationalDelta javaBasedDelta) throws SynchronisationFailedException {

		try {
			javaBasedDelta.transformToOpaqueDelta().execute(getTargetModel());
			backward();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (getSourceModel() == null)
			throw new SynchronisationFailedException("Failed to propagate target delta!");
	}

	@Override
	public OperationalDelta getFailedDelta() {
		return new OperationalDelta();
	}

	@Override
	public void setUpdatePolicy(String updatePolicy) {

	}

	@Override
	public void terminate() {
		try {
			super.terminate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialise() throws SynchronisationFailedException {
		if (initialTask == null && initialJavaPackage != null) {
			transformTargetIntoSourceModel();
			persistState(persistenceDirectory);
		} else if (initialJavaPackage == null && initialTask != null) {
			transformSourceIntoTargetModel();
			persistState(persistenceDirectory);
		} else if (initialTask == null && initialJavaPackage == null) {
			throw new SynchronisationFailedException("Source or target artefact have to be provided!");
		}
	}

	private void transformTargetIntoSourceModel() throws SynchronisationFailedException {
		getTargetResource().getContents().add(initialJavaPackage);
		try {
			backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (getSourceModel() == null) {
			try {
				saveModels();
			} catch (IOException e) {
				e.printStackTrace();
			}
			throw new SynchronisationFailedException("Failed to initialize source and target models!");
		}
	}

	private void transformSourceIntoTargetModel() throws SynchronisationFailedException {
		getSourceResource().getContents().add(initialTask);
		try {
			forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (getTargetModel() == null)
			throw new SynchronisationFailedException("Failed to initialize source and target models!");
	}
}
