package tekrar4;

import java.util.Scanner;

public class S06_StringManipulation {

	public static void main(String[] args) {

		// uzunlugu �ift say� olan bir stringin yar�s�n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir string giriniz");
		String str=scan.nextLine();
		
		if (str.length()%2==0) {
			
			System.out.println("girilen string'in ilk yar�s� : "+str.substring(0, str.length()/2));
		} else {
			System.out.println("girdiginiz string'in uzunlugu cift say� degildir");
		}
		
		scan.close();
	}

}
