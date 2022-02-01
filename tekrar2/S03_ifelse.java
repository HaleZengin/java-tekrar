package tekrar2;

import java.util.Scanner;

public class S03_ifelse {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir sayi al�n 
		 say� 0 dan b�y�k yada e�it ise 10'dan kucuk olup olmad�g�n� kontrol et
		 10'dan kucuk ise ekrana "rakam" yazd�r degilse "pozitif say�" yazd�r
		 say� 02dan kucuk ise ekrana "negatif say� yazd�r"
		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsay� giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>=0) {
			if (sayi<10) {
				System.out.println("Girilen say� bir rakamd�r");
			} else {
				System.out.println("Girilen say� pozitiftir");
			}

		} else {
			System.out.println("Girilen say� negatiftir");
		}
		
		System.out.println();
		
		// ternary ile c�z�m:
		
		String sonuc=(sayi>=0)?((sayi<10)?("Girilen say� bir rakamd�r"):("Girilen say� pozitiftir")) : ("Girilen say� negatiftir");
		System.out.println(sonuc);
		
		scan.close();
	}

}
