package bxtendDemonstratorImpl.rules;

import GridLanguage.Grid;
import GridLanguage.GridLanguagePackage;
import GridLanguage.Group;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguagePackage;
import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.rules.BxtendDemonstratorImplTransformation;
import bxtendDemonstratorImpl.rules.Elem2Elem;
import com.google.common.collect.Iterators;
import java.util.UUID;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Socket2Group extends Elem2Elem {
  public Socket2Group(final Resource src, final Resource trgt, final Resource corr) {
    super(src, trgt, corr);
  }
  
  @Override
  public void sourceToTarget(final String s) {
    final Function1<Group, Boolean> _function = (Group g) -> {
      return Boolean.valueOf(((g.eContainer() instanceof Grid) && (this.getCorrModelElement(g.eContainer(), BxtendDemonstratorImplTransformation.grid2Kitchen).getTargetElement() instanceof Kitchen)));
    };
    final Procedure1<Group> _function_1 = (Group g) -> {
      final Corr corrTarget = this.getOrCreateCorrModelElement(g, BxtendDemonstratorImplTransformation.socket2Group);
      EObject _orCreateTargetElem = this.getOrCreateTargetElem(corrTarget, KitchenLanguagePackage.eINSTANCE.getItemSocket());
      final ItemSocket targetItemSocket = ((ItemSocket) _orCreateTargetElem);
      boolean _equals = targetItemSocket.getId().equals("");
      if (_equals) {
        targetItemSocket.setId(UUID.randomUUID().toString());
      }
      EObject _get = this.targetModel.getContents().get(0);
      Kitchen kitchen = ((Kitchen) _get);
      kitchen.getItemSockets().add(targetItemSocket);
    };
    IteratorExtensions.<Group>forEach(IteratorExtensions.<Group>filter(Iterators.<Group>filter(this.sourceModel.getAllContents(), Group.class), _function), _function_1);
  }
  
  @Override
  public void targetToSource(final String s) {
    final Function1<ItemSocket, Boolean> _function = (ItemSocket g) -> {
      return Boolean.valueOf(((g.eContainer() instanceof Kitchen) && (this.getCorrModelElement(g.eContainer(), BxtendDemonstratorImplTransformation.grid2Kitchen).getSourceElement() instanceof Grid)));
    };
    final Procedure1<ItemSocket> _function_1 = (ItemSocket i) -> {
      final Corr corrTarget = this.getOrCreateCorrModelElement(i, BxtendDemonstratorImplTransformation.socket2Group);
      EObject _orCreateSourceElem = this.getOrCreateSourceElem(corrTarget, GridLanguagePackage.eINSTANCE.getGroup());
      final Group groupElement = ((Group) _orCreateSourceElem);
      EObject _sourceElement = this.getCorrModelElement(i.eContainer(), BxtendDemonstratorImplTransformation.grid2Kitchen).getSourceElement();
      final Grid grid = ((Grid) _sourceElement);
      grid.getGroups().add(groupElement);
    };
    IteratorExtensions.<ItemSocket>forEach(IteratorExtensions.<ItemSocket>filter(Iterators.<ItemSocket>filter(this.targetModel.getAllContents(), ItemSocket.class), _function), _function_1);
  }
}
