package tekrar21_okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler  {
	
	
		
	

	/*
	B�R OKUL Y�NET�M PLATFORMU KODALYINIZ.

	1.	Bu programda, ��renci ve ��retmen Kay�tlar� ile ilgili i�lemler yap�labilmelidir.
		Kay�tlarda �u bilgiler olabilmelidir.

		��retmen: Ad-Soyad,  kimlik No, ya�, b�l�m, ve sicil No bilgileri i�ermelidir.
		��renci: Ad-Soyad,  kimlik No, ya�, numara, s�n�f bilgileri i�ermelidir.

	2.	Program ba�lad���nda Kullan�c�ya, ��retmen ve ��renci i�lemlerini se�ebilmesi i�in
		A�a��daki gibi bir men� g�sterilsin.

	====================================
	 ��RENC� VE ��RETMEN Y�NET�M PANEL�
	====================================
	 1- ��RENC� ��LEMLER�
	 2- ��RETMEN ��LEMLER�
	 Q- �IKI�

	3.	Se�ilen Ki�i t�r�ne g�re a�a��daki i�lemleri g�steren bir alt men� daha g�sterilsin.

	============= ��LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-L�STELEME
		 4-S�LME
		 5-ANA MEN�
		 Q-�IKI�

	SE��M�N�Z:

	4.	��lemler men�s�nde se�ilen i�leme g�re bir �nceki men�de se�ilen Ki�i t�r� ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan t�m ki�ileri listeleme gibi i�lemler yap�labilmelidir.
		Bunun yan�nda bir �st men�ye d�nme veya ��k�� i�lemleri de yap�labilmelidir.

 */
	
	
	static List<Kisi> ogrenciList = new ArrayList<>();
	static List<Kisi> ogretmenList = new ArrayList<>();
	
	Scanner scan= new Scanner(System.in);
	
	static String kisiTuru;
	
	@SuppressWarnings("resource")
	public static void anaMenu() {
		Scanner scan= new Scanner(System.in);
		System.out.println("��RENC� VE ��RETMEN ��LEMLER� PANEL�NE HO�GELD�N�Z \n1- ��RENC� ��LEMLER� \n2- ��RETMEN ��LEMLER� \n3- �IKI�");
		System.out.println("YAPMAK �STED���N�Z ��LEMLER� SE��N�Z...");
		
		String secim=scan.next();
		
		switch(secim) {
		case "1":
			kisiTuru="OGRENCI";
			islemMenusu();
			break;
		case "2":
			kisiTuru="OGRETMEN";
			islemMenusu();
			break;
		case "3":
			cikis();
			break;
		default : 
			System.out.println("Yanl�� bir giri� yapt�n�z!\nLutfen tekrar se�im yap�n�z...");
			anaMenu();
			break;
		
		}
		
	
	}
	
	
	private static void cikis() {
		System.out.println("Uygulamadan ��k���n�z yap�ld�! Yine bekleriz...");
		
	}



	@SuppressWarnings("resource")
	private static void islemMenusu() {
		System.out.println("Sectiginiz  Ki�i turu icin  a�a��daki i�lemlerden tercih yap�n�z.\r\n"
                + "============= ��LEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-L�STELEME\r\n"
                + "     4-S�LME\r\n"
                + "     0-ANA MENU");

        System.out.print("Lutfen islem tercihinizi giriniz : ");
        Scanner scan= new Scanner(System.in);
        int islemTercihi=scan.nextInt();
        
        switch (islemTercihi) {
        	case 0 :
        		anaMenu();
        		break;
        	case 1 :
            	ekleme();
            	islemMenusu();
        		break;
        	case 2 :
            	arama();
            	islemMenusu();
        		break;
        	case 3 :
            	listeleme();
            	islemMenusu();
        		break;
        	case 4 :
            	silme();
            	islemMenusu();
        		break;
        default :
        	System.out.println("Yanl�� bir giri� yapt�n�z!\nLutfen tekrar se�im yap�n�z...");
        	islemMenusu();
        	break;
             
        }
        
        
    	
	}



	@SuppressWarnings("resource")
	private static void ekleme() {
		System.out.println("********* "+kisiTuru+" ekleme sayfas� *********");
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ad ve soyad giriniz.");
		String adSoyad=scan.nextLine();
		System.out.println("Lutfen kimlik numaras� giriniz.");
		String kimlikNo=scan.next();
		System.out.println("Lutfen yas� giriniz.");
		int yas=scan.nextInt();
		
		if (kisiTuru.equals("OGRENCI")) {
			System.out.println("Lutfen ogrenci numaras�n� giriniz.");
			int numara=scan.nextInt();
			System.out.println("Lutfen ogrenci s�n�f�n� giriniz.");
			String sinif=scan.next();
			
			Ogrenci ogrenci= new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenci.toString()+" eklendi...");
			
		} else {
			System.out.println("Lutfen ogretmenin b�l�m�n� giriniz.");
			String bolum=scan.nextLine();
			System.out.println("Lutfen ogretmen sicil numaras�n� giriniz.");
			String sicilNo=scan.nextLine();
			
			Ogretmen ogretmen= new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
			ogretmenList.add(ogretmen);
			System.out.println(ogretmen.toString()+" eklendi...");
		}
		
	}


	@SuppressWarnings("resource")
	private static void arama() {
		System.out.println("********* " + kisiTuru + " arama sayfasi *********");
        boolean kontrol = true;
        Scanner scan= new Scanner(System.in);
        
        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("Arad�g�n�z ��rencinin kimlik numaras�n� giriniz.");
			String araOgrKimlikNo=scan.next();
			for (Kisi each : ogrenciList) {
				if (each.getKimlikNo().equals(araOgrKimlikNo)) {
					System.out.println("Arad�g�n�z ��renci: "+each.getAdSoyad());
					kontrol=false;
				}
			}
			if (kontrol) {
				System.out.println("Arad�g�n�z ��renci listede mevcut de�il!");
			}
        	
     	
		} else {
			System.out.println("Arad�g�n�z ��retmenin kimlik numaras�n� giriniz.");
			String araOgrtKimlikNo=scan.next();
			for (Kisi each : ogretmenList) {
				if (each.getKimlikNo().equals(araOgrtKimlikNo)) {
					System.out.println("Arad���n�z ��retmen: "+each.getAdSoyad());
					kontrol=false;
				}
			}
			if (kontrol) {
				System.out.println("Arad�g�n�z ��retmen listede mevcut de�il!");
			}
			
		}
     
		
	}


	private static void listeleme() {
		System.out.println("********* "+kisiTuru+" listeleme sayfas� *********");
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			for (Kisi each : ogrenciList) {
				System.out.println(each.toString());
			}
		} else {
			for (Kisi each : ogretmenList) {
				System.out.println(each.toString());
			}
		}
		
	}


	@SuppressWarnings("resource")
	private static void silme() {
		System.out.println("********* " + kisiTuru + "silme sayfasi *********");
        boolean kontrol = true;
        Scanner scan= new Scanner(System.in);
        
        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("Silmek istedi�iniz ��rencinin kimlik numaras�n� giriniz.");
			String silinckOgrKimlkNo=scan.next();
			for (Kisi each : ogrenciList) {
				if (each.getKimlikNo().contains(silinckOgrKimlkNo)) {
					System.out.println("Silinecek ��renci: "+each.getAdSoyad());
					ogrenciList.remove(each);
					kontrol=false;
					break;
				}
			}
			if (kontrol) {
				System.out.println("Arad�g�n�z ��renci listede mevcut de�il!");
			}
		
	} else {
		System.out.println("Silmek istedi�iniz ��retmenin kimlik numaras�n� giriniz.");
		String silinckOgrtKimlikNo=scan.next();
		for (Kisi each : ogretmenList) {
			if (each.getKimlikNo().contains(silinckOgrtKimlikNo)) {
				System.out.println("Silinecek ��retmen: "+each.getAdSoyad());
				ogretmenList.remove(each);
				kontrol=false;
				break;
			}
		}
		if (kontrol) {
			System.out.println("Arad�g�n�z ��retmen listede mevcut de�il!");
		}
	}
	

}
}
