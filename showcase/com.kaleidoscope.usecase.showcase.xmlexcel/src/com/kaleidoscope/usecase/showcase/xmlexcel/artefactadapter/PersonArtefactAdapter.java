package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.nio.file.Path;
import java.util.Optional;

<<<<<<< HEAD
=======
import org.apache.log4j.Logger;
>>>>>>> master
import org.emoflon.ibex.tgg.run.simpletreetoperson.SYNC_App_XML;

import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.XMLArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Persons.PersonContainer;
<<<<<<< HEAD
import Simpletree.File;
import Simpletree.TreeElement;

public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> {

=======
import Simpletree.Node;

public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> { 	
	private static final Logger logger = Logger.getLogger(PersonArtefactAdapter.class);
>>>>>>> master
	private Optional<Persons.PersonContainer> model;
	private Path path;

	public PersonArtefactAdapter(Path path) {
		this.path = path;
		this.model = Optional.empty();
	}

	/**
	 * CONVERT XML TO PERSON
	 */
	@Override
	public void parse() {
<<<<<<< HEAD

		System.out.println("Reading from XML file start ...");

		// Call XMLArtefactAdapter and get Simpletree Model from XML
		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		xmlArtefactAdapter.parse();
		Optional<TreeElement> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();

		simpleTreeModelFromXml.ifPresent(tree -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(true, true, tree);
=======
		logger.debug("Reading from XML file start ...");
		
		// Call XMLArtefactAdapter and get Simpletree Model from XML
		XMLArtefactAdapter xmlArtefactAdapter  = new XMLArtefactAdapter(path);
		xmlArtefactAdapter.parse();
		Optional<Node> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();
		
		// Convert SimpleTree Model to Person Model using TGG
		simpleTreeModelFromXml.ifPresent(tree -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(true, tree);
>>>>>>> master
				sync.forward();
				setModel((PersonContainer) sync.getTargetResource().getContents().get(0));
				System.out.println(getModel().get().getPersons());
				sync.terminate();
<<<<<<< HEAD

			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		System.out.println();
=======
			} catch (Exception|Error e) {
				e.printStackTrace();
			}
		});
	}
>>>>>>> master

	}

	/**
	 * CONVERT PERSON TO XML
	 */
	@Override
	public void unparse() {
<<<<<<< HEAD
		System.out.println("parsing person model");

		// TODO: Convert Persons Model to SimpleTree model
		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		getModel().ifPresent(person -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(false, true, person);
				sync.backward();
				sync.terminate();
				xmlArtefactAdapter.setModel((File) sync.getSourceResource().getContents().get(0));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		//Call XMLArtefactAdapter, send simpleTreeModel and get XML back.
		System.out.println("Converting to XML Document");
		xmlArtefactAdapter.unparse();
=======
		logger.debug("Reading from model start ...");
		
		//TODO: Convert Persons Model to SimpleTree model
		//TODO : Call XMLArtefactAdapter, send simpleTreeModel and get XML back. 
>>>>>>> master
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
