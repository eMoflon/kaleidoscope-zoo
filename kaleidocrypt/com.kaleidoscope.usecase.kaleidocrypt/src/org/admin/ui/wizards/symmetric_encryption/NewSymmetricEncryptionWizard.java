package org.admin.ui.wizards.symmetric_encryption;

import static org.moflon.core.utilities.WorkspaceHelper.addAllFolders;
import static org.moflon.core.utilities.WorkspaceHelper.addAllFoldersAndFile;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.core.JavaProject;
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
    	boolean creationAllowed = newFileWizardPage.getCreationAllowed();
    	
    	if(creationAllowed){
    		System.out.println("Creating!");
    		String configName = newFileWizardPage.getConfigFileName();
    		String packageName = newFileWizardPage.getPackageName();
    		try {
				doFinish(configName, packageName);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}else{
    		System.out.println("Blocked!");
    	}
    	
    	
    	return true;
    }
    public void doFinish(String configName, String packageName)
    		throws CoreException {
    		
    		IPath pathToInitialConfiguration = new Path("models/" + configName +".xmi");
    		
    		String initialConfigurationfileContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
    				"<CryptoAPIConfig:Task\n" + 
    				"    xmi:version=\"2.0\"\n" + 
    				"    xmlns:xmi=\"http://www.omg.org/XMI\"\n" + 
    				"    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" + 
    				"    xmlns:CryptoAPIConfig=\"platform:/plugin/CryptoAPIConfig/model/CryptoAPIConfig.ecore\"\n" + 
    				"    package=\"" + packageName + "\"\n" + 
    				"    description=\"SymmetricEncryption\">\n" + 
    				"  \n" + 
    				"  <algorithms\n" + 
    				"      xsi:type=\"CryptoAPIConfig:SymmetricBlockCipher\"\n" + 
    				"      name=\"AES\"\n" + 
    				"      mode=\"GCM\"\n" + 
    				"      padding=\"PKCS5Padding\">\n" + 
    				"      <imports value=\"java.security.InvalidAlgorithmParameterException\"/>\n" + 
    				"  <imports value=\"java.security.InvalidKeyException\"/>\n" + 
    				"  <imports value=\"java.security.Key\"/>\n" + 
    				"  <imports value=\"java.security.NoSuchAlgorithmException\"/>\n" + 
    				"  <imports value=\"java.security.SecureRandom\"/>\n" + 
    				"  <imports value=\"javax.crypto.BadPaddingException\"/>\n" + 
    				"  <imports value=\"javax.crypto.Cipher\"/>\n" + 
    				"  <imports value=\"javax.crypto.IllegalBlockSizeException\"/>\n" + 
    				"  <imports value=\"javax.crypto.KeyGenerator\"/>\n" + 
    				"  <imports value=\"javax.crypto.NoSuchPaddingException\"/>\n" + 
    				"  <imports value=\"javax.crypto.SecretKey\"/>\n" + 
    				"  <imports value=\"javax.crypto.spec.IvParameterSpec\"/>\n" + 
    				"  </algorithms>\n" + 
    				"</CryptoAPIConfig:Task>\n" + 
    				"";
    		try {
    			addAllFolders(project, "models/gen/" + configName, null);
				addAllFoldersAndFile(project, pathToInitialConfiguration, initialConfigurationfileContent, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    public void init(IWorkbench workbench, IStructuredSelection selection) {        
        this.selection = selection;
        
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null)
        {           
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof JavaProject)
            {
                project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
                  
            }
        }
        
    }
   
}