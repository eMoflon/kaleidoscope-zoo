package com.kaleidoscope.usecase.showcase.xmlexcel.artefactadapter;

import java.nio.file.Path;
import java.nio.file.Paths;


public class XMLToExcelConversion {

	public static void main(String[] args) {
		// parse - XML to person
		Path path = Paths.get("C:\\Users\\Srijani\\Desktop\\TestXMLDoc.xml");
		PersonArtefactAdapter personArtefactAdapter = new PersonArtefactAdapter(path);
		personArtefactAdapter.parse();

		System.out.println("Converted from XML to Person Model");
		
		//set employee model
		Path excelPath = Paths.get("C:\\Users\\Srijani\\Desktop\\TestExcelDoc.xlsx");
		EmployeeArtefactAdapter employeeArtefactAdapter = new EmployeeArtefactAdapter(excelPath);
		employeeArtefactAdapter.unparse();
		
		//unparse - employee to xlsx (forward)
		employeeArtefactAdapter.parse();
		
		System.out.println();
	}
}
