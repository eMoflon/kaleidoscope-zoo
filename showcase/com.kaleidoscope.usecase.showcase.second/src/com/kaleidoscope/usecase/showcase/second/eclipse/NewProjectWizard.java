package com.kaleidoscope.usecase.showcase.second.eclipse;

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

public class NewProjectWizard extends com.kaleidoscope.usecase.showcase.first.eclipse.NewProjectWizard {

	@Override
	protected void createInitialProjectStructure(final IProgressMonitor monitor, IProject project)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generate project structure", 3);
		DefaultFilesHelper.generateDefaultSchema(project.getName());

		addAllFolders(project, "models", subMon.split(1));

		IPath pathToXtextSourceModel = new Path("models/src.persons");
		IPath pathToXtextTargetModel = new Path("models/trg.employees");

		try {
			addAllFoldersAndFile(project, pathToXtextSourceModel, "", null);
			addAllFoldersAndFile(project, pathToXtextTargetModel, "", null);
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
		WorkspaceHelper.addNature(project, ShowcaseSecondNature.SHOWCASE_API_NATURE_ID, subMon.split(1));
	}

}