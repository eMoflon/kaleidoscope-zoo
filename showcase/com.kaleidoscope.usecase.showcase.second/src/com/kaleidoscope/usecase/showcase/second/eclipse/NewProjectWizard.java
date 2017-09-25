package com.kaleidoscope.usecase.showcase.second.eclipse;

import static com.kaleidoscope.util.WorkspaceHelper.addAllFolders;
import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import com.kaleidoscope.util.WorkspaceHelper;
import com.kaleidoscope.util.DefaultFilesHelper;

public class NewProjectWizard extends Wizard implements INewWizard {
	private NewProjectWizardPage page;
	//private ISelection selection;

	/**
	 * Constructor for NewCryptoAPIProject.
	 */
	public NewProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewProjectWizardPage();
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. It creates a new project.
	 */
	public boolean performFinish() {
		final String projectName = page.getProjectName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, monitor);
				} catch (CoreException e) {
					e.printStackTrace();
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	public void doFinish(String projectName, IProgressMonitor monitor)
		throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating new project", 3);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		createProject(subMon.split(3),  project);
		createInitialProjectStructure(monitor, project);
	}

	private void createInitialProjectStructure(final IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Generate project structure", 3);
		DefaultFilesHelper.generateDefaultSchema(project.getName());
		
		addAllFolders(project, "models",subMon.split(1));
		
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
	

	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);
		
		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1));
				
		// Add CryptoAPI Nature
		WorkspaceHelper.addNature(project, ShowcaseSecondNature.SHOWCASE_SECOND_API_NATURE_ID, subMon.split(1)); 
	}

	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}
}