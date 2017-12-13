package org.kaleidoscope.usecase.kaleidocrypt.admin.ui.wizards.symmetric_encryption;

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
    	
    	if(newFileWizardPage.getCreationAllowed()){
    		System.out.println("Creating!");
    		String configName = "SymmEnc";
    	
    		try {
				doFinish(configName);
			} catch (CoreException e) {
				e.printStackTrace();
			}
    	}else{
    		System.out.println("Blocked!");
    	}

    	return true;
    }
    public void doFinish(String configName) throws CoreException {
    		
    		InitialProjectStructure.addInitialConfigurationModel(project, configName);
  
    }
    public void init(IWorkbench workbench, IStructuredSelection selection) {
    	
        this.selection = selection;
        
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null)
        {           
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IJavaProject)
            {
                project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
                  
            }
        }
        
    }
   
}