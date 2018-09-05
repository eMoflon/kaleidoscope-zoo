package org.emoflon.ibex.tgg.operational.csp.constraints.factories.cryptoconfigtojavaibex;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.cryptoconfigtojavaibex.UserDefined_nameModePadding;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.cryptoconfigtojavaibex.UserDefined_setDefaultStringIfNull;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("nameModePadding", () -> new UserDefined_nameModePadding());
		creators.put("setDefaultStringIfNull", () -> new UserDefined_setDefaultStringIfNull());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
