package com.kaleidoscope.usecase.kaleidocrypt.emoflon.csp.constraints;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class SetDefaultStringIfNull extends TGGConstraintImpl {
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		// TODO Implement BB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FB":
    		// TODO Implement FB-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	case "FF":
    		// TODO Implement FF-operation
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}