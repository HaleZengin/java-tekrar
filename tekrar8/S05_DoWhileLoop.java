package tekrar8;

import java.util.Scanner;

public class S05_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir sayý iste.
		 100'den kucuk ise "kazandýnýz"
		 deðilse "kaybettiniz" yazdýrýn
		 */
		
		Scanner scan=new Scanner(System.in);
	
		int n=0;
		do {
			System.out.println("lutfen bir tamsayý giriniz..");
			
			n=scan.nextInt();
			
			if (n<100) {
				System.out.println("kazandýnýz");
			}		
			
		} while (n<100);
		
		System.out.println("kaybettiniz");
		
		scan.close();
	}

}
