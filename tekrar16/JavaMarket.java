package tekrar16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

	static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates","Patates","Biber","So�an","Havu�","Elma","Muz","�ilek","Kavun","Uzum","Limon"));
	static List<Double> fiyatlari = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
	static List<String> sepeturunleri = new ArrayList<>();
	static List<Double> sepetKg = new ArrayList<>();
	static List<Double> sepetFiyatlar = new ArrayList<>();
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Basarili Market al��-veri� program�.
		 *
		 * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.
		 * 			No 	   �r�n 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 So�an      	 2.30 TL
					04	 Havu�     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 �ilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 �z�m      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz.
		 * 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
		 * 4. Ad�m: Al�nacak bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z.
		 * 5. Ba�ka bir �r�n al�p almak istemedi�ini sorunuz.
		 * 6. E�er devam etmek istiyorsa yeniden �r�n se�me k�sm�na y�nlendiriniz.
		 * 7. E�er bitirmek istiyorsa �demeyi kontrol edip para ustu hesaplayarak  program� bitirinzi.
		 */
		
		
		String devamMi = null;
		double toplamFiyat=0;
		

		do {
			urunListesi();
			System.out.print("Ur�n nosuna g�re �r�n seciniz...");
			int urunNo=scan.nextInt();
			System.out.println("Sectiginiz urunden ka� kg istiyorsunuz?");
			double kg=scan.nextDouble();
			
			sepeteEkle(urunNo,kg);
			
			toplamFiyat=sepetTutar�();
			
			System.out.println("Al��veri�e devam etmek istiyor musunuz?\nDevam edecekseniz e' ye, etmeyecekseniz herhangi bir tu�a bas�n�z...");
			devamMi=scan.next();
			
		}
	
		while (devamMi.equalsIgnoreCase("e"));
		
			odeme(toplamFiyat);
	}


	private static double sepetTutar�() {               // �r�n ekledikce tutara eklesin
		double sptTutar=0;
		double sptKg=0;
		for (int i = 0; i < sepeturunleri.size(); i++) {
			sptTutar+=sepetFiyatlar.get(i);
			sptKg+=sepetKg.get(i);
			
		}
		System.out.println("Toplam odemeniz gereken miktar: "+sptTutar+" tl"+"\nAld�g�n�z �r�nlerin miktar�: "+sptKg+" kg");
		return sptTutar;
	}


	private static void odeme(double toplamFiyat) {    // �denecek fiyat� yazd�racag�z
		System.out.println("�demeniz gereken miktar : "+toplamFiyat );
		double nakit=0;
		do {
			System.out.println("Lutfen nakit odemenizi giriniz:");
			nakit+=scan.nextDouble();
			if (nakit<toplamFiyat) {
				System.out.println("Eksik odeme yapt�n�z. "+(toplamFiyat-nakit)+" daha odeme yapman�z gerekiyo.");
			} else {

			}
			
		} while (nakit<toplamFiyat);
			double paraUstu=nakit-toplamFiyat;
			if (paraUstu>0) {
				System.out.println("Para �st�n�z: "+paraUstu);
			}
			System.out.println("Yine bekleriz...�yi g�nler");
	}


	private static void sepeteEkle(int urunNo, double kg) {   //sectigimiz urunleri sepete ekler
		sepeturunleri.add(urunListesi.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlari.get(urunNo)*kg);
		
		
	}


	private static void urunListesi() {    //�r�nleri yazd�rmak icin method olusturduk
		System.out.println("No\t Urunler \t Fiyatlar");
		System.out.println("===\t ======= \t =======");
		
		for (int i = 0; i < urunListesi.size(); i++) {
			System.out.println(" "+i+"\t"+urunListesi.get(i)+"        \t"+fiyatlari.get(i));
		}
		
	}

}
