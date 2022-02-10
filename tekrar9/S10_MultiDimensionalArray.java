package tekrar9;

import java.util.Arrays;

public class S10_MultiDimensionalArray {

	public static void main(String[] args) {
		//multidimensional arrayin iç array lerindeki tüm elemanlarýn toplamýný birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemaný yapan ve yeni array i ekrana yazdýran programý yaziniz.

		int arr[][]= {{10,20,30},{4},{6,7,20}};
		
		int yeniArray[] = new int [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				yeniArray[i]+=arr[i][j];
				
			}
			
		}
		
		System.out.println(Arrays.toString(yeniArray));
		
	}

}
