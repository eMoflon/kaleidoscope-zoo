package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

<<<<<<< HEAD
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
=======
>>>>>>> master
import org.emoflon.ibex.tgg.run.simpleexceltoemployee.SYNC_App_EXCEL;

import com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter.ExcelArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Employees.EmployeeContainer;
import Simpleexcel.File;
import Simpleexcel.SimpleexcelPackage;

public class EmployeeArtefactAdapter implements ArtefactAdapter<EmployeeContainer, Path> {

	private Optional<Employees.EmployeeContainer> model;
	private Optional<Employees.EmployeeContainer> simpleExcelModel;
	private Path path;

	public EmployeeArtefactAdapter(Path path) {
		this.path = path;
		this.model = Optional.empty();
	}

	
	/**
	 *  CONVERT EMPLOYEE TO .XLSX
	 */
	@Override
	public void parse() {
		
		System.out.println("Unparsing employee model");
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(this.path);
		
		// Convert Employee Model to Simpleexcel model
		getModel().ifPresent(employee -> {
			try {
				SYNC_App_EXCEL sync = new SYNC_App_EXCEL(true, true, employee);
				sync.forward();
				sync.terminate();
				excelArtefactAdapter.setModel((File) sync.getTargetResource().getContents().get(0));
				System.out.println("END");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		excelArtefactAdapter.unparse();

	}

	/**
	 * CONVERT .XLSX TO EMPLOYEE
	 */
	@Override
	public void unparse() {
		System.out.println("Reading from EXCEL file start ...");

		// Call ExcelArtefactAdapter and get Simpleexcel Model from EXCEL
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(this.path);
		excelArtefactAdapter.parse();
		Optional<File> simpleExcelModelFromExcel = excelArtefactAdapter.getModel();

		// Convert Simpleexcel Model to Employee Model using TGG
		simpleExcelModelFromExcel.ifPresent(excel -> {
			try {
				SYNC_App_EXCEL sync = new SYNC_App_EXCEL(false, true, excel);
				sync.backward();
				setModel((EmployeeContainer) sync.getSourceResource().getContents().get(0));
				sync.terminate();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	public void setModel(EmployeeContainer m) {
		model = Optional.of(m);
	}

	@Override
	public void setArtefact(Path a) {
		path = a;
	}

	@Override
	public Optional<EmployeeContainer> getModel() {
		return model;
	}

	@Override
	public Optional<Path> getArtefact() {
		return Optional.of(path);
	}
}
