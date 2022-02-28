package tekrar15;

import java.util.ArrayList;
import java.util.Scanner;

public class AdamAsmaca {

	
	public static String getMaskedWord(String secretWord, ArrayList<Character> guessList) {
		String result="";
		
		for (int i = 0; i < secretWord.length(); i++) {
			Character currentChar = secretWord.charAt(i);
			
			if (guessList.contains(currentChar)) {
				result = result.concat(currentChar.toString());
			} else {
				result = result.concat("_ ");
			}
			
		}
		
		return result;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int maxTry=15;
		String secretWord="woohoo";
		ArrayList<Character> guessList = new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		
		String maskedWord = getMaskedWord(secretWord, guessList);
		System.out.println(maskedWord);
		
		boolean didWin=false;
		
		for (int i = 0; i < maxTry; i++) {
			System.out.println("Bir tahminde bulun!");
			String guess= scan.next();
			
			guessList.add(guess.charAt(0));   					// kullanýcýnýn girdigi tahminin ilk harfini liste ekledik
			
			maskedWord = getMaskedWord(secretWord, guessList);
			System.out.println(maskedWord);
			
			if (maskedWord.equals(secretWord)) {
				didWin=true;
				break;
			} 
			
			if (didWin) {
				System.out.println("Kazandýnýz!!!");
			} else {
				System.out.println("Kaybettiniz!!!");
			}
		}

	}

}
