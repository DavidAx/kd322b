package uppgift4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HadGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField info;
	private JTextField error;
	private JTextField humanname;
	private JTextField dogname;
	private JLabel lblAnd;
	private JLabel lblDogs;
	Human humans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HadGUI frame = new HadGUI();
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
	public HadGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humanname.getText().length() >= 3) {
					humans = new Human(humanname.getText());
					error.setText("");
				} else {
					error.setText("Invalid name for Human");
				}
			}
		});
		btnNewButton.setBounds(139, 28, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humans != null) {
					Dog dog = new Dog();
					dog.setName(dogname.getText());
					humans.buyDog(dog );
					error.setText("");
				} else {

					error.setText("Dog needs to have a human");
				}
			}
		});
		btnBuyDog.setBounds(139, 64, 89, 23);
		contentPane.add(btnBuyDog);

		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setText(humans.getInfo());
			}
		});
		btnPrintInfo.setBounds(139, 98, 89, 23);
		contentPane.add(btnPrintInfo);

		info = new JTextField();
		info.setBounds(25, 132, 370, 51);
		contentPane.add(info);
		info.setColumns(10);

		error = new JTextField();
		error.setBounds(25, 194, 370, 56);
		contentPane.add(error);
		error.setColumns(10);

		humanname = new JTextField();
		humanname.setBounds(25, 29, 86, 20);
		contentPane.add(humanname);
		humanname.setColumns(10);

		dogname = new JTextField();
		dogname.setBounds(25, 65, 86, 20);
		contentPane.add(dogname);
		dogname.setColumns(10);

		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(25, 117, 46, 14);
		contentPane.add(lblInfo);

		JLabel lblHumansAndDogs = new JLabel("Humans");
		lblHumansAndDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumansAndDogs.setBounds(283, 18, 98, 34);
		contentPane.add(lblHumansAndDogs);

		lblAnd = new JLabel("and");
		lblAnd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnd.setBounds(283, 53, 51, 23);
		contentPane.add(lblAnd);

		lblDogs = new JLabel("dogs");
		lblDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDogs.setBounds(283, 75, 56, 34);
		contentPane.add(lblDogs);
	}
}
