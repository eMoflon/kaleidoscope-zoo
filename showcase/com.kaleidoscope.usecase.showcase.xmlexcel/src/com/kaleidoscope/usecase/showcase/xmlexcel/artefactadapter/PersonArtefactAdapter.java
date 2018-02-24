package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.nio.file.Path;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.simpletreetoperson.SYNC_App_XML;

import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.XMLArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Persons.PersonContainer;
import Simpletree.Node;

public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> { 	
	private static final Logger logger = Logger.getLogger(PersonArtefactAdapter.class);
	private Optional<Persons.PersonContainer> model;
	private Path path;
	
	public PersonArtefactAdapter(Path path) {		
		this.path = path;
		this.model = Optional.empty();
	}
	
	@Override
	public void parse() {
		logger.debug("Reading from XML file start ...");
		
		// Call XMLArtefactAdapter and get Simpletree Model from XML
		XMLArtefactAdapter xmlArtefactAdapter  = new XMLArtefactAdapter(path);
		xmlArtefactAdapter.parse();
		Optional<Node> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();
		
		// Convert SimpleTree Model to Person Model using TGG
		simpleTreeModelFromXml.ifPresent(tree -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(true, tree);
				sync.forward();
				setModel((PersonContainer) sync.getTargetResource().getContents().get(0));
				sync.terminate();
			} catch (Exception|Error e) {
				e.printStackTrace();
			}
		});
	}


	@Override
	public void unparse() {
		logger.debug("Reading from model start ...");
		
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
		model = Optional.of(m);
	}
}
