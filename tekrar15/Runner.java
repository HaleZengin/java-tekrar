package tekrar15;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("May�n tarlas�na ho�geldiniz!");
		System.out.println("Lutfen oynamak istediginiz boyutlar� giriniz");
		Scanner scan= new Scanner(System.in);
		
		int row,column;
		System.out.println("Sat�r say�s�: ");
		row=scan.nextInt();
		System.out.println("S�tun say�s�: ");
		column=scan.nextInt();
		
		May�nTarlas� may�n=  new May�nTarlas�(row,column);
		may�n.run();

		
		scan.close();
	}

}
