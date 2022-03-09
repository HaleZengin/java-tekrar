package tekrar20_geometrikHesaplamalar;

public class Kare extends Sekil {

	public Kare(double kisaKenar, double uzunKenar) {
		super(kisaKenar,uzunKenar);
		
	}
	
	@Override
	public String toString() {
		
		return "Kenar: "+uzunKenar+ "Karenin cevresi: "+cevreHesaplama()+ "Karenin alaný: "+alanHesaplama();
	}

	
}
