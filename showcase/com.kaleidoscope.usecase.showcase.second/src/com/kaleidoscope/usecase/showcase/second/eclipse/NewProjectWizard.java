package com.kaleidoscope.usecase.showcase.second.eclipse;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

import com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure;
import com.kaleidoscope.util.WorkspaceHelper;

public class NewProjectWizard extends com.kaleidoscope.usecase.showcase.first.eclipse.NewProjectWizard {

	@Override
	protected void createInitialProjectStructure(final IProgressMonitor monitor, IProject project) throws CoreException {
		
		InitialProjectStructure.createEmptyFile(project, new Path("models/src.persons"));
		InitialProjectStructure.createEmptyFile(project, new Path("models/trg.employees"));
		InitialProjectStructure.createEmptyFolder(project, "models");
	}

	@Override
	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);

		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1));

		// Add nature
		WorkspaceHelper.addNature(project, ShowcaseSecondNature.SHOWCASE_API_NATURE_ID, subMon.split(1));
	}
}