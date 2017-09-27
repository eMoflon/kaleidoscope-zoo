package com.kaleidoscope.usecase.showcase.second.artefactadapter;

import com.kaleidoscope.usecase.showcase.xtext.personDsl.Person;
import com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PersonSerializer {
  public CharSequence personContainerToString(final PersonContainer c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Person> _persons = c.getPersons();
      for(final Person p : _persons) {
        CharSequence _personToString = this.personToString(p);
        _builder.append(_personToString);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence personToString(final Person p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Person ");
    int _iD = p.getID();
    _builder.append(_iD);
    _builder.append(" {name ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
