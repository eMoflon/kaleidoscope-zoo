package CryptoConfigToJava.csp.constraints;


import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;
public class NameModePadding extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1, Variable var_2, Variable var_3){
    	String bindingStates = getBindingStates(var_0, var_1, var_2, var_3);
    	String nameModePadding = null;
    	String name = null;
    	String mode = null;
    	String padding = null;
    	
    	switch(bindingStates){
    	case "BBBB":
    		name = (String) var_0.getValue () ;
    		mode = (String) var_1.getValue () ;
    		padding = (String) var_2.getValue();
    		String oldNameModePadding = (String) var_3.getValue();
    		nameModePadding = "\"" + name + "/" + mode + "/" + padding + "\""; 
    		setSatisfied(nameModePadding.equals(oldNameModePadding));
    		break;
    		
    	case "BBBF":
    		name = (String) var_0.getValue () ;
    		mode = (String) var_1.getValue () ;
    		padding = ( String ) var_2 . getValue () ;
    		nameModePadding = "\"" + name + "/" + mode + "/" + padding + "\"";
    		var_3.bindToValue(nameModePadding); 
    		setSatisfied(true);
    		break;
    	case "FFFB":
    		nameModePadding = (String) var_3 . getValue () ;
    		nameModePadding = nameModePadding.replaceAll("\"", "");
    		String[] parts = nameModePadding.split("/");
    		name = parts[0];
    		mode = parts[1];
    		padding = parts[2];
    		
    		var_0.bindToValue(name);
    		var_1.bindToValue(mode);
    		var_2.bindToValue(padding);
    		
    		setSatisfied(true);
    		break;
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}