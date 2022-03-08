package tekrar18;

import java.util.Arrays;
import java.util.HashSet;

public class S04 {

	public static void main(String[] args) {
		
		// Soru: Verilen bir arraydeki tekrarli elemanlari silip, sadece unique degerlerden 
		// olusan bir liste haline getiren bir program yaziniz. 
		
		int arr[]= {2,3,9,2,5,3,7,4,1,9,1,3,4};
		System.out.println("ilk array: "+Arrays.toString(arr));
		int tekrarsizArray[]=tekrarlariSil(arr);
		System.out.println("tekrarsýz array: "+Arrays.toString(tekrarsizArray));
	}

	private static int[] tekrarlariSil(int[] arr) {
		
		HashSet<Integer> hs = new HashSet<>();
		for (Integer each : arr) {
			hs.add(each);
			
		}
		System.out.println("Hashset'e dönüþmüþ hali: "+hs);
		
		int tekrarsizArray[]=new int[hs.size()];
		int index=0;
		for (int each : hs) {
			tekrarsizArray[index]=each;
			index++;
		}
		
		return tekrarsizArray;
	}

}
