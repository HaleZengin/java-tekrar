package tekrar2;

import java.util.Scanner;

public class S06_switchcase {

	public static void main(String[] args) {
		/*
		 Markete giden bir m�steriden ald�g� urun say�s�n� ve toplam �deyeceg� fiyat� al�n
		 Eger m�sterinin kart� var urun say�s� 20den fazla ise %20 indirim, degilse %10 indirim uygula
		 Eger m�sterinin kart� yoksa urun say�s� 20den fazla ise %15 indirim, degilse %8 indirim uygula
		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Ald�g�n�z �r�n say�s� nedir?");
		int urun=scan.nextInt();
		System.out.println("Toplam �deyeceginiz miktar nedir?");
		double odeme=scan.nextDouble();
		
		System.out.println("Marketiminiz kart� var m�?\nvarsa 1'e yoksa 2'ye bas�n�z");
		int kart=scan.nextInt();
		
		switch(kart) {
		case 1 : 
			if (urun>20) {
				odeme=(odeme*0.8);
				System.out.println("Ald�g�n�z urunlerin indirimli hali = "+odeme);
			} else {
				odeme=(odeme*0.9);
				System.out.println("Ald�g�n�z urunlerin indirimli hali = "+odeme);
			}
			break;
		case 2 : 
			if (urun>20) {
				odeme=(odeme*0.85);
				System.out.println("Ald�g�n�z urunlerin indirimli hali = "+odeme);
			} else {
				odeme=(odeme*0.92);
				System.out.println("Ald�g�n�z urunlerin indirimli hali = "+odeme);
			}
			break;
			default :
				System.out.println("Lutfen 1 ya da 2'ye bas�n�z");
		}
		
		scan.close();
	}

}
