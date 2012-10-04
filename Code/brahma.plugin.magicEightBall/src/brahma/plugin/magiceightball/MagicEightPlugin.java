package brahma.plugin.magiceightball;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import plugin.Plugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class MagicEightPlugin extends Plugin {
	JPanel panel;
	private static final String id = "Eight Ball Plugin";
	
	public MagicEightPlugin() {
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
