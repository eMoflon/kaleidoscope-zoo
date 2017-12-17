package org.kaleidoscope.usecase.kaleidocrypt.admin;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class Activator extends AbstractUIPlugin {

	
	public Activator() {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.ALL);
	}	
}
