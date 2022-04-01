package tekrar24_kelimeOyunu;

import java.util.Scanner;

public class Kelime_Oyunu {

	static int oyuncu=1;
	static int puan1=0;
	static int puan2=0;
	static String kelime="";
	static String ekleme="";

	public static void main(String[] args) {
		
		/* Iki kisinin oynayacagi bir kelime oyunu uretelim
		 * Kurallar
		 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
		 * 
		 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
		 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
		 *        ve 3.adima gecin 
		 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun 
		 *        kazandigini yazip oyunu bitirin
		 *        
		 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
		 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve 
		 *          basa mi sona mi ekleyecegini sorun
		 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
		 *          
		 *      *   Devam etmek istemezse 
		 *          "Oyun bitti" yazin
		 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin  
		 */
		

		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println(oyuncu +". oyuncu lutfen kelime giriniz");
		kelime=scan.next();
		
		
		// oyuncuyu degistirmek icin bir method yazalim
		oyuncuDegistir();
		
		onaySor();

}

	private static void onaySor() {
		System.out.println(oyuncu +". oyuncunun girdigi kelime: "+kelime);
		System.out.println("Girilen kelimeyi onaylýyor musunuz?\n1: Evet \n2: Hayýr");
		Scanner scan=new Scanner(System.in);
		int karar=scan.nextInt();
		
		if (karar==1) {
			if (oyuncu==1) {
				puan2+=kelime.length();
			} else {
				puan1+=kelime.length();
			}
			devamIstiyorMu();
		} else if(karar==2) {
			oyunuBitir();
		} else {
			System.out.println("Lutfrn 1 veya 2'ye basýnýz!");
		}
		
		scan.close();
	}

	private static void devamIstiyorMu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Oyuna devam etmek istiyor musunuz?\n1: Evet \n2: Hayýr");
		int karar=scan.nextInt();
		
		if (karar==1) {
			stringEkle();
		} else if(karar==2) {
			System.out.println("Oyun Bitti!!!");
			System.out.println("1. oyuncunun puaný: "+puan1);
			System.out.println("2. oyuncunun puaný: "+puan2);
			if (puan1>puan2) {
				System.out.println("1. oyuncu kazandý!");
			} else if(puan1<puan2) {
				System.out.println("2. oyuncu kazandý!");
			} else {
				System.out.println("Oyuncular berabere kaldý!");
			}
			
		} else {
			System.out.println("Lutfen 1 veya 2'ye basýnýz.");
		}
		
		
		scan.close();
	}

	private static void stringEkle() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kelimeye eklemek icin bir String giriniz");
		ekleme=scan.next();
		System.out.println("Kelimenin basina ekleme yapmak icin 1'e \nKelimenin sonuna eklemek icin 2'ye basýnýz.");
		int karar=scan.nextInt();
		if (karar==1) {
			kelime=ekleme+kelime;
		} else if(karar==2) {
			kelime=kelime+ekleme;
		} else {
			System.out.println("Lutfen 1 veya 2'ye basýnýz.");
		}
		
		oyuncuDegistir();
		onaySor();
		scan.close();
	}

	private static void oyunuBitir() {
		System.out.println("Gecersiz kelime!!!");
		System.out.println("Oyun Bitti...");
		System.out.println(oyuncu+". oyuncu kazandý!");
		
	}

	private static void oyuncuDegistir() {
		if (oyuncu==1) {
			oyuncu=2;
		} else {
			oyuncu=1;
		}
	}

	

}
