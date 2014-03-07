package teat;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bargraph extends JComponent {
	private int women;
	private int men;
	private float total;

	public Bargraph(int women, int men) {
		this.women = women;
		this.men = men;
	}

	public void updateValues(int _women, int _men) {
		this.women = _women;
		this.men = _men;
		this.total = this.women + this.men;
		this.repaint();

	}

	@Override
	public void paint(Graphics g) {

		
		if (women > 0 && men > 0) {

			float antal = women + men;
			int height = getHeight();
			int width = getWidth();
			float pwomen=(women / antal);
			
			float pmen=(men/antal);
			
			float pixelwomen = (pwomen * height);
			float pixelmen = (pmen * height);
			System.out.println(pixelwomen);
			System.out.println("Women " + pwomen + "% " + "Men " + pmen + "% "
					+ antal);
			g.setColor(Color.RED);
			int howlong =  (int) (height - pixelwomen);
			g.fillRect(0, howlong, (width / 2), (int) ( pixelwomen));
			g.setColor(Color.BLUE);
			howlong = (int) (height - pixelmen);
			g.fillRect((width/2), howlong, (width / 2), (int) ( pixelmen));
			
		}

		super.paint(g);
	}

}
