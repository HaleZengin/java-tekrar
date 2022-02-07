package tekrar4;

import java.util.Scanner;

public class S02_StringManipulation {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim giriniz");
		String isim=scan.nextLine();
		
		//if ile çözümü:
		char c1=isim.charAt(0);
		char c2=isim.charAt(1);
		char c3=isim.charAt(2);
		
		if (isim.length()==3) {
			
			if (c1!=c2 && c1!=c3 && c2!=c3) {
				System.out.println("girilen isim 3 harfli ve farklýdýr");
				
			} else {
				System.out.println("girilen isim 3 harfli ama farklý degil");
			}
			
		} else {
			System.out.println("girilen isim 3 harflý degildir");
		}
		System.out.println("<=============>");
		//ternary ile çözümü:
		String sonuc=(isim.length()==3) ? ( (c1!=c2 && c1!=c3 && c2!=c3)? ("girilen isim 3 harfli ve farklýdýr") : ("girilen isim 3 harfli ama farklý degil") ) : ("girilen isim 3 harflý degildir");
		System.out.println(sonuc);
		
		scan.close();
	}

}
