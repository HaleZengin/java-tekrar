package tekrar10;

import java.util.Arrays;

public class S03_Arrays {

	public static void main(String[] args) {
		// Verilen bir int dizisi icin elemanlarin karelerini bulup yeni array icene koyup yazd�r�n
		
		int arr[]= {2,6,4,9,12,3,41};	
		
		System.out.println("verilen array'in degerleri: "+Arrays.toString(arr));
		
		int kareArr[]=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]*=arr[i];
			kareArr[i]=arr[i];
			
		}

		System.out.println("array'in degerlerinin karesi al�nm�s yeni array: "+Arrays.toString(kareArr));
	}

}
