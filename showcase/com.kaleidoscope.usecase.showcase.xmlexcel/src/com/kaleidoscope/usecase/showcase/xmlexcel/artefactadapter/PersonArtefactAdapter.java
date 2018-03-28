package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.simpletreetoperson.SYNC_App_XML;

import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.XMLArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Persons.PersonContainer;
import Simpletree.File;
import Simpletree.TreeElement;

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
		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		xmlArtefactAdapter.parse();
		Optional<TreeElement> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();

		simpleTreeModelFromXml.ifPresent(tree -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(true, tree);
				sync.forward();
				setModel((PersonContainer) sync.getTargetResource().getContents().get(0));
				logger.debug(getModel().get().getPersons());
				sync.terminate();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	public void unparse() {
		logger.debug("parsing person model");

		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		getModel().ifPresent(person -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(false, person);
				sync.backward();
				sync.terminate();
				xmlArtefactAdapter.setModel((File) sync.getSourceResource().getContents().get(0));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		//Call XMLArtefactAdapter, send simpleTreeModel and get XML back.
		logger.debug("Converting to XML Document");
		xmlArtefactAdapter.unparse();
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
