/**
 * 
 */
package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse;

import com.kaleidoscope.usecase.showcase.first.eclipse.ShowcaseFirstNature;

/**
 * @author Srijani
 *
 */
public class ShowcaseXmlExcelNature extends ShowcaseFirstNature {
	public static final String SHOWCASE_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.xmlexcel.nature";
	public static final String SHOWCASE_API_BUILDER_ID = "com.kaleidoscope.usecase.showcase.xmlexcel.builder";
	
	public String getShowcaseApiBuilderID() {
		return SHOWCASE_API_BUILDER_ID;
	}
	
	
	public String getShowcaseApiNatureID() {
		return SHOWCASE_API_NATURE_ID;
	}	
}
