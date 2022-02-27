package tekrar14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {

	public static void main(String[] args) {
		
		/*
		 * Bir tane film isim listesi olu�turun
		 * Kullan�c�dan liste uzunlugunda bir say� isteyip, o s�radaki filmi cag�r�n
		 * Filmin ismindeki harfleri "-" olacak sekilse cevirip kullan�c�ya g�sterin
		 * Kullan�c�dan bir harf tahmin etmesini isteyin
		 * Bu harfin film isminde olup olmad�g�n� kontrol edin
		 * Girilen harf dogru ise ismin tamam�nda bu harfi g�sterin
		 * Toplam kac yanl�s harf tahmin edildigini g�sterin ve s�n�r as�ld�ysa kaybettin yazd�r�n
		 * Eger hepsi dogru tahmin edildiyde kazand�n yazd�r�n
		 *  
		 */

		
		List <String> filmListesi= new ArrayList <>();    											//film listesi olusturduk 
		filmListesi.add("Titanik");
		filmListesi.add("Y�z�klerin Efendisi");
		filmListesi.add("Gad father");
		filmListesi.add("Doktor");
		filmListesi.add("Cesur Y�rek");
		filmListesi.add("Z�b�k");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 1'den "+filmListesi.size()+"'a kadar bir say� giriniz"); 		//kullan�c�dan say� istedik
		int sira=scan.nextInt()-1;
		
		String filmAdi=filmListesi.get(sira).toLowerCase();											//kullan�c�n�n girdigi say�ya kars�l�k gelen filmi filmAdi i�ine kayduk
		
		String gizliIsim= filmAdi.replaceAll("\\S", "-"); 	
		//film harflerini - seklinde d�n��t�r�p gizliIsim 'in i�ine atar
		System.out.println(gizliIsim);
		
		List<Integer> indexList= new ArrayList<>();  												//girilen harfleri indexList'e att�k
		
		int sayac=0;  																				//girilen yanl�s harfi sayacak
		
		do {
			
		
		System.out.println("Lutfen bir harf tahmin ediniz...");  									//kullan�c�dan harf istedik
		char harf= scan.next().toLowerCase().charAt(0);
		
		String hrf=Character.toString(harf); 														//harf 'i string'e cevirip hrf' nin i�ine att�k
		if (!filmAdi.contains(hrf)) { 																//bunu contains metodunu kullanmak i�in yapt�k
			sayac++;
		}
		
		if (sayac==3) { 																			//3 kere yanl�� girince kaybedecek
			System.out.println("3 tahmin say�s�n� doldurdunuz. Kaybettiniz...");
			break;
		}
		System.out.println(sayac+" kere hatal� girdiniz. Kalan hakk�n�z: "+(3-sayac));
		
		
		
		for (int i = 0; i < filmAdi.length() ; i++) { 												//girilen harfi ---- olan k�s�mda yerine koy
			if (filmAdi.charAt(i)==harf) {
				indexList.add(i);
			}
			
		}
		
		for (int i = 0; i < indexList.size(); i++) {  											//gizli isimde girilen harfi g�sterecegiz
			gizliIsim=gizliIsim.substring(0, indexList.get(i))+filmAdi.substring(indexList.get(i), indexList.get(i)+1)
			+gizliIsim.substring(indexList.get(i)+1);
		} System.out.println(gizliIsim);
		
		if (filmAdi.equalsIgnoreCase(gizliIsim)) {
			System.out.println("Tebrikler kazand�n�z!!!");
		}
		
		} while (!filmAdi.equalsIgnoreCase(gizliIsim)); 												//girilen harf film ad�na esit oldugunda bitecek
		
		
	
	}

}
