package tekrar3;

import java.util.Scanner;

public class S06 {

	public static void main(String[] args) {
		/*
		 * Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z.
		
		 * M�kemmel say� : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine
		 * e�itse o say� m�kemmeldir.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int sayi=scan.nextInt();
		
		int bolenToplamlar�=0;
		int i=1;
		
		//do while loop ile :
		
		do {
			if (sayi%i==0) {
				bolenToplamlar�+=i;
			}
			i++;
			
			
		} while (i<sayi);
		if (sayi==bolenToplamlar�) {
			System.out.println(sayi+" m�kemmel say�d�r");
		} else {
			System.out.println(sayi+" m�kemmel say� degildir");
		}

		
		scan.close();
	}

}
