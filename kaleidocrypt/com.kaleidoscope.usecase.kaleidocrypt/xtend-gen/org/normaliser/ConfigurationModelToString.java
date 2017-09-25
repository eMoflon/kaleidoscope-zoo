package org.normaliser;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.Digest;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.KeyDerivationAlgorithm;
import CryptoAPIConfig.PERFORMANCE;
import CryptoAPIConfig.SECURITY;
import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.normaliser.AlgorithmNormaliser;
import org.normaliser.ImportNormaliser;

@SuppressWarnings("all")
public class ConfigurationModelToString {
  private ImportNormaliser importNormaliser = new ImportNormaliser();
  
  private AlgorithmNormaliser algorithmNormaliser = new AlgorithmNormaliser();
  
  public ConfigurationModelToString() {
  }
  
  public CharSequence unparseTask(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("task {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("package: ");
    String _package = task.getPackage();
    _builder.append(_package, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("description: ");
    String _description = task.getDescription();
    _builder.append(_description, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("algorithms: [");
    _builder.newLine();
    _builder.append("\t");
    EList<Algorithm> _algorithms = task.getAlgorithms();
    final List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(_algorithms);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.algorithmNormaliser.normalize(sortedAlgorithms);
    _builder.newLineIfNotEmpty();
    {
      for(final Algorithm a : sortedAlgorithms) {
        _builder.append("\t");
        String _unparseAlgorithm = this.unparseAlgorithm(a);
        _builder.append(_unparseAlgorithm, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String unparseAlgorithm(final Algorithm alg) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((alg instanceof SymmetricBlockCipher)) {
        _builder.newLineIfNotEmpty();
        CharSequence _unparseSymmetricBlockCipher = this.unparseSymmetricBlockCipher(((SymmetricBlockCipher)alg));
        _builder.append(_unparseSymmetricBlockCipher);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((alg instanceof KeyDerivationAlgorithm)) {
        CharSequence _unparseKeyDerivationAlgorithm = this.unparseKeyDerivationAlgorithm(((KeyDerivationAlgorithm)alg));
        _builder.append(_unparseKeyDerivationAlgorithm);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((alg instanceof Digest)) {
        CharSequence _unparseDigestAlgorithm = this.unparseDigestAlgorithm(((Digest)alg));
        _builder.append(_unparseDigestAlgorithm);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public CharSequence unparseSymmetricBlockCipher(final SymmetricBlockCipher sbc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("algorithm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description: ");
    String _description = sbc.getDescription();
    _builder.append(_description, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("name: ");
    String _name = sbc.getName();
    _builder.append(_name, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("security: ");
    SECURITY _security = sbc.getSecurity();
    _builder.append(_security, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("performance: ");
    PERFORMANCE _performance = sbc.getPerformance();
    _builder.append(_performance, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("mode: ");
    String _mode = sbc.getMode();
    _builder.append(_mode, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("padding: ");
    String _padding = sbc.getPadding();
    _builder.append(_padding, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("keySize: ");
    int _keySize = sbc.getKeySize();
    _builder.append(_keySize, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("incldues: [");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Algorithm> _includes = sbc.getIncludes();
    final List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(_includes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.algorithmNormaliser.normalize(sortedAlgorithms);
    _builder.newLineIfNotEmpty();
    {
      for(final Algorithm a : sortedAlgorithms) {
        _builder.append("\t\t");
        String _unparseAlgorithm = this.unparseAlgorithm(a);
        _builder.append(_unparseAlgorithm, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("imports: [");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Import> _imports = sbc.getImports();
    final List<Import> sortedImports = new ArrayList<Import>(_imports);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.importNormaliser.normalize(sortedImports);
    _builder.append("\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    {
      for(final Import i : sortedImports) {
        _builder.append("\t\t");
        _builder.append("import ");
        String _value = i.getValue();
        _builder.append(_value, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence unparseKeyDerivationAlgorithm(final KeyDerivationAlgorithm kda) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("algorithm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description: ");
    String _description = kda.getDescription();
    _builder.append(_description, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("name: ");
    String _name = kda.getName();
    _builder.append(_name, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("security: ");
    SECURITY _security = kda.getSecurity();
    _builder.append(_security, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("performance: ");
    PERFORMANCE _performance = kda.getPerformance();
    _builder.append(_performance, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("iterations: ");
    String _iterations = kda.getIterations();
    _builder.append(_iterations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("outputSize: ");
    String _outputSize = kda.getOutputSize();
    _builder.append(_outputSize, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("incldues: [");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Algorithm> _includes = kda.getIncludes();
    final List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(_includes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.algorithmNormaliser.normalize(sortedAlgorithms);
    _builder.newLineIfNotEmpty();
    {
      for(final Algorithm a : sortedAlgorithms) {
        _builder.append("\t\t");
        String _unparseAlgorithm = this.unparseAlgorithm(a);
        _builder.append(_unparseAlgorithm, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("imports: [");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Import> _imports = kda.getImports();
    final List<Import> sortedImports = new ArrayList<Import>(_imports);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.importNormaliser.normalize(sortedImports);
    _builder.append("\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    {
      for(final Import i : sortedImports) {
        _builder.append("\t\t");
        _builder.append("import ");
        String _value = i.getValue();
        _builder.append(_value, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence unparseDigestAlgorithm(final Digest digest) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("algorithm {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description: ");
    String _description = digest.getDescription();
    _builder.append(_description, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("name: ");
    String _name = digest.getName();
    _builder.append(_name, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("security: ");
    SECURITY _security = digest.getSecurity();
    _builder.append(_security, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("performance: ");
    PERFORMANCE _performance = digest.getPerformance();
    _builder.append(_performance, "\t");
    _builder.append("\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("outputSize: ");
    int _outputSize = digest.getOutputSize();
    _builder.append(_outputSize, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("incldues: [");
    _builder.newLine();
    _builder.append("\t\t");
    EList<Algorithm> _includes = digest.getIncludes();
    final List<Algorithm> sortedAlgorithms = new ArrayList<Algorithm>(_includes);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.algorithmNormaliser.normalize(sortedAlgorithms);
    _builder.newLineIfNotEmpty();
    {
      for(final Algorithm a : sortedAlgorithms) {
        _builder.append("\t\t");
        String _unparseAlgorithm = this.unparseAlgorithm(a);
        _builder.append(_unparseAlgorithm, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
