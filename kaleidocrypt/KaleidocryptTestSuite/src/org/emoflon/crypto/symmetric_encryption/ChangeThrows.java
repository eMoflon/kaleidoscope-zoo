package org.emoflon.crypto.symmetric_encryption;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.admin.ui.wizards.symmetric_encryption.NewSymmetricEncryptionWizard;
import org.eclipse.core.runtime.CoreException;
import org.emoflon.crypto.CryptoTestCase;
import org.junit.Test;

public class ChangeThrows extends CryptoTestCase{
	private Path pathExpectedFolder = Paths.get("symmetric_encryption");
	@Test
	public void test() throws InterruptedException, CoreException {

		//------------	
		String configFileName = "SymmEnc";		
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(), testName,"ChangeThrows.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		
		helperCryptoTest.createProject(testName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(testName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveTargetEdit(relActualTargetPath, helperSimpleJava::changeOpaqueMethod);
		helperCryptoTest.performChangeSaveTargetEdit(relActualTargetPath, helperSimpleJava::changeThrows);
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherName);
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		
	}
}


