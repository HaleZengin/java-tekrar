package tekrar7;

import java.util.Scanner;

public class Emlak {

	public int listeNo;
	public String evTipi;
	public String il;
	public int odaSayisi;
	private double fiyat;
	public String stokDurumu;
	
	
	
	@SuppressWarnings("resource")
	Emlak (int listeNo, String evTipi, String il, int odaSayisi, double fiyat, String stokDurumu) {
		
		this.listeNo=listeNo++;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Evin tipini giriniz:");
		this.evTipi=scan.next();
		
		System.out.println("Ýli giriniz:");
		this.il=scan.next();
		
		System.out.println("Oda sayisini giriniz:");
		this.odaSayisi=scan.nextInt();
		
		System.out.println("Fiyati giriniz:");
		this.fiyat=scan.nextDouble();
		
		System.out.println("Stok durumunu giriniz:");
		this.stokDurumu=scan.next();
		
	}


	public void listele() {
		
		System.out.println("Liste no: "+listeNo+"\nEv tipi: "+evTipi+"\nIl: "+il+"\nOda sayýsý: "+odaSayisi+"\nFiyat: "+fiyat+"\nStok durumu: "+stokDurumu);
		System.out.println("----------------");
	}


	public int getListeNo() {
		return listeNo;
	}


	public void setListeNo(int listeNo) {
		this.listeNo = listeNo;
	}


	public String getEvTipi() {
		return evTipi;
	}


	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}


	public String getIl() {
		return il;
	}


	public void setIl(String il) {
		this.il = il;
	}


	public int getOdaSayisi() {
		return odaSayisi;
	}


	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}


	public double getFiyat() {
		return fiyat;
	}


	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}


	public String getStokDurumu() {
		return stokDurumu;
	}


	public void setStokDurumu(String stokDurumu) {
		this.stokDurumu = stokDurumu;
	}
	
	

}
