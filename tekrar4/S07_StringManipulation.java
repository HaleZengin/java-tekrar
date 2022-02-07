package tekrar4;

import java.util.Scanner;

public class S07_StringManipulation {

	public static void main(String[] args) {
		//Kullanýcýdan isim v soy ismini alýnýz. 
        // Örn. Mustafa Murat Zengin => M.M.Z  formatýyla yazdýrýnýz.

		Scanner scan=new Scanner(System.in);
		System.out.println("isiminizi ve soy isiminizi giriniz");
		String isim=scan.nextLine();
		
		int sayac=1;
		
		 for(int i = 0; i < isim.length(); i++)
	        {
	            if(isim.charAt(i) == ' ') {
	                sayac++;
	            }
	        }
		 System.out.println(sayac+" kelimeli bir ismin-soyisim blogu girdiniz");
		
		 System.out.println("<========================>");
		 
		if (sayac==2) {
			char q=isim.toUpperCase().charAt(0);
			char w=isim.toUpperCase().charAt(0);
			
			System.out.println("Girilen ismin ve soyismin kýsaltmasý: "+q+"."+w);
			
		} else if (sayac==3) {
			char x=isim.toUpperCase().charAt(0);
			char y=isim.toUpperCase().charAt(isim.indexOf(" ")+1);
			char z=isim.toUpperCase().charAt(0);
			
			System.out.println("Girilen ismin ve soyismin kýsaltmasý: "+x+"."+y+"."+z);
			
		} else if (sayac==4) {
			char a=isim.toUpperCase().charAt(0);
			char b=isim.toUpperCase().charAt(isim.indexOf(" ")+1);
			char c=isim.toUpperCase().charAt(isim.indexOf(" ",isim.indexOf(" ")+1)+1);
			char d=isim.toUpperCase().charAt(isim.lastIndexOf(" ")+1);
			
			System.out.println("Girilen ismin ve soyismin kýsaltmasý: "+a+"."+b+"."+c+"."+d);
			
		} else
		
			System.out.println("Lutfen dort kelimeden fazla girmeyiniz.Zira programý yazamadým.Yeter...");
		
	
	
		scan.close();
		
	}

}
