package simplejava.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;

import com.kaleidoscope.implementation.artefactadapter.normaliser.java_normaliser.JavaPackageToString;

import SimpleJava.JavaPackage;

public class SimpleJavaComparator implements Comparator<JavaPackage>{
	JavaPackageToString simpleJavaString;	
	
	@Override
	public int compare(JavaPackage expected, JavaPackage actual){
		simpleJavaString = new JavaPackageToString();
		String expectedString = simpleJavaString.unparse(expected).toString();
		String actualString = simpleJavaString.unparse(actual).toString();
		assertTrue(simpleJavaString.unparse(expected).toString().startsWith("package"));
		assertEquals(expectedString, actualString);		
		return expectedString.compareTo(actualString);
	}
}


