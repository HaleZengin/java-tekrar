package tekrar22_kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {

	static Scanner scan= new Scanner(System.in);
	static int kitapNo=1000;
	
	public static void menu(List<Kitap> liste) {
		System.out.println("========= K�TAP PROGRAMI =============");
		System.out.println("1-Kitap ekle: \t2-Numara ile kitap sil: \t3-T�m kitaplar� listele \t4-Bitir");
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
			System.out.println("Yanl�� giri� yap�ld�. Tekrar deneyiniz...");
			break;	
		}
		
	}
	

	public static void kitapEkle(List<Kitap> liste) {
		
		System.out.println("Kitap ad� giriniz");
		scan.nextLine();    // dummy yani bo� scan objesi olu�turur. iki tane scanLine olunca bunu yapmak gerekiyor. araya bo� bir sat�r atlat�yor
		String kitapAdi=scan.nextLine();
		System.out.println("Kitap yazar ad�n� giriniz");	
		String kitapYazari=scan.nextLine();
		System.out.println("Kitap yay�n y�l�n� giriniz");
		int kitapYayinYili=scan.nextInt();
		System.out.println("Kitap fiyat�n� giriniz");
		double kitapFiyati=scan.nextDouble();
		
		Kitap kitap= new Kitap(++kitapNo,kitapAdi, kitapYazari, kitapYayinYili, kitapFiyati);
		liste.add(kitap);
		System.out.println("Kitap listesine girmi� oldu�unuz kitab�n �zellikleri "+kitap.toString());
		menu(liste);
	}

	public static void kitapSil(List<Kitap> liste) {
		
		System.out.println("Silmek iste�iniz kitap numaras�n� giriniz.");
		int silinecekNo=scan.nextInt();
		for (Kitap each : liste) {
			
			if (each.getNo()==silinecekNo) {
				liste.remove(each);
				menu(liste);   					  // tekrar ana men�ye d�n demektir.
			} 
			
				System.out.println(silinecekNo+" :Yazd���n�z numara listede yok!");
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
	
	// kitapcida �nceden var olan kitaplar olsun:
	
	public static void varOlanKitaplar(List<Kitap> liste) {
		Kitap kitap1= new Kitap(++kitapNo, "B�lb�l� �ld�rmek", "Harper Lee", 1920, 35);
		Kitap kitap2= new Kitap(++kitapNo, "Ak�l Oyunlar�", "Daniel Palmer", 1900, 30);
		Kitap kitap3= new Kitap(++kitapNo, "Simyac�", "Paulo Coelhe", 1940, 27);
		
		liste.add(kitap1);
		liste.add(kitap2);
		liste.add(kitap3);
		
	}
	
	


	
	
}
