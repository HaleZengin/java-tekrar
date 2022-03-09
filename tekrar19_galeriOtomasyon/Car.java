package tekrar19_galeriOtomasyon;

public class Car extends Runner{

	/*
    Bir class olusturunuz adi Car olsun
    icerisinde 3 instance variable olsun 
    protected String make ;
    protected String model;
    protected int year ;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    ve iki constructor olusturunuz 
    1 parametreli
    1 parametresiz
    String model;
    int year
    Son olarak bir oject olusturup method lari main method da print ediniz 
    */
	
	
	// 3 instance variable:
	protected String make ;
    protected String model;
    protected int year ;
    
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
    
    public Car() {
    	
    }
    
    public Car(String model, int year) {
    	this.model=model;
    	this.year=year;
    	
    }
    
    
    

}
