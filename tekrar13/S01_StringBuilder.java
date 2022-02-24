package tekrar13;

import java.util.Scanner;

public class S01_StringBuilder {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		Bir c�mleyi parametre olarak kabul eden, StringBuilder kullanarak c�mleyi ters �eviren ve c�mlenin palindrom
	    olup olmad���n� kontrol eden (b�y�k/k���k harf duyarl�l��� olmadan) bir Java program� yaz�n.
	    
	    Eg : input : I love Java
	    Output: "Reversed sentence : avaJ evol I 
	    It is not a palindrome"

		 */

		Scanner scan= new Scanner(System.in);
	
		System.out.println("Lutfen bir metin giriniz");
		
		String metin=scan.nextLine();
		
		StringBuilder sb= new StringBuilder(metin);
		
		String tersMetin= sb.reverse().toString();  //metini ters cevirip stringe cevirdim
		
		System.out.println(tersMetin);
		
		
		if (tersMetin.equalsIgnoreCase(metin)) {
			
			System.out.println("Girdiginiz metin poligromdur");
		} else {
			System.out.println("Girdiginiz metin poligrom degildir");
		}
		
		

	}

}
