package org.kaleidoscope.usecase.kaleidocrypt;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.MoflonUtilitiesActivator;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
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
import Simplejava.JavaPackage;
import kaleidocrypt.implemenation.BxtendTool;

public class ControllerModule extends AbstractModule {
	private ResourceSet set;	
	private final BxTool bxTool = BxTool.EMOFLON;
	private Path sourceArtefactPath;
	private Path targetArtefactPath;
	private Path persistanceDestination;
	
	public ControllerModule(ResourceSet set, Path sourceArtefactPath, Path targetArtefactPath, Path persistanceDestination) {
		this.set = set;		
		this.persistanceDestination = persistanceDestination;
		this.sourceArtefactPath = sourceArtefactPath;
 		this.targetArtefactPath = targetArtefactPath;
	}
	
	@Provides @Src
	ArtefactAdapter<Task, Path> provideSourceArtefactAdapter() {		
		return new XMIArtefactAdapter<Task>(sourceArtefactPath);
	}

	@Provides @Trg
	ArtefactAdapter<JavaPackage, Path> provideTargetArtefactAdapter() {
		return new JavaArtefactAdapter(targetArtefactPath);
	}
	
	@Provides
	PersistentSynchroniser<
		Task, 
		JavaPackage, 
		String, 
		OperationalDelta, 
		OperationalDelta, 
		Path
	>
	provideSynchroniser() throws IOException{
		PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path> tool;
		
		ArtefactAdapter<Task, Path> sourceArtefactAdapter = provideSourceArtefactAdapter();
		sourceArtefactAdapter.parse();
		Optional<Task> initialSource = sourceArtefactAdapter.getModel();
		
		ArtefactAdapter<JavaPackage, Path> targetArtefactAdapter = provideTargetArtefactAdapter();
		targetArtefactAdapter.parse();
		Optional<JavaPackage> initialTarget = targetArtefactAdapter.getModel();
		
		if(bxTool.equals(BxTool.EMOFLON)) {
			URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava"); 
			tool = new EMoflonTool(
					CryptoConfigToJavaPackage.eINSTANCE, 
					pathToTGGtransProjet.getPath(), set, 
					initialSource, 
					initialTarget, 
					persistanceDestination
				);
		} else if(bxTool.equals(BxTool.BXTEND)){
			tool = new BxtendTool(
					initialSource, 
					initialTarget, 
					persistanceDestination
				);
		}
		else {
			throw new IllegalArgumentException("Bx tool has to be chosen!");
		}
			
		return tool;
	}
	
	@Provides @Src
	OfflineDeltaDiscoverer<Task, OperationalDelta> provideSourceOfflineDeltaDiscoverer(){
		return new EMFCompareDeltaDiscoverer<Task>();
	}
	
	@Provides @Trg
	OfflineDeltaDiscoverer<JavaPackage, OperationalDelta> provideTargetOfflineDeltaDiscoverer(){
		return new EMFCompareDeltaDiscoverer<JavaPackage>();
	}
	
	@Override
	protected void configure() {
		bind(Path.class).annotatedWith(Dest.class).toInstance(persistanceDestination);
	}
}

enum BxTool {
    EMOFLON, BXTEND 
}