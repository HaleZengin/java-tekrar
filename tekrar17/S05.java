package tekrar17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S05 {

	public static void main(String[] args) {
		
		
			// Verilen bir Array'deki tekrarli elemanlari silip
	        // unique elemanlardan olusan bir Array'e ceviren 
	        // bir method yaziniz

			int arr[] = {2,3,4,3,5,3,6,4,7,4,8,5};
			System.out.println("ilk verilen arrayin elemanlarý: "+Arrays.toString(arr));
			
			int tekrarsýzArray[] = tekrarlariSil(arr);
			System.out.println("icinde tekrar eden elemanlarýn olmadýgý array: "+Arrays.toString(tekrarsýzArray));
	}

	private static int[] tekrarlariSil(int[] arr) {
		
		Set<Integer> set= new HashSet<>();
		
		for (Integer each : arr) {
			set.add(each);
		}
		System.out.println("hashsetin elemanlarý: "+set);
		int yeniArray[]=new int[set.size()];
		
		int index=0;
		for (int each : set) {
			yeniArray[index]=each;
			index++;
		}
		return yeniArray;
		
	}

}
