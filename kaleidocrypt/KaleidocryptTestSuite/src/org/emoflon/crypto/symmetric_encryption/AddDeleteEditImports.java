package org.emoflon.crypto.symmetric_encryption;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.admin.ui.wizards.symmetric_encryption.NewSymmetricEncryptionWizard;
import org.eclipse.core.runtime.CoreException;
import org.emoflon.crypto.CryptoTestCase;
import org.junit.Test;

public class AddDeleteEditImports extends CryptoTestCase{
	
	private Path pathExpectedFolder = Paths.get("symmetric_encryption");
	@Test
	public void testRemoveImports() throws InterruptedException, CoreException {

		//------------
		String projectName = testName + "_remove";
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(), testName,"RemoveImports.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		Path exptectedSourcePath = Paths.get(pathExpectedFolder.toString(), testName,"RemoveImports.xmi");
		Path actualSourceName = Paths.get("SymmEnc");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveTargetEdit(relActualTargetPath, helperSimpleJava::removeImports);
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherMode);
		
		//------------	
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		helperCryptoTest.assertSource(exptectedSourcePath, actualSourceName);
	}
	@Test
	public void testAddImports() throws InterruptedException, CoreException {

		//------------
		String projectName = testName+ "_add";
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(), testName,"AddImports.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		Path exptectedSourcePath = Paths.get(pathExpectedFolder.toString(), testName,"AddImports.xmi");
		Path actualSourceName = Paths.get("SymmEnc");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveTargetEdit(relActualTargetPath, helperSimpleJava::addImports);
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherName);
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		helperCryptoTest.assertSource(exptectedSourcePath, actualSourceName);
	}
	
	
	
	@Test
	public void testEditImports() throws InterruptedException, CoreException {

		//------------
		String projectName = testName + "_edit";
		String configFileName = "SymmEnc";
		String packageName = "Crypto";
		String configurationModelWizardID = NewSymmetricEncryptionWizard.NEW_SYMMETRIC_ENCRYPTION_WIZARD_ID;
		
		Path exptectedTargetPath = Paths.get(pathExpectedFolder.toString(), testName, "EditImports.java");
		Path relActualTargetPath = Paths.get("src", "Crypto", "Enc.java");
		Path exptectedSourcePath = Paths.get(pathExpectedFolder.toString(),testName, "EditImports.xmi");
		Path actualSourceName = Paths.get("SymmEnc");
		
		helperCryptoTest.createProject(projectName, NEW_PROJECT_WIZARD_ID);
		helperCryptoTest.createConfiguration(projectName, configFileName, packageName, configurationModelWizardID);
		
		//------------
		helperCryptoTest.performChangeSaveTargetEdit(relActualTargetPath, helperSimpleJava::editImports);
		helperCryptoTest.performChangeSaveSourceEdit(configFileName, helperConfiguration::changeSymmBlockCipherName);
		
		//------------
		helperCryptoTest.assertTarget(exptectedTargetPath, relActualTargetPath);
		helperCryptoTest.assertSource(exptectedSourcePath, actualSourceName);
	}
}


