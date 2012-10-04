package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {
	
	double num = 0;
	char op = 'n';
	

	public void layout(JPanel contentPane) {
		contentPane.setLayout(new BorderLayout());
		// Labels used
		JLabel lblName = new JLabel("Name");
		JLabel lblAddress = new JLabel("Address");
		JLabel lblInterest = new JLabel("Interest");
		JLabel lblBio = new JLabel("Biography");
		JLabel equation = new JLabel("");
		
		
		// answerLabel
		final JLabel answer = new JLabel("Answer");
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
		JButton butDecimal = new JButton(".");
		
		
		// Top Panel with table like layout (grid layout)
		GridLayout layoutTop = new GridLayout(4,4);
		JPanel panelTop = new JPanel();
		panelTop.setLayout(layoutTop);		
		
		// Add widgets to the top panel	
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
		panelTop.add(butClear); // Fourth row
		
		
		// Add the top panel to the top section of the content pane
		contentPane.add(panelTop, BorderLayout.PAGE_START);
		
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
				answer.setText("");
				num = 0;
				op = 'n';
			}
		});
		
		// Add button
		butAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				op = '+';
			}
		});
		
		// Subtract Button
		butSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				op = '-';
			}
		});
		
		// Multiply Button
		butSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				op = '*';
			}
		});
		
		// Divide Button
		butSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				op = '/';
			}
		});
		
		
		
		// Divide Button
		butZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// For showing html view
				final JFrame browserFrame = new JFrame("Error");
				browserFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				final JPanel panelBrowser = (JPanel)browserFrame.getContentPane();
				final JLabel lblBrowser = new JLabel();
				panelBrowser.add(lblBrowser, BorderLayout.CENTER);

				if(op == 'n')
					num = '0';
				else
					switch(op) {
						case '+':	num = num+=0;
						case '-':	num = num-+0;
						case '*':	num = 0;
						case '/':	String html = "<html>" +
												  "<body>" +
												  "<table>" +
												  "<tr><td>Cannot Divide by 0</td><td>" +
												  "<table>" +
												  "</body>" +
												  "</html>";
									lblBrowser.setText(html);
									browserFrame.pack();
									browserFrame.setVisible(true);
						default:
							num = '0';									
					}
			}
		});
		
		// Divide Button
		butOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '1';
				else
					switch(op) {
						case '+':	num = num+=1;
						case '-':	num = num-+1;
						case '*':	break;
						case '/':	break;
						default:
							num = '1';									
					}
			}
		});
		
		// Divide Button
		butTwo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(op == 'n')
						num = '2';
					else
						switch(op) {
							case '+':	num = num+=2;
							case '-':	num = num-+2;
							case '*':	num = num*=2;
							case '/':	num = num/=2;
							default:
								num = '2';									
						}
				}
		});
		
		// Divide Button
		butThree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '3';
				else
					switch(op) {
						case '+':	num = num+=3;
						case '-':	num = num-+3;
						case '*':	num = num*=3;
						case '/':	num = num/=3;
						default:
							num = '3';									
					}
			}
		});
		
		// Divide Button
		butFour.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '4';
				else
					switch(op) {
						case '+':	num = num+=4;
						case '-':	num = num-+4;
						case '*':	num = num*=4;
						case '/':	num = num/=4;
						default:
							num = '4';									
					}
			}
		});
		
		// Divide Button
		butFive.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '5';
				else
					switch(op) {
						case '+':	num = num+=5;
						case '-':	num = num-+5;
						case '*':	num = num*=5;
						case '/':	num = num/=5;
						default:
							num = '5';									
					}
			}
		});
		
		// Divide Button
		butSix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '6';
				else
					switch(op) {
						case '+':	num = num+=6;
						case '-':	num = num-+6;
						case '*':	num = num*=6;
						case '/':	num = num/=6;
						default:
							num = '6';									
					}
			}
		});
		
		// Divide Button
		butSeven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '7';
				else
					switch(op) {
						case '+':	num = num+=7;
						case '-':	num = num-+7;
						case '*':	num = num*=7;
						case '/':	num = num/=7;
						default:
							num = '7';									
					}
			}
		});
		
		// Divide Button
		butEight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '8';
				else
					switch(op) {
						case '+':	num = num+=8;
						case '-':	num = num-+8;
						case '*':	num = num*=8;
						case '/':	num = num/=8;
						default:
							num = '8';									
					}
			}
		});
		
		// Divide Button
		butNine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op == 'n')
					num = '9';
				else
					switch(op) {
						case '+':	num = num+=9;
						case '-':	num = num-+9;
						case '*':	num = num*=9;
						case '/':	num = num/=9;
						default:
							num = '9';									
					}
			}
		});
	}
}
