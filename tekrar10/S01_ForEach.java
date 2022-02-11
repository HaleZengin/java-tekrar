package tekrar10;

import java.util.Arrays;

public class S01_ForEach {

	public static void main(String[] args) {
		
		 //bir int Array elemanlarinin iþaretini +' yý - , -' yi + olarak degistiren  bir method yaziniz.

		int[] arr= {1,6,-4,3,-2,-9,8};
		
		yeniArr(arr);
		
		for (int each : arr) {
			
			each*=-1;
			System.out.print(each+ " ");
		}
		
		System.out.println();
		
		System.out.println("isareti degistirilmis array: "+Arrays.toString(yeniArr(arr)));

	}

	private static int[] yeniArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]*=-1;
		}
		
		return arr;
		
		
	}

}
