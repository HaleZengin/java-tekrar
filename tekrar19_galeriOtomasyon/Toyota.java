package tekrar19_galeriOtomasyon;

public class Toyota extends Car {

	 /*
    Bir class olusturunuz adi Toyota olsun
    icerisinde 3 instance variable olsun 
    protected String make = "Toyota";
    protected String model = "Corolla";
    protected int year = 2009;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */
	
	//  3 instance variable:
	 protected String make = "Toyota";
	 protected String model = "Corolla";
	 protected int year = 2010;
	 protected String renk ="Beyaz";
	 
	 // 3 tane String return tipinden method:
	 public String arabaMarkasi() {
		 
		 return make;
	 }
	 
	 public String arabaModeli() {
		 
		 return model;
	 }
	 
	 public Integer arabaYili() {
		 
		 return year;
	 }
	 
	 public String arabaRengi() {
		 
		 return renk;
	 }
	 
	// iki constructor:
	    
		 public Toyota() {
		    	
		 }
		    
		 public Toyota(String model, int year) {
		    this.model=model;
		    this.year=year;
		    	
		}
	
	
	
	public static void main(String[] args) {
		
		Toyota newToyota = new Toyota();
		System.out.println("Arabanýn markasý: "+newToyota.arabaMarkasi());
		System.out.println("Arabanýn modeli: "+newToyota.arabaModeli());
		System.out.println("Arabanýn yýlý: "+newToyota.arabaYili());
		System.out.println("Arabanýn rengi: "+newToyota.arabaRengi());
		
		Toyota toyota2 = new Toyota("Avensis", 2018);
		System.out.println("Arabanýn markasý: "+toyota2.arabaMarkasi());
		System.out.println("Arabanýn modeli: "+toyota2.arabaModeli());
		System.out.println("Arabanýn yýlý: "+toyota2.arabaYili());
		System.out.println("Arabanýn rengi: "+toyota2.arabaRengi());
		
		
		

	}

}
