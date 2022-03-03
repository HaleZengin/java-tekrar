package tekrar16;

import java.util.Scanner;

public class S01 {

	public static void main(String[] args) {
		/*
		Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
	        olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str= scan.nextLine();
		StringBuilder sb= new StringBuilder(str);
		
		String tersStr= sb.reverse().toString();
		System.out.println(tersStr);
		
		if (tersStr.equalsIgnoreCase(str)) {
			System.out.println("Palidromdur");
		} else {
			System.out.println("Palidrom degildir");
			
		}
		
		scan.close();
	}

}
