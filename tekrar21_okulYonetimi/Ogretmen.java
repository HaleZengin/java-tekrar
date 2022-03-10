package tekrar21_okulYonetimi;

public class Ogretmen extends Kisi {

	private String bolum;
	private String sicilNo;
	
	
	Ogretmen () {
		
	}
	
	Ogretmen (String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
		super(adSoyad, kimlikNo, yas);
		this.bolum=bolum;
		this.sicilNo=sicilNo;
		
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	
	
	@Override
    public String toString() {
        return "Ogretmen{" +"Ad Soyad="+getAdSoyad()+",Kimlik No :"+getKimlikNo()+", Yas="+getYas()+
                ", SicilNo='" + sicilNo + '\'' +
                ", Bolum='" + bolum + '\'' +
                '}';
    }
	
}
