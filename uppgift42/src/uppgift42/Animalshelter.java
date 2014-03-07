package uppgift42;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;



public class Animalshelter extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animalshelter frame = new Animalshelter();
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
	public Animalshelter() {
		
		ArrayList<Animal> myanimals = new ArrayList<Animal>();
		
		myanimals.add(new Dog("Pluto", 4, "om bollar"));
		myanimals.add(new Cat("Maja", 2, "glad"));
		myanimals.add(new Snake("Zeke", "giftig"));
		myanimals.add(new Dog("Fido", 3, "inte om bollar"));
		myanimals.add(new Cat("Mårten", 2, "inte glad"));
		myanimals.add(new Snake("Zeke", "inte giftig"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane animaltext = new JTextPane();
		animaltext.setBounds(10, 0, 414, 250);
		contentPane.add(animaltext);
		
		String text = "";
		for(int i =0; i<myanimals.size(); i++){
			Animal currentanimal = myanimals.get(i);
			text += currentanimal.getInfo() + "\n";
			
		}
		animaltext.setText(text);
	}
}
