package com.kaleidoscope.usecase.showcase.third.eclipse;

import static com.kaleidoscope.util.WorkspaceHelper.addAllFolders;
import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

import com.kaleidoscope.util.DefaultFilesHelper;
import com.kaleidoscope.util.WorkspaceHelper;

public class NewProjectWizard extends com.kaleidoscope.usecase.showcase.first.eclipse.NewProjectWizard{
	
	@Override
	protected void createInitialProjectStructure(final IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generate project structure", 3);
		DefaultFilesHelper.generateDefaultSchema(project.getName());
		
		addAllFolders(project, "models",subMon.split(1));
		
		IPath pathToSourceModel = new Path("models/src.xmi");
		IPath pathToTargetModel = new Path("models/trg.xmi");
		
		String initialSourceModelContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<com.kaleidoscope.usecase.showcase.metamodel.person:PersonContainer xmi:version=\"2.0\"\r\n" + 
				"    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
				"    xmlns:com.kaleidoscope.usecase.showcase.metamodel.person=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore\"\r\n" + 
				"    xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore ../model/Persons.ecore\"/>\r\n" + 
				"";
		
		String initialTargetModelContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<com.kaleidoscope.usecase.showcase.metamodel.employee:EmployeeContainer xmi:version=\"2.0\"\r\n" + 
				"    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
				"    xmlns:com.kaleidoscope.usecase.showcase.metamodel.employee=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore\"\r\n" + 
				"    xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore ../model/Employees.ecore\"/>\r\n" + 
				"";
		
		try {
			addAllFoldersAndFile(project, pathToSourceModel, initialSourceModelContent, null);
			addAllFoldersAndFile(project, pathToTargetModel, initialTargetModelContent, null);
			addAllFolders(project, "models/gen", null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);
		
		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1));
				
		// Add CryptoAPI Nature
		WorkspaceHelper.addNature(project, ShowcaseThirdNature.SHOWCASE_API_NATURE_ID, subMon.split(1)); 
	}

}