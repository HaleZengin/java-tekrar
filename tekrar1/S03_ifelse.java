package tekrar1;

import java.util.Scanner;

public class S03_ifelse {

	public static void main(String[] args) {
		// kullanýcýdan boy ve kilosunu isteyin
		// vucut kitle indexini yazdýrý
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
		int kilo=scan.nextInt();
		System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
		double boy=scan.nextInt();
		
		double vki= kilo/((boy/100)*(boy/100));
				
		if (vki<=18.5) {
			System.out.println("zayýf");
		} else if (vki<=24.9) {
			System.out.println("normal kilolu");
		} else if (vki<=29.9) {
			System.out.println("fazla kilolu");
		} else if (vki<=39.9) {
			System.out.println("obez");
		}else if (vki>40) {
			System.out.println("ileri derecede obez");
		} else {
			System.out.println("Lutfen boy ve kilonuzu dogru giriniz");
		}

		scan.close();
	}

}
