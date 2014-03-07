package uppgift3;

import java.util.ArrayList;

public class BikeStore {
		
		/**An arrayList with bikes */
	private ArrayList<Bike> myBikes = new ArrayList<Bike>();
	/*	
	private Bike[] myBike = new Bike[20];
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
		}
		*/
		public BikeStore() {
			myBikes.add(new Bike(21902, 24));
			myBikes.add(new Bike("red", 1954, 10));
			myBikes.add(new Bike("green",3990, 18));
			myBikes.add(new Bike(5332, 16));
			myBikes.add(new Bike(3999, 9));
		}
	/** returns all the bikes */
		public String getAllBikes(){
			String biketext="";
			for (int i = 0; i < myBikes.size(); i++) {
				
				
				biketext+=("Plats: " + (i+1) + " Pris: " + myBikes.get(i).getPrice() + (" Färg: " + myBikes.get(i).getColor()+ " Storlek: "+ myBikes.get(i).getSize()+ "\n"));
				

			}
			
			return biketext;
		
	}
		
		/**Returns a new bike added */
		public void addBike(String _color, String _size, String _price){
			int newprice = Integer.parseInt(_price);
			int newsize = Integer.parseInt(_size);
			myBikes.add(new Bike(_color, newprice, newsize));

		
		
		}
}

	

