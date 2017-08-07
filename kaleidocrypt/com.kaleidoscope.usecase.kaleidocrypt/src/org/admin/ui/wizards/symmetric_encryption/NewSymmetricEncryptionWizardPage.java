package org.admin.ui.wizards.symmetric_encryption;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewSymmetricEncryptionWizardPage extends WizardPage {	
	  private IStructuredSelection selection;
	  private boolean creationAllowed = true;	  
	  
	  private Text packageName;
	  private Text configFileName;
	  
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
	public String getPackageName(){
		return packageName.getText();
	}
	public String getConfigFileName(){
		return configFileName.getText();
	}
	private void initialize() {
		packageName.setText("");
		configFileName.setText("");
	}
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {		
		String packageName = getPackageName();
		String configFileName = getConfigFileName();
		
		if (packageName.length() == 0) {
			updateStatus("Package name must be specified");
			return;
		}
		
		if (configFileName.length() == 0) {
			updateStatus("Config file name must be specified");
			return;
		}
		if (packageName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Package name must be valid");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
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
		
		Label labelPackageName = new Label(container, SWT.NULL);
		labelPackageName.setText("Package name:");

		packageName = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		packageName.setLayoutData(gd);
		packageName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Label configFileLabel = new Label(container, SWT.NULL);
		configFileLabel.setText("&Config file name:");
		
		
		configFileName = new Text(container, SWT.BORDER | SWT.SINGLE);
		configFileName .setLayoutData(gd);
		configFileName .addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		initialize();
		setControl(container);
		
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		
		
		// check if it is allowed to create a new project. First condition states that project needs to be selected and 
		// the second that the project needs to be opened
        if (window != null)
        {
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IProject)
            {
                IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
                IPath path = project.getFullPath();
                
                if(project.isOpen()) {
                	
	                System.out.println(path);
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