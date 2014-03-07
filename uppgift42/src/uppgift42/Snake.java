package uppgift42;

/**
 * Här skapas en orm
 * @author David
 *
 */
public class Snake extends Animal{
	public String poison;
	public Snake(String _latinname, String _poison) {
		super(_latinname);
		poison =_poison;
	}

	@Override
	public String getInfo() {
		String info = "Ormen " + this.latinname + " är " + this.poison;
		return info;
	}

}
