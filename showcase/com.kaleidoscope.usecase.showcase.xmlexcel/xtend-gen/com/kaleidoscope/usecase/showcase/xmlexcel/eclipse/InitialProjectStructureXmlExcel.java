package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse;

import com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class InitialProjectStructureXmlExcel extends InitialProjectStructure {
  public static void createEmptyExcelFile(final IPath projectPath, final IPath filePath) {
    InitialProjectStructureXmlExcel.create(projectPath, filePath);
  }
  
  public static String create(final IPath projectPath, final IPath filePath) {
    StringConcatenation _builder = new StringConcatenation();
    String _plus = (projectPath + "\\");
    String _string = filePath.toString();
    String _plus_1 = (_plus + _string);
    final File file = new File(_plus_1);
    _builder.newLineIfNotEmpty();
    String _plus_2 = (projectPath + "\\");
    String _string_1 = filePath.toString();
    String _plus_3 = (_plus_2 + _string_1);
    String _println = InputOutput.<String>println(_plus_3);
    _builder.append(_println);
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    boolean _exists = file.exists();
    if (_exists) {
      _xifexpression = InputOutput.<String>println("File already exists!");
    } else {
      InputOutput.<String>println("Creating new Excel file...");
      final XSSFWorkbook workbook = new XSSFWorkbook();
      workbook.createSheet("Sheet1");
      try {
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
