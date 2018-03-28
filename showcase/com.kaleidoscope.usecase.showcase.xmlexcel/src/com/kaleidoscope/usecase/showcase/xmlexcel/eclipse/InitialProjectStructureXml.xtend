package com.kaleidoscope.usecase.showcase.xmlexcel.eclipse

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath

import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile

class InitialProjectStructureXml {
	def static void createEmptyXMLFile(IProject project, IPath filePath) {
		val String initialSourceModelContent = '''
			<people>
			</people>
		'''

		addAllFoldersAndFile(project, filePath, initialSourceModelContent, null)
	}
}
