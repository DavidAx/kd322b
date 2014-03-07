package teat;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.JLabel;
import javax.swing.JComboBox;

public class test extends JFrame {
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private JPanel contentPane;
	private Document doc;
	private JLabel label;
	Program program;
	private int programsize;
	private JComboBox comboBox;
	
	private Document getDOM(){
		
		File myFile = new File("ht2013_antagning.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = null;
				try {
					dBuilder = dbFactory.newDocumentBuilder();
					
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					doc = dBuilder.parse(myFile);
					doc.getDocumentElement().normalize();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return root;
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		private Document root;
	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel rootlable = new JLabel("New label");
		rootlable.setBounds(5, 5, 167, 14);
		contentPane.add(rootlable);
		
		
		JLabel antal = new JLabel();
		antal.setBounds(5, 30, 181, 33);
		contentPane.add(antal);
		
		root = getDOM();
		
		programsList = loadAllPrograms();
		
		rootlable.setText("Första elementet (rooten): ");
		
		antal.setText("Antal program:   " + Integer.toString(programsize));
		
		comboBox = new JComboBox();
		comboBox.setBounds(15, 58, 409, 25);
		contentPane.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		label = new JLabel("<root>");
		label.setBounds(189, 5, 223, 14);
		contentPane.add(label);
		
		String name = doc.getDocumentElement().getNodeName();
		label.setText(name);
		
		
	}

	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();
		// Hämta alla program
		NodeList programs = doc.getElementsByTagName("Program");
		programsize = programs.getLength();
		System.out.println(programsize);
		for (int i = 0; i < programs.getLength(); i++) {
		// Gör om varje nod i listan till ett element
		Node node = programs.item(i);
		Element elm = (Element) node;
		// Hämta data från elementet
		String name = elm.getElementsByTagName("name").item(0).getTextContent();
		String code = elm.getElementsByTagName("code").item(0).getTextContent();
		String womenread = elm.getElementsByTagName("women").item(0).getTextContent();
		int women = Integer.parseInt(womenread);
		String menread = elm.getElementsByTagName("men").item(0).getTextContent();
		int men = Integer.parseInt(menread);
		// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
		// Skapa programmet och lägg till i listan
		//System.out.println(code);
		Program program = new Program(name, code, women, men);
		output.add(program);
		}
		return output;
		}
	}


