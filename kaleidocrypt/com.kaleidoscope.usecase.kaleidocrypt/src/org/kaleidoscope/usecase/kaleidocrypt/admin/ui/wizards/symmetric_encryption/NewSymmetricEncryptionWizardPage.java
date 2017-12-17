package org.kaleidoscope.usecase.kaleidocrypt.admin.ui.wizards.symmetric_encryption;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class NewSymmetricEncryptionWizardPage extends WizardPage {	
	
	  private IStructuredSelection selection;
	  private boolean creationAllowed = true;	  
	  
	  public boolean getCreationAllowed(){
		  return creationAllowed;
	  }
	  public void setCreationAllowed(boolean creationAllowed){
		  this.creationAllowed = creationAllowed;
	  }

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewSymmetricEncryptionWizardPage(IStructuredSelection selection, IProject project) {
		super("wizardPage");
		this.selection = selection;		
		setTitle("New SymmetriEncryption wizard");
		setDescription("This wizard creates a new SymmetricEncryption configuration model inside the models folder!");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;

		setControl(container);
		
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		
		
		// check if it is allowed to create a new project. First condition states that project needs to be selected and 
		// the second that the project needs to be opened
        if (window != null)
        {
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IJavaProject)
            {
                IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);                
                
                if(project.isOpen()) {
                		         
	                setCreationAllowed(true);
                }else {
                	setErrorMessage("A project needs to be opened in order to add the configuration model!");
                	setCreationAllowed(false);
                }
            }else{
            	setErrorMessage("A project needs to be selected in order to add the configuration model!");
            	setCreationAllowed(false);
            }
        }
	}



	
}