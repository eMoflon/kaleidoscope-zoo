package bxtendDemonstratorImpl.rules

import java.util.HashMap
import java.util.List
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList

public class Continuation {
	private Optional<String> continationDecision = Optional.empty();
	private Optional<List<String>> continationChoices = Optional.of(new ArrayList<String>());
	private Optional<HashMap<String, EObject>> context = Optional.empty();
	private Optional<(HashMap<String, EObject>, String)=> void> function = Optional.empty();
	
	def Continuation(){
		
	}
	def public void executeFunction(){
		function.ifPresent(f | f.apply(context.get, decision.get))
	}
	def public boolean hasContinuation(){
		return continationChoices.get().size() > 0;
	}
	
	
	
	def public void setDecision(String decision){
		continationDecision = Optional.of(decision);
	}
	def public Optional<String> getDecision(){
		return continationDecision;
	}
	
	def public void setChoices(List<String>choices){
		continationChoices = Optional.of(choices);
	}
	
	def public Optional<List<String>> getChoices(){
		return continationChoices;
	}
	def public void clear(){
		continationDecision = Optional.empty();
		continationChoices = Optional.of(new ArrayList<String>());
		context = Optional.empty();
		function = Optional.empty();
	}
	
	def public void setContext(HashMap<String, EObject> context){
		this.context = Optional.of(context);
	}
	def public Optional<HashMap<String, EObject>> getContext(){
		return context;
	}
	
	def public void setFunction((HashMap<String, EObject>, String)=> void function){
		this.function = Optional.of(function);
	}
}
