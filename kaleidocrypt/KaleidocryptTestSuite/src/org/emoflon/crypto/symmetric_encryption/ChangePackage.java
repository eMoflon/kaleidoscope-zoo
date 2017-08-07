package org.emoflon.crypto.symmetric_encryption;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.admin.ui.wizards.symmetric_encryption.NewSymmetricEncryptionWizard;
import org.eclipse.core.runtime.CoreException;
import org.emoflon.crypto.CryptoTestCase;
import org.junit.Test;

public class ChangePackage extends CryptoTestCase{
	private Path pathExpectedFolder = Paths.get("symmetric_encryption");
	@Test
	public void ChangePackageInConfiguration() throws InterruptedException, CoreException {

		//------------	
		String projectName = testName + "_in_configuration";
		String configFileName = "SymmEnc";		
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(),testName, "ChangePackageInConfiguration.java");
		Path relActualTargetPath = Paths.get("src", "com", "crypto", "test", "Enc.java");
		Path exptectedSourcePath = Paths.get(pathExpectedFolder.toString(),testName, "ChangePackageInConfiguration.xmi");
		Path actualSourceName = Paths.get("SymmEnc");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changePackageName);
	
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		helperCryptoTest.assertSource(exptectedSourcePath, actualSourceName);
	}
	@Test
	public void ChangePackageInJavaFile() throws InterruptedException, CoreException {

		//------------	
		String projectName = testName + "_in_java";
		String configFileName = "SymmEnc";		
		String packageName = "Crypto";
		Path originalTargetPath =  Paths.get("src", "Crypto", "Enc.java");
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(),testName, "ChangePackageInJava.java");
		Path relActualTargetPath = Paths.get("src", "cryptog", "Enc.java");
		Path exptectedSourcePath = Paths.get(pathExpectedFolder.toString(),testName, "ChangePackageInJava.xmi");
		Path actualSourceName = Paths.get("SymmEnc");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveTargetEdit(originalTargetPath, helperSimpleJava::changePackageName);
	
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		helperCryptoTest.assertSource(exptectedSourcePath, actualSourceName);
	}
	
}


