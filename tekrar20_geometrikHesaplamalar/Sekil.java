package tekrar20_geometrikHesaplamalar;

public class Sekil {

	double kisaKenar;
	double uzunKenar;
	double yariCap;
	
	// kare-dikd�rtgen , cember ile ilgili consructor:
	public Sekil (double kisaKenar, double uzunKenar ) {
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
		
	}
	
	public Sekil (double yariCap) {
		this.yariCap=yariCap;
	}
	
	
	
	// dikd�rtgenin cevresi,alan� ve cemberin alan� ile ilgili method:
	public Double cevreHesaplama() {
		
		return (kisaKenar+uzunKenar)*2;
	}
	
	public Double alanHesaplama() {
		
		return (kisaKenar*uzunKenar);
	}
	
	public Double cevreHesaplamaCember() {
		
		return (yariCap*yariCap*3.14);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
