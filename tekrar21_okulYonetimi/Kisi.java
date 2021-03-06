package tekrar21_okulYonetimi;

public class Kisi {

	private String adSoyad;
	private String kimlikNo;
	private int yas;
	
	
	Kisi() {
		
	}
	
	Kisi(String adSoyad, String kimlikNo, int yas) {
		this.kimlikNo=kimlikNo;
		setAdSoyad(adSoyad);
		setYas(yas);
		
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad.toUpperCase();
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		if (kimlikNo.length()==11) {
			this.kimlikNo = kimlikNo;
		} else {
			System.out.println("Lutfen kimlik no'yu 11 haneli giriniz!");
		}
		
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		if (yas<0) {
			this.yas=-yas;
		} else {
			this.yas = yas;
		}
		
	}
	
	 @Override
	 public String toString() {
		 
	      return "Kisi{" +
	                "adSoyad='" + adSoyad + '\'' +
	                ", kimlikNo='" + kimlikNo + '\'' +
	                ", yas=" + yas +
	                '}';
	    }
	
	
}
