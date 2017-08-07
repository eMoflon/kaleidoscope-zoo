package configuration.core;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;

import org.normaliser.ConfigurationModelToString;

import CryptoAPIConfig.Task;

public class ConfigurationComparator<S> implements Comparator<Task>{
	ConfigurationModelToString configurationToString;	
	
	@Override
	public int compare(Task expected, Task actual){
		configurationToString = new ConfigurationModelToString();
		String expectedString = configurationToString.unparseTask(expected).toString();
		String actualString = configurationToString.unparseTask(actual).toString();
		assertTrue(configurationToString.unparseTask(expected).toString().startsWith("task"));
		assertEquals(expectedString, actualString);
		return expectedString.compareTo(actualString);
	}
}


