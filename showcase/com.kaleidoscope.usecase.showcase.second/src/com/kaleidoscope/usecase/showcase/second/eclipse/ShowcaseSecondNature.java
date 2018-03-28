package com.kaleidoscope.usecase.showcase.second.eclipse;

import com.kaleidoscope.usecase.showcase.first.eclipse.ShowcaseFirstNature;

public class ShowcaseSecondNature extends ShowcaseFirstNature {

	public static final String SHOWCASE_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.second.nature";
	public static final String SHOWCASE_API_BUILDER_ID = "com.kaleidoscope.usecase.showcase.second.builder";
	
	public String getShowcaseApiBuilderID() {
		return SHOWCASE_API_BUILDER_ID;
	}
	
	
	public String getShowcaseApiNatureID() {
		return SHOWCASE_API_NATURE_ID;
	}
}
