package tekrar9;

import java.util.Arrays;

public class S01 {

	public static void main(String[] args) {
		
		/*Verilen iki array'i birlestiren ve sonucu birlesikArray isminde bir array'e kaydeden bir method olusturunuz
		  main method icinde yeni array'i siralayip yazdirin
		*/
		
		int arr1[]= {3,1,10};
		int arr2[]= {2,4,1,8,3};
		
		int birlesikArray[]= birlestir(arr1,arr2);
		
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int []birlesikArray= new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			
			birlesikArray[i]=arr1[i];
			
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			
			birlesikArray[i+arr1.length]=arr2[i];
			
		}
		
	
		return birlesikArray;
	}

}
