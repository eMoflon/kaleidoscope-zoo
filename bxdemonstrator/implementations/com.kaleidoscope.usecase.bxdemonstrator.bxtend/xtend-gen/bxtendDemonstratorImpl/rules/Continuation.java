package bxtendDemonstratorImpl.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class Continuation {
  private Optional<String> continationDecision = Optional.<String>empty();
  
  private Optional<List<String>> continationChoices = Optional.<List<String>>of(new ArrayList<String>());
  
  private Optional<HashMap<String, EObject>> context = Optional.<HashMap<String, EObject>>empty();
  
  private Optional<Procedure2<? super HashMap<String, EObject>, ? super String>> function = Optional.<Procedure2<? super HashMap<String, EObject>, ? super String>>empty();
  
  public Object Continuation() {
    return null;
  }
  
  public void executeFunction() {
    final Consumer<Procedure2<? super HashMap<String, EObject>, ? super String>> _function = (Procedure2<? super HashMap<String, EObject>, ? super String> f) -> {
      f.apply(this.context.get(), this.getDecision().get());
    };
    this.function.ifPresent(_function);
  }
  
  public boolean hasContinuation() {
    int _size = this.continationChoices.get().size();
    return (_size > 0);
  }
  
  public void setDecision(final String decision) {
    this.continationDecision = Optional.<String>of(decision);
  }
  
  public Optional<String> getDecision() {
    return this.continationDecision;
  }
  
  public void setChoices(final List<String> choices) {
    this.continationChoices = Optional.<List<String>>of(choices);
  }
  
  public Optional<List<String>> getChoices() {
    return this.continationChoices;
  }
  
  public void clear() {
    this.continationDecision = Optional.<String>empty();
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.continationChoices = Optional.<List<String>>of(_arrayList);
    this.context = Optional.<HashMap<String, EObject>>empty();
    this.function = Optional.<Procedure2<? super HashMap<String, EObject>, ? super String>>empty();
  }
  
  public void setContext(final HashMap<String, EObject> context) {
    this.context = Optional.<HashMap<String, EObject>>of(context);
  }
  
  public Optional<HashMap<String, EObject>> getContext() {
    return this.context;
  }
  
  public void setFunction(final Procedure2<? super HashMap<String, EObject>, ? super String> function) {
    this.function = Optional.<Procedure2<? super HashMap<String, EObject>, ? super String>>of(function);
  }
}
