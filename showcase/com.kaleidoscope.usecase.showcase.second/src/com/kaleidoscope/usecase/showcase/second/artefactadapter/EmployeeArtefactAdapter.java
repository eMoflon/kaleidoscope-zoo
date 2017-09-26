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
import com.kaleidoscope.usecase.showcase.second.artefactadapter.EmployeeSerializer;
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee;
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer;
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeDslFactory;

import Employees.EmployeesFactory;


public class EmployeeArtefactAdapter implements ArtefactAdapter<Employees.EmployeeContainer, Path> {

	private final static Logger logger = Logger.getLogger(EmployeeArtefactAdapter.class); 
	
	private XtextResourceSet resourceSet;	
	private Optional<Employees.EmployeeContainer> model;
	private Optional<EmployeeContainer> xtextModel;
	private Path path;
	
	public EmployeeArtefactAdapter(Path path) {
		
		this.resourceSet = new XtextResourceSet();
		this.resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		this.path = path;
		this.model = Optional.empty();
	}
	
	@Override
	public void parse() {	
		logger.debug("Parsing EmployeeDSL to ecore model!");
		try {
			File file = path.toFile();
			Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
			resource.load(null);
			
			if(resource.getContents().isEmpty()) 
				xtextModel =  Optional.of(EmployeeDslFactory.eINSTANCE.createEmployeeContainer());
			else
				xtextModel = Optional.of((EmployeeContainer)resource.getContents().get(0));
			
			xtextModel.ifPresent(m -> {
				
				model = Optional.of(EmployeesFactory.eINSTANCE.createEmployeeContainer());
				m.getEmployees().forEach(p -> {
					Employees.Employee employee = EmployeesFactory.eINSTANCE.createEmployee();
					employee.setName(p.getName());
					employee.setID(p.getID());
					employee.setSalary(p.getSalary());
					model.get().getEmployees().add(employee);
				});
			});
		} catch (IOException e) {	
			logger.error("Not able to load EmployeeDSL file from " + path);			
		}catch(ClassCastException e){			
			logger.error("Not able to cast " + path + " to required type: " + e.getMessage());
		}
	}
	
	@Override
	public void unparse() {
		logger.debug("Starting to unparse Employee ecore model to EmployeeDSL!");
		
		try {	
			model.ifPresent(m -> {
				xtextModel = Optional.of(EmployeeDslFactory.eINSTANCE.createEmployeeContainer());
				m.getEmployees().forEach(p -> {
					Employee employee = EmployeeDslFactory.eINSTANCE.createEmployee();
					employee.setName(p.getName());
					employee.setID(p.getID());	
					employee.setSalary(p.getSalary());
					xtextModel.get().getEmployees().add(employee);
				});
			});

			EmployeeSerializer serializer = new EmployeeSerializer();
			CharSequence fileContent =  serializer.employeeContainerToString(xtextModel.get());
			FileUtils.writeStringToFile(path.toFile(), fileContent.toString());
			logger.debug("Employee DSL saved!");
		} catch (IOException | ClassCastException e) {
			logger.error("Not able to save XMI resource: " + e.getMessage());					
		}		
	}

	@Override
	public Optional<Employees.EmployeeContainer> getModel() {
		return model;
	}

	@Override
	public Optional<Path> getArtefact() {
		return Optional.of(path);
	}

	@Override
	public void setModel(Employees.EmployeeContainer m) {
		model = Optional.of(m);
	}

	@Override
	public void setArtefact(Path a) {
		path = a;
	}

}
