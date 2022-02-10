package tekrar9;

import java.util.Arrays;
import java.util.Scanner;

public class S07_Arrays {

	public static void main(String[] args) {

		// kullanýcýnýn girdigi 5 sayýnýn tek ve çift olanlarýný yazdýr
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("5 tane sayý giriniz\nHer girdiginiz sayýdan sonra enter tusuna basýnýz");
		int ct=0;
		int tt=0;
		
		int arr[]= new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			arr[i]=scan.nextInt();
		}

		System.out.println("Girilen sayýlarýn Array hali: "+Arrays.toString(arr));
		System.out.println("<===================>");
		
		System.out.print("Girilen sayýlardan cift olanlar: ");
		for (int i = 0; i < 5; i++) {
			
			if (arr[i]%2==0) {
				
				System.out.print(" "+arr[i]);
				
				ct=ct+arr[i];
				
			}
			
		}
		
		System.out.print("\nGirilen sayýlardan tek olanlar: ");
		for (int i = 0; i < 5; i++) {
			
			if (arr[i]%2!=0) {
				
				System.out.print(" "+arr[i]);
				tt=tt+arr[i];
			} 
			
			
		}
		System.out.println("\ncift sayýlarýn toplamý: "+ct);
		System.out.println("tek sayýlarýn toplamý: "+tt);
		
	}

}
