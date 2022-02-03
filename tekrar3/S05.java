package tekrar3;

import java.util.Scanner;

public class S05 {

	public static void main(String[] args) {
		/*
		   Kullanicidan 10’dan kucuk bir sayi alin ve carpim tablosu olusturun 
		   tabloyu bu þekilde yapýnýz 1 2 3 4 
		                              2 4 6 8 
		                              3 6 9 12 
		                              4 8 12 16
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("10'dan kucuk bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= sayi; j++) {
				System.out.print(i*j+" ");
				
			}
			System.out.println();
		}
		
			System.out.println();
			
		/*
		   aþagýdaki þekilde yapýnýz
		   	4 3 2 1 
			8 6 4 2 
			12 9 6 3 
			16 12 8 4
		 */

		for (int l = 1; l <= sayi; l++) {
			for (int k = sayi; k >=1; k--) {
				System.out.print(l*k+ " ");
			}
			System.out.println();
		}
		
			System.out.println();
			
		/*	asagýdaký sekilde yapýnýz
			*
			**
			***
			****
		*/
			
		for (int n = 1; n <= sayi; n++) {
			for (int m = 1; m <=n ; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		
		scan.close();
	}

}
