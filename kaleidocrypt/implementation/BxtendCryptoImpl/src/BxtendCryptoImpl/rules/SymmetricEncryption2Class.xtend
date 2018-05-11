package BxtendCryptoImpl.rules

import CryptoAPIConfig.SymmetricBlockCipher
import CryptoAPIConfig.Task
import Simplejava.SimplejavaFactory
import Simplejava.SimplejavaPackage
import Simplejava.JavaCompilationUnit
import Simplejava.JavaLiteral
import Simplejava.JavaPackage
import org.eclipse.emf.ecore.resource.Resource

class SymmetricEncryption2Class extends Elem2Elem{
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	def createJavaVariable(String type, String name, int index){
		val param = SimplejavaFactory.eINSTANCE.createJavaVariableDeclaration
		param.type = type
		param.name = name
		param.index = index
		return param
	}
	def createJavaLiteral(String stringLiteral){
		val literal = SimplejavaFactory.eINSTANCE.createJavaLiteral
		literal.value = stringLiteral
		return literal
	}
	def createJavaName(String stringName, int index){
		val name = SimplejavaFactory.eINSTANCE.createJavaName
		name.identifier = stringName
		name.index = index
		return name
	}
	def createEncryptWorkflowMethod(JavaCompilationUnit cunit, JavaLiteral nameModePadding){
		
		val methodInvocation = SimplejavaFactory.eINSTANCE.createJavaMethodInvocation
		val returnStatement = SimplejavaFactory.eINSTANCE.createJavaStatement
		
		returnStatement.^return = true
		returnStatement.expr = methodInvocation
		
	
		methodInvocation.name = "performEncryption"
		methodInvocation.arguments.add(createJavaName("data", 0))
		methodInvocation.arguments.add(createJavaName("key", 1))
		methodInvocation.arguments.add(nameModePadding)
			
		val workflowMethod = SimplejavaFactory.eINSTANCE.createJavaWorkflowMethod => [
			name = "encrypt"
			throws = "InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException"
			modifier = "public"
			type = "byte[] "
			params.add(createJavaVariable("byte[]", "data", 0))
		    params.add(createJavaVariable("SecretKey", "key", 1))
		    statements.add(returnStatement)
		    index = 1
		]
		cunit.methods.add(workflowMethod)		
	}
	def createPerformEncryptionOpaqueMethod(JavaCompilationUnit cunit){
		val opaqueMethod = SimplejavaFactory.eINSTANCE.createJavaOpaqueMethod => [
			name = "performEncryption";
			throws = "InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException";
			type = "byte[] "
			modifier = "private"
			parameters = "byte[] data,SecretKey key,String encryptPassingArgument"
			index = 0
			body =  "{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n"
		]
		
		cunit.methods.add(opaqueMethod)			
	}
	
	override sourceToTarget(String s) {
		
		sourceModel.allContents.filter(typeof(SymmetricBlockCipher))
								.filter[p | p.eContainer instanceof Task 
									&& (p.eContainer as Task).description.equals("SymmetricEncryption")]
		.forEach[ c | 
			val task = c.eContainer as Task
		
			val corrTargetJcu = task.getOrCreateCorrModelElement(BxtendCryptoImplTransformation.task2JavaPackageCorr)
			val targetJavaPackage = corrTargetJcu.getOrCreateTargetElem(SimplejavaPackage.eINSTANCE.javaPackage) as JavaPackage
			
						
			val corrTarget = c.getOrCreateCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaCompilationUnitCorr)
			val cunit = corrTarget.getOrCreateTargetElem(SimplejavaPackage.eINSTANCE.javaCompilationUnit) as JavaCompilationUnit
			
			if(!targetModel.contents.contains(targetJavaPackage)){

				cunit.name = "Enc"
				
				val corrNameModePaddingTarget = c.getOrCreateCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaLiteralCorr)
				val nameModePaddingLiteral = corrNameModePaddingTarget.getOrCreateTargetElem(SimplejavaPackage.eINSTANCE.javaLiteral) as JavaLiteral
				nameModePaddingLiteral.value = "\""+ c.name + "/"+ c.mode + "/" + c.padding +"\""
				nameModePaddingLiteral.index = 2
				createEncryptWorkflowMethod(cunit, nameModePaddingLiteral)

				createPerformEncryptionOpaqueMethod(cunit)
				targetJavaPackage.cunits.add(cunit)	
				
				targetModel.contents.add(targetJavaPackage)
			}
			targetJavaPackage.name = task.package
			
			
			if(!targetModel.contents.contains(targetJavaPackage))
				targetModel.contents.add(targetJavaPackage)
		];
	}
	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(JavaPackage))
		.forEach[ c |
			var corr = c.getCorrModelElement(BxtendCryptoImplTransformation.task2JavaPackageCorr) 
			
			if(corr !== null){
				var task = corr.sourceElement as Task
				task.package  = c.name
			}
		]
	}
	
}