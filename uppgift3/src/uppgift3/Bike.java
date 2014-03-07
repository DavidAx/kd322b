package uppgift3;

public class Bike {
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	
	/**Creates a bike with color that have their limits in Constants */
	public Bike(String _color, int _price,int _size){
		
		if(_size>Constants.MIN_SIZE && _size<Constants.MAX_SIZE && _price>Constants.MIN_PRICE && _price<Constants.MAX_PRICE){
			
			size = _size;
			price = _price;
			for(int i = 0; i<3;i++){
				if(_color.equals(Constants.COLORS[i]) ){
					
					color = _color;
				}
			}
			
			if(_color == null){
				color = "No";
			
				}

		}
		else if(size < Constants.MIN_SIZE) {
			size = Constants.MIN_SIZE;
		
		}
		
		
		
		nbrOfBikes +=1;
	
}
	/**Creates a bike without color that have their limits in Constants */
	public Bike( int _price,int _size){
		
		if(_size>Constants.MIN_SIZE && _size<Constants.MAX_SIZE && _price>Constants.MIN_PRICE && _price<Constants.MAX_PRICE){
			
			size = _size;
			price = _price;
			
		}
		else{
			size = Constants.MIN_SIZE;
		}
		
		nbrOfBikes +=1;
	}
	/** Returns Color */
	public String getColor(){
		return color;
	}
	/** Returns Size */
	public int getSize(){
		return size;
	}
	/** Returns Price */
	public int getPrice(){
		return price;
	}
	/** Set new price and returns it */
	public int setPrice(int newprice){
		price = newprice;
		return price;
	}
	/** Returns nbrOfBikes */
	public static int getNbrBikes(){
		
		return nbrOfBikes;
		}

	}


