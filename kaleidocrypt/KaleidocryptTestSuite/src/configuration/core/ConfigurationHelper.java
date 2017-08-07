package configuration.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;

public class ConfigurationHelper {

	public void changePackageName(Task task){
		task.setPackage("com.crypto.test");
	}
	public  void changeSymmBlockCipherPadding(Task task){
		 List<Algorithm>algorithms = task.getAlgorithms();
		 SymmetricBlockCipher sbc = (SymmetricBlockCipher)algorithms.get(0);
		 sbc.setPadding("PKCS10Padding");
	}
	public void changeSymmBlockCipherMode(Task task){
		 List<Algorithm>algorithms = task.getAlgorithms();
		 SymmetricBlockCipher sbc = (SymmetricBlockCipher)algorithms.get(0);
		 sbc.setMode("CCM");
	}
	public  void changeSymmBlockCipherName(Task task){
		 List<Algorithm>algorithms = task.getAlgorithms();
		 SymmetricBlockCipher sbc = (SymmetricBlockCipher)algorithms.get(0);
		 sbc.setName("RSA");
	}
	public void createSymmetricEncryptionImports(Task task){
		Import generatedImport = CryptoAPIConfigFactory.eINSTANCE.createImport();
		generatedImport.setValue("java.security.InvalidAlgorithmParameterException");
		task.getAlgorithms().get(0).getImports().add(generatedImport);		 
	}
	public void createExceptionImport(Task task) {		
		 Import generatedImport = CryptoAPIConfigFactory.eINSTANCE.createImport();
		 generatedImport.setValue("java.security.InvalidAlgorithmParameterException");
		 task.getAlgorithms().get(0).getImports().add(generatedImport);		 
	}
	public void createAESImport(Task task) {
		 Import generatedImport = CryptoAPIConfigFactory.eINSTANCE.createImport();
		 generatedImport.setValue("java.security.AES");
		 task.getAlgorithms().get(0).getImports().add(generatedImport);		 
	}
	public void createRSAImport(Task task) {
		 Import generatedImport = CryptoAPIConfigFactory.eINSTANCE.createImport();
		 generatedImport.setValue("java.security.RSA");
		 task.getAlgorithms().get(0).getImports().add(generatedImport);		 
	}
	public void renameExceptionImport(EObject task) {
		//task.getImports().stream().filter(x -> x.getValue().equals("java.security.InvalidAlgorithmParameterException")).findFirst().get();
		((Task) task).getAlgorithms().get(0).getImports().get(0).setValue("java.security.InvalidAlgorithm");
		((Task) task).getAlgorithms().get(0).getImports().get(2).setValue("java.security.RSAB");
	}
	public void removeFirstImport(Task task){
		task.getAlgorithms().get(0).getImports().remove(0);
	}
}
