package tekrar14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {

	public static void main(String[] args) {
		
		/*
		 * Bir tane film isim listesi oluþturun
		 * Kullanýcýdan liste uzunlugunda bir sayý isteyip, o sýradaki filmi cagýrýn
		 * Filmin ismindeki harfleri "-" olacak sekilse cevirip kullanýcýya gösterin
		 * Kullanýcýdan bir harf tahmin etmesini isteyin
		 * Bu harfin film isminde olup olmadýgýný kontrol edin
		 * Girilen harf dogru ise ismin tamamýnda bu harfi gösterin
		 * Toplam kac yanlýs harf tahmin edildigini gösterin ve sýnýr asýldýysa kaybettin yazdýrýn
		 * Eger hepsi dogru tahmin edildiyde kazandýn yazdýrýn
		 *  
		 */

		
		List <String> filmListesi= new ArrayList <>();    											//film listesi olusturduk 
		filmListesi.add("Titanik");
		filmListesi.add("Yüzüklerin Efendisi");
		filmListesi.add("Gad father");
		filmListesi.add("Doktor");
		filmListesi.add("Cesur Yürek");
		filmListesi.add("Zübük");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 1'den "+filmListesi.size()+"'a kadar bir sayý giriniz"); 		//kullanýcýdan sayý istedik
		int sira=scan.nextInt()-1;
		
		String filmAdi=filmListesi.get(sira).toLowerCase();											//kullanýcýnýn girdigi sayýya karsýlýk gelen filmi filmAdi içine kayduk
		
		String gizliIsim= filmAdi.replaceAll("\\S", "-"); 	
		//film harflerini - seklinde dönüþtürüp gizliIsim 'in içine atar
		System.out.println(gizliIsim);
		
		List<Integer> indexList= new ArrayList<>();  												//girilen harfleri indexList'e attýk
		
		int sayac=0;  																				//girilen yanlýs harfi sayacak
		
		do {
			
		
		System.out.println("Lutfen bir harf tahmin ediniz...");  									//kullanýcýdan harf istedik
		char harf= scan.next().toLowerCase().charAt(0);
		
		String hrf=Character.toString(harf); 														//harf 'i string'e cevirip hrf' nin içine attýk
		if (!filmAdi.contains(hrf)) { 																//bunu contains metodunu kullanmak için yaptýk
			sayac++;
		}
		
		if (sayac==3) { 																			//3 kere yanlýþ girince kaybedecek
			System.out.println("3 tahmin sayýsýný doldurdunuz. Kaybettiniz...");
			break;
		}
		System.out.println(sayac+" kere hatalý girdiniz. Kalan hakkýnýz: "+(3-sayac));
		
		
		
		for (int i = 0; i < filmAdi.length() ; i++) { 												//girilen harfi ---- olan kýsýmda yerine koy
			if (filmAdi.charAt(i)==harf) {
				indexList.add(i);
			}
			
		}
		
		for (int i = 0; i < indexList.size(); i++) {  											//gizli isimde girilen harfi gösterecegiz
			gizliIsim=gizliIsim.substring(0, indexList.get(i))+filmAdi.substring(indexList.get(i), indexList.get(i)+1)
			+gizliIsim.substring(indexList.get(i)+1);
		} System.out.println(gizliIsim);
		
		if (filmAdi.equalsIgnoreCase(gizliIsim)) {
			System.out.println("Tebrikler kazandýnýz!!!");
		}
		
		} while (!filmAdi.equalsIgnoreCase(gizliIsim)); 												//girilen harf film adýna esit oldugunda bitecek
		
		
	
	}

}
