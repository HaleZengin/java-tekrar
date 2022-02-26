package tekrar7;

public class Cars {

	public String make;
	public String model;
	public int price;
	public int year;
	
	public static int numOfCars =0;
	public String vin;
	
	public Cars() {
		
	}
	
	public Cars(String make, String model, int price, int year) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		numOfCars++;
	}
	
	//if you dont yous static keyword between access modifier 
	// and return type, the method will be instance method
	public void drive() {
		System.out.println("I am driving the car");
		
	}
	
	public static String engine() {
		return "Engine exist";
	}
	
	public static String createVin(Cars c) {
		String vin=c.make.substring(0, 3) + c.model.charAt(0) + c.year + numOfCars;
		
		return vin;
		
	}
}
