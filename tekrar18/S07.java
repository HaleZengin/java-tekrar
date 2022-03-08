package tekrar18;

import java.util.Arrays;
import java.util.HashSet;

public class S07 {

	public static void main(String[] args) {
		
		 /*
	    Main method altinda bir double hashSet olusturunuz.
	    ve bu seti, adi setOlustur ve return tipi hashSet double olan
	    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
	    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double(Çift) hashSet kabul edecek ayri bir method olusturarak
	    hashSetin degerlerinin toplamini alacaksiniz.

	    Çýktý--> sonuc = 44.69
	     */
		
		
		HashSet<Double> hs = setOlustur();
		System.out.println(hs);
		
		double toplam= toplaminiAl(hs);
		System.out.println(toplam);

	}

	private static double toplaminiAl(HashSet<Double> hs) {
		double toplam=0;
		for (Double each : hs) {
			toplam+=each;
		}
		return toplam;
	}

	private static HashSet<Double> setOlustur() {
		HashSet<Double> hs = new HashSet<>(Arrays.asList(3.23, 3.10, 5.12, 10.12, 23.12));
		
		return hs;
	}

	

}
