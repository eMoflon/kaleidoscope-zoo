package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import org.emoflon.ibex.tgg.run.simpleexceltoemployee.SYNC_App_EXCEL;
import org.emoflon.ibex.tgg.run.simpletreetoperson.*;

import com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter.ExcelArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Employees.EmployeeContainer;
import Persons.PersonContainer;
import Simpleexcel.File;

public class EmployeeArtefactAdapter implements ArtefactAdapter<EmployeeContainer, Path> {

	private Optional<Employees.EmployeeContainer> model;
	private Optional<Employees.EmployeeContainer> simpleExcelModel;
	private Path path;

	public EmployeeArtefactAdapter(Path path) {
		this.path = path;
		this.model = Optional.empty();
	}

	@Override
	public void parse() {
		System.out.println("Reading from EXCEL file start ...");

		// TODO : Call ExcelArtefactAdapter and get Simpleexcel Model from EXCEL
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(this.path);
		excelArtefactAdapter.parse();
	    Optional<File> simpleExcelModelFromExcel = excelArtefactAdapter.getModel();
		
		// TODO: Convert Simpleexcel Model to Employee Model using TGG
	    simpleExcelModelFromExcel.ifPresent(excel -> {
	    	try {
	    		SYNC_App_EXCEL sync = new SYNC_App_EXCEL(true, excel.eResource());
				sync.forward();
				setModel((EmployeeContainer) sync.getTargetResource().getContents().get(0));
				sync.terminate();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    });
	}

	@Override
	public void unparse() {
		System.out.println("Reading from model start ...");

		// TODO: Convert Employee Model to Simpleexcel model
		// TODO : Call ExcelArtefactAdapter, send Simpleexcel and get Excel back.
	}

	@Override
	public void setModel(EmployeeContainer m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setArtefact(Path a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<EmployeeContainer> getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Path> getArtefact() {
		// TODO Auto-generated method stub
		return null;
	}

}
