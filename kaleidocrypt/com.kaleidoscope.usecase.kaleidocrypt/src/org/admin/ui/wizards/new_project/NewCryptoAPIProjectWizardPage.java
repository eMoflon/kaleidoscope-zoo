package org.admin.ui.wizards.new_project;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page is used to provide text box for entering project name
 */

public class NewCryptoAPIProjectWizardPage extends WizardPage {	
	private Text projectText;

	/**
	 * Constructor for NewCryptoAPIProjectWizardPage.	
	 */
	public NewCryptoAPIProjectWizardPage() {
		super("wizardPage");
		setTitle("New Project wizard");
		setDescription("This wizard creates a new project");
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
		Label label = new Label(container, SWT.NULL);
		label.setText("&Project name:");

		projectText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		projectText.setLayoutData(gd);
		projectText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Initialize project text field with empty string
	 */

	private void initialize() {
		projectText.setText("");
	}


	/**
	 * Ensures that the text field is set.
	 */

	private void dialogChanged() {		
		String projectName = getProjectName();
		if (projectName.length() == 0) {
			updateStatus("Project name must be specified");
			return;
		}
		if (projectName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Project name must be valid");
			return;
		}
		
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public void setProjectName(String projectName){
		projectText.setText(projectName);
	}
	
	public String getProjectName(){
		return projectText.getText();
	}
}