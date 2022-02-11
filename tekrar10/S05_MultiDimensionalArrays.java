package tekrar10;

import java.util.Arrays;

public class S05_MultiDimensionalArrays {

	public static void main(String[] args) {
		  
		//A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n
        //toplam�n� birer birer bulan ve herbir sonucu yeni bir array�in eleman� yapan
        // ve yeni array�i ekrana yazd�ran bir program yaz�n�z
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

		int arr[][]= { {2,6,7},{6,12,40,3},{15,29} };
		
		System.out.println("ilk verilen array: "+Arrays.deepToString(arr));
		
		int yeniArr[]= new int [arr.length];
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				toplam=toplam+arr[i][j];
			}
			
			yeniArr[i]=toplam;
			toplam=0;
		}
		
		System.out.println("yeni array: "+Arrays.toString(yeniArr));
	}

}
