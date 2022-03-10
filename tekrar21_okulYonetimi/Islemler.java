package tekrar21_okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler  {
	
	
		
	

	/*
	BÝR OKUL YÖNETÝM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öðrenci ve Öðretmen Kayýtlarý ile ilgili iþlemler yapýlabilmelidir.
		Kayýtlarda þu bilgiler olabilmelidir.

		Öðretmen: Ad-Soyad,  kimlik No, yaþ, bölüm, ve sicil No bilgileri içermelidir.
		Öðrenci: Ad-Soyad,  kimlik No, yaþ, numara, sýnýf bilgileri içermelidir.

	2.	Program baþladýðýnda Kullanýcýya, Öðretmen ve Öðrenci iþlemlerini seçebilmesi için
		Aþaðýdaki gibi bir menü gösterilsin.

	====================================
	 ÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ
	====================================
	 1- ÖÐRENCÝ ÝÞLEMLERÝ
	 2- ÖÐRETMEN ÝÞLEMLERÝ
	 Q- ÇIKIÞ

	3.	Seçilen Kiþi türüne göre aþaðýdaki iþlemleri gösteren bir alt menü daha gösterilsin.

	============= ÝÞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LÝSTELEME
		 4-SÝLME
		 5-ANA MENÜ
		 Q-ÇIKIÞ

	SEÇÝMÝNÝZ:

	4.	Ýþlemler menüsünde seçilen iþleme göre bir önceki menüde seçilen Kiþi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kiþileri listeleme gibi iþlemler yapýlabilmelidir.
		Bunun yanýnda bir üst menüye dönme veya çýkýþ iþlemleri de yapýlabilmelidir.

 */
	
	
	static List<Kisi> ogrenciList = new ArrayList<>();
	static List<Kisi> ogretmenList = new ArrayList<>();
	
	Scanner scan= new Scanner(System.in);
	
	static String kisiTuru;
	
	@SuppressWarnings("resource")
	public static void anaMenu() {
		Scanner scan= new Scanner(System.in);
		System.out.println("ÖÐRENCÝ VE ÖÐRETMEN ÝÞLEMLERÝ PANELÝNE HOÞGELDÝNÝZ \n1- ÖÐRENCÝ ÝÞLEMLERÝ \n2- ÖÐRETMEN ÝÞLEMLERÝ \n3- ÇIKIÞ");
		System.out.println("YAPMAK ÝSTEDÝÐÝNÝZ ÝÞLEMLERÝ SEÇÝNÝZ...");
		
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
			System.out.println("Yanlýþ bir giriþ yaptýnýz!\nLutfen tekrar seçim yapýnýz...");
			anaMenu();
			break;
		
		}
		
	
	}
	
	
	private static void cikis() {
		System.out.println("Uygulamadan çýkýþýnýz yapýldý! Yine bekleriz...");
		
	}



	@SuppressWarnings("resource")
	private static void islemMenusu() {
		System.out.println("Sectiginiz  Kiþi turu icin  aþaðýdaki iþlemlerden tercih yapýnýz.\r\n"
                + "============= ÝÞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LÝSTELEME\r\n"
                + "     4-SÝLME\r\n"
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
        	System.out.println("Yanlýþ bir giriþ yaptýnýz!\nLutfen tekrar seçim yapýnýz...");
        	islemMenusu();
        	break;
             
        }
        
        
    	
	}



	@SuppressWarnings("resource")
	private static void ekleme() {
		System.out.println("********* "+kisiTuru+" ekleme sayfasý *********");
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ad ve soyad giriniz.");
		String adSoyad=scan.nextLine();
		System.out.println("Lutfen kimlik numarasý giriniz.");
		String kimlikNo=scan.next();
		System.out.println("Lutfen yasý giriniz.");
		int yas=scan.nextInt();
		
		if (kisiTuru.equals("OGRENCI")) {
			System.out.println("Lutfen ogrenci numarasýný giriniz.");
			int numara=scan.nextInt();
			System.out.println("Lutfen ogrenci sýnýfýný giriniz.");
			String sinif=scan.next();
			
			Ogrenci ogrenci= new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenci.toString()+" eklendi...");
			
		} else {
			System.out.println("Lutfen ogretmenin bölümünü giriniz.");
			String bolum=scan.nextLine();
			System.out.println("Lutfen ogretmen sicil numarasýný giriniz.");
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
			System.out.println("Aradýgýnýz öðrencinin kimlik numarasýný giriniz.");
			String araOgrKimlikNo=scan.next();
			for (Kisi each : ogrenciList) {
				if (each.getKimlikNo().equals(araOgrKimlikNo)) {
					System.out.println("Aradýgýnýz öðrenci: "+each.getAdSoyad());
					kontrol=false;
				}
			}
			if (kontrol) {
				System.out.println("Aradýgýnýz öðrenci listede mevcut deðil!");
			}
        	
     	
		} else {
			System.out.println("Aradýgýnýz öðretmenin kimlik numarasýný giriniz.");
			String araOgrtKimlikNo=scan.next();
			for (Kisi each : ogretmenList) {
				if (each.getKimlikNo().equals(araOgrtKimlikNo)) {
					System.out.println("Aradýðýnýz öðretmen: "+each.getAdSoyad());
					kontrol=false;
				}
			}
			if (kontrol) {
				System.out.println("Aradýgýnýz öðretmen listede mevcut deðil!");
			}
			
		}
     
		
	}


	private static void listeleme() {
		System.out.println("********* "+kisiTuru+" listeleme sayfasý *********");
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
			System.out.println("Silmek istediðiniz öðrencinin kimlik numarasýný giriniz.");
			String silinckOgrKimlkNo=scan.next();
			for (Kisi each : ogrenciList) {
				if (each.getKimlikNo().contains(silinckOgrKimlkNo)) {
					System.out.println("Silinecek öðrenci: "+each.getAdSoyad());
					ogrenciList.remove(each);
					kontrol=false;
					break;
				}
			}
			if (kontrol) {
				System.out.println("Aradýgýnýz öðrenci listede mevcut deðil!");
			}
		
	} else {
		System.out.println("Silmek istediðiniz öðretmenin kimlik numarasýný giriniz.");
		String silinckOgrtKimlikNo=scan.next();
		for (Kisi each : ogretmenList) {
			if (each.getKimlikNo().contains(silinckOgrtKimlikNo)) {
				System.out.println("Silinecek öðretmen: "+each.getAdSoyad());
				ogretmenList.remove(each);
				kontrol=false;
				break;
			}
		}
		if (kontrol) {
			System.out.println("Aradýgýnýz öðretmen listede mevcut deðil!");
		}
	}
	

}
}
