package com.kaleidoscope.usecase.kaleidocrypt.emoflon.csp.constraints;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class NameModePadding extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1, Variable var_2, Variable var_3){
    	String bindingStates = getBindingStates(var_0, var_1, var_2, var_3);
    	
    	switch(bindingStates){
    	case "BBBF":
    		// TODO Implement BBBF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FFFB":
    		// TODO Implement FFFB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "BBBB":
    		// TODO Implement BBBB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FFFF":
    		// TODO Implement FFFF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}