package bxtendDemonstratorImpl.rules;

import GridLanguage.Block;
import bxtendDemonstratorImpl.BxtendDemonstratorImplFactory;
import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.rules.Elem2Elem;
import bxtendDemonstratorImpl.rules.Grid2Kitchen;
import bxtendDemonstratorImpl.rules.Item2Group;
import bxtendDemonstratorImpl.rules.Socket2Group;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class BxtendDemonstratorImplTransformation {
  private Resource sourceModel;
  
  private Resource targetModel;
  
  private Resource corrModel;
  
  private List<Elem2Elem> rules = new ArrayList<Elem2Elem>();
  
  public final static String FWD_DIRECTION = "FWD";
  
  public final static String BWD_DIRECTION = "BWD";
  
  public final static String item2FirstBlock = "item2FirstBlock";
  
  public final static String item2SecondBlock = "item2SecondBlock";
  
  public final static String grid2Kitchen = "Grid2Kitchen";
  
  public final static String socket2Group = "socket2Group";
  
  public BxtendDemonstratorImplTransformation(final URI source, final URI target, final URI correspondence) {
    final ResourceSet set = new ResourceSetImpl();
    this.sourceModel = set.getResource(source, true);
    this.targetModel = set.getResource(target, true);
    this.corrModel = set.getResource(correspondence, true);
    int _size = this.corrModel.getContents().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.corrModel.getContents().add(BxtendDemonstratorImplFactory.eINSTANCE.createTransformation());
    }
  }
  
  public BxtendDemonstratorImplTransformation(final Resource source, final Resource target, final Resource correspondence) {
    this.sourceModel = source;
    this.targetModel = target;
    this.corrModel = correspondence;
    int _size = this.corrModel.getContents().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.corrModel.getContents().add(BxtendDemonstratorImplFactory.eINSTANCE.createTransformation());
    }
    this.addRules();
  }
  
  /**
   * Fuegt alle Regeln zum rules-Set hinzu. Sollte im Konstruktor aufgerufen werden.
   */
  private void addRules() {
    boolean _isEmpty = this.corrModel.getContents().isEmpty();
    if (_isEmpty) {
      this.corrModel.getContents().add(BxtendDemonstratorImplFactory.eINSTANCE.createTransformation());
    }
    Grid2Kitchen _grid2Kitchen = new Grid2Kitchen(this.sourceModel, this.targetModel, this.corrModel);
    this.rules.add(_grid2Kitchen);
    Socket2Group _socket2Group = new Socket2Group(this.sourceModel, this.targetModel, this.corrModel);
    this.rules.add(_socket2Group);
    Item2Group _item2Group = new Item2Group(this.sourceModel, this.targetModel, this.corrModel);
    this.rules.add(_item2Group);
  }
  
  public void sourceToTarget() {
    int _size = this.sourceModel.getContents().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      for (final Elem2Elem e : this.rules) {
        e.sourceToTarget("Import");
      }
    }
    this.deleteUnreferencedTargetElements();
  }
  
  public void targetToSource() {
    int _size = this.targetModel.getContents().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      for (final Elem2Elem e : this.rules) {
        e.targetToSource("Import");
      }
    }
    this.deleteUnreferencedSourceElements();
  }
  
  public boolean checkCorrespondences() {
    return true;
  }
  
  public Iterator<Corr> detectSourceDeletions() {
    final Function1<Corr, Boolean> _function = (Corr c) -> {
      EObject _sourceElement = c.getSourceElement();
      return Boolean.valueOf(Objects.equal(_sourceElement, null));
    };
    return IteratorExtensions.<Corr>filter(Iterators.<Corr>filter(this.corrModel.getAllContents(), Corr.class), _function);
  }
  
  public Iterator<Corr> detectTargetDeletions() {
    final Function1<Corr, Boolean> _function = (Corr c) -> {
      EObject _targetElement = c.getTargetElement();
      return Boolean.valueOf(Objects.equal(_targetElement, null));
    };
    return IteratorExtensions.<Corr>filter(Iterators.<Corr>filter(this.corrModel.getAllContents(), Corr.class), _function);
  }
  
  public void deleteUnreferencedTargetElements() {
    final List<EObject> deletionList = CollectionLiterals.<EObject>newArrayList();
    final Procedure1<Corr> _function = (Corr c) -> {
      EObject _targetElement = c.getTargetElement();
      deletionList.add(_targetElement);
      deletionList.add(c);
    };
    IteratorExtensions.<Corr>forEach(this.detectSourceDeletions(), _function);
    final Consumer<EObject> _function_1 = (EObject e) -> {
      EcoreUtil.delete(e, true);
    };
    deletionList.forEach(_function_1);
  }
  
  public void deleteUnreferencedSourceElements() {
    final List<EObject> deletionList = CollectionLiterals.<EObject>newArrayList();
    final Procedure1<Corr> _function = (Corr c) -> {
      EObject _sourceElement = c.getSourceElement();
      boolean _not = (!(_sourceElement instanceof Block));
      if (_not) {
        EObject _sourceElement_1 = c.getSourceElement();
        deletionList.add(_sourceElement_1);
      }
      deletionList.add(c);
    };
    IteratorExtensions.<Corr>forEach(this.detectTargetDeletions(), _function);
    final Consumer<EObject> _function_1 = (EObject e) -> {
      EcoreUtil.delete(e, true);
    };
    deletionList.forEach(_function_1);
  }
}
