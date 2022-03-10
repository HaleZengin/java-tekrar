package tekrar21_okulYonetimi;

public class Ogrenci extends Kisi {

	private int numara;
	private String sinif;
	
	Ogrenci() {
		
	}
	
	Ogrenci(String adSoyad, String kimlikNo, int yas, int numara, String sinif) {
		super(adSoyad, kimlikNo, yas);
		this.numara=numara;
		this.sinif=sinif;
		
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	
	@Override
	public String toString() {
		
		return "Ogrenci: { Ad� Soyad�: "+getAdSoyad()+", Kimlik numaras�: "+getKimlikNo()+", Ya��: "+getYas()
				+", Numaras�: "+numara+", S�n�f�: "+sinif+" }";
	}
	
	
	
}
