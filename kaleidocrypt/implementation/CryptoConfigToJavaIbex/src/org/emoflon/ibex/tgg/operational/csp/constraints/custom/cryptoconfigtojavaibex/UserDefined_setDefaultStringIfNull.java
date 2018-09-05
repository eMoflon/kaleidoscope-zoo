package org.emoflon.ibex.tgg.operational.csp.constraints.custom.cryptoconfigtojavaibex;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;

public class UserDefined_setDefaultStringIfNull extends RuntimeTGGAttributeConstraint {

	/**
	 * Constraint setDefaultStringIfNull(v0)
	 * 
	 * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	 */
	@Override
	public void solve() {
		String bindingStates = getBindingStates(variables.get(0), variables.get(1));

		switch (bindingStates) {
		case "BB":
			setSatisfied(true);
			return;
		case "FB":
			if (variables.get(0).getValue() == null)
				variables.get(0).bindToValue(variables.get(1).getValue());
			setSatisfied(true);
			return;
		case "FF":
			variables.get(0).bindToValue(generateValue(variables.get(0).getType()));
			variables.get(1).bindToValue(generateValue(variables.get(1).getType()));
			setSatisfied(true);
			return;
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}
