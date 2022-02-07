package tekrar4;

import java.util.Scanner;

public class S06_StringManipulation {

	public static void main(String[] args) {

		// uzunlugu çift sayý olan bir stringin yarýsýný yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir string giriniz");
		String str=scan.nextLine();
		
		if (str.length()%2==0) {
			
			System.out.println("girilen string'in ilk yarýsý : "+str.substring(0, str.length()/2));
		} else {
			System.out.println("girdiginiz string'in uzunlugu cift sayý degildir");
		}
		
		scan.close();
	}

}
