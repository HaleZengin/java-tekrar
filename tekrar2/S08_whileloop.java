package tekrar2;

import java.util.Scanner;

public class S08_whileloop {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir say� iste
		 girdigi say�n�n 10'a kadar carp�m tablosunu yazd�r
		 3x1=3 3x2=6........3x10=30 seklinde yazd�r
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi=scan.nextInt();
		
		int i=1;
		while (i<=10) {
			System.out.print(sayi+"x"+i+"="+(sayi*i)+"\t");
			i++;
		}
		scan.close();
	}

}
