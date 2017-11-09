package org.admin.ui.wizards.symmetric_encryption;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.moflon.core.utilities.WorkspaceHelper;

@SuppressWarnings("all")
public class InitialProjectStructure {
  public Object createInitialProjectStructure(final IProgressMonitor monitor, final IProject project) {
    return null;
  }
  
  public static void addInitialConfigurationModel(final IProject project, final String configName, final String packageName) throws CoreException {
    final IPath pathToInitialConfiguration = new Path((("models/" + configName) + ".xmi"));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<CryptoAPIConfig:Task");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmi:version=\"2.0\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xmi=\"http://www.omg.org/XMI\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("xmlns:CryptoAPIConfig=\"platform:/plugin/CryptoAPIConfig/model/CryptoAPIConfig.ecore\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("package=");
    _builder.append(packageName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("description=\"SymmetricEncryption\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<algorithms");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("xsi:type=\"CryptoAPIConfig:SymmetricBlockCipher\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("name=\"AES\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("mode=\"GCM\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("padding=\"PKCS5Padding\">");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<imports value=\"java.security.InvalidAlgorithmParameterException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"java.security.InvalidKeyException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"java.security.Key\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"java.security.NoSuchAlgorithmException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"java.security.SecureRandom\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.BadPaddingException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.Cipher\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.IllegalBlockSizeException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.KeyGenerator\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.NoSuchPaddingException\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.SecretKey\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<imports value=\"javax.crypto.spec.IvParameterSpec\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</algorithms>");
    _builder.newLine();
    _builder.append("</CryptoAPIConfig:Task>");
    _builder.newLine();
    _builder.newLine();
    final String initialConfigurationfileContent = _builder.toString();
    try {
      WorkspaceHelper.addAllFolders(project, ("models/gen/" + configName), null);
      WorkspaceHelper.addAllFoldersAndFile(project, pathToInitialConfiguration, initialConfigurationfileContent, null);
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException e = (CoreException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
