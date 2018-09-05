package org.emoflon.ibex.tgg.operational.csp.constraints.custom.cryptoconfigtojavaibex;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;

public class UserDefined_nameModePadding extends RuntimeTGGAttributeConstraint
{
	public void solve() {
		String bindingStates = getBindingStates(variables.get(0), variables.get(1), variables.get(2), variables.get(3));

		String name;
		
		switch (bindingStates) {
		case "BBBB":
		{
			name = (String) variables.get(0).getValue();
			String mode = (String) variables.get(1).getValue();
			String padding = (String) variables.get(2).getValue();
			String oldNameModePadding = (String) variables.get(3).getValue();
			String nameModePadding = "\"" + name + "/" + mode + "/" + padding + "\"";
			setSatisfied(nameModePadding.equals(oldNameModePadding));
			break;
		}
		case "BBBF":
		{
			name = (String) variables.get(0).getValue();
			String mode = (String) variables.get(1).getValue();
			String padding = (String) variables.get(2).getValue();
			String nameModePadding = "\"" + name + "/" + mode + "/" + padding + "\"";
			variables.get(3).bindToValue(nameModePadding);
			setSatisfied(true);
			break;
		}
		case "FFFB":
		{
			String nameModePadding = (String) variables.get(3).getValue();
			nameModePadding = nameModePadding.replaceAll("\"", "");
			String[] parts = nameModePadding.split("/");
			name = parts[0];
			String mode = parts[1];
			String padding = parts[2];

			variables.get(0).bindToValue(name);
			variables.get(1).bindToValue(mode);
			variables.get(2).bindToValue(padding);

			setSatisfied(true);
			break;
		}
		default:
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}

	}
}