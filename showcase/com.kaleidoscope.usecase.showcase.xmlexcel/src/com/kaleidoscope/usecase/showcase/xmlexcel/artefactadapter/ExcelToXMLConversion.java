package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExcelToXMLConversion {

	public static void main(String[] args) {
		// parse - xlsx to employee
		Path path = Paths.get("C:\\Users\\Srijani\\Desktop\\TestExcelDoc.xlsx");
		EmployeeArtefactAdapter employeeArtefactAdapter = new EmployeeArtefactAdapter(path);
		employeeArtefactAdapter.unparse();

		System.out.println();
		
		//set person model
		path = Paths.get("C:\\Users\\Srijani\\Desktop\\TestXMLDoc.xml");
		PersonArtefactAdapter personArtefactAdapter = new PersonArtefactAdapter(path);
		personArtefactAdapter.parse();
		
		// parse - person to XML
		personArtefactAdapter.unparse();
	}

}
