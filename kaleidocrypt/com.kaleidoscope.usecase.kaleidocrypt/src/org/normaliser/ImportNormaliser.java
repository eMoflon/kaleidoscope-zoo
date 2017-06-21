package org.normaliser;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import CryptoAPIConfig.Import;


public class ImportNormaliser implements Comparator<Import> {
	@Override
	public int compare(Import expected, Import actual) {
		return expected.getValue().compareTo(actual.getValue());
	}

	public void normalize(List<Import> imports){
		Comparator<Import> comparator = new ImportNormaliser();
		Collections.sort(imports, comparator);
	}
}
