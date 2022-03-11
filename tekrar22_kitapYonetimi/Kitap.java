package tekrar22_kitapYonetimi;

public class Kitap {

	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	Kitap() {
		
	}
	
	
	Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		this.no=no;
		this.kitapAdi=kitapAdi;
		this.yazarAdi=yazarAdi;
		this.yayinYili=yayinYili;
		this.fiyat=fiyat;
		
	}
	
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getYayinYili() {
		return yayinYili;
	}
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	
	// Source'den Generate toString'i seç bu otomatik geliyor
	// toString objenin elemanlarýný String'e çevirip yazdýrýr
	@Override
	public String toString() {
		return "Kitap [no=" + no + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili=" + yayinYili
				+ ", fiyat=" + fiyat + "]";
	}
	
	
	
	
}
