package simplejava.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import SimpleJava.JavaImport;


public class JavaImportNormaliser implements Comparator<JavaImport> {
	@Override
	public int compare(JavaImport expected, JavaImport actual) {
		return expected.getValue().compareTo(actual.getValue());
	}

	public void normalize(List<JavaImport> imports){
		Comparator<JavaImport> comparator = new JavaImportNormaliser();
		Collections.sort(imports, comparator);
	}
}
