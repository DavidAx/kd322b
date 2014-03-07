package uppgift3;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField colorfield;
	private JTextField pricefield;
	BikeStore Store = new BikeStore();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(202, 11, 304, 226);
		contentPane.add(textArea);
		textArea.setText(Store.getAllBikes());
		
		sizefield = new JTextField();
		sizefield.setBounds(80, 165, 86, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(40, 168, 46, 14);
		contentPane.add(lblSize);
		
		colorfield = new JTextField();
		colorfield.setBounds(80, 134, 86, 20);
		contentPane.add(colorfield);
		colorfield.setColumns(10);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(40, 137, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(40, 196, 46, 14);
		contentPane.add(lblPrice);
		
		pricefield = new JTextField();
		pricefield.setText("12345");
		pricefield.setBounds(80, 193, 86, 20);
		contentPane.add(pricefield);
		pricefield.setColumns(10);
		
		JButton btnAddBike = new JButton("Add Bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				String a = colorfield.getText();
				String b = sizefield.getText();
				String c = pricefield.getText();
				
				Store.addBike(a, b, c);
				
				textArea.setText(Store.getAllBikes());
			}
		});
		btnAddBike.setBounds(80, 221, 86, 23);
		contentPane.add(btnAddBike);
	}
}
