package tekrar2;

import java.util.Scanner;

public class S04_ternary {

	public static void main(String[] args) {
		/*
		 kullan�c�dan bir pozitif tamsay� girmesini isteyin
		 girilen pozitif tamsay� 3 basamakl� ise 3 basamakl� yazd�r�n
		 degilse, cift olup olmad�g�n� kontrol edin. 
		 cift ise 3 basamakl� olmayan cift say�
		 cift say� degilse 3 basamakl� olmayan tek say� yazd�r�n
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir say� giriniz");
		int sayi=scan.nextInt();
		String strSayi=String.valueOf(sayi);
		
		String sonuc=(strSayi.length()==3) ? ("Say� 3 basamakl�d�r") : ((sayi%2==0)?("3 basamakl� olmayan cift say�"):("3 basamakl� olmayan tek say�"));
		
		System.out.println(sonuc);
		scan.close();
	}

}
