package tekrar2;

import java.util.Scanner;

public class S02_ifelse {

	public static void main(String[] args) {
		//kullanýcýdan alacagýnýz iki sayiyi yine kullanacaýya sectireceginiz
		//dort islemden biri ile isleme koyup sonucu yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayý giriniz");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen baska bir sayi giriniz");
		double sayi2=scan.nextDouble();
		
		System.out.println("Toplama icin -> 1 \nCýkarma icin -> 2 \nCarpma icin -> 3 \nBolme icin ->4");
		
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println(sayi1+sayi2);
		} else if (islem==2) {
			System.out.println(sayi1-sayi2);
		} else if (islem==3) {
			System.out.println(sayi1*sayi2);
		} else if (islem==4) {
			System.out.println(sayi1/sayi2);
		} else{
			System.out.println("Lutfen 1,2,3,4 sayýlarýndan birini seciniz");
		}
		scan.close();

	}

}
