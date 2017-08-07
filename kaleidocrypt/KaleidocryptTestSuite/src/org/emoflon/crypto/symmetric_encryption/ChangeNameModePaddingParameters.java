package org.emoflon.crypto.symmetric_encryption;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.admin.ui.wizards.symmetric_encryption.NewSymmetricEncryptionWizard;
import org.eclipse.core.runtime.CoreException;
import org.emoflon.crypto.CryptoTestCase;
import org.junit.Test;

public class ChangeNameModePaddingParameters extends CryptoTestCase{
	private Path pathExpectedFolder = Paths.get("symmetric_encryption");
	@Test
	public void changeNameParameter() throws InterruptedException, CoreException {

		//------------		
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(),testName, "ChangeNameParameter.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		
		helperCryptoTest.createProject(testName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(testName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherName);
		
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		
	}

	@Test
	public void changeModeParameter() throws InterruptedException, CoreException {

		//------------
		String projectName = testName;
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(),testName, "ChangeModeParameter.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherMode);
		
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
	}
	
	@Test
	public void changePaddingParameter() throws InterruptedException, CoreException {

		//------------		
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(), testName,"ChangePaddingParameter.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		
		helperCryptoTest.createProject(testName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(testName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherPadding);
		
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
	}
}


