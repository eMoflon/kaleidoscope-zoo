package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.tgg.run.simpletreetoperson.SYNC_App_XML;

import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.XMLArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Persons.PersonContainer;
import Simpleexcel.SimpleexcelPackage;
import Simpletree.Node;

public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> { 
	
	private Optional<Persons.PersonContainer> model;
	private Optional<Persons.PersonContainer> simpleTreeModel;
	private Path path;
	
	public PersonArtefactAdapter(Path path) {		
		this.path = path;
		this.model = Optional.empty();
	}
	
	@Override
	public void parse() {
		System.out.println("Reading from XML file start ...");
		
		//Call XMLArtefactAdapter and get Simpletree Model from XML
		ResourceSet set = setResourceSet();
		XMLArtefactAdapter xmlArtefactAdapter  = new XMLArtefactAdapter(this.path);
		xmlArtefactAdapter.parse();
		Optional<Node> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();
		
		//TODO: Convert SimpleTree Model to Person Model using TGG
			simpleTreeModelFromXml.ifPresent(tree -> {
				try {
				SYNC_App_XML sync = new SYNC_App_XML(true, tree.eResource());
				sync.forward();
				setModel((PersonContainer) sync.getTargetResource().getContents().get(0));
				sync.terminate();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		System.out.println();
	}


	@Override
	public void unparse() {
		System.out.println("Reading from model start ...");
		
		//TODO: Convert Persons Model to SimpleTree model
		//TODO : Call XMLArtefactAdapter, send simpleTreeModel and get XML back. 
	}

	@Override
	public Optional<Persons.PersonContainer> getModel() {
		return model;
	}

	@Override
	public Optional<Path> getArtefact() {
		return Optional.of(path);
	}


	@Override
	public void setArtefact(Path a) {
		path = a;
	}

	@Override
	public void setModel(PersonContainer m) {
		// TODO Auto-generated method stub
		
	}
	
	private static ResourceSet setResourceSet() {
		// obtain a new resource set
		ResourceSet set = new ResourceSetImpl();

		// TODO Auto-generated method stub
		set.getPackageRegistry().put(SimpleexcelPackage.eNS_URI, SimpleexcelPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new EcoreResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		return set;
	}

}
