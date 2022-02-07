package tekrar4;

import java.util.Scanner;

public class S04_StringManipulation {

	public static void main(String[] args) {
	/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen email adresinizi girin");
		String mail=scan.next();
		
		if (!mail.contains("@")) {
			System.out.println("gecerli bir email adresi girin");
		}
		if (mail.contains("@") && !mail.contains("gmail.com")) {
			System.out.println("Lutfen gmail hesabinizi girin");
		}
		if (mail.endsWith("@gmail.com")) {
			System.out.println("email onaylandý");
		} else {
			 
				System.out.println("lutfen @gmail.com adresin en sonunda bulunsun");
		
				scan.close();
		}
	}

}
