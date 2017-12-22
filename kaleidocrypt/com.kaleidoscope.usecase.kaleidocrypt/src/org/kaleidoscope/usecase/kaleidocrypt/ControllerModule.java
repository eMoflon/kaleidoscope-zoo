package org.kaleidoscope.usecase.kaleidocrypt;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
import SimpleJava.JavaPackage;
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
		//FIXME[Dusko]:  Why do you recreate the set here?  After taking it as a constructor parameter?
		set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		if(bxTool.equals(BxTool.EMOFLON)) {
			URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava"); 
			tool = new EMoflonTool(CryptoConfigToJavaPackage.eINSTANCE, 
								   pathToTGGtransProjet.getPath(), 
								   set, 
								   //FIXME[Dusko]:  Why do you need the source/target artefact adapters in this manner?
								   provideSourceArtefactAdapter().getModel().orElse(null), 
								   provideTargetArtefactAdapter().getModel().orElse(null), 
								   persistanceDestination);
		} else if(bxTool.equals(BxTool.BXTEND)){
			tool = new BxtendTool(provideSourceArtefactAdapter().getModel().orElse(null), 
								 provideTargetArtefactAdapter().getModel().orElse(null), 
								 persistanceDestination);
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