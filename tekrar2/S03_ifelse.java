package tekrar2;

import java.util.Scanner;

public class S03_ifelse {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir sayi alýn 
		 sayý 0 dan büyük yada eþit ise 10'dan kucuk olup olmadýgýný kontrol et
		 10'dan kucuk ise ekrana "rakam" yazdýr degilse "pozitif sayý" yazdýr
		 sayý 02dan kucuk ise ekrana "negatif sayý yazdýr"
		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayý giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>=0) {
			if (sayi<10) {
				System.out.println("Girilen sayý bir rakamdýr");
			} else {
				System.out.println("Girilen sayý pozitiftir");
			}

		} else {
			System.out.println("Girilen sayý negatiftir");
		}
		
		System.out.println();
		
		// ternary ile cözüm:
		
		String sonuc=(sayi>=0)?((sayi<10)?("Girilen sayý bir rakamdýr"):("Girilen sayý pozitiftir")) : ("Girilen sayý negatiftir");
		System.out.println(sonuc);
		
		scan.close();
	}

}
