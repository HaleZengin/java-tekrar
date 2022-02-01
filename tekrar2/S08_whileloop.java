package tekrar2;

import java.util.Scanner;

public class S08_whileloop {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir sayý iste
		 girdigi sayýnýn 10'a kadar carpým tablosunu yazdýr
		 3x1=3 3x2=6........3x10=30 seklinde yazdýr
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi=scan.nextInt();
		
		int i=1;
		while (i<=10) {
			System.out.print(sayi+"x"+i+"="+(sayi*i)+"\t");
			i++;
		}
		scan.close();
	}

}
