package kaleidocrypt.implemenation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;

import BxtendCryptoImpl.Transformation;
import BxtendCryptoImpl.rules.BxtendCryptoImplTransformation;
import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;

public class BxtendTool implements PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path> {
	private Resource sourceResource;
	private Resource targetResource;
	private Resource corrResource;

	private Task sourceModel;
	private JavaPackage targetModel;
	private Transformation corrModel;

	private String sourceModelFileName = "fwd.src.xmi";
	private String targetModelFileName = "fwd.trg.xmi";
	private String corrModelFileName = "fwd.corr.xmi";

	private Task initialTask;
	private JavaPackage initialJavaPackage;
	private ResourceSet set;

	public BxtendTool(Optional<Task> initialSource, Optional<JavaPackage> initialTarget, Path persistenceDirectory) {
		this.initialTask = initialSource.orElse(null); 
		this.initialJavaPackage = initialTarget.orElse(null);

		set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		sourceResource = set.createResource(URI.createURI("fwd.src.xmi"));
		targetResource = set.createResource(URI.createURI("fwd.trg.xmi"));
		corrResource = set.createResource(URI.createURI("fwd.corr.xmi"));
	}

	@Override
	public void initialise() {
		if (initialTask != null && initialJavaPackage == null) {
			sourceModel = initialTask;
			sourceResource.getContents().add(sourceModel);
			syncForward(new OperationalDelta());
		} else if (initialJavaPackage != null && initialTask == null) {
			targetModel = initialJavaPackage;
			targetResource.getContents().add(targetModel);
			syncBackward(new OperationalDelta());
		}
	}

	@Override
	public void terminate() {

	}

	private boolean isStatePersisted(Path persistenceDirectory) {
		File sourceModelFile = persistenceDirectory.resolve(sourceModelFileName).toFile();
		File targetModelFile = persistenceDirectory.resolve(targetModelFileName).toFile();
		File correspondentModelFile = persistenceDirectory.resolve(corrModelFileName).toFile();

		if (!sourceModelFile.exists() || !targetModelFile.exists() || !correspondentModelFile.exists())
			return false;

		return true;
	}

	@Override
	public void restoreState(Path persistenceDirectory) {
		if (!isStatePersisted(persistenceDirectory)) return;

		sourceModel = (Task) loadModel(sourceResource, persistenceDirectory.resolve(sourceModelFileName).toString());
		targetModel = (JavaPackage) loadModel(targetResource,
				persistenceDirectory.resolve(targetModelFileName).toString());
		corrModel = (Transformation) loadModel(corrResource,
				persistenceDirectory.resolve(corrModelFileName).toString());
		EcoreUtil.resolveAll(corrModel);
	}

	@Override
	public void persistState(Path persistenceDirectory) {
		saveModel(sourceResource, sourceModel, persistenceDirectory.resolve(sourceModelFileName).toString());
		saveModel(targetResource, targetModel, persistenceDirectory.resolve(targetModelFileName).toString());
		saveModel(corrResource, corrModel, persistenceDirectory.resolve(corrModelFileName).toString());
	}

	public Task getSourceModel() {
		return sourceModel;
	}

	public JavaPackage getTargetModel() {
		return targetModel;
	}

	@Override
	public void syncForward(OperationalDelta operationalJavaBasedDelta) {
		OpaqueDelta<Task> delta = operationalJavaBasedDelta.transformToOpaqueDelta();
		delta.execute(sourceModel);

		BxtendCryptoImplTransformation f2pt = new BxtendCryptoImplTransformation(sourceResource, targetResource,
				corrResource);
		f2pt.sourceToTarget();

		targetModel = (JavaPackage) targetResource.getContents().get(0);
		corrModel = (Transformation) corrResource.getContents().get(0);
	}

	@Override
	public void syncBackward(OperationalDelta operationalJavaBasedDelta) {
		OpaqueDelta<EObject> delta = operationalJavaBasedDelta.transformToOpaqueDelta();
		delta.execute(targetModel);

		BxtendCryptoImplTransformation f2pt = new BxtendCryptoImplTransformation(sourceResource, targetResource,
				corrResource);
		f2pt.targetToSource();

		sourceModel = (Task) sourceResource.getContents().get(0);
		corrModel = (Transformation) corrResource.getContents().get(0);
	}

	@Override
	public void setUpdatePolicy(String p) {

	}

	@Override
	public OperationalDelta getFailedDelta() {
		return null;
	}

	private EObject loadModel(Resource resource, final String path) {
		resource.setURI(createFileURI(path, true));
		try {
			resource.load(null);
		} catch (IOException e) {
			// LogUtils.error(logger, e);
		}
		return resource.getContents().get(0);
	}

	private URI createFileURI(final String pathToXMIFile, final boolean mustExist) {
		File filePath = new File(pathToXMIFile);

		if (!filePath.exists() && mustExist)
			throw new IllegalArgumentException(pathToXMIFile + " does not exist.");

		return URI.createFileURI(filePath.getAbsolutePath());
	}

	private void saveModel(final Resource resource, final EObject rootElementOfModel, final String pathToXMIFile) {
		if (resource.getContents().isEmpty())
			resource.getContents().add(rootElementOfModel);
		else
			resource.getContents().set(0, rootElementOfModel);
		URI fileURI = createFileURI(pathToXMIFile, false);
		resource.setURI(fileURI);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
