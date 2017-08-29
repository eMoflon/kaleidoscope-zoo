package org;

import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import kaleidocrypt.implemenation.BxtendTool;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.MoflonUtilitiesActivator;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.auxiliary.emfcompare.EMFCompareDeltaDiscoverer;
import  com.kaleidoscope.core.auxiliary.simplejava.artefactadapter.JavaArtefactAdapter;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.discovery.OfflineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Dest;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import CryptoAPIConfig.Task;
import CryptoConfigToJava.CryptoConfigToJavaPackage;
import CryptoConfigToJava.org.moflon.EMoflonTool;
import SimpleJava.JavaPackage;

public class ControllerModule extends AbstractModule{

	private ResourceSet set;
	private Path sourceArtefactAdapterUnparsePath;
	private Path targetArtefactAdapterPackageRoot;
	private Path destination;
	private Optional<Path> initialSourceModelPath;
	private final BxTool bxTool = BxTool.BXTEND;
	
	public ControllerModule(ResourceSet set, Path destination, Path sourceArtefactAdapterUnparsePath, Path targetArtefactAdapterPackageRoot, Optional<Path> initialSourceModelPath) {
		this.set = set;
		this.sourceArtefactAdapterUnparsePath = sourceArtefactAdapterUnparsePath;
		this.targetArtefactAdapterPackageRoot = targetArtefactAdapterPackageRoot;
		this.destination = destination;
		this.initialSourceModelPath = initialSourceModelPath;
	}
	
	@Provides @Src
	ArtefactAdapter<Task, Path> provideSourceArtefactAdapter() {		
		return new XMIArtefactAdapter<Task>(sourceArtefactAdapterUnparsePath);
	}

	@Provides @Trg
	ArtefactAdapter<JavaPackage, List<Path>> provideTargetArtefactAdapter() {
		return new JavaArtefactAdapter(targetArtefactAdapterPackageRoot);
	}
	
	@Provides
	PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path>provideSynchroniser(){
		
		URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava"); 
		PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path>tool;
		
		if(bxTool.equals(BxTool.EMOFLON)) {
			
			tool = new EMoflonTool(CryptoConfigToJavaPackage.eINSTANCE, pathToTGGtransProjet.getPath(), set, initialSourceModelPath);
		}
		else if(bxTool.equals(BxTool.BXTEND)){
			
			tool = new BxtendTool(set, initialSourceModelPath);
		}
		else {
			tool = null;
		}
				
		tool.initialize();
		
		initialSourceModelPath.ifPresent((i) -> {
			tool.persistState(destination);
		});
		
		return tool;
	}
	@Override
	protected void configure() {
		bind(new TypeLiteral<OfflineDeltaDiscoverer<Task, OperationalDelta>>() {}). annotatedWith(Src.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<Task>>() {});
		bind(new TypeLiteral<OfflineDeltaDiscoverer<JavaPackage, OperationalDelta>>() {}). annotatedWith(Trg.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<JavaPackage>>() {});
		bind(Path.class).annotatedWith(Dest.class).toInstance(destination);
	}
	
}

enum BxTool {
    EMOFLON, BXTEND 
}