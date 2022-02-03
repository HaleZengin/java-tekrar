package tekrar3;

import java.util.Scanner;

public class S01 {

	public static void main(String[] args) {
		 /*
           Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bes basamaklý bir sayý giriniz");
		int sayi=scan.nextInt();
		String sayi1=""+sayi;
		
		if (sayi1.length()>5 || sayi1.length()<5) {
			System.out.println("Lutfen girdiginiz sayý 5 basamaklý olsun");
		} else {
			int sayi1Int=Integer.valueOf(sayi1);
			
			int ilk2=sayi1Int/1000;
			int son2=sayi1Int%100;
			
			int ilk2Toplam=ilk2%10+ilk2/10;
			int son2Toplam=son2%10+son2/10;
			
			System.out.println(ilk2Toplam+son2Toplam);
			
		}
		
		scan.close();
	}

}
