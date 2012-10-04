package brahma.plugin.magiceightball;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import plugin.Plugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class MagicEightPlugin extends Plugin {

	JPanel panel;
	public MagicEightPlugin(String id) {
		super(id);
	}

	@Override
	public void layout(JPanel parentPanel) {
		parentPanel.setLayout(new BorderLayout());
		panel = new MagicEightPanel();
		parentPanel.add(panel);		
	}

	@Override
	public void start() {
		// Nothing to do here.
		
	}

	@Override
	public void stop() {
		// Nothing to do here.
		
	}

	
}
