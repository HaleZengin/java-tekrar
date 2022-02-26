package tekrar6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavTekrar {

	static List<String> urunListesi= new ArrayList<>();
	static List<Double> urunFiyatlari= new ArrayList<>();
	static double toplamOdenecekTutar;
	
	public static void main(String[] args) {
		
		 /*
         * Basit bir 5 �r�nl� manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
		
		
		urunListesi.add("Erik, urun kodu: 1");
		urunListesi.add("Elma, urun kodu: 2");
		urunListesi.add("Muz, urun kodu: 3");
		urunListesi.add("Kivi, urun kodu: 4");
		urunListesi.add("Seftali, urun kodu: 5");
		
		urunFiyatlari.add(5.5);
		urunFiyatlari.add(4.0);
		urunFiyatlari.add(11.90);
		urunFiyatlari.add(7.5);
		urunFiyatlari.add(8.90);
		
		System.out.println("Urunlerimizin listesi: "+urunListesi);
		
		m�steriSecim();   // m�steri �r�n secmesi icin method yapt�k
		
		
	}
	

	@SuppressWarnings("resource")
	private static void m�steriSecim() {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Hangi uru istiyorsaniz o urunun kodunu giriniz");
		int secim=scan.nextInt();
		
		System.out.println("Sectiginiz urunden ka� kg almak istersiniz?");
		double kilo=scan.nextDouble();
		
		
		double urunToplamTutar = kilo*urunFiyatlari.get(secim - 1);
		
		toplamOdenecekTutar+=urunToplamTutar;
		
		System.out.println("Alisverise devam edecekseniz 1'e , kasaya gitmek icin 2'ye basiniz\nBaska bir tusa basman�z halinde yeniden giris yapman�z gerekecektir..");
		
		int karar=scan.nextInt();
		
		if (karar==1) {
			m�steriSecim();    //karar 1 ise method yine cal��s�n
			
		} else if(karar==2) {
			kasa();
			
		} else {
			System.out.println("1 veya 2'den baska bir say� girdiginiz icin yeniden giris yap�n�z");
		}
		
		
		
	}

	@SuppressWarnings("resource")
	private static void kasa() {
		
		
		System.out.println("Alisverisinizin toplam tutari: "+toplamOdenecekTutar);
		System.out.println("Nakit odeme yapmak icin 1'e , taksitli odeme yapmak icin 2'ye bas�n�z");
		Scanner scan= new Scanner(System.in);
		int odemeSecimi=scan.nextInt();
		
		switch (odemeSecimi) {
		
		case 1: System.out.println("Nakit odemeyi sectiniz. Toplam odeyeceginiz tutar : "+toplamOdenecekTutar);
			break;
		case 2: System.out.println("Taksitli odemeyi sectiniz. Yapacag�m�z taksit say�s� 3' tur.\nToplam odeyeceginiz tutar : "+toplamOdenecekTutar+"\nHer ay odeyeceginiz tutar: "+(toplamOdenecekTutar/3));
			break;
		default : System.out.println("Yanl�s bir tusa bast�n�z");
		
		
		}
		
		System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.\nYine bekleriz");
		
	}
	

}
