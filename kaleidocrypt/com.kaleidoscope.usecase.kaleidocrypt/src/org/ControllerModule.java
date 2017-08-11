package org;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.MoflonUtilitiesActivator;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.kaleidoscope.core.auxiliary.emfcompare.EMFCompareDeltaDiscoverer;
import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.discovery.OfflineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.factories.PersistentStateBasedControllerFactory;

import CryptoAPIConfig.Task;
import CryptoConfigToJava.CryptoConfigToJavaPackage;
import CryptoConfigToJava.org.moflon.EMoflonTool;
import SimpleJava.JavaPackage;
import  com.kaleidoscope.core.auxiliary.simplejava.artefactadapter.JavaArtefactAdapter;

public class ControllerModule extends AbstractModule{

	private ResourceSet set;

	public ControllerModule(ResourceSet set) {
		this.set = set;
	}
	
	@Provides @Src
	ArtefactAdapter<Task, Path> provideSourceArtefactAdapter() {
		Path path = new File("./resources/s.xmi").getAbsoluteFile().toPath();
		return new XMIArtefactAdapter<Task>(set, path);
	}

	@Provides @Trg
	ArtefactAdapter<JavaPackage, List<Path>> provideTargetArtefactAdapter() {
		Path path = new File("./resources/t.xmi").getAbsoluteFile().toPath();
		return new JavaArtefactAdapter(null);
	}
	
	@Provides
	PersistentSynchroniser<Task, JavaPackage, String, OperationalDelta, OperationalDelta, Path>provideSynchroniser(){
		
		URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava"); 
		return new EMoflonTool(CryptoConfigToJavaPackage.eINSTANCE, pathToTGGtransProjet.getPath(), set);
	}
	@Override
	protected void configure() {
		bind(new TypeLiteral<OfflineDeltaDiscoverer<Task, OperationalDelta>>() {}). annotatedWith(Src.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<Task>>() {});
		bind(new TypeLiteral<OfflineDeltaDiscoverer<JavaPackage, OperationalDelta>>() {}). annotatedWith(Trg.class).to(new TypeLiteral<EMFCompareDeltaDiscoverer<JavaPackage>>() {});
		
		 FactoryModuleBuilder fb = new FactoryModuleBuilder();
		 install(fb.build(new TypeLiteral<PersistentStateBasedControllerFactory<Task, Path, JavaPackage, Path, String, OperationalDelta, OperationalDelta, String>>(){}));
	}
	
}
