package org.emoflon.crypto;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.After;

import CryptoAPIConfig.Task;
import SimpleJava.JavaPackage;
import configuration.core.ConfigurationComparator;
import configuration.core.ConfigurationHelper;
import simplejava.core.SimpleJavaComparator;
import simplejava.core.SimpleJavaHelper;

public class CryptoTestCase {

	protected Comparator<Task> configurationComparator;
	protected Comparator<JavaPackage> simpleJavaComparator;
	
	protected ConfigurationHelper helperConfiguration;
	protected SimpleJavaHelper helperSimpleJava;
	
	protected CryptoTestHelper<Task, JavaPackage>helperCryptoTest;
	
	final public static String NEW_PROJECT_WIZARD_ID = "kaleidoscope.usecase.crypto.wizards.NewCryptoAPIProject";
	protected String testName;
	
	
	@Before
	public void initialise() {
		testName = this.getClass().getSimpleName();
		
		configurationComparator = new ConfigurationComparator();
		simpleJavaComparator = new SimpleJavaComparator();
		ResourceSet resourceSet = new ResourceSetImpl();
		Path p = Paths.get("crypto_java_configuration_instances").toAbsolutePath();
		
		helperCryptoTest = new CryptoTestHelper<Task, JavaPackage>(resourceSet, "crypto_java_configuration_instances",
				"crypto_java_configuration_instances", configurationComparator, simpleJavaComparator);		
		helperConfiguration = new ConfigurationHelper();
		helperSimpleJava = new SimpleJavaHelper();
	}
	@After
	public void finish() throws CoreException {
		helperCryptoTest.closeProject();
		helperCryptoTest.getProject().delete(true, null);
		
	}
	
}
