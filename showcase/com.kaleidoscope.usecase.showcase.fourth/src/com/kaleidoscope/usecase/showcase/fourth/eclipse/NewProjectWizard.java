package com.kaleidoscope.usecase.showcase.fourth.eclipse;

import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

import com.kaleidoscope.util.WorkspaceHelper;

public class NewProjectWizard extends com.kaleidoscope.usecase.showcase.first.eclipse.NewProjectWizard{
	
	@Override
	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);
		
		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1)); 
		
		WorkspaceHelper.addNature(project, ShowcaseFourthNature.SHOWCASE_API_NATURE_ID, subMon.split(1));
	}
	
	@Override
	protected void createInitialProjectStructure(final IProgressMonitor monitor, IProject project) throws CoreException {				
		addJavaMainFile(project);
		addSourceModelFile(project);
		addTargetModelFile(project);
	}
	
	private void addTargetModelFile(IProject project) throws CoreException{

		IPath filePath = new Path("instances/trg.xmi");
		IPath genFilePath = new Path("instances/gen/trg.xmi");
		String initialTargetModelContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<com.kaleidoscope.usecase.showcase.metamodel.employee:EmployeeContainer xmi:version=\"2.0\"\r\n" + 
				"    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
				"    xmlns:com.kaleidoscope.usecase.showcase.metamodel.employee=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore\"\r\n" + 
				"    xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore ../model/Employees.ecore\"/>\r\n" + 
				"";
		
		addAllFoldersAndFile(project, filePath, initialTargetModelContent, null);
		addAllFoldersAndFile(project, genFilePath, initialTargetModelContent, null);
		
	}
	private void addSourceModelFile(IProject project) throws CoreException {
		
		IPath filePath = new Path("instances/src.xmi");
		IPath genFilePath = new Path("instances/gen/src.xmi");
		String initialSourceModelContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<com.kaleidoscope.usecase.showcase.metamodel.person:PersonContainer xmi:version=\"2.0\"\r\n" + 
				"    xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n" + 
				"    xmlns:com.kaleidoscope.usecase.showcase.metamodel.person=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore\"\r\n" + 
				"    xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore ../model/Persons.ecore\"/>\r\n" + 
				"";
		
		addAllFoldersAndFile(project, filePath, initialSourceModelContent, null);
		addAllFoldersAndFile(project, genFilePath, initialSourceModelContent, null);
		
	}
	private void addJavaMainFile(IProject project) throws CoreException {
		
		IPath filePath = new Path("src/Main.java");
		String fileContent = "import java.nio.file.Path;\r\n" + 
				"import java.nio.file.Paths;\r\n" + 
				"\r\n" + 
				"import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;\r\n" + 
				"import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;\r\n" + 
				"import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;\r\n" + 
				"import com.kaleidoscope.usecase.showcase.fourth.controller.ControllerModule;\r\n" + 
				"import Employees.EmployeeContainer;\r\n" + 
				"import Persons.Person;\r\n" + 
				"import Persons.PersonContainer;\r\n" + 
				"import Persons.PersonsFactory;\r\n" + 
				"\r\n" + 
				"public class Main {\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"\r\n" + 
				"		OpaqueDelta<PersonContainer> delta = (m) -> {\r\n" + 
				"			Person newPerson = PersonsFactory.eINSTANCE.createPerson();\r\n" + 
				"			newPerson.setName(\"Nikola Tesla\");\r\n" + 
				"			m.getPersons().add(newPerson);\r\n" + 
				"			\r\n" + 
				"			Person newPersonEdison = PersonsFactory.eINSTANCE.createPerson();\r\n" + 
				"			newPersonEdison.setName(\"Thomas Edison\");\r\n" + 
				"			m.getPersons().add(newPersonEdison);\r\n" + 
				"		};\r\n" + 
				"\r\n" + 
				"		ControllerModule controllerModule = new ControllerModule(Paths.get(\"instances\", \"gen\"));\r\n" + 
				"		PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path> controller = controllerModule\r\n" + 
				"				.getControllerInstance();\r\n" + 
				"		controller.syncForward(delta);\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"}";
		addAllFoldersAndFile(project, filePath, fileContent, null);
	}

}