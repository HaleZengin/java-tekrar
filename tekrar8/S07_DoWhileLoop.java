package tekrar8;

import java.util.Scanner;

public class S07_DoWhileLoop {

	public static void main(String[] args) {
	/*
		 kullanýcý adý:admin , þifre:a12b34
		 kullanýcýya, kullanýcý adý ve þifresini sorun
		 eger doðru girerse hesabýndasýn yazsýn
		 3 kere yanlýþ girerse kullanýcý adý ve þifrenizi tekrar giriniz
		 3den fazla yanlýþ girerse hesabýnýz bloke oldu yazsýn
	 */
		Scanner scan=new Scanner(System.in);
		String kullanýcýAdý="";
		String sifre="";
		
		int sayac=0;
		
		do {
			
			System.out.println("kullanýcý adýnýzý ve sifreninzi giriniz.\nkullanýcý adýný girdikten sonra enter'a basýnýz");
			kullanýcýAdý=scan.next();
			sifre=scan.next();
			
			if (kullanýcýAdý.equals("admin") && sifre.equals("a12b34")) {
				System.out.println("hesabýnýzdasýnýz");
				break;
			} 
			
			if (sayac==3) {
				System.out.println("hesabýnýz bloke oldu");
				break;
			}
			
			sayac++;
		} while (true);
		
		
		scan.close();
	}

}
