package tekrar8;

import java.util.Scanner;

public class S05_DoWhileLoop {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir say� iste.
		 100'den kucuk ise "kazand�n�z"
		 de�ilse "kaybettiniz" yazd�r�n
		 */
		
		Scanner scan=new Scanner(System.in);
	
		int n=0;
		do {
			System.out.println("lutfen bir tamsay� giriniz..");
			
			n=scan.nextInt();
			
			if (n<100) {
				System.out.println("kazand�n�z");
			}		
			
		} while (n<100);
		
		System.out.println("kaybettiniz");
		
		scan.close();
	}

}
