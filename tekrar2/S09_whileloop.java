package tekrar2;

import java.util.Scanner;

public class S09_whileloop {

	public static void main(String[] args) {
		/*
		 kullan�c�dan asag�daki sekli yapmak icin sat�r say�s� girmesini isteyin
		 kullan�c� eger 4 girerse:
		 
		 A1
		 AB2
		 ABC3
		 ABCD4
		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi=Math.abs(scan.nextInt());
		
		int i=1;
		char c='A'; 
		while (i<=sayi) {
			for (int j = 1; j<=i; j++) {
				System.out.print(c);
				c++;
			}
			
			c='A';
			System.out.println(i);		
			i++;
		}
		scan.close();
	}

}
