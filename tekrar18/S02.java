package tekrar18;

import java.util.HashSet;

public class S02 {

	public static void main(String[] args) {
		
		/*
		 * main method altinda bir double hashSet olusturunuz.
		 * ve bu seti, adý setOlustur ve return tipi hashSet double olan
		 * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
		 * kullanarak doldurun.
		 * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
		 * edecek ayri bir method olusturarak
		 * hashSetin degerlerinin toplamini alacaksiniz.
		 */

		HashSet<Double> hs = setOlustur();
		System.out.println("HashSet'in elemanlarý: "+hs);
		
		double toplam = toplaminiAl(hs);
		System.out.println("HashSet'in elemanlarýn toplamý: "+toplam);
	}

	private static Double toplaminiAl(HashSet<Double> hs) {
		double toplam=0;
		for (Double each : hs) {
			toplam+=each;
		}
		return toplam;
	}

	private static HashSet<Double> setOlustur() {
		HashSet<Double> hs = new HashSet<>();
		hs.add(3.23);
		hs.add(3.10);
		hs.add(5.12);
		hs.add(10.12);
		hs.add(23.12);
		
		
		return hs;
	}

}
