package plugin;

import java.io.IOException;
import java.util.ArrayList;

public class Brahma {
	
	public static void main(String args[]) throws IOException {
		PluginManager manager = null;
		Globals.list = new ArrayList<Plugin>();
		try {
			  manager = new PluginManager();
			  Thread thread = new Thread(manager);
			thread.start();
		
		} catch (IOException e) {
			throw e;
		}
		PluginCore core = new PluginCore();
		core.start();
	}
}
