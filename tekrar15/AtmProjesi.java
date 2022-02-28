package tekrar15;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		
		double bakiye = 5000;
		Scanner scan= new Scanner(System.in);

		System.out.println("Bankamýza Hoþgeldiniz");
		System.out.println("Güncel Bakiyeniz: "+bakiye+" tl' dir.");
		
		while (bakiye>0) {
			System.out.println();
			System.out.println("1- Para yatýr");
			System.out.println("2- Para çek");
			System.out.println("3- Bakiye sorgula");
			System.out.println("4- Çýkýþ yap");
			System.out.println("Yapmak istediðiniz iþlemi seçiniz");
			int input=scan.nextInt();
			
		if (input==1) {
			System.out.println("Yatýrmak istediginiz tutarý giriniz:");
			int yatýrTutar=scan.nextInt();
			bakiye+=yatýrTutar;
			System.out.println("Yeni bakiyeniz: "+bakiye+" tl'dir.");
		} else if (input==2) {
			System.out.println("Çekmek istediginiz tutarý giriniz");
			int cekmeTutar=scan.nextInt();
			if (cekmeTutar>2000) {
				System.out.println("Günlük para çekme sýnýrý 2000 tl'dir.");
			} else if (bakiye<cekmeTutar) {
				System.out.println("Bakiyenizden daha büyük bir tutarý çekemezsiniz.");
			} else {
			bakiye-=cekmeTutar;
			System.out.println("Yeni bakiyeniz: "+bakiye+" tl'dir.");
			}
		} else if (input==3) {
			System.out.println("Güncel Bakiyeniz: "+bakiye+" tl' dir.");
		} else if (input==4) {
			System.out.println("Çýkýþ yapýlýyor...");
			break;
		} else {
			System.out.println("Yanlýþ bir tuþa bastýnýz...");
			
		}
		
		
	}
		System.out.println("Tekrar bekleriz!");
		scan.close();

	}
}
