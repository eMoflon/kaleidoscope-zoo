package org.normaliser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import CryptoAPIConfig.Algorithm;


public class AlgorithmNormaliser implements Comparator<Algorithm> {
	@Override
	public int compare(Algorithm expected, Algorithm actual) {
		String expectedNameDescription = expected.getName() + expected.getDescription();
		String actualNameDescription = actual.getName() + actual.getDescription();
		
		return expectedNameDescription.compareTo(actualNameDescription);
	}

	public void normalize(List<Algorithm> algorithms){
		Comparator<Algorithm> comparator = new AlgorithmNormaliser();
		Collections.sort(algorithms, comparator);
	}
}
