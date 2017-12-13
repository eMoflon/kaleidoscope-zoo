package org.kaleidoscope.usecase.kaleidocrypt.admin.ui.wizards.new_project;

import static org.moflon.core.utilities.WorkspaceHelper.addAllFolders;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.kaleidoscope.usecase.kaleidocrypt.admin.ui.wizards.CryptoAPINature;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tgg.mosl.defaults.DefaultFilesHelper;



public class NewCryptoAPIProjectWizard extends Wizard implements INewWizard {
	private NewCryptoAPIProjectWizardPage page;

	/**
	 * Constructor for NewCryptoAPIProject.
	 */
	public NewCryptoAPIProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewCryptoAPIProjectWizardPage();
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
		addAllFolders(project, "src",subMon.split(1));
		addAllFolders(project, "models",subMon.split(1));
		addAllFolders(project, "models/gen",subMon.split(1));
	}
	

	protected void createProject(IProgressMonitor monitor, IProject project) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Creating " + project.getName(), 3);
		
		// Create project
		project.create(subMon.split(1));
		project.open(subMon.split(1));
				
		// Add CryptoAPI Nature
		WorkspaceHelper.addNature(project, CryptoAPINature.CRYPTO_API_NATURE_ID, subMon.split(1)); 
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		
	}
}