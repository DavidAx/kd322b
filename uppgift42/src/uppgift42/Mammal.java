package uppgift42;
/**
 * F�r vidare Animal med nya variabler
 * @author David
 *
 */
public abstract class Mammal extends Animal{
	int legs;
	public Mammal(String _latinname, int _legs) {
		super(_latinname);
		legs = _legs;
	}



}
