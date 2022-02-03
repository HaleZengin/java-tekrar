package tekrar3;

import java.util.Scanner;

public class S07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir cumle ve bir harf alin,
		 * Cumlede harfin kac kere
		 * kullanildigini bulup, yazdirin
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cümle giriniz");
		String cumle=scan.nextLine();
		System.out.println("lutfen bir harf giriniz");
		String harf=scan.next().substring(0, 1);
		
		int count=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.substring(i, i+1).equals(harf)) {
				count++;
			}
		}
		System.out.println("Girdiginiz cumlede "+harf+" harfi "+count+" kere kullanýlmýþtýr");
		
		scan.close();
	}

}
