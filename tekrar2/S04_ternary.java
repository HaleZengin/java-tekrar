package tekrar2;

import java.util.Scanner;

public class S04_ternary {

	public static void main(String[] args) {
		/*
		 kullanýcýdan bir pozitif tamsayý girmesini isteyin
		 girilen pozitif tamsayý 3 basamaklý ise 3 basamaklý yazdýrýn
		 degilse, cift olup olmadýgýný kontrol edin. 
		 cift ise 3 basamaklý olmayan cift sayý
		 cift sayý degilse 3 basamaklý olmayan tek sayý yazdýrýn
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayý giriniz");
		int sayi=scan.nextInt();
		String strSayi=String.valueOf(sayi);
		
		String sonuc=(strSayi.length()==3) ? ("Sayý 3 basamaklýdýr") : ((sayi%2==0)?("3 basamaklý olmayan cift sayý"):("3 basamaklý olmayan tek sayý"));
		
		System.out.println(sonuc);
		scan.close();
	}

}
