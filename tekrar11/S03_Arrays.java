package tekrar11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S03_Arrays {

	public static void main(String[] args) {
		// Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
		//   toplamýný bulunuz. Sonucu ekrana yazdýrýnýz.

		List<String> list=new ArrayList<>();
		Scanner scan=new Scanner (System.in);
		System.out.println("List'e atamak icin sayi giriniz");
		System.out.println("Yeterli sayiya ulastýgýnýzda'q' giriniz");
		
		int toplam=0;
		
		String islem="";
		
		while (!islem.equalsIgnoreCase("q")) { //kullanýcýnýn girdigi veriler q olmayana kadar calýs
			
			System.out.println("Sayý giriniz:");
			islem=scan.next();
			list.add(islem);
			
		}
		
		list.remove(list.size()-1);  // q 'yu sildik diger degerler var
		
		//list'in icine girip elemanlarýn karelerinin toplamýný bul
		
		for (String w : list) {
			int x=Integer.parseInt(w);   //Stringi integera cevirdik
			toplam+=x*x;
			
		}
		
		System.out.println("Girilen sayilarin kareleri toplami= "+toplam);
		
		scan.close();
	}

}
