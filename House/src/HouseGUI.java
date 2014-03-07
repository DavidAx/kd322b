import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class HouseGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		house[] myHouse = new house[10];
		{
			myHouse[0] = new house(1902, 120);
			myHouse[1] = new house(1954, 180);
			myHouse[2] = new house(1995, 8);
			
			JTextArea textArea = new JTextArea();
			textArea.setRows(10);
			textArea.setColumns(5);
			contentPane.add(textArea);
			contentPane.add(textArea, BorderLayout.CENTER);
			textArea.setEditable(false);
			
			for (int i = 0; i < myHouse.length; i++) {
				if (myHouse[i] != null) {

					textArea.append("Ett hus byggt ");
					textArea.append(Integer.toString(myHouse[i].getYear()));
					textArea.append(" Som är ");
					textArea.append(Integer.toString(myHouse[i].getSize()));
					textArea.append(" kvm.");
					textArea.append("\n");



				}
				

			}

			textArea.append("Det finns totalt: " + house.getNbrHouses() + " stycken hus.");
	}

}
}

