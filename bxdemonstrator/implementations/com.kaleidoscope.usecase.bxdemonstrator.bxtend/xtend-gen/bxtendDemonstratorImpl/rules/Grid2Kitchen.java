package bxtendDemonstratorImpl.rules;

import GridLanguage.Grid;
import GridLanguage.GridLanguagePackage;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguagePackage;
import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.rules.BxtendDemonstratorImplTransformation;
import bxtendDemonstratorImpl.rules.Elem2Elem;
import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Grid2Kitchen extends Elem2Elem {
  public Grid2Kitchen(final Resource src, final Resource trgt, final Resource corr) {
    super(src, trgt, corr);
  }
  
  @Override
  public void sourceToTarget(final String s) {
    final Procedure1<Grid> _function = (Grid g) -> {
      final Corr corrTarget = this.getOrCreateCorrModelElement(g, BxtendDemonstratorImplTransformation.grid2Kitchen);
      EObject _orCreateTargetElem = this.getOrCreateTargetElem(corrTarget, KitchenLanguagePackage.eINSTANCE.getKitchen());
      final Kitchen targetElement = ((Kitchen) _orCreateTargetElem);
      double _blockSize = g.getBlockSize();
      boolean _equals = (_blockSize == 0);
      if (_equals) {
        g.setBlockSize(100);
      }
      double _xSize = targetElement.getXSize();
      boolean _equals_1 = (_xSize == 0);
      if (_equals_1) {
        targetElement.setXSize(500);
      }
      double _ySize = targetElement.getYSize();
      boolean _equals_2 = (_ySize == 0);
      if (_equals_2) {
        targetElement.setYSize(500);
      }
      boolean _contains = this.targetModel.getContents().contains(targetElement);
      boolean _not = (!_contains);
      if (_not) {
        this.targetModel.getContents().add(targetElement);
      }
    };
    IteratorExtensions.<Grid>forEach(Iterators.<Grid>filter(this.sourceModel.getAllContents(), Grid.class), _function);
  }
  
  @Override
  public void targetToSource(final String s) {
    final Procedure1<Kitchen> _function = (Kitchen k) -> {
      final Corr corrTarget = this.getOrCreateCorrModelElement(k, BxtendDemonstratorImplTransformation.grid2Kitchen);
      EObject _orCreateSourceElem = this.getOrCreateSourceElem(corrTarget, GridLanguagePackage.eINSTANCE.getGrid());
      final Grid targetElement = ((Grid) _orCreateSourceElem);
      double _blockSize = targetElement.getBlockSize();
      boolean _equals = (_blockSize == 0);
      if (_equals) {
        targetElement.setBlockSize(100);
      }
      double _xSize = k.getXSize();
      boolean _equals_1 = (_xSize == 0);
      if (_equals_1) {
        k.setXSize(100);
      }
      double _ySize = k.getYSize();
      boolean _equals_2 = (_ySize == 0);
      if (_equals_2) {
        k.setYSize(100);
      }
    };
    IteratorExtensions.<Kitchen>forEach(Iterators.<Kitchen>filter(this.targetModel.getAllContents(), Kitchen.class), _function);
  }
}
