package uppgift4;
/**
 * Skapar en Human
 */


/**
 * vad �rdetta??
 * @author David
 *
 */
public class Human {
	

	private String name;
	private Dog mydog;

	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void buyDog(Dog _dog) {
		if (_dog == null) {
			
		} else {
			mydog = _dog;
		}
	}

	public String getInfo() {
		String infoname = "";
		if (name != null) {

			infoname = getName() + " �ger en hund som heter " + mydog.getName();
		}

		return infoname;

	}

	public void setName(String _name) {

		name = _name;
	}
}
