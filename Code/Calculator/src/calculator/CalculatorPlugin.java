package calculator;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import plugin.Plugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class CalculatorPlugin extends Plugin {
	JPanel panel;
	private static final String id = "Calculator Plugin";
	
	public CalculatorPlugin() {
		super(id);
	}

	@Override
	public void layout(JPanel parentPanel) {
		parentPanel.setLayout(new BorderLayout());
		panel = new CalculatorPanel();
		parentPanel.add(panel);		
	}

	@Override
	public void start() {
		// nothing to be initiated
		
	}

	@Override
	public void stop() {
		// nothing to be stopped
		
	}

	

}
