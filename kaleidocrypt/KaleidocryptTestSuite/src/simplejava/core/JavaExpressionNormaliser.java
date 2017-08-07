package simplejava.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import SimpleJava.JavaExpression;
import SimpleJava.JavaImport;


public class JavaExpressionNormaliser implements Comparator<JavaExpression> {
	@Override
	public int compare(JavaExpression expected, JavaExpression actual) {		
		return Integer.compare(expected.getIndex(), actual.getIndex());
	}

	public void normalize(List<JavaExpression> imports){
		Comparator<JavaExpression> comparator = new JavaExpressionNormaliser();
		Collections.sort(imports, comparator);
	}
}
