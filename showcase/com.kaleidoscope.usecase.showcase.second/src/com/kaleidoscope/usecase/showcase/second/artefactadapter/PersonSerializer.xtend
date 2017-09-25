package com.kaleidoscope.usecase.showcase.second.artefactadapter

import com.kaleidoscope.usecase.showcase.xtext.personDsl.Person
import com.kaleidoscope.usecase.showcase.xtext.personDsl.PersonContainer

class PersonSerializer {
	
	def personContainerToString(PersonContainer c)
	'''
	«FOR p:c.persons»
	«personToString(p)»
	«ENDFOR»
	'''
	
	def personToString(Person p)
	'''
	Person «p.ID» {name «p.name»}
	'''
}