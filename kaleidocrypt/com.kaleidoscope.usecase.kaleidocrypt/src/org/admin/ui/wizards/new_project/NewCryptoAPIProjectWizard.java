package org.admin.ui.wizards.new_project;

import static org.moflon.core.utilities.WorkspaceHelper.addAllFolders;

import java.lang.reflect.InvocationTargetException;

import org.admin.ui.wizards.CryptoAPINature;
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
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tgg.mosl.defaults.DefaultFilesHelper;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class NewCryptoAPIProjectWizard extends Wizard implements INewWizard {
	private NewCryptoAPIProjectWizardPage page;
	//private ISelection selection;

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
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
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
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

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
		
		
		/*IPath pathToInitialConfiguration = new Path("models/config.xmi");
		String initialConfigurationfileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
				"<CryptoAPIConfig:Task xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:CryptoAPIConfig=\"platform:/plugin/CryptoAPIConfig/model/CryptoAPIConfig.ecore\" package=\"com.java.Crypto\" description=\"SymmetricEncryption\">\n" + 
				"  <imports value=\"com.java\"/>\n" + 
				"  <algorithms xsi:type=\"CryptoAPIConfig:SymmetricBlockCipher\" name=\"AESS\" mode=\"GCM\" padding=\"PKCS5Padding\"/>\n" + 
				"</CryptoAPIConfig:Task>\n" + 
				"";
		addAllFoldersAndFile(project, pathToInitialConfiguration, initialConfigurationfileContent, monitor);
		*/
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