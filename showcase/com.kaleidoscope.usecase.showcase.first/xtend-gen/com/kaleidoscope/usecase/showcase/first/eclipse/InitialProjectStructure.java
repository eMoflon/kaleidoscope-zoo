package com.kaleidoscope.usecase.showcase.first.eclipse;

import com.kaleidoscope.util.WorkspaceHelper;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class InitialProjectStructure {
  public Object createInitialProjectStructure(final IProgressMonitor monitor, final IProject project) {
    return null;
  }
  
  public static void createEmptyFile(final IProject project, final IPath filePath) {
    try {
      WorkspaceHelper.addAllFoldersAndFile(project, filePath, "", null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void createEmptyFolder(final IProject project, final String folderPath) {
    try {
      WorkspaceHelper.addAllFolders(project, folderPath, null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void addEmptyEmployeeModelFile(final IProject project, final IPath filePath) throws CoreException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<com.kaleidoscope.usecase.showcase.metamodel.employee:EmployeeContainer xmi:version=\"2.0\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:com.kaleidoscope.usecase.showcase.metamodel.employee=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore ../model/Employees.ecore\"/>");
    _builder.newLine();
    final String initialTargetModelContent = _builder.toString();
    WorkspaceHelper.addAllFoldersAndFile(project, filePath, initialTargetModelContent, null);
  }
  
  public static void addEmptyPersonModelFile(final IProject project, final IPath filePath) throws CoreException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<com.kaleidoscope.usecase.showcase.metamodel.person:PersonContainer xmi:version=\"2.0\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:com.kaleidoscope.usecase.showcase.metamodel.person=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xsi:schemaLocation=\"platform:/plugin/com.kaleidoscope.usecase.showcase.metamodel.person/model/Persons.ecore ../model/Persons.ecore\"/>");
    _builder.newLine();
    final String initialSourceModelContent = _builder.toString();
    WorkspaceHelper.addAllFoldersAndFile(project, filePath, initialSourceModelContent, null);
  }
}
