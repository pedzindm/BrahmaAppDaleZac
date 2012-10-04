package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorPanel extends JPanel {
	
	CalculatorLogic logic = new CalculatorLogic();	
	JLabel answer = new JLabel("Answer");
	public CalculatorPanel() {
		
		layout(this);
	}
	public void layout(JPanel contentPane) {
		contentPane.setLayout(new BorderLayout());
		// answerLabel
		
		answer.setBackground(Color.YELLOW);
		
		// Buttons
		JButton butClear = new JButton("Clear");
		JButton butAdd = new JButton("+");
		JButton butSub = new JButton("-");
		JButton butMult = new JButton("*");
		JButton butDiv = new JButton("/");
		JButton butZero = new JButton("0");
		JButton butOne = new JButton("1");
		JButton butTwo = new JButton("2");
		JButton butThree = new JButton("3");
		JButton butFour = new JButton("4");
		JButton butFive = new JButton("5");
		JButton butSix = new JButton("6");
		JButton butSeven = new JButton("7");
		JButton butEight = new JButton("8");
		JButton butNine = new JButton("9");
		JButton butEnter = new JButton("Enter");
		
		
		// Top Panel with table like layout (grid layout)
		GridLayout layoutTop = new GridLayout(4,4);
		JPanel panelTop = new JPanel();
		panelTop.setLayout(layoutTop);		
		

		
		// Center Panel with BorderLayout
		JPanel panelCenter = new JPanel();
		BorderLayout layoutCenter = new BorderLayout();
		panelCenter.setLayout(layoutCenter);
		
		// Add widgets to the center panel
		panelCenter.add(answer, BorderLayout.CENTER);
		
		// Add the center panel to the center section of the content pane
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		// Add action listeners
		// Clear button
		butClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Clear things
				answer.setText("Answer");
				answer.setVisible(true);
				logic.clearAll();
			}
		});
		
		// enter button
		butEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Clear things
				String result = logic.sendEnterSignal();
			    System.out.print(result);
				answer.setText(result);
				logic.clearAll();
			}
		});
		
		// Add button
		butAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('+', 0);
			}
		});
		
		// Subtract Button
		butSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('-', 0);
			}
		});
		
		// Multiply Button
		butMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('*', 0);
			}
		});
		
		// Divide Button
		butDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('/', 0);
			}
		});
		
		
		
		// 0 Button
		butZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 0);
			}
				
		});
		
		// 1 Button
		butOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 1);
			}
		});
		
		// 2 Button
		butTwo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 2);
			}
		});
		
		// 3 Button
		butThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 3);
			}
		});
		
		// 4 Button
		butFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 4);
			}
		});
		
		// 5 Button
		butFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 5);
			}
		});
		
		// 6 Button
		butSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 6);
			}
		});
		
		// 7 Button
		butSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 7);
			}
		});
		
		// 8 Button
		butEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 8);
			}
		});
		
		// 9 Button
		butNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logic.sendSignal('n', 9);
			}
		});
		// Add buttons to the top panel	
		panelTop.add(butSeven); 
		panelTop.add(butEight); 
		panelTop.add(butNine);
		panelTop.add(butDiv); // First row
		panelTop.add(butFour); 
		panelTop.add(butFive); 
		panelTop.add(butSix);
		panelTop.add(butMult); // Second row
		panelTop.add(butOne); 
		panelTop.add(butTwo); 
		panelTop.add(butThree);
		panelTop.add(butSub); // Third row
		panelTop.add(butZero); 
		panelTop.add(butAdd);
		panelTop.add(butClear); 
		panelTop.add(butEnter);// Fourth row
		
		
		// Add the top panel to the top section of the content pane
		contentPane.add(panelTop, BorderLayout.PAGE_START);
	}
}
