package BxtendCryptoImpl.rules

import CryptoAPIConfig.SymmetricBlockCipher
import SimpleJava.JavaLiteral
import org.eclipse.emf.ecore.resource.Resource

class SymmetricEncryption2JavaLiteral extends Elem2Elem{
	new(Resource src, Resource trgt, Resource corr) {
		super(src, trgt, corr)
	}
	
	override sourceToTarget(String s) {
		
		sourceModel.allContents.filter(typeof(SymmetricBlockCipher))
								.filter[p | p.corrModelElem !== null] 									
		.forEach[ c | 
			val nameModePaddingLiteral = c.getCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaLiteralCorr).targetElement as JavaLiteral
			nameModePaddingLiteral.value = "\""+ c.name + "/"+ c.mode + "/" + c.padding +"\""
		];
	}
	
	override targetToSource(String s) {
		targetModel.allContents.filter(typeof(JavaLiteral))
								.filter[p | p.corrModelElem !== null] 
		.forEach[ nameModePadding |
			val symmetricBlockCipher = nameModePadding.getCorrModelElement(BxtendCryptoImplTransformation.symmetricEncryption2JavaLiteralCorr).sourceElement as SymmetricBlockCipher
			val nameModePaddingString = nameModePadding.value.replaceAll("\"", "");
    		val String[] parts = nameModePaddingString.split("/");
    		symmetricBlockCipher.name = parts.get(0);
    		symmetricBlockCipher.mode = parts.get(1)
    		symmetricBlockCipher.padding = parts.get(2)    		
		]
	}
	
}