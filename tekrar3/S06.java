package tekrar3;

import java.util.Scanner;

public class S06 {

	public static void main(String[] args) {
		/*
		 * Bir sayýnýn mükemmel olup olmadýðýný bulan bir program yazýnýz.
		
		 * Mükemmel sayý : bir sayýnýn kendisi hariç bölenlerinin toplamý, kendisine
		 * eþitse o sayý mükemmeldir.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int sayi=scan.nextInt();
		
		int bolenToplamlarý=0;
		int i=1;
		
		//do while loop ile :
		
		do {
			if (sayi%i==0) {
				bolenToplamlarý+=i;
			}
			i++;
			
			
		} while (i<sayi);
		if (sayi==bolenToplamlarý) {
			System.out.println(sayi+" mükemmel sayýdýr");
		} else {
			System.out.println(sayi+" mükemmel sayý degildir");
		}

		
		scan.close();
	}

}
