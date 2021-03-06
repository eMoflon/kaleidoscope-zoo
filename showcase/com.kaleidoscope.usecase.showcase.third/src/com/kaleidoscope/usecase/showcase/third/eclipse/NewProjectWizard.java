package com.kaleidoscope.usecase.showcase.third.eclipse;

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
		InitialProjectStructure.addEmptyEmployeeModelFile(project, new Path("models/trg.xmi"));
		InitialProjectStructure.addEmptyPersonModelFile(project, new Path("models/src.xmi"));	
		InitialProjectStructure.createEmptyFolder(project, "models/gen");
	}
	
	@Override
	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);
		
		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1));
				
		// Add nature
		WorkspaceHelper.addNature(project, ShowcaseThirdNature.SHOWCASE_API_NATURE_ID, subMon.split(1)); 
	}
}