package tekrar2;

import java.util.Scanner;

public class S06_switchcase {

	public static void main(String[] args) {
		/*
		 Markete giden bir müsteriden aldýgý urun sayýsýný ve toplam ödeyecegý fiyatý alýn
		 Eger müsterinin kartý var urun sayýsý 20den fazla ise %20 indirim, degilse %10 indirim uygula
		 Eger müsterinin kartý yoksa urun sayýsý 20den fazla ise %15 indirim, degilse %8 indirim uygula
		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Aldýgýnýz ürün sayýsý nedir?");
		int urun=scan.nextInt();
		System.out.println("Toplam ödeyeceginiz miktar nedir?");
		double odeme=scan.nextDouble();
		
		System.out.println("Marketiminiz kartý var mý?\nvarsa 1'e yoksa 2'ye basýnýz");
		int kart=scan.nextInt();
		
		switch(kart) {
		case 1 : 
			if (urun>20) {
				odeme=(odeme*0.8);
				System.out.println("Aldýgýnýz urunlerin indirimli hali = "+odeme);
			} else {
				odeme=(odeme*0.9);
				System.out.println("Aldýgýnýz urunlerin indirimli hali = "+odeme);
			}
			break;
		case 2 : 
			if (urun>20) {
				odeme=(odeme*0.85);
				System.out.println("Aldýgýnýz urunlerin indirimli hali = "+odeme);
			} else {
				odeme=(odeme*0.92);
				System.out.println("Aldýgýnýz urunlerin indirimli hali = "+odeme);
			}
			break;
			default :
				System.out.println("Lutfen 1 ya da 2'ye basýnýz");
		}
		
		scan.close();
	}

}
