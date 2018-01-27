package org.benchmarx.examples.familiestopersons.implementations.nmf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import org.benchmarx.emf.ModelAssertation;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Assert;

import com.kaleidoscope.core.delta.javabased.Delta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationResult;

import Families.FamilyRegister;
import Persons.PersonRegister;

public class NMFModelAssertation implements ModelAssertation<FamilyRegister, PersonRegister> {

	private FamiliesComparator srcHelper = new FamiliesComparator();
	private PersonsComparator trgHelper = new PersonsComparator();
	private BufferedReader reader;
	private BufferedWriter writer;
	
	@Override
	public void assertPostcondition(FamilyRegister source, PersonRegister target,
			SynchronisationResult<FamilyRegister, ?, PersonRegister, ?, ? extends Delta> syncResult) {
		this.assertPrecondition(source, target, syncResult);
		
	}

	private <M> M readModel(String command) {
		try {
			File tempFile = File.createTempFile("model", ".xmi");
			writer.write(command);
			writer.write(" ");
			writer.write(tempFile.getAbsolutePath());
			writer.write("\n");
			writer.flush();
			reader.readLine();
			M result = loadModel(tempFile.getAbsolutePath());
			tempFile.delete();
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
			return null;
		}
	}
	
	private void normaliseAndCompare(String expected, String actual) {
		Assert.assertEquals(expected.replaceAll("\\s+",""), actual.replaceAll("\\s+",""));
	}
	
	private <M> M loadModel(String path){
		ResourceSet resourceSet = new ResourceSetImpl();
		return loadModel(path, resourceSet);
	}
	
	@SuppressWarnings("unchecked")
	private <M> M loadModel(String path, ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	      
		Resource resource = resourceSet.createResource(URI.createFileURI(path));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (M)resource.getContents().get(0);
	}
	
	@Override
	public void assertPrecondition(FamilyRegister source, PersonRegister target,
			SynchronisationResult<FamilyRegister, ?, PersonRegister, ?, ? extends Delta> syncResult) {
		
		
		String resultSrc = srcHelper.familyToString(readModel("SaveFamilies"));
		String resultTrg = trgHelper.personsToString(readModel("SavePersons"));
		
		String expectedFamilyRegister = srcHelper.familyToString(source);
		String expectedPersonsRegister = trgHelper.personsToString(target);
		
		normaliseAndCompare(expectedFamilyRegister, resultSrc);
		normaliseAndCompare(expectedPersonsRegister, resultTrg);
		
	}

}
