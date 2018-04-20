package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse

import com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure
import java.io.FileOutputStream
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath

class InitialProjectStructureExcel extends InitialProjectStructure {
	def static void createEmptyExcelFile(IProject project, IPath filePath) {
		create(project, filePath)
	}

	def static String create(IProject projectPath, IPath filePath) '''
	
	«val file = projectPath.getFile(filePath)»
			«println(file.fullPath)»
			
			«if(file.exists){
		println("File already exists!");
	}
	else{
		println("Creating new Excel file...")
		val workbook = new XSSFWorkbook()
		workbook.createSheet("Sheet1")	
		try {
				addHeader(workbook);
				val fileOutputStream = new FileOutputStream(file.location.toString);
				workbook.write(fileOutputStream);
				fileOutputStream.close();
				println("file created at : " + file.location);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}»
	'''

	def static addHeader(Workbook workbook) {
		val headerRow = workbook.getSheet("Sheet1").createRow(0);
		headerRow.createCell(0).cellValue = "Components";
		headerRow.createCell(1).cellValue = "Dependencies";
		headerRow.createCell(2).cellValue = "Documentation";
		headerRow.createCell(3).cellValue = "Review";
	}

}
