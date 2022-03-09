package tekrar19_galeriOtomasyon;

public class Honda extends Car {

	/*
    Bir class olusturunuz adi Honda olsun
    icerisinde 3 instance variable olsun 
    protected String make = "Honda";
    protected String model = "Accord";
    protected int year = 2012;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */
	
	// 3 instance variable:
	 protected String make = "Honda";
	 protected String model = "Accord";
	 protected int year = 2012;
	  
	 @Override// methodun ovirride olup olmad���n� kontrol eder.
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
	 
	 
	// iki constructor:
	    
	 public Honda() {
	    	
	 }
	    
	 public Honda(String model, int year) {
	    this.model=model;
	    this.year=year;
	    	
	}
	 
	
	public static void main(String[] args) {
		
		Honda newHonda= new Honda();
		System.out.println("Araban�n markas�: "+newHonda.arabaMarkasi());
		System.out.println("Araban�n modeli: "+newHonda.arabaModeli());
		System.out.println("Araban�n y�l�: "+newHonda.arabaYili());
		
		Honda honda2= new Honda("Civic", 2014);
		System.out.println("Araban�n markas�: "+honda2.arabaMarkasi());
		System.out.println("Araban�n modeli: "+honda2.arabaModeli());
		System.out.println("Araban�n y�l�: "+honda2.arabaYili());
		
		
		
	} 
	 
	
	 
}
