package tekrar9;

import java.util.Arrays;

public class S10_MultiDimensionalArray {

	public static void main(String[] args) {
		//multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana yazd�ran program� yaziniz.

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
