package tekrar22_kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {

	static Scanner scan= new Scanner(System.in);
	static int kitapNo=1000;
	
	public static void menu(List<Kitap> liste) {
		System.out.println("========= KÝTAP PROGRAMI =============");
		System.out.println("1-Kitap ekle: \t2-Numara ile kitap sil: \t3-Tüm kitaplarý listele \t4-Bitir");
		System.out.println("Isleminizi seciniz...");
		int tercih=scan.nextInt();
		
		switch(tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			kitapSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		default :
			System.out.println("Yanlýþ giriþ yapýldý. Tekrar deneyiniz...");
			break;	
		}
		
	}
	

	public static void kitapEkle(List<Kitap> liste) {
		
		System.out.println("Kitap adý giriniz");
		scan.nextLine();    // dummy yani boþ scan objesi oluþturur. iki tane scanLine olunca bunu yapmak gerekiyor. araya boþ bir satýr atlatýyor
		String kitapAdi=scan.nextLine();
		System.out.println("Kitap yazar adýný giriniz");	
		String kitapYazari=scan.nextLine();
		System.out.println("Kitap yayýn yýlýný giriniz");
		int kitapYayinYili=scan.nextInt();
		System.out.println("Kitap fiyatýný giriniz");
		double kitapFiyati=scan.nextDouble();
		
		Kitap kitap= new Kitap(++kitapNo,kitapAdi, kitapYazari, kitapYayinYili, kitapFiyati);
		liste.add(kitap);
		System.out.println("Kitap listesine girmiþ olduðunuz kitabýn özellikleri "+kitap.toString());
		menu(liste);
	}

	public static void kitapSil(List<Kitap> liste) {
		
		System.out.println("Silmek isteðiniz kitap numarasýný giriniz.");
		int silinecekNo=scan.nextInt();
		for (Kitap each : liste) {
			
			if (each.getNo()==silinecekNo) {
				liste.remove(each);
				menu(liste);   					  // tekrar ana menüye dön demektir.
			} 
			
				System.out.println(silinecekNo+" :Yazdýðýnýz numara listede yok!");
				menu(liste);
			
		}
	}

	public static void listele(List<Kitap> liste) {
		
		for (Kitap each : liste) {
			System.out.println(each.toString());
		}
		menu(liste);
	}

	public static void bitir() {
		System.out.println("Yine bekleriz...");
		
	}
	
	// kitapcida önceden var olan kitaplar olsun:
	
	public static void varOlanKitaplar(List<Kitap> liste) {
		Kitap kitap1= new Kitap(++kitapNo, "Bülbülü Öldürmek", "Harper Lee", 1920, 35);
		Kitap kitap2= new Kitap(++kitapNo, "Akýl Oyunlarý", "Daniel Palmer", 1900, 30);
		Kitap kitap3= new Kitap(++kitapNo, "Simyacý", "Paulo Coelhe", 1940, 27);
		
		liste.add(kitap1);
		liste.add(kitap2);
		liste.add(kitap3);
		
	}
	
	


	
	
}
