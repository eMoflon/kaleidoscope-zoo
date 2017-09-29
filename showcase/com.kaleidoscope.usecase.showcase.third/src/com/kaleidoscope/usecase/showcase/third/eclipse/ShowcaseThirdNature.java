package com.kaleidoscope.usecase.showcase.third.eclipse;

public class ShowcaseThirdNature extends com.kaleidoscope.usecase.showcase.first.eclipse.ShowcaseFirstNature{

	public final static String SHOWCASE_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.third.nature";
	public final static String SHOWCASE_API_BUILDER_ID = "com.kaleidoscope.usecase.showcase.third.builder";
	
	
	@Override
	public String getShowcaseApiBuilderID() {
		return SHOWCASE_API_BUILDER_ID;
	}
	
	@Override
	public String getShowcaseApiNatureID() {
		return SHOWCASE_API_NATURE_ID;
	}
	

	
}
