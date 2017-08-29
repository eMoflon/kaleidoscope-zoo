package org.normaliser

import CryptoAPIConfig.Algorithm
import CryptoAPIConfig.Digest
import CryptoAPIConfig.Import
import CryptoAPIConfig.KeyDerivationAlgorithm
import CryptoAPIConfig.SymmetricBlockCipher
import CryptoAPIConfig.Task
import java.util.ArrayList
import java.util.List


class ConfigurationModelToString {

	private ImportNormaliser importNormaliser = new ImportNormaliser();
	private AlgorithmNormaliser algorithmNormaliser = new AlgorithmNormaliser();
	
	new(){
	}
		
	def unparseTask(Task task)
		'''
		task {
			package: «task.package»
			description: «task.description»
			algorithms: [
			«val List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(task.algorithms)»
			«algorithmNormaliser.normalize(sortedAlgorithms)»
			«FOR a : sortedAlgorithms»
			«unparseAlgorithm(a)»
			«ENDFOR»
			]						
		}
		'''
	def String unparseAlgorithm(Algorithm alg)
	'''«IF alg instanceof SymmetricBlockCipher»
	«unparseSymmetricBlockCipher(alg)»
		«ENDIF»
		«IF alg instanceof KeyDerivationAlgorithm»
	«unparseKeyDerivationAlgorithm(alg)»
		«ENDIF»
		«IF alg instanceof Digest»
	«unparseDigestAlgorithm(alg)»
		«ENDIF»
	'''
	def unparseSymmetricBlockCipher(SymmetricBlockCipher sbc)
	'''
		algorithm {
			description: «sbc.description»
			name: «sbc.name»
			security: «sbc.security»
			performance: «sbc.performance»
			mode: «sbc.mode»
			padding: «sbc.padding»
			keySize: «sbc.keySize»
			incldues: [
				«val List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(sbc.includes)»
				«algorithmNormaliser.normalize(sortedAlgorithms)»
				«FOR a : sortedAlgorithms»
				«unparseAlgorithm(a)»
				«ENDFOR»
			]
			imports: [
				«val List<Import> sortedImports = new ArrayList<Import>(sbc.imports)»
				«importNormaliser.normalize(sortedImports)»					
				«FOR i : sortedImports»
				import «i.value»;
				«ENDFOR»
			]
		}	
	'''
	def unparseKeyDerivationAlgorithm(KeyDerivationAlgorithm kda)
	'''
		algorithm {
			description: «kda.description»
			name: «kda.name»
			security: «kda.security»
			performance: «kda.performance»
			iterations: «kda.iterations»
			outputSize: «kda.outputSize»
			incldues: [
				«val List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(kda.includes)»
				«algorithmNormaliser.normalize(sortedAlgorithms)»
				«FOR a : sortedAlgorithms»
				«unparseAlgorithm(a)»
				«ENDFOR»
			]
			imports: [
				«val List<Import> sortedImports = new ArrayList<Import>(kda.imports)»
				«importNormaliser.normalize(sortedImports)»					
				«FOR i : sortedImports»
				import «i.value»;
				«ENDFOR»
			]
		}	
		
	'''
	
	def unparseDigestAlgorithm(Digest digest)
	'''
		algorithm {
			description: «digest.description»
			name: «digest.name»
			security: «digest.security»
			performance: «digest.performance»			
			outputSize: «digest.outputSize»
			incldues: [
				«val List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(digest.includes)»
				«algorithmNormaliser.normalize(sortedAlgorithms)»
				«FOR a : sortedAlgorithms»
				«unparseAlgorithm(a)»
				«ENDFOR»
			]
		}	
		
	'''
}
