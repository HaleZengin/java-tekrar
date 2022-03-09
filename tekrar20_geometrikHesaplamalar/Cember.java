package tekrar20_geometrikHesaplamalar;

public class Cember extends Sekil {

	public Cember(double yariCap) {
		
		super(yariCap);
	}
	
	public Double cevreHesaplama() {
		
		return (2*yariCap*3.14);
	}
	
	public Double alanHesaplamaCember() {
		
		return (yariCap*yariCap*3.14);
	}
	@Override
	public String toString() {
		
		return "Yarýcap: "+yariCap+ " Cemberin cevresi: "+cevreHesaplama() + "Cemberin alaný: "+alanHesaplamaCember();
		
	}
	
	
	
}
