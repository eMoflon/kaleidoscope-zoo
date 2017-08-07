package simplejava.core;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;
import SimpleJava.SimpleJavaFactory;
import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaImport;
import SimpleJava.JavaMethod;
import SimpleJava.JavaOpaqueMethod;
import SimpleJava.JavaPackage;

public class SimpleJavaHelper {
	public void addOpaqueMethod(JavaPackage javaPackage){
		JavaOpaqueMethod jom = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		jom.setModifier("private");
		jom.setName("opaqueMethod");
		jom.setThrows("NullPointerException");
		jom.setType("SecretKey");
		jom.setBody("{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		jom.setIndex(2);
		javaPackage.getCunits().get(0).getMethods().add(jom);
	}
	public void changePackageName(JavaPackage javaPackage){
		javaPackage.setName("cryptog");
	}
	public void addImports(JavaPackage javaPackage){
		JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		List<JavaImport>javaImports = cu.getImports();
		
		int highestIndex = javaImports.stream()
									  .max((i1, i2) -> Integer.compare(i1.getIndex(), i2.getIndex()))
									  .get().getIndex();
		
		JavaImport javaNullPointerException = SimpleJavaFactory.eINSTANCE.createJavaImport();
		javaNullPointerException.setValue("java.lang.NullPointerException");
		javaNullPointerException.setIndex(++highestIndex);
		
		JavaImport calendarException = SimpleJavaFactory.eINSTANCE.createJavaImport();
		calendarException.setValue("java.util.Calendar");
		calendarException.setIndex(++highestIndex);
		
		JavaImport dateException = SimpleJavaFactory.eINSTANCE.createJavaImport();
		dateException.setValue("java.util.Date");
		dateException.setIndex(++highestIndex);				
		
		javaImports.add(dateException);
		javaImports.add(calendarException);
		javaImports.add(javaNullPointerException);
		
	}
	public void removeImports(JavaPackage javaPackage){
		JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		List<JavaImport>javaImports = cu.getImports();
		
		javaImports.remove(0);
		javaImports.remove(0);
		javaImports.remove(0);
	}
	public void editImports(JavaPackage javaPackage){
		JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		List<JavaImport>javaImports = cu.getImports();
		
		JavaImport javaSecurityKeyImport = javaImports.stream().filter(i -> i.getValue().equals("java.security.Key")).findFirst().get();
		javaSecurityKeyImport.setValue("java.lang.NullPointerException");
		
		JavaImport javaSecureRandomImport = javaImports.stream().filter(i -> i.getValue().equals("java.security.SecureRandom")).findFirst().get();
		javaSecureRandomImport.setValue("java.util.Calendar");
		
		JavaImport javaxCryptoCipher = javaImports.stream().filter(i -> i.getValue().equals("javax.crypto.Cipher")).findFirst().get();
		javaxCryptoCipher.setValue("java.util.Date");		
	}
	public void changeOpaqueMethod(JavaPackage javaPackage){
		 JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		 JavaOpaqueMethod opaqueMethod = null;
		 
		 for (JavaMethod javaMethod : cu.getMethods()) {
			 if(javaMethod instanceof JavaOpaqueMethod){
				 opaqueMethod =  (JavaOpaqueMethod) javaMethod;
			 }
		 }		 	 
		 opaqueMethod.setBody("{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  return ret;\n}\n");
	}
	public void changeThrows(JavaPackage javaPackage){
		JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		 JavaOpaqueMethod opaqueMethod = null;
		 
		 for (JavaMethod javaMethod : cu.getMethods()) {
			 if(javaMethod instanceof JavaOpaqueMethod){
				 opaqueMethod =  (JavaOpaqueMethod) javaMethod;
			 }
		 }	
		 opaqueMethod.setThrows("NoSuchAlgorithmException");
	}
	public void changeImportsMethodsOrder(JavaPackage javaPackage){
		JavaCompilationUnit cu = javaPackage.getCunits().get(0);
		List<JavaImport>javaImports = cu.getImports();
		List<JavaMethod>javaMethods = cu.getMethods();
		
		for (JavaImport javaImport : javaImports) {
			if(javaImport.getIndex() == 0){
				javaImport.setIndex(2);
				continue;
			}
			if(javaImport.getIndex() == 2){
				javaImport.setIndex(0);
				continue;
			}
				
		}
		
		for (JavaMethod javaMethod : javaMethods) {
			if(javaMethod.getIndex() == 0){
				javaMethod.setIndex(1);
				continue;
			}
				
			
			if(javaMethod.getIndex() == 1){
				javaMethod.setIndex(0);
				continue;
			}
				
		}
	}
	
}
