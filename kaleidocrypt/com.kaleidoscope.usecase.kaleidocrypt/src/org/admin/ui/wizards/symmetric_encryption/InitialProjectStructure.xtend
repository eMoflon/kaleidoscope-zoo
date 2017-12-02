package org.admin.ui.wizards.symmetric_encryption;

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor

import static org.moflon.core.utilities.WorkspaceHelper.addAllFolders;
import static org.moflon.core.utilities.WorkspaceHelper.addAllFoldersAndFile;
import org.eclipse.core.runtime.Path

class InitialProjectStructure {
	
	def createInitialProjectStructure(IProgressMonitor monitor, IProject project){
	
	}
	
	
	def static void addInitialConfigurationModel(IProject project, String configName, String packageName) throws CoreException{

	    val IPath pathToInitialConfiguration = new Path("models/" + configName +".xmi");
		val String initialConfigurationfileContent = '''
		<?xml version="1.0" encoding="UTF-8"?>
		<CryptoAPIConfig:Task
		    xmi:version="2.0"
		    xmlns:xmi="http://www.omg.org/XMI"
		    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    xmlns:CryptoAPIConfig="platform:/plugin/CryptoAPIConfig/model/CryptoAPIConfig.ecore"
		    package="«packageName»"
		    description="SymmetricEncryption">
		  
		  <algorithms
		      xsi:type="CryptoAPIConfig:SymmetricBlockCipher"
		      name="AES"
		      mode="GCM"
		      padding="PKCS5Padding">
		      <imports value="java.security.InvalidAlgorithmParameterException"/>
		  <imports value="java.security.InvalidKeyException"/>
		  <imports value="java.security.Key"/>
		  <imports value="java.security.NoSuchAlgorithmException"/>
		  <imports value="java.security.SecureRandom"/>
		  <imports value="javax.crypto.BadPaddingException"/>
		  <imports value="javax.crypto.Cipher"/>
		  <imports value="javax.crypto.IllegalBlockSizeException"/>
		  <imports value="javax.crypto.KeyGenerator"/>
		  <imports value="javax.crypto.NoSuchPaddingException"/>
		  <imports value="javax.crypto.SecretKey"/>
		  <imports value="javax.crypto.spec.IvParameterSpec"/>
		  </algorithms>
		</CryptoAPIConfig:Task>

		'''
		try {
    			addAllFolders(project, "models/gen/" + configName, null);
				addAllFoldersAndFile(project, pathToInitialConfiguration, initialConfigurationfileContent, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
	}
	
	
	
}