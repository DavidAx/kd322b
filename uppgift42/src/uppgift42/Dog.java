package uppgift42;
/**
 * Skapar en Dog
 * @author David
 *
 */
public class Dog extends Mammal {
	String balls;

	public Dog(String _latinname, int _legs, String _balls) {
		super(_latinname, _legs);
		balls = _balls;

	}

	@Override
	public String getInfo() {
		String info = "Hunden " + this.latinname + " och har " + this.legs
				+ "ben och tycker " + this.balls;
		return info;
	}

}
