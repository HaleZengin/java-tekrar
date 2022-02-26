package tekrar7;

public class CarsRunner {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//inside the cars class, we have 6 variables
		//but using class name you can access just
		//static variables
		System.out.println(Cars.numOfCars);	//0
		
		// to access instance variables you have to create object
		Cars c1=new Cars();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		//static variables can be accessed by using object as well
		// but it is not recommended
		// because static variables is not related with the object
		// therefore you are getting yellow underline
		System.out.println(c1.numOfCars);
		
		// engine method is static method
		// because of that we can access to it by using just class name
		System.out.println(Cars.engine());
		
		//drive method is non static methods
		//because of that to access drive method,I used c1 object
		c1.drive();
		
		//static methods can be accessed by using object as well
		// but it is not recommended
		// because static methods is not related with the object
		// therefore you are getting yellow underline
		System.out.println(c1.engine());

		
		Cars c2=new Cars("Honda", "Civic", 7000, 2012);	
		String vinc2=Cars.createVin(c2);	
		System.out.println(vinc2);
		
		
		Cars c3=new Cars("Audi", "R8", 5700, 2021);
		String vinc3=Cars.createVin(c3);
		System.out.println(vinc3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
