package org.benchmarx.examples.familiestopersons.implementations.bigul;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.benchmarx.Configurator;
import org.benchmarx.emf.ModelAssertation;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.junit.Assert;

import com.kaleidoscope.core.delta.javabased.Delta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationFailedException;
import com.kaleidoscope.core.framework.synchronisation.SynchronisationResult;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsFactory;

/**
 * The trick applied by this testrunner is simply to set the source and target
 * models A and B, when
 * {@link #assertPrecondition(FamilyRegister, PersonRegister)} is invoked (BiGUL
 * is state-based and does not require any internal state). As idle updates are
 * only used to establish the precondition, these can be simply ignored.
 * 
 * Any subsequent invocations of
 * {@link #performAndPropagateSourceEdit(Consumer)} or
 * {@link #performAndPropagateTargetEdit(Consumer)} are then used to update the
 * models, e.g., to A' and B.
 * 
 * This means that round trips are not directly supported (only multiple source
 * or multiple target updates are allowed, not a mixture), and have to be split
 * into separate tests!
 * 
 * Finally, when {@link #assertPostcondition(FamilyRegister, PersonRegister)} is
 * invoked, BiGUL is called with the current state of A' and B to produce B'.
 * 
 * @author anthony anjorin
 */
public class BiGULFamiliesToPersonsKaleidoscope  implements Synchroniser<
																	FamilyRegister, 
																	PersonRegister, 
																	Configurator<Decisions>, 
																	OperationalDelta, 
																	OperationalDelta
																	> ,
												ModelAssertation<FamilyRegister, PersonRegister>{
	private static final boolean debug = false;
	
	private static final String BIGUL_EXE = "src/org/benchmarx/examples/familiestopersons/implementations/bigul/FamiliesToPersons";
	private FamilyRegister src;
	private PersonRegister trg;
	private String resultSrc;
	private String resultTrg;
	private FamiliesComparator srcHelper = new FamiliesComparator();
	private PersonsComparator trgHelper = new PersonsComparator();
	private Runnable propagation;
	private Configurator<Decisions> configurator;
	
	
	public String getName() {
		return "BiGUL";
	}
	
	
	@Override
	public void initialise() {
		// BiGUL does not require any internal state
		src = FamiliesFactory.eINSTANCE.createFamilyRegister();
		trg = PersonsFactory.eINSTANCE.createPersonRegister();
		
		// Initial results
		resultSrc = srcHelper.familyToString(src);
		resultTrg = trgHelper.personsToString(trg);
		
		configurator = new Configurator<Decisions>();
		propagation = () -> {};
	}

	private void runBigulBWD() {
		resultSrc = runBigul("bwd", resultSrc, trgHelper.personsToString(trg));
		resultTrg = trgHelper.personsToString(trg);
	}

	private void runBigulFWD() {
		resultTrg = runBigul("fwd", srcHelper.familyToString(src), resultTrg);
		resultSrc = srcHelper.familyToString(src);
	}

	private String runBigul(String dir, String familyRegister, String personsRegister) {
		try {
			File pathToExecutable = new File(BIGUL_EXE);
			String input = "(" + "\"" + dir + "\"" + ", " + updatePolicy() + ", " + familyRegister + "," + personsRegister + ")";
			ProcessBuilder processBuilder = new ProcessBuilder(pathToExecutable.getAbsoluteFile().toString());
			processBuilder.redirectErrorStream(true);
			Process process = processBuilder.start();
			
			OutputStream stdin = process.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));
			
			InputStream stdout = process.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));

			if(debug)
				System.out.println(input);
			
			writer.write(input);
			writer.flush();
			writer.close();
			
			String output = reader.lines().collect(Collectors.joining(" "));
			reader.close();
			
			return output;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "ERROR__Have_you_set_up_the_BiGUL_implementation_properly?__"
				+ "Please_consult_the_\"/implementations/bigul/README-SETUP\"_file!";
	}

	private String updatePolicy() {
		try {
			boolean b = configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD);
			boolean e = configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW);
			
			String policy = "[";
			if(b)
				policy += "PREFER_CREATING_PARENT_TO_CHILD";
			if(b && e)
				policy += ", ";
			if(e)
				policy += "PREFER_EXISTING_FAMILY_TO_NEW";
			
			return policy + "]";
		} catch (Exception e) {
			return "[]";
		}
	}

	@Override
	public void setUpdatePolicy(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}	
	
	public void saveModels(String name) {
		
	}

	@Override
	public FamilyRegister getSourceModel() {
		// TODO Auto-generated method stub
		return src;
	}

	@Override
	public PersonRegister getTargetModel() {
		// TODO Auto-generated method stub
		return trg;
	}

	@Override
	public void syncForward(OperationalDelta srcDelta) throws SynchronisationFailedException {
		try {
			
			srcDelta.transformToOpaqueDelta().execute(src);
			propagation =  this::runBigulFWD;
		} catch (Error e) {
			// We are not interested in any problems that might occur while constructing deltas
		}
		
	}

	
	
	@Override
	public void syncBackward(OperationalDelta trgDelta) throws SynchronisationFailedException {
		
		try {
			
			trgDelta.transformToOpaqueDelta().execute(trg);
			propagation =  this::runBigulBWD;
		} catch (Error e) {
			// We are not interested in any problems that might occur while constructing deltas
		}		
		
	}

	@Override
	public OperationalDelta getFailedDelta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}

	private void normaliseAndCompare(String expected, String actual) {
		Assert.assertEquals(expected.replaceAll("\\s+",""), actual.replaceAll("\\s+",""));
	}
	@Override
	public void assertPostcondition(FamilyRegister source, PersonRegister target,
			SynchronisationResult<FamilyRegister, ?, PersonRegister, ?, ? extends Delta> syncResult) {
			propagation.run();
		
		String expectedFamilyRegister = srcHelper.familyToString(source);
		String expectedPersonsRegister = trgHelper.personsToString(target);
		
		normaliseAndCompare(expectedFamilyRegister, resultSrc);
		normaliseAndCompare(expectedPersonsRegister, resultTrg);
		
	}


	@Override
	public void assertPrecondition(FamilyRegister source, PersonRegister target,
			SynchronisationResult<FamilyRegister, ?, PersonRegister, ?, ? extends Delta> syncResult) {
		src = source;
		trg = target;
		resultSrc = srcHelper.familyToString(src);
		resultTrg = trgHelper.personsToString(trg);
		
	}
	
}

