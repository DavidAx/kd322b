package uppgift42;

/**
 * H�r skapas en orm
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
		String info = "Ormen " + this.latinname + " �r " + this.poison;
		return info;
	}

}
