package uppgift3;

public class Main {

	public static void main(String[] args) {

		Bike[] myBike = new Bike[10];
		{
			myBike[0] = new Bike(21902, 24);
			myBike[1] = new Bike("red", 1954, 10);
			myBike[2] = new Bike("green",3990, 18);
			myBike[3] = new Bike(5332, 16);
			myBike[4] = new Bike(3999, 9);
			myBike[5] = new Bike("blue",8322, 8);			
			myBike[6] = new Bike(6666, 12);
			myBike[7] = new Bike("orange",1234, 20);
			myBike[8] = new Bike(24421, 22);
			myBike[9] = new Bike(29999, 21);
			
			for (int i = 0; i < myBike.length; i++) {
				if (myBike[i] != null) {
				System.out.println("Plats: " + (i+1) + " Pris: " + myBike[i].getPrice() + (" Färg: " + myBike[i].getColor() + " Storlek: "+ myBike[i].getSize()));

				}
			}

			
	}
	}

}
