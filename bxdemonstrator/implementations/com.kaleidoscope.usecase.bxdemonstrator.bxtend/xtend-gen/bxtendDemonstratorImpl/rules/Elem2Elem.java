package bxtendDemonstratorImpl.rules;

import GridLanguage.GridLanguageFactory;
import GridLanguage.GridLanguagePackage;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.KitchenLanguagePackage;
import bxtendDemonstratorImpl.BasicElem;
import bxtendDemonstratorImpl.BxtendDemonstratorImplFactory;
import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.Transformation;
import bxtendDemonstratorImpl.rules.Continuation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class Elem2Elem {
  public final static Continuation CONTINUATION = new Continuation();
  
  protected Resource sourceModel;
  
  protected Resource targetModel;
  
  protected Resource corrModel;
  
  protected final GridLanguageFactory sourceFactory = GridLanguageFactory.eINSTANCE;
  
  protected final KitchenLanguageFactory targetFactory = KitchenLanguageFactory.eINSTANCE;
  
  protected final BxtendDemonstratorImplFactory corrFactory = BxtendDemonstratorImplFactory.eINSTANCE;
  
  protected final GridLanguagePackage sourcePackage = GridLanguagePackage.eINSTANCE;
  
  protected final KitchenLanguagePackage targetPackage = KitchenLanguagePackage.eINSTANCE;
  
  protected String ruleID;
  
  protected static Map<EObject, List<Corr>> elementsToCorr = CollectionLiterals.<EObject, List<Corr>>newHashMap();
  
  public Elem2Elem(final Resource src, final Resource trgt, final Resource corr) {
    this.sourceModel = src;
    this.targetModel = trgt;
    this.corrModel = corr;
    this.ruleID = "base";
    EObject _get = this.corrModel.getContents().get(0);
    final Consumer<Corr> _function = (Corr c) -> {
      List<Corr> _get_1 = Elem2Elem.elementsToCorr.get(c.getSourceElement());
      final List<Corr> sourceCorrList = ((List<Corr>) _get_1);
      if ((sourceCorrList == null)) {
        ArrayList<Corr> newCorrList = CollectionLiterals.<Corr>newArrayList();
        newCorrList.add(c);
        Elem2Elem.elementsToCorr.put(c.getSourceElement(), newCorrList);
      } else {
        sourceCorrList.add(c);
      }
      List<Corr> _get_2 = Elem2Elem.elementsToCorr.get(c.getTargetElement());
      final List<Corr> targetCorrList = ((List<Corr>) _get_2);
      if ((targetCorrList == null)) {
        ArrayList<Corr> newCorrList_1 = CollectionLiterals.<Corr>newArrayList();
        newCorrList_1.add(c);
        Elem2Elem.elementsToCorr.put(c.getTargetElement(), newCorrList_1);
      } else {
        targetCorrList.add(c);
      }
    };
    ((Transformation) _get).getCorrespondences().forEach(_function);
  }
  
  public void sourceToTarget(final String s) {
  }
  
  public void targetToSource(final String s) {
  }
  
  public List<Corr> getCorrModelElem(final EObject obj) {
    return Elem2Elem.elementsToCorr.get(obj);
  }
  
  public Corr getCorrModelElement(final EObject obj, final String description) {
    List<Corr> corr = this.getCorrModelElem(obj);
    if ((corr == null)) {
      return null;
    }
    final Function1<Corr, Boolean> _function = (Corr c) -> {
      return Boolean.valueOf(c.getDesc().equals(description));
    };
    return IterableExtensions.<Corr>findFirst(corr, _function);
  }
  
  public Corr getOrCreateCorrModelElement(final EObject obj, final String description) {
    List<Corr> corrList = this.getCorrModelElem(obj);
    if ((corrList == null)) {
      ArrayList<Corr> _arrayList = new ArrayList<Corr>();
      corrList = _arrayList;
    }
    final Function1<Corr, Boolean> _function = (Corr c) -> {
      return Boolean.valueOf(c.getDesc().equals(description));
    };
    Corr corr = IterableExtensions.<Corr>findFirst(corrList, _function);
    if ((corr == null)) {
      BasicElem _createBasicElem = this.corrFactory.createBasicElem();
      final Procedure1<BasicElem> _function_1 = (BasicElem it) -> {
        EPackage _ePackage = obj.eClass().getEPackage();
        if ((_ePackage instanceof GridLanguagePackage)) {
          it.setSourceElement(obj);
        }
        EPackage _ePackage_1 = obj.eClass().getEPackage();
        if ((_ePackage_1 instanceof KitchenLanguagePackage)) {
          it.setTargetElement(obj);
        }
        it.setDesc(description);
      };
      BasicElem _doubleArrow = ObjectExtensions.<BasicElem>operator_doubleArrow(_createBasicElem, _function_1);
      corr = _doubleArrow;
      EObject _get = this.corrModel.getContents().get(0);
      EList<Corr> _correspondences = ((Transformation) _get).getCorrespondences();
      _correspondences.add(corr);
      corrList.add(corr);
      Elem2Elem.elementsToCorr.put(corr.getSourceElement(), corrList);
      Elem2Elem.elementsToCorr.put(corr.getTargetElement(), corrList);
    }
    return corr;
  }
  
  public EObject createSourceElement(final EClass clazz) {
    return this.sourceFactory.create(clazz);
  }
  
  public EObject createTargetElement(final EClass clazz) {
    return this.targetFactory.create(clazz);
  }
  
  public EObject getOrCreateSourceElem(final Corr corr, final EClass clazz) {
    EObject source = corr.getSourceElement();
    EObject _sourceElement = corr.getSourceElement();
    boolean _tripleEquals = (_sourceElement == null);
    if (_tripleEquals) {
      source = this.createSourceElement(clazz);
      corr.setSourceElement(source);
      List<Corr> corrList = this.getCorrModelElem(corr.getSourceElement());
      if ((corrList == null)) {
        ArrayList<Corr> _arrayList = new ArrayList<Corr>();
        corrList = _arrayList;
      }
      corrList.add(corr);
      Elem2Elem.elementsToCorr.put(corr.getSourceElement(), corrList);
    }
    return source;
  }
  
  public EObject getOrCreateTargetElem(final Corr corr, final EClass clazz) {
    EObject target = corr.getTargetElement();
    if ((target == null)) {
      target = this.createTargetElement(clazz);
      corr.setTargetElement(target);
      List<Corr> corrList = this.getCorrModelElem(corr.getTargetElement());
      if ((corrList == null)) {
        ArrayList<Corr> _arrayList = new ArrayList<Corr>();
        corrList = _arrayList;
      }
      corrList.add(corr);
      Elem2Elem.elementsToCorr.put(corr.getTargetElement(), corrList);
    }
    return target;
  }
}
