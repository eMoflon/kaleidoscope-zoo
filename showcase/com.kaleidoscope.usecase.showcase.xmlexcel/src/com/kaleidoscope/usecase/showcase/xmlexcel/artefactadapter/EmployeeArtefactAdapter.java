package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.simpleexceltoemployee.SYNC_App_EXCEL;

import com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter.ExcelArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import Employees.EmployeeContainer;
import Simpleexcel.File;

public class EmployeeArtefactAdapter implements ArtefactAdapter<EmployeeContainer, Path> {
	private Logger logger = Logger.getLogger(EmployeeArtefactAdapter.class);
	private Optional<Employees.EmployeeContainer> model;
	private Path path;

	public EmployeeArtefactAdapter(Path path) {
		this.path = path;
		this.model = Optional.empty();
	}

	/**
	 * CONVERT EMPLOYEE TO .XLSX
	 */
	@Override
	public void unparse() {
		logger.debug("Unparsing employee model");
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(this.path);

		// Convert Employee Model to Simpleexcel model
		getModel().ifPresent(employee -> {
			try {
				SYNC_App_EXCEL sync = new SYNC_App_EXCEL(true, employee);
				sync.forward();
				sync.terminate();
				excelArtefactAdapter.setModel((File) sync.getTargetResource().getContents().get(0));
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
	public void parse() {
		logger.debug("Reading from EXCEL file start ...");

		// Call ExcelArtefactAdapter and get Simpleexcel Model from EXCEL
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(this.path);
		excelArtefactAdapter.parse();
		Optional<File> simpleExcelModelFromExcel = excelArtefactAdapter.getModel();

		// Convert Simpleexcel Model to Employee Model using TGG
		simpleExcelModelFromExcel.ifPresent(excel -> {
			try {
				SYNC_App_EXCEL sync = new SYNC_App_EXCEL(false, excel);
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
