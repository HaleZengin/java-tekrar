package tekrar16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

	static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Soðan","Havuç","Elma","Muz","Çilek","Kavun","Uzum","Limon"));
	static List<Double> fiyatlari = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
	static List<String> sepeturunleri = new ArrayList<>();
	static List<Double> sepetKg = new ArrayList<>();
	static List<Double> sepetFiyatlar = new ArrayList<>();
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Basarili Market alýþ-veriþ programý.
		 *
		 * 1. Adým: Ürünler ve fiyatlarý içeren listeleri oluþturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soðan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
		 * 4. Adým: Alýnacak bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz.
		 * 5. Baþka bir ürün alýp almak istemediðini sorunuz.
		 * 6. Eðer devam etmek istiyorsa yeniden ürün seçme kýsmýna yönlendiriniz.
		 * 7. Eðer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programý bitirinzi.
		 */
		
		
		String devamMi = null;
		double toplamFiyat=0;
		

		do {
			urunListesi();
			System.out.print("Urün nosuna göre ürün seciniz...");
			int urunNo=scan.nextInt();
			System.out.println("Sectiginiz urunden kaç kg istiyorsunuz?");
			double kg=scan.nextDouble();
			
			sepeteEkle(urunNo,kg);
			
			toplamFiyat=sepetTutarý();
			
			System.out.println("Alýþveriþe devam etmek istiyor musunuz?\nDevam edecekseniz e' ye, etmeyecekseniz herhangi bir tuþa basýnýz...");
			devamMi=scan.next();
			
		}
	
		while (devamMi.equalsIgnoreCase("e"));
		
			odeme(toplamFiyat);
	}


	private static double sepetTutarý() {               // ürün ekledikce tutara eklesin
		double sptTutar=0;
		double sptKg=0;
		for (int i = 0; i < sepeturunleri.size(); i++) {
			sptTutar+=sepetFiyatlar.get(i);
			sptKg+=sepetKg.get(i);
			
		}
		System.out.println("Toplam odemeniz gereken miktar: "+sptTutar+" tl"+"\nAldýgýnýz ürünlerin miktarý: "+sptKg+" kg");
		return sptTutar;
	}


	private static void odeme(double toplamFiyat) {    // ödenecek fiyatý yazdýracagýz
		System.out.println("Ödemeniz gereken miktar : "+toplamFiyat );
		double nakit=0;
		do {
			System.out.println("Lutfen nakit odemenizi giriniz:");
			nakit+=scan.nextDouble();
			if (nakit<toplamFiyat) {
				System.out.println("Eksik odeme yaptýnýz. "+(toplamFiyat-nakit)+" daha odeme yapmanýz gerekiyo.");
			} else {

			}
			
		} while (nakit<toplamFiyat);
			double paraUstu=nakit-toplamFiyat;
			if (paraUstu>0) {
				System.out.println("Para üstünüz: "+paraUstu);
			}
			System.out.println("Yine bekleriz...Ýyi günler");
	}


	private static void sepeteEkle(int urunNo, double kg) {   //sectigimiz urunleri sepete ekler
		sepeturunleri.add(urunListesi.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlari.get(urunNo)*kg);
		
		
	}


	private static void urunListesi() {    //ürünleri yazdýrmak icin method olusturduk
		System.out.println("No\t Urunler \t Fiyatlar");
		System.out.println("===\t ======= \t =======");
		
		for (int i = 0; i < urunListesi.size(); i++) {
			System.out.println(" "+i+"\t"+urunListesi.get(i)+"        \t"+fiyatlari.get(i));
		}
		
	}

}
