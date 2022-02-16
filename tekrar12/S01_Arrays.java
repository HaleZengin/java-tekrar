package tekrar12;

import java.util.ArrayList;
import java.util.Scanner;

public class S01_Arrays {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðýnýz 6 elemanlý bir dizinin
        // sadece tek elemanlarýný ayrý diziye bir metodda atayarak
        // main de yazdýrýnýz.
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner (System.in);
		
		
		int arr[]= new int [6];
		
		tekElelman(arr);
		
		for (int i = 0; i < 6; i++) {
			
			System.out.println(i+". index'deki sayiyi giriniz");
			arr[i]=scan.nextInt();
			
		}

		System.out.println(tekElelman(arr));
	}
	
	

	private static ArrayList<Integer> tekElelman(int[] arr) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==1) {
				
				list.add(arr[i]);
			}
		}
		
		return list;
		
	}

}
