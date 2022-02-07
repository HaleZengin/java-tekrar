package tekrar4;

import java.util.Scanner;

public class S03_StringManipulation {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðýný bir stringde boþluk karakterinin olup olmadýðýný kontrol ediniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir string giriniz");
		String str=scan.nextLine();
		
		boolean x=str.contains(" ");
		
		System.out.println("girilen string'de bosluk "+x );
		
		str.isEmpty();
		System.out.println("girilen string bos mu? :"+str.isEmpty());

		scan.close();
	}

}
