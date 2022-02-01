package tekrar2;

import java.util.Scanner;

public class S10_whileloop {

	public static void main(String[] args) {
		//kullanýcýdan bir string isteyin. sesli harfleri yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cumle=scan.nextLine();
		
		int index=0;
		
		while (index<cumle.length()) {
			
			char c=cumle.charAt(index);
			if (c=='a' || c=='e' || c=='i' || c=='u' || c=='o' || c=='A' || c=='E' || c=='I' || c=='U' || c=='O') {
				System.out.print(c);
			}
			
			index++;
		}		
			
			System.out.println();
			
			// 2.YOL
			
			String s1=cumle.replaceAll("[^aeiouAEIOU]", "");
			System.out.println(s1);
			
			scan.close();
	}

}
