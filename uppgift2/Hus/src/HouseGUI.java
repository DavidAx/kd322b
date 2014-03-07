import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

import org.w3c.dom.css.Counter;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		

		House[] myHouse = new House[10];
		{
			myHouse[0] = new House(1902, 120);
			myHouse[1] = new House(1954, 180);
			myHouse[2] = new House(1995, 90);
			
			JTextArea textArea = new JTextArea();
			textArea.setRows(10);
			textArea.setColumns(5);
			contentPane.add(textArea);
			contentPane.add(textArea, BorderLayout.CENTER);
			textArea.setEditable(false);
			
			
			/* Loops through the houses*/
			for (int i = 0; i < myHouse.length; i++) {
				if (myHouse[i] != null) {
			          System.out.println(myHouse[i].getYear() + " "  +  myHouse[i].getSize() + " " + House.getNbrHouses());

					textArea.append("Ett hus byggt ");
					textArea.append(Integer.toString(myHouse[i].getYear()));
					textArea.append(" Som är ");
					textArea.append(Integer.toString(myHouse[i].getSize()));
					textArea.append(" kvm");
					textArea.append("\n");
				}

			}

		}

	}
}
