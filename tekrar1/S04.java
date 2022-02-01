package tekrar1;

import java.util.Scanner;

public class S04 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tamsayý alýp dort islemlerini yapýnýz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayý giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen baska bir tamsayý giriniz");
		double sayi2=scan.nextDouble();
		
	
		
		System.out.println(("Sayýlar toplamý= "+(sayi1+sayi2)+"\n"+"Sayýlar farký= "+(sayi1-sayi2)+ "\n"+"Sayýlar bölümü= "+(sayi1/sayi2)+ "\n"+"Sayýlar carpýmý= "+(sayi1*sayi2)));
		
		scan.close();
	}
	
}

