package calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;



public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private calculator calcObject;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		 calcObject = new calculator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(83, 11, 207, 36);
		contentPane.add(textArea);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(1);
				textArea.append("1");
			}
		});
		button.setBounds(79, 154, 49, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(2);
				textArea.append("2");
			}
		});
		button_1.setBounds(157, 154, 54, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(3);
				textArea.append("3");
			}
		});
		button_2.setBounds(236, 154, 54, 37);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(4);
				textArea.append("4");
			}
		});
		button_3.setBounds(79, 106, 49, 37);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(5);
				textArea.append("5");
			}
		});
		button_4.setBounds(157, 106, 54, 37);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(6);
				textArea.append("6");
			}
		});
		button_5.setBounds(236, 106, 54, 37);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(7);
				textArea.append("7");
			}
		});
		button_6.setBounds(79, 58, 49, 37);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(8);
				textArea.append("8");
			}
		});
		button_7.setBounds(157, 58, 54, 37);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(9);
				textArea.append("9");
			}
		});
		button_8.setBounds(236, 58, 54, 37);
		contentPane.add(button_8);
		
		
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(calcObject.getOperand());
				calcObject.plus();
				System.out.println(calcObject.getResult());
				textArea.append("+");
			}
		});
		button_9.setBounds(310, 154, 64, 37);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(0);
				textArea.append("0");
			}
		});
		button_10.setBounds(79, 202, 49, 37);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("00");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.numberButtonPressed(00);
				textArea.append("00");
			}
		});
		button_11.setBounds(157, 202, 54, 37);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.equals();
				System.out.println(calcObject.getResult());
				textArea.append("=" + calcObject.getResult());
			}
		});
		button_12.setBounds(236, 202, 138, 37);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.minus();
				textArea.append("-");
			}
		});
		button_13.setBounds(310, 106, 64, 37);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("*");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.mult();
				textArea.append("*");
			}
		});
		button_14.setBounds(310, 58, 64, 37);
		contentPane.add(button_14);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcObject.clear();
				textArea.setText("");
			}
		});
		btnClear.setBounds(310, 11, 64, 37);
		contentPane.add(btnClear);
		
		
	}
}

