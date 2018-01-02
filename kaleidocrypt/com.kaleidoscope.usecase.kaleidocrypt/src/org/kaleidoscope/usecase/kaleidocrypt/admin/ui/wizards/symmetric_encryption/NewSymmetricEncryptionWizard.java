package org.kaleidoscope.usecase.kaleidocrypt.admin.ui.wizards.symmetric_encryption;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class NewSymmetricEncryptionWizard extends Wizard implements INewWizard {
	private IStructuredSelection selection;
	private NewSymmetricEncryptionWizardPage newFileWizardPage;
	private IProject project = null;
	private static final Logger logger = Logger.getLogger(NewSymmetricEncryptionWizard.class);
	private static final String CONFIGURAITON_FILE_NAME = "SymmEnc";

	public static String NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID = "kaleidoscope.usecase.crypto.wizards.NewSymmetricEncryptionWizard";

	public NewSymmetricEncryptionWizard() {
		setWindowTitle("New SymmetricEncryption configuration model");
	}

	@Override
	public void addPages() {
		newFileWizardPage = new NewSymmetricEncryptionWizardPage(selection, project);
		addPage(newFileWizardPage);
	}

	@Override
	public boolean performFinish() {
		if (newFileWizardPage.getCreationAllowed()) {
			logger.info("Adding a symmetric encryption configuration model!");
			try {
				doFinish(CONFIGURAITON_FILE_NAME);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} else {
			logger.info(
					"It is not allowed to add symmetric encryption configuration model, because a project is not selected!");
		}

		return true;
	}

	public void doFinish(String configName) throws CoreException {
		InitialProjectStructure.addInitialConfigurationModel(project, configName);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IJavaProject) {
				project = (IProject) ((IAdaptable) firstElement).getAdapter(IProject.class);
			}
		}
	}
}