package com.kaleidoscope.usecase.showcase.fourth.eclipse;

import com.kaleidoscope.util.WorkspaceHelper;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InitialProjectStructure extends com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure {
  public static void addJavaMainFile(final IProject project) throws CoreException {
    final IPath filePath = new Path("src/Main.java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.nio.file.Path;");
    _builder.newLine();
    _builder.append("import java.nio.file.Paths;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;");
    _builder.newLine();
    _builder.append("import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;");
    _builder.newLine();
    _builder.append("import com.kaleidoscope.core.framework.workflow.controllers.deltabased.PersistentDeltaBasedController;");
    _builder.newLine();
    _builder.append("import com.kaleidoscope.usecase.showcase.fourth.controller.ControllerModule;");
    _builder.newLine();
    _builder.append("import Employees.EmployeeContainer;");
    _builder.newLine();
    _builder.append("import Persons.Person;");
    _builder.newLine();
    _builder.append("import Persons.PersonContainer;");
    _builder.newLine();
    _builder.append("import Persons.PersonsFactory;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("OpaqueDelta<PersonContainer> delta = (m) -> {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Person newPerson = PersonsFactory.eINSTANCE.createPerson();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("newPerson.setName(\"Nikola Tesla\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("m.getPersons().add(newPerson);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Person newPersonEdison = PersonsFactory.eINSTANCE.createPerson();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("newPersonEdison.setName(\"Thomas Edison\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("m.getPersons().add(newPersonEdison);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ControllerModule controllerModule = new ControllerModule(Paths.get(\"instances\", \"gen\"));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PersistentDeltaBasedController<PersonContainer, Path, EmployeeContainer, Path, String, OperationalDelta, OperationalDelta, OpaqueDelta<PersonContainer>, OpaqueDelta<EmployeeContainer>, Path> controller = controllerModule");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append(".getControllerInstance();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("controller.syncForward(delta);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    final String fileContent = _builder.toString();
    WorkspaceHelper.addAllFoldersAndFile(project, filePath, fileContent, null);
  }
}
