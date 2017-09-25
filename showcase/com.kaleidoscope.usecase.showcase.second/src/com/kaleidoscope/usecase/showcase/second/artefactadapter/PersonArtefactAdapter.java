package com.kaleidoscope.usecase.showcase.second.artefactadapter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.usecase.showcase.second.artefactadapter.PersonSerializer;
import com.kaleidoscope.usecase.showcase.xtext.personDsl.Person;
import com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonContainer;
import com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonDslFactory;

import Persons.PersonsFactory;


public class PersonArtefactAdapter implements ArtefactAdapter<Persons.PersonContainer, Path> {

	private final static Logger logger = Logger.getLogger(PersonArtefactAdapter.class); 
	
	private XtextResourceSet resourceSet;	
	private Optional<Persons.PersonContainer> model;
	private Optional<PersonContainer> xtextModel;
	private Path path;
	
	public PersonArtefactAdapter(Path path) {
		
		this.resourceSet = new XtextResourceSet();
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		this.path = path;
		this.model = Optional.empty();
	}
	
	@Override
	public void parse() {	
		logger.debug("Parsing PersonDSL to ecore model!");
		try {
			File file = path.toFile();
			Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
			resource.load(null);
			
			if(resource.getContents().isEmpty()) 
				xtextModel =  Optional.of(PersonDslFactory.eINSTANCE.createPersonContainer());
			else
				xtextModel = Optional.of((PersonContainer)resource.getContents().get(0));
			
			xtextModel.ifPresent(m -> {
				
				model = Optional.of(PersonsFactory.eINSTANCE.createPersonContainer());
				m.getPersons().forEach(p -> {
					Persons.Person person = PersonsFactory.eINSTANCE.createPerson();
					person.setName(p.getName());
					person.setID(p.getID());
					model.get().getPersons().add(person);
				});
			});
		} catch (IOException e) {	
			logger.error("Not able to load PersonDSL file from " + path);			
		}catch(ClassCastException e){			
			logger.error("Not able to cast " + path + " to required type: " + e.getMessage());
		}
	}
	
	@Override
	public void unparse() {
		logger.debug("Starting to unparse Person ecore model to PersonDSL!");
		
		try {	
			model.ifPresent(m -> {
				xtextModel = Optional.of(PersonDslFactory.eINSTANCE.createPersonContainer());
				m.getPersons().forEach(p -> {
					Person person = PersonDslFactory.eINSTANCE.createPerson();
					person.setName(p.getName());
					person.setID(p.getID());
					xtextModel.get().getPersons().add(person);
				});
			});

			PersonSerializer serializer = new PersonSerializer();
			CharSequence fileContent = serializer.personContainerToString(xtextModel.get());
			FileUtils.writeStringToFile(path.toFile(), fileContent.toString(), (Charset)null);
			
			logger.debug("Person DSL saved!");
		} catch (IOException | ClassCastException e) {
			logger.error("Not able to save Person DSL: " + e.getMessage());					
		}		
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
	public void setModel(Persons.PersonContainer m) {
		model = Optional.of(m);
	}

	@Override
	public void setArtefact(Path a) {
		path = a;
	}

}
