package uppgift42;
/**
 * Skapar en Cat
 * @author David
 *
 */
public class Cat extends Mammal{
	public String happy;
	public Cat(String _latinname, int _legs, String _happy) {
		super(_latinname, _legs);
		happy =_happy;
	}
	
	@Override
	public String getInfo() {
		String info = "Katten " + this.latinname + " och har " + this.legs + "ben och är " + this.happy;
		return info;
	}

}
