package tekrar17;

import java.util.LinkedList;
import java.util.Scanner;

public class S04 {

	public static void main(String[] args) {
		/*
 		Node'larin deðereleri; "Ali" "Veli" "Ayse" "Can" olan bir LinkedList olusturun
 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
 	
		 */
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Ali");
		ll.add("Veli");
		ll.add("Ayse");
		ll.add("Can");
		System.out.println(ll);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz...");
		String isim=scan.next();
		
		if (ll.remove(isim)) {
			System.out.println("Bu isim LinkedList'de vardi ve silindi");
		} else {
			System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
			ll.add(isim);
			System.out.println("linkedlist'in yeni hali: "+ll);
		}
		
		

		scan.close();
	}

}
