package tekrar9;

import java.util.Arrays;
import java.util.Scanner;

public class S07_Arrays {

	public static void main(String[] args) {

		// kullan�c�n�n girdigi 5 say�n�n tek ve �ift olanlar�n� yazd�r
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("5 tane say� giriniz\nHer girdiginiz say�dan sonra enter tusuna bas�n�z");
		int ct=0;
		int tt=0;
		
		int arr[]= new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			arr[i]=scan.nextInt();
		}

		System.out.println("Girilen say�lar�n Array hali: "+Arrays.toString(arr));
		System.out.println("<===================>");
		
		System.out.print("Girilen say�lardan cift olanlar: ");
		for (int i = 0; i < 5; i++) {
			
			if (arr[i]%2==0) {
				
				System.out.print(" "+arr[i]);
				
				ct=ct+arr[i];
				
			}
			
		}
		
		System.out.print("\nGirilen say�lardan tek olanlar: ");
		for (int i = 0; i < 5; i++) {
			
			if (arr[i]%2!=0) {
				
				System.out.print(" "+arr[i]);
				tt=tt+arr[i];
			} 
			
			
		}
		System.out.println("\ncift say�lar�n toplam�: "+ct);
		System.out.println("tek say�lar�n toplam�: "+tt);
		
	}

}
