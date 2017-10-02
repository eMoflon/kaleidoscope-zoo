package com.kaleidoscope.usecase.showcase.fourth.eclipse;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

import com.kaleidoscope.usecase.showcase.fourth.eclipse.InitialProjectStructure;
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
		
		InitialProjectStructure.addJavaMainFile(project);
		InitialProjectStructure.addEmptyEmployeeModelFile(project, new Path("models/trg.xmi"));
		InitialProjectStructure.addEmptyPersonModelFile(project, new Path("models/src.xmi"));	
		
		InitialProjectStructure.addEmptyEmployeeModelFile(project, new Path("models/gen/trg.xmi"));
		InitialProjectStructure.addEmptyPersonModelFile(project, new Path("models/gen/src.xmi"));	
		
	}
	
	

}