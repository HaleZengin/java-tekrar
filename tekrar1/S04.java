package tekrar1;

import java.util.Scanner;

public class S04 {

	public static void main(String[] args) {
		// kullan�c�dan 2 tamsay� al�p dort islemlerini yap�n�z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir say� giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen baska bir tamsay� giriniz");
		double sayi2=scan.nextDouble();
		
	
		
		System.out.println(("Say�lar toplam�= "+(sayi1+sayi2)+"\n"+"Say�lar fark�= "+(sayi1-sayi2)+ "\n"+"Say�lar b�l�m�= "+(sayi1/sayi2)+ "\n"+"Say�lar carp�m�= "+(sayi1*sayi2)));
		
		scan.close();
	}
	
}

