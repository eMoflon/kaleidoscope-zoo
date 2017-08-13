package bxtendDemonstratorImpl.rules;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.Group;
import KitchenLanguage.Fridge;
import KitchenLanguage.Item;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.Sink;
import KitchenLanguage.Table;
import bxtendDemonstratorImpl.Corr;
import bxtendDemonstratorImpl.rules.BxtendDemonstratorImplTransformation;
import bxtendDemonstratorImpl.rules.Elem2Elem;
import bxtendDemonstratorImpl.rules.SynchronizationError;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class Item2Group extends Elem2Elem {
  protected String ruleID = "item2group";
  
  public Item2Group(final Resource src, final Resource trgt, final Resource corr) {
    super(src, trgt, corr);
  }
  
  public boolean checkIfBlockIsOccupiedByOtherGroup(final Grid grid, final Group group, final Block block) {
    final Function1<Group, Boolean> _function = (Group g) -> {
      boolean _equals = g.equals(group);
      return Boolean.valueOf((!_equals));
    };
    final Function1<Group, Boolean> _function_1 = (Group g) -> {
      EList<Block> _occupies = g.getOccupies();
      return Boolean.valueOf(Objects.equal(_occupies, block));
    };
    return IterableExtensions.<Group>exists(IterableExtensions.<Group>filter(grid.getGroups(), _function), _function_1);
  }
  
  public boolean chkAddHorzTableToCorrGroupPsbl(final Grid grid, final Block firstBlock, final Block secondBlock) {
    if (((!Objects.equal(firstBlock.getE(), secondBlock)) && (!Objects.equal(secondBlock.getE(), firstBlock)))) {
      return false;
    }
    return true;
  }
  
  public boolean chkAddVertTableToCorrGroupPsbl(final Grid grid, final Block firstBlock, final Block secondBlock) {
    if (((!Objects.equal(firstBlock.getS(), secondBlock)) && (!Objects.equal(secondBlock.getS(), firstBlock)))) {
      return false;
    }
    return true;
  }
  
  public boolean chkAddFridgeToCorrGroupPsbl(final Grid grid, final Block firstBlock, final Block secondBlock) {
    if (((!Objects.equal(firstBlock.getS(), secondBlock)) && (!Objects.equal(secondBlock.getS(), firstBlock)))) {
      return false;
    }
    Block _n = firstBlock.getN();
    boolean _tripleNotEquals = (_n != null);
    if (_tripleNotEquals) {
      return false;
    }
    return true;
  }
  
  public boolean chkAddSinkToCorrGroupPsbl(final Grid grid, final Block firstBlock, final Block secondBlock) {
    if (((!Objects.equal(firstBlock.getE(), secondBlock)) && (!Objects.equal(secondBlock.getE(), firstBlock)))) {
      return false;
    }
    Block _w = firstBlock.getW();
    boolean _tripleNotEquals = (_w != null);
    if (_tripleNotEquals) {
      return false;
    }
    return true;
  }
  
  public boolean chkAddingCorrGroupToHrzTablePsbl(final Grid grid, final Table table, final Group corrGroup) {
    final Function1<Block, Boolean> _function = (Block b) -> {
      return Boolean.valueOf(((b.getXIndex() == (((int) table.getXPos()) / ((int) grid.getBlockSize()))) && 
        (b.getYIndex() == (((int) table.getYPos()) / ((int) grid.getBlockSize())))));
    };
    Block _findFirst = IterableExtensions.<Block>findFirst(grid.getBlocks(), _function);
    Block firstBlock = ((Block) _findFirst);
    if ((((firstBlock.getE() == null) || ((firstBlock.getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getIsOccupiedBy(), corrGroup)))) || ((firstBlock.getE().getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getE().getIsOccupiedBy(), corrGroup))))) {
      return false;
    }
    return true;
  }
  
  public boolean chkAddingCorrGroupToVertTablePsbl(final Grid grid, final Table table, final Group corrGroup) {
    final Function1<Block, Boolean> _function = (Block b) -> {
      return Boolean.valueOf(((b.getXIndex() == (((int) table.getXPos()) / ((int) grid.getBlockSize()))) && 
        (b.getYIndex() == (((int) table.getYPos()) / ((int) grid.getBlockSize())))));
    };
    Block _findFirst = IterableExtensions.<Block>findFirst(grid.getBlocks(), _function);
    Block firstBlock = ((Block) _findFirst);
    if ((((firstBlock.getS() == null) || ((firstBlock.getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getIsOccupiedBy(), corrGroup)))) || ((firstBlock.getS().getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getS().getIsOccupiedBy(), corrGroup))))) {
      return false;
    }
    return true;
  }
  
  @Override
  public void targetToSource(final String s) {
    final Function1<Item, Boolean> _function = (Item p) -> {
      EObject _eContainer = p.eContainer();
      return Boolean.valueOf((_eContainer instanceof ItemSocket));
    };
    final Procedure1<Item> _function_1 = (Item f) -> {
      EObject itemSocket = f.eContainer();
      Corr corrElement = this.getCorrModelElement(itemSocket, BxtendDemonstratorImplTransformation.socket2Group);
      EObject _sourceElement = corrElement.getSourceElement();
      Group corrGroup = ((Group) _sourceElement);
      EObject _get = this.sourceModel.getContents().get(0);
      Grid grid = ((Grid) _get);
      double _xPos = f.getXPos();
      double _blockSize = grid.getBlockSize();
      final int lookForXIndex = (((int) _xPos) / ((int) _blockSize));
      double _yPos = f.getYPos();
      double _blockSize_1 = grid.getBlockSize();
      final int lookForYIndex = (((int) _yPos) / ((int) _blockSize_1));
      final Function1<Block, Boolean> _function_2 = (Block b) -> {
        return Boolean.valueOf(((b.getXIndex() == lookForXIndex) && 
          (b.getYIndex() == lookForYIndex)));
      };
      Block _findFirst = IterableExtensions.<Block>findFirst(grid.getBlocks(), _function_2);
      Block firstBlock = ((Block) _findFirst);
      Corr firstBlockCorr = this.getOrCreateCorrModelElement(f, BxtendDemonstratorImplTransformation.item2FirstBlock);
      Corr secondBlockCorr = this.getOrCreateCorrModelElement(f, BxtendDemonstratorImplTransformation.item2SecondBlock);
      EObject _sourceElement_1 = firstBlockCorr.getSourceElement();
      Block oldFirstBlock = ((Block) _sourceElement_1);
      EObject _sourceElement_2 = secondBlockCorr.getSourceElement();
      Block oldSecondBlock = ((Block) _sourceElement_2);
      boolean _notEquals = (!Objects.equal(firstBlock, oldFirstBlock));
      if (_notEquals) {
        if (((oldFirstBlock != null) && (oldSecondBlock != null))) {
          oldFirstBlock.setIsOccupiedBy(null);
          oldSecondBlock.setIsOccupiedBy(null);
        }
        boolean _matched = false;
        if (f instanceof Sink) {
          _matched=true;
          if (((((firstBlock.getW() != null) || ((firstBlock.getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getIsOccupiedBy(), corrGroup)))) || (firstBlock.getE() == null)) || ((firstBlock.getE().getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getE().getIsOccupiedBy(), corrGroup))))) {
            throw new SynchronizationError();
          } else {
            firstBlockCorr.setSourceElement(firstBlock);
            secondBlockCorr.setSourceElement(firstBlock.getE());
            boolean _contains = corrGroup.getOccupies().contains(firstBlock);
            boolean _not = (!_contains);
            if (_not) {
              corrGroup.getOccupies().add(firstBlock);
            }
            boolean _contains_1 = corrGroup.getOccupies().contains(firstBlock.getE());
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              corrGroup.getOccupies().add(firstBlock.getE());
            }
          }
        }
        if (!_matched) {
          if (f instanceof Fridge) {
            _matched=true;
            if ((((((firstBlock.getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getIsOccupiedBy(), corrGroup))) || (firstBlock.getN() != null)) || 
              (firstBlock.getS() == null)) || ((firstBlock.getS().getIsOccupiedBy() != null) && (!Objects.equal(firstBlock.getS().getIsOccupiedBy(), corrGroup))))) {
              throw new SynchronizationError();
            } else {
              firstBlockCorr.setSourceElement(firstBlock);
              secondBlockCorr.setSourceElement(firstBlock.getS());
              boolean _contains = corrGroup.getOccupies().contains(firstBlock);
              boolean _not = (!_contains);
              if (_not) {
                corrGroup.getOccupies().add(firstBlock);
              }
              boolean _contains_1 = corrGroup.getOccupies().contains(firstBlock.getS());
              boolean _not_1 = (!_contains_1);
              if (_not_1) {
                corrGroup.getOccupies().add(firstBlock.getS());
              }
            }
          }
        }
        if (!_matched) {
          if (f instanceof Table) {
            _matched=true;
            if ((this.chkAddingCorrGroupToHrzTablePsbl(grid, ((Table) f), ((Group) corrGroup)) && 
              this.chkAddingCorrGroupToVertTablePsbl(grid, ((Table) f), ((Group) corrGroup)))) {
              Elem2Elem.CONTINUATION.setChoices(Arrays.<String>asList("create_a_horizontal_table", "create_a_vertical_table"));
              HashMap<String, EObject> functionContext = new HashMap<String, EObject>();
              functionContext.put("group", corrGroup);
              functionContext.put("firstBlock", firstBlock);
              functionContext.put("firstBlockCorr", firstBlockCorr);
              functionContext.put("secondBlockCorr", secondBlockCorr);
              Elem2Elem.CONTINUATION.setContext(functionContext);
              final Procedure2<HashMap<String, EObject>, String> _function_3 = (HashMap<String, EObject> context, String decision) -> {
                boolean _equals = decision.equals("create_a_horizontal_table");
                if (_equals) {
                  EObject _get_1 = context.get("group");
                  Group group = ((Group) _get_1);
                  EObject _get_2 = context.get("firstBlock");
                  Block firstBlockContext = ((Block) _get_2);
                  Block _e = firstBlockContext.getE();
                  Block secondBlockContext = ((Block) _e);
                  EObject _get_3 = context.get("firstBlockCorr");
                  Corr firstBlockCorrContext = ((Corr) _get_3);
                  EObject _get_4 = context.get("secondBlockCorr");
                  Corr secondBlockCorrContext = ((Corr) _get_4);
                  firstBlockCorrContext.setSourceElement(firstBlockContext);
                  secondBlockCorrContext.setSourceElement(secondBlockContext);
                  boolean _contains = group.getOccupies().contains(firstBlockContext);
                  boolean _not = (!_contains);
                  if (_not) {
                    group.getOccupies().add(firstBlockContext);
                  }
                  boolean _contains_1 = group.getOccupies().contains(secondBlockContext);
                  boolean _not_1 = (!_contains_1);
                  if (_not_1) {
                    group.getOccupies().add(secondBlockContext);
                  }
                } else {
                  boolean _equals_1 = decision.equals("create_a_vertical_table");
                  if (_equals_1) {
                    EObject _get_5 = context.get("group");
                    Group group_1 = ((Group) _get_5);
                    EObject _get_6 = context.get("firstBlock");
                    Block firstBlockContext_1 = ((Block) ((Block) _get_6));
                    Block _s = firstBlockContext_1.getS();
                    Block secondBlockContext_1 = ((Block) _s);
                    EObject _get_7 = context.get("firstBlockCorr");
                    Corr firstBlockCorrContext_1 = ((Corr) _get_7);
                    EObject _get_8 = context.get("secondBlockCorr");
                    Corr secondBlockCorrContext_1 = ((Corr) _get_8);
                    firstBlockCorrContext_1.setSourceElement(firstBlockContext_1);
                    secondBlockCorrContext_1.setSourceElement(secondBlockContext_1);
                    boolean _contains_2 = group_1.getOccupies().contains(firstBlockContext_1);
                    boolean _not_2 = (!_contains_2);
                    if (_not_2) {
                      group_1.getOccupies().add(firstBlockContext_1);
                    }
                    boolean _contains_3 = group_1.getOccupies().contains(secondBlockContext_1);
                    boolean _not_3 = (!_contains_3);
                    if (_not_3) {
                      group_1.getOccupies().add(secondBlockContext_1);
                    }
                  }
                }
                return;
              };
              final Procedure2<HashMap<String, EObject>, String> continuationFunction = _function_3;
              Elem2Elem.CONTINUATION.setFunction(continuationFunction);
            } else {
              boolean _chkAddingCorrGroupToHrzTablePsbl = this.chkAddingCorrGroupToHrzTablePsbl(grid, ((Table) f), ((Group) corrGroup));
              if (_chkAddingCorrGroupToHrzTablePsbl) {
                firstBlockCorr.setSourceElement(firstBlock);
                secondBlockCorr.setSourceElement(firstBlock.getE());
                boolean _contains = corrGroup.getOccupies().contains(firstBlock);
                boolean _not = (!_contains);
                if (_not) {
                  corrGroup.getOccupies().add(firstBlock);
                }
                boolean _contains_1 = corrGroup.getOccupies().contains(firstBlock.getE());
                boolean _not_1 = (!_contains_1);
                if (_not_1) {
                  corrGroup.getOccupies().add(firstBlock.getE());
                }
              } else {
                boolean _chkAddingCorrGroupToVertTablePsbl = this.chkAddingCorrGroupToVertTablePsbl(grid, ((Table) f), ((Group) corrGroup));
                if (_chkAddingCorrGroupToVertTablePsbl) {
                  firstBlockCorr.setSourceElement(firstBlock);
                  secondBlockCorr.setSourceElement(firstBlock.getS());
                  boolean _contains_2 = corrGroup.getOccupies().contains(firstBlock);
                  boolean _not_2 = (!_contains_2);
                  if (_not_2) {
                    corrGroup.getOccupies().add(firstBlock);
                  }
                  boolean _contains_3 = corrGroup.getOccupies().contains(firstBlock.getS());
                  boolean _not_3 = (!_contains_3);
                  if (_not_3) {
                    corrGroup.getOccupies().add(firstBlock.getS());
                  }
                } else {
                  throw new SynchronizationError();
                }
              }
            }
          }
        }
        if (!_matched) {
        }
      }
    };
    IteratorExtensions.<Item>forEach(IteratorExtensions.<Item>filter(Iterators.<Item>filter(this.targetModel.getAllContents(), Item.class), _function), _function_1);
  }
  
  @Override
  public void sourceToTarget(final String s) {
    final Procedure1<Group> _function = (Group g) -> {
      final Corr corrSource = this.getCorrModelElement(g, BxtendDemonstratorImplTransformation.socket2Group);
      EObject _targetElement = corrSource.getTargetElement();
      final ItemSocket itemSocket = ((ItemSocket) _targetElement);
      Item _item = itemSocket.getItem();
      Item item = ((Item) _item);
      EObject _get = this.sourceModel.getContents().get(0);
      Grid grid = ((Grid) _get);
      if ((item == null)) {
        int i = 0;
        int j = 0;
        for (i = 0; (i < g.getOccupies().size()); i++) {
          for (j = 0; (j < g.getOccupies().size()); j++) {
            {
              Block firstBlock = g.getOccupies().get(i);
              Block secondBlock = g.getOccupies().get(j);
              if ((this.checkIfBlockIsOccupiedByOtherGroup(grid, g, firstBlock) || 
                this.checkIfBlockIsOccupiedByOtherGroup(grid, g, secondBlock))) {
              } else {
                if ((this.chkAddFridgeToCorrGroupPsbl(grid, firstBlock, secondBlock) && this.chkAddVertTableToCorrGroupPsbl(grid, firstBlock, secondBlock))) {
                  Elem2Elem.CONTINUATION.setChoices(Arrays.<String>asList("create_a_fridge", "create_a_vertical_table"));
                  HashMap<String, EObject> functionContext = new HashMap<String, EObject>();
                  functionContext.put("grid", grid);
                  functionContext.put("firstBlock", firstBlock);
                  functionContext.put("firstBlock", firstBlock);
                  functionContext.put("secondBlock", secondBlock);
                  final Procedure2<HashMap<String, EObject>, String> _function_1 = (HashMap<String, EObject> context, String decision) -> {
                    EObject _get_1 = context.get("firstBlock");
                    Block firstBlockContext = ((Block) _get_1);
                    EObject _get_2 = context.get("secondBlock");
                    Block secondBlockContext = ((Block) _get_2);
                    boolean _equals = decision.equals("create_a_fridge");
                    if (_equals) {
                      Fridge fridge = KitchenLanguageFactory.eINSTANCE.createFridge();
                      EObject _get_3 = context.get("firstBlock");
                      int _xIndex = ((Block) _get_3).getXIndex();
                      EObject _get_4 = context.get("grid");
                      double _blockSize = ((Grid) _get_4).getBlockSize();
                      double _multiply = (_xIndex * _blockSize);
                      fridge.setXPos(_multiply);
                      EObject _get_5 = context.get("firstBlock");
                      int _yIndex = ((Block) _get_5).getYIndex();
                      EObject _get_6 = context.get("grid");
                      double _blockSize_1 = ((Grid) _get_6).getBlockSize();
                      double _multiply_1 = (_yIndex * _blockSize_1);
                      fridge.setYPos(_multiply_1);
                      itemSocket.setItem(fridge);
                      this.makeCorrBetweenItemBlock(fridge, firstBlockContext, secondBlockContext);
                    } else {
                      boolean _equals_1 = decision.equals("create_a_vertical_table");
                      if (_equals_1) {
                        Table table = KitchenLanguageFactory.eINSTANCE.createTable();
                        EObject _get_7 = context.get("firstBlock");
                        int _xIndex_1 = ((Block) _get_7).getXIndex();
                        EObject _get_8 = context.get("grid");
                        double _blockSize_2 = ((Grid) _get_8).getBlockSize();
                        double _multiply_2 = (_xIndex_1 * _blockSize_2);
                        table.setXPos(_multiply_2);
                        EObject _get_9 = context.get("firstBlock");
                        int _yIndex_1 = ((Block) _get_9).getYIndex();
                        EObject _get_10 = context.get("grid");
                        double _blockSize_3 = ((Grid) _get_10).getBlockSize();
                        double _multiply_3 = (_yIndex_1 * _blockSize_3);
                        table.setYPos(_multiply_3);
                        itemSocket.setItem(table);
                        this.makeCorrBetweenItemBlock(table, firstBlockContext, secondBlockContext);
                      }
                    }
                  };
                  final Procedure2<HashMap<String, EObject>, String> continuationFunction = _function_1;
                  Elem2Elem.CONTINUATION.setContext(functionContext);
                  Elem2Elem.CONTINUATION.setFunction(continuationFunction);
                  return;
                } else {
                  if ((this.chkAddSinkToCorrGroupPsbl(grid, firstBlock, secondBlock) && this.chkAddHorzTableToCorrGroupPsbl(grid, firstBlock, secondBlock))) {
                    Elem2Elem.CONTINUATION.setChoices(Arrays.<String>asList("create_a_sink", "create_a_horizontal_table"));
                    HashMap<String, EObject> functionContext_1 = new HashMap<String, EObject>();
                    functionContext_1.put("grid", grid);
                    functionContext_1.put("firstBlock", firstBlock);
                    functionContext_1.put("secondBlock", secondBlock);
                    functionContext_1.put("itemSocket", itemSocket);
                    final Procedure2<HashMap<String, EObject>, String> _function_2 = (HashMap<String, EObject> context, String decision) -> {
                      boolean _equals = decision.equals("create_a_sink");
                      if (_equals) {
                        Sink sink = KitchenLanguageFactory.eINSTANCE.createSink();
                        EObject _get_1 = context.get("firstBlock");
                        Block firstBlockContext = ((Block) _get_1);
                        EObject _get_2 = context.get("secondBlock");
                        Block secondBlockContext = ((Block) _get_2);
                        EObject _get_3 = context.get("itemSocket");
                        ItemSocket itemSocketContext = ((ItemSocket) _get_3);
                        int _xIndex = firstBlockContext.getXIndex();
                        EObject _get_4 = context.get("grid");
                        double _blockSize = ((Grid) _get_4).getBlockSize();
                        double _multiply = (_xIndex * _blockSize);
                        sink.setXPos(_multiply);
                        int _yIndex = firstBlockContext.getYIndex();
                        EObject _get_5 = context.get("grid");
                        double _blockSize_1 = ((Grid) _get_5).getBlockSize();
                        double _multiply_1 = (_yIndex * _blockSize_1);
                        sink.setYPos(_multiply_1);
                        itemSocketContext.setItem(sink);
                        this.makeCorrBetweenItemBlock(sink, firstBlockContext, secondBlockContext);
                      } else {
                        boolean _equals_1 = decision.equals("create_a_horizontal_table");
                        if (_equals_1) {
                          Table table = KitchenLanguageFactory.eINSTANCE.createTable();
                          EObject _get_6 = context.get("firstBlock");
                          Block firstBlockContext_1 = ((Block) _get_6);
                          EObject _get_7 = context.get("secondBlock");
                          Block secondBlockContext_1 = ((Block) _get_7);
                          EObject _get_8 = context.get("firstBlock");
                          int _xIndex_1 = ((Block) _get_8).getXIndex();
                          EObject _get_9 = context.get("grid");
                          double _blockSize_2 = ((Grid) _get_9).getBlockSize();
                          double _multiply_2 = (_xIndex_1 * _blockSize_2);
                          table.setXPos(_multiply_2);
                          EObject _get_10 = context.get("firstBlock");
                          int _yIndex_1 = ((Block) _get_10).getYIndex();
                          EObject _get_11 = context.get("grid");
                          double _blockSize_3 = ((Grid) _get_11).getBlockSize();
                          double _multiply_3 = (_yIndex_1 * _blockSize_3);
                          table.setYPos(_multiply_3);
                          itemSocket.setItem(table);
                          this.makeCorrBetweenItemBlock(table, firstBlockContext_1, secondBlockContext_1);
                        }
                      }
                    };
                    final Procedure2<HashMap<String, EObject>, String> continuationFunction_1 = _function_2;
                    Elem2Elem.CONTINUATION.setContext(functionContext_1);
                    Elem2Elem.CONTINUATION.setFunction(continuationFunction_1);
                    return;
                  } else {
                    boolean _chkAddFridgeToCorrGroupPsbl = this.chkAddFridgeToCorrGroupPsbl(grid, firstBlock, secondBlock);
                    if (_chkAddFridgeToCorrGroupPsbl) {
                      Fridge fridge = KitchenLanguageFactory.eINSTANCE.createFridge();
                      int _xIndex = firstBlock.getXIndex();
                      double _blockSize = grid.getBlockSize();
                      double _multiply = (_xIndex * _blockSize);
                      fridge.setXPos(_multiply);
                      int _yIndex = firstBlock.getYIndex();
                      double _blockSize_1 = grid.getBlockSize();
                      double _multiply_1 = (_yIndex * _blockSize_1);
                      fridge.setYPos(_multiply_1);
                      itemSocket.setItem(fridge);
                      this.makeCorrBetweenItemBlock(fridge, firstBlock, secondBlock);
                      return;
                    } else {
                      boolean _chkAddSinkToCorrGroupPsbl = this.chkAddSinkToCorrGroupPsbl(grid, firstBlock, secondBlock);
                      if (_chkAddSinkToCorrGroupPsbl) {
                        Sink sink = KitchenLanguageFactory.eINSTANCE.createSink();
                        int _xIndex_1 = firstBlock.getXIndex();
                        double _blockSize_2 = grid.getBlockSize();
                        double _multiply_2 = (_xIndex_1 * _blockSize_2);
                        sink.setXPos(_multiply_2);
                        int _yIndex_1 = firstBlock.getYIndex();
                        double _blockSize_3 = grid.getBlockSize();
                        double _multiply_3 = (_yIndex_1 * _blockSize_3);
                        sink.setYPos(_multiply_3);
                        itemSocket.setItem(sink);
                        this.makeCorrBetweenItemBlock(sink, firstBlock, secondBlock);
                        return;
                      } else {
                        boolean _chkAddVertTableToCorrGroupPsbl = this.chkAddVertTableToCorrGroupPsbl(grid, firstBlock, secondBlock);
                        if (_chkAddVertTableToCorrGroupPsbl) {
                          Table table = KitchenLanguageFactory.eINSTANCE.createTable();
                          int _xIndex_2 = firstBlock.getXIndex();
                          double _blockSize_4 = grid.getBlockSize();
                          double _multiply_4 = (_xIndex_2 * _blockSize_4);
                          table.setXPos(_multiply_4);
                          int _yIndex_2 = firstBlock.getYIndex();
                          double _blockSize_5 = grid.getBlockSize();
                          double _multiply_5 = (_yIndex_2 * _blockSize_5);
                          table.setYPos(_multiply_5);
                          itemSocket.setItem(table);
                          this.makeCorrBetweenItemBlock(table, firstBlock, secondBlock);
                          return;
                        } else {
                          boolean _chkAddHorzTableToCorrGroupPsbl = this.chkAddHorzTableToCorrGroupPsbl(grid, firstBlock, secondBlock);
                          if (_chkAddHorzTableToCorrGroupPsbl) {
                            Table table_1 = KitchenLanguageFactory.eINSTANCE.createTable();
                            int _xIndex_3 = firstBlock.getXIndex();
                            double _blockSize_6 = grid.getBlockSize();
                            double _multiply_6 = (_xIndex_3 * _blockSize_6);
                            table_1.setXPos(_multiply_6);
                            int _yIndex_3 = firstBlock.getYIndex();
                            double _blockSize_7 = grid.getBlockSize();
                            double _multiply_7 = (_yIndex_3 * _blockSize_7);
                            table_1.setYPos(_multiply_7);
                            itemSocket.setItem(table_1);
                            this.makeCorrBetweenItemBlock(table_1, firstBlock, secondBlock);
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
    IteratorExtensions.<Group>forEach(Iterators.<Group>filter(this.sourceModel.getAllContents(), Group.class), _function);
  }
  
  public void makeCorrBetweenItemBlock(final Item item, final Block firstBlock, final Block secondBlock) {
    Corr firstBlockCorr = this.getOrCreateCorrModelElement(item, BxtendDemonstratorImplTransformation.item2FirstBlock);
    Corr secondBlockCorr = this.getOrCreateCorrModelElement(item, BxtendDemonstratorImplTransformation.item2SecondBlock);
    firstBlockCorr.setSourceElement(firstBlock);
    secondBlockCorr.setSourceElement(secondBlock);
  }
}
