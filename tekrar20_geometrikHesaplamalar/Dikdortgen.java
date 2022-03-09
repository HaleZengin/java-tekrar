package tekrar20_geometrikHesaplamalar;

public class Dikdortgen extends Sekil{

	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);

	}

	public Double cevreHesaplama() {
		return (uzunKenar+kisaKenar)*2;
	}

	public Double alanHesaplama() {
		return uzunKenar*kisaKenar;
	}


	@Override
	public String toString() {
		return "uzunKenar: " + uzunKenar + ", kisaKenar: " + kisaKenar + ", dikdortgenin cevresi: " + cevreHesaplama()
				+ ", dikdortgenin alaný: " + alanHesaplama();
	}
	
}
