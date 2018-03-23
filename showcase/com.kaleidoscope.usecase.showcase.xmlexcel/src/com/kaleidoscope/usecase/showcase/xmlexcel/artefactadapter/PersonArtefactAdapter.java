package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.emoflon.ibex.tgg.run.simpletreetoperson.SYNC_App_XML;

import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.XMLArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Persons.PersonContainer;
import Simpletree.File;
import Simpletree.TreeElement;

public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> {

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

		System.out.println("Reading from XML file start ...");

		// Call XMLArtefactAdapter and get Simpletree Model from XML
		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		xmlArtefactAdapter.parse();
		Optional<TreeElement> simpleTreeModelFromXml = xmlArtefactAdapter.getModel();

		simpleTreeModelFromXml.ifPresent(tree -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(true, false, tree);
				sync.forward();
				setModel((PersonContainer) sync.getTargetResource().getContents().get(0));
				System.out.println(getModel().get().getPersons());
				sync.terminate();

			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		System.out.println();

	}

	/**
	 * CONVERT PERSON TO XML
	 */
	@Override
	public void unparse() {
		System.out.println("parsing person model");

		// TODO: Convert Persons Model to SimpleTree model
		XMLArtefactAdapter xmlArtefactAdapter = new XMLArtefactAdapter(this.path);
		getModel().ifPresent(person -> {
			try {
				SYNC_App_XML sync = new SYNC_App_XML(false, false, person);
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
