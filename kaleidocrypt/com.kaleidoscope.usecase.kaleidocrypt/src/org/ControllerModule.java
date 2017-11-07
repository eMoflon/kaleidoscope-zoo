package org;

import java.net.URL;
import java.nio.file.Path;

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
import kaleidocrypt.implemenation.BxtendTool;

public class ControllerModule extends AbstractModule{

	private ResourceSet set;	
	private final BxTool bxTool = BxTool.EMOFLON;
	
	private Path sourceArtefactPath;
	private Path targetArtefactPath;
	private Path persisanceDestination;
	
	public ControllerModule(ResourceSet set, Path sourceArtefactPath, Path targetArtefactPath, Path persistanceDestination) {
		this.set = set;		
		this.persisanceDestination = persistanceDestination;
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
	PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path>provideSynchroniser(){
		
		PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path>tool;
		
		XMIArtefactAdapter<Task> sourceArtefactAdapter = new XMIArtefactAdapter<Task>(sourceArtefactPath);
		sourceArtefactAdapter.parse();			
		
		ArtefactAdapter<JavaPackage, Path> targetArtefactAdapter = new JavaArtefactAdapter(targetArtefactPath);
		targetArtefactAdapter.parse();
		
		if(bxTool.equals(BxTool.EMOFLON)) {
		
			URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava"); 
			tool = new EMoflonTool(CryptoConfigToJavaPackage.eINSTANCE, pathToTGGtransProjet.getPath(), set
																									,sourceArtefactAdapter.getModel().orElse(null)
																									, targetArtefactAdapter.getModel().orElse(null)
																									, persisanceDestination);
		}
		else if(bxTool.equals(BxTool.BXTEND)){
			
			tool = new BxtendTool(sourceArtefactAdapter.getModel().orElse(null), targetArtefactAdapter.getModel().orElse(null), persisanceDestination);
		}
		else {
			throw new IllegalArgumentException("Bx tool has to be chosen!");
		}
				
		tool.initialize();
		
		return tool;
	}
	@Override
	protected void configure() {
		bind(new TypeLiteral<OfflineDeltaDiscoverer<Task, OperationalDelta>>() {}). annotatedWith(Src.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<Task>>() {});
		bind(new TypeLiteral<OfflineDeltaDiscoverer<JavaPackage, OperationalDelta>>() {}). annotatedWith(Trg.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<JavaPackage>>() {});
		bind(Path.class).annotatedWith(Dest.class).toInstance(persisanceDestination);
	}
	
}

enum BxTool {
    EMOFLON, BXTEND 
}