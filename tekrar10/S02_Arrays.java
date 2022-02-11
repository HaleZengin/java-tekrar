package tekrar10;

import java.util.Arrays;

public class S02_Arrays {

	public static void main(String[] args) {
		//Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
		//bulmak için bir java programi yazin
		
		int arr[]= {3,42,96,-56,-78,-21,84,12,-9,34};

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int min=arr[0];
		int max=arr[arr.length-1];
		int max2=arr[arr.length-2];
		
		System.out.println("Array'deki minimum deger: "+min);
		System.out.println("Array'deki maksimum deger: "+max);
		System.out.println("Array'deki 2.maksimum deger: "+max2);
		
	}

}
