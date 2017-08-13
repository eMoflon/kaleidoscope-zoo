package bxtendDemonstratorImpl.rules;

import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.rules.Continuation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class Elem2Elem {
  public final static Continuation CONTINUATION = new Continuation();
  
  protected Resource sourceModel;
  
  protected Resource targetModel;
  
  protected Resource corrModel;
  
  protected final Object sourceFactory /* Skipped initializer because of errors */;
  
  protected final Object targetFactory /* Skipped initializer because of errors */;
  
  protected final Object corrFactory /* Skipped initializer because of errors */;
  
  protected final Object sourcePackage /* Skipped initializer because of errors */;
  
  protected final Object targetPackage /* Skipped initializer because of errors */;
  
  protected /* String */Object ruleID;
  
  protected static /* Map<EObject, List<Corr>> */Object elementsToCorr /* Skipped initializer because of errors */;
  
  public Elem2Elem(final Resource src, final Resource trgt, final Resource corr) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\nList cannot be resolved to a type."
      + "\nThe method forEach((Object)=>Object) is undefined for the type EList<Corr>"
      + "\nThe method get(int) is undefined for the type EList<EObject>"
      + "\nThe method or field sourceElement is undefined for the type Object"
      + "\nThe method or field newArrayList is undefined"
      + "\nThe method or field sourceElement is undefined for the type Object"
      + "\nThe method or field targetElement is undefined for the type Object"
      + "\nThe method or field newArrayList is undefined"
      + "\nThe method or field targetElement is undefined for the type Object"
      + "\nThe field Elem2Elem.ruleID refers to the missing type String"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nget cannot be resolved"
      + "\n== cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nput cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nget cannot be resolved"
      + "\n== cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nput cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  public void sourceToTarget(final /* String */Object s) {
  }
  
  public void targetToSource(final /* String */Object s) {
  }
  
  public Object getCorrModelElem(final EObject obj) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nget cannot be resolved");
  }
  
  public java.lang.Object getCorrModelElement(final EObject obj, final /* String */Object description) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\nThe method or field desc is undefined for the type Object"
      + "\nThe method getCorrModelElem(EObject) from the type Elem2Elem refers to the missing type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\n== cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\nequals cannot be resolved");
  }
  
  public Object getOrCreateCorrModelElement(final EObject obj, final /* String */Object description) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\nGridLanguagePackage cannot be resolved to a type."
      + "\nKitchenLanguagePackage cannot be resolved to a type."
      + "\nArrayList cannot be resolved."
      + "\nThe method or field desc is undefined for the type Object"
      + "\nThe method sourceElement(EObject) is undefined"
      + "\nThe method targetElement(EObject) is undefined"
      + "\nThe method desc(String) is undefined"
      + "\n+= cannot be resolved."
      + "\nThe method get(int) is undefined for the type EList<EObject>"
      + "\nThe method getCorrModelElem(EObject) from the type Elem2Elem refers to the missing type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe field Elem2Elem.corrFactory refers to the missing type Object"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\n== cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncreateBasicElem cannot be resolved"
      + "\n=> cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nput cannot be resolved"
      + "\nsourceElement cannot be resolved"
      + "\nput cannot be resolved"
      + "\ntargetElement cannot be resolved");
  }
  
  public Object createSourceElement(final EClass clazz) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Elem2Elem.sourceFactory refers to the missing type Object"
      + "\ncreate cannot be resolved");
  }
  
  public Object createTargetElement(final EClass clazz) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field Elem2Elem.targetFactory refers to the missing type Object"
      + "\ncreate cannot be resolved");
  }
  
  public EObject getOrCreateSourceElem(final Corr corr, final EClass clazz) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\n== cannot be resolved."
      + "\nArrayList cannot be resolved."
      + "\nThe method createSourceElement(EClass) from the type Elem2Elem refers to the missing type Object"
      + "\nThe method getCorrModelElem(EObject) from the type Elem2Elem refers to the missing type Object"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\n== cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nput cannot be resolved");
  }
  
  public EObject getOrCreateTargetElem(final Corr corr, final EClass clazz) {
    throw new Error("Unresolved compilation problems:"
      + "\nList cannot be resolved to a type."
      + "\n== cannot be resolved."
      + "\nArrayList cannot be resolved."
      + "\nThe method createTargetElement(EClass) from the type Elem2Elem refers to the missing type Object"
      + "\nThe method getCorrModelElem(EObject) from the type Elem2Elem refers to the missing type Object"
      + "\nThe field Elem2Elem.elementsToCorr refers to the missing type Map"
      + "\n== cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nput cannot be resolved");
  }
}
