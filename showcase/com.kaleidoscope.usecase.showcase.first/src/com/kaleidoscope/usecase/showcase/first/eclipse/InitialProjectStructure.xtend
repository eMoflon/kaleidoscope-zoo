package com.kaleidoscope.usecase.showcase.first.eclipse

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor

import static com.kaleidoscope.util.WorkspaceHelper.addAllFolders
import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile

class InitialProjectStructure {
	
	def createInitialProjectStructure(IProgressMonitor monitor, IProject project){
	
	}
	
	def static void createEmptyFile(IProject project, IPath filePath){
		addAllFoldersAndFile(project, filePath, "", null);
	}
	
	def static void createEmptyFolder(IProject project, String folderPath){
		addAllFolders(project, folderPath, null);
	}
	def static void addEmptyEmployeeModelFile(IProject project, IPath filePath) throws CoreException{

		val String initialTargetModelContent = '''
		<?xml version="1.0" encoding="UTF-8"?>
		<com.kaleidoscope.usecase.showcase.metamodel.employee:EmployeeContainer xmi:version="2.0"
		    xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    xmlns:com.kaleidoscope.usecase.showcase.metamodel.employee="platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employees.ecore"/>
		'''
		addAllFoldersAndFile(project, filePath, initialTargetModelContent, null)
	}
	
	def static void addEmptyPersonModelFile(IProject project, IPath filePath) throws CoreException {
		
		val String initialSourceModelContent = '''
		<?xml version="1.0" encoding="UTF-8"?>
		<com.kaleidoscope.usecase.showcase.metamodel.person:PersonContainer xmi:version="2.0"
		    xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    xmlns:com.kaleidoscope.usecase.showcase.metamodel.person="platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore"/>
		'''
		
		addAllFoldersAndFile(project, filePath, initialSourceModelContent, null)
		
	}
	
}