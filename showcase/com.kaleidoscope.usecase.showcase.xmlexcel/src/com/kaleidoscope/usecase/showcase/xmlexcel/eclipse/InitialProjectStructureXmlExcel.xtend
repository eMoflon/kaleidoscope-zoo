package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse

import com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure
import java.io.File
import org.eclipse.core.runtime.IPath
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream
import java.io.IOException

class InitialProjectStructureXmlExcel extends InitialProjectStructure {
	def static void createEmptyExcelFile(IPath projectPath, IPath filePath) {
		create(projectPath, filePath)
	}
	
	def static String create(IPath projectPath, IPath filePath) '''
	«val file = new File(projectPath+"\\"+filePath.toString)»
	«println(projectPath+"\\"+filePath.toString)»
	«if(file.exists){
		println("File already exists!");
	}
	else{
		println("Creating new Excel file...")
		val workbook = new XSSFWorkbook()
		workbook.createSheet("Sheet1")
		try {
				val fileOutputStream = new FileOutputStream(file);
				workbook.write(fileOutputStream);
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	»
	'''
}
