package tekrar8;

import java.util.Scanner;

public class S07_DoWhileLoop {

	public static void main(String[] args) {
	/*
		 kullan�c� ad�:admin , �ifre:a12b34
		 kullan�c�ya, kullan�c� ad� ve �ifresini sorun
		 eger do�ru girerse hesab�ndas�n yazs�n
		 3 kere yanl�� girerse kullan�c� ad� ve �ifrenizi tekrar giriniz
		 3den fazla yanl�� girerse hesab�n�z bloke oldu yazs�n
	 */
		Scanner scan=new Scanner(System.in);
		String kullan�c�Ad�="";
		String sifre="";
		
		int sayac=0;
		
		do {
			
			System.out.println("kullan�c� ad�n�z� ve sifreninzi giriniz.\nkullan�c� ad�n� girdikten sonra enter'a bas�n�z");
			kullan�c�Ad�=scan.next();
			sifre=scan.next();
			
			if (kullan�c�Ad�.equals("admin") && sifre.equals("a12b34")) {
				System.out.println("hesab�n�zdas�n�z");
				break;
			} 
			
			if (sayac==3) {
				System.out.println("hesab�n�z bloke oldu");
				break;
			}
			
			sayac++;
		} while (true);
		
		
		scan.close();
	}

}
