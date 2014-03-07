public class House {
	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10;

	public House(int year, int size) {
		this.year = year;
		this.size = size;
	}

	public static int getNbrHouses() {
		return nbrOfHouses;
	}

	public int getYear() {
		return year;
	}

	public int getSize() {
		return size;
	}
}

