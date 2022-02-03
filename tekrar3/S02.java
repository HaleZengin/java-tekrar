package tekrar3;

import java.util.Scanner;

public class S02 {

	public static void main(String[] args) {
	 /* 
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.

        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      
      */
		Scanner scan=new Scanner(System.in);
		System.out.println("ücgenin bir kenarýný giriniz");
		double kenar1=scan.nextDouble();
		System.out.println("ücgenin diger kenarýný girinz");
		double kenar2=scan.nextDouble();
		
		double hipo=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		
		System.out.println("ücgenin bir kenar uzunlugu = "+kenar1);
		System.out.println("ücgenin diger kenar uzunlugu = "+kenar2);
		System.out.println("ücgenin hipotenüsü = "+hipo);

		scan.close();
	}

}
