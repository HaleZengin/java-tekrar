package tekrar10;

import java.util.Scanner;

public class S06_Arrays {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan=new Scanner(System.in);
	
		
		int arr[]= new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("lutfen "+i+" . indexdeki sayýyý gýrýnýz");
			
			arr[i]=scan.nextInt();
			
		}
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				
				sayac++;
			}
		}
		
		System.out.println("3'e bolunebilen sayýlar toplamý: "+sayac);
		scan.close();
	}

}
