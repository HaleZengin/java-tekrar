package tekrar9;

import java.util.Arrays;
import java.util.Scanner;

public class S06_Arrays {

	public static void main(String[] args) {
		
		//array'�n ogelerinin toplam�n� bulunuz
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("5 tane sayi giriniz.\nHer girdiginiz say�dan sonra enter tusuna bas�n�z");
		int s=0;
		
		int arr[]=new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i]=scan.nextInt();
			
		}
		for (int i = 0; i < 5; i++) {
			s=s+arr[i];
			
		}

		System.out.println("Girilen say�lar�n Array hali: "+Arrays.toString(arr));
		
		System.out.println("girilen t�m elemanlar�n toplam�= "+s);
		
	}

}
