package tekrar18;

import java.util.Arrays;
import java.util.HashSet;

public class S03 {

	public static void main(String[] args) {
		
		 /*
	    main method altinda bos bir hashset olusturunuz.
	    parametresi Integer set ve integer array ve adi elementEkle olan bir method yaziniz (return tipi olmayacak)
	    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
	     */

		HashSet<Integer> set= new HashSet<>();
		int [] arr= {10,2,56,39,45,9,87,21,10};
		System.out.println("Array'in elemanlarý+ "+Arrays.toString(arr));
		
		
		elemantEkle(set,arr);
		yazdir(set);
	}

	private static void yazdir(HashSet<Integer> set) {
		for (Integer each : set) {
			System.out.print(each+" ");
		}
		
	}

	private static void elemantEkle(HashSet<Integer> set, int[] arr) {
		for (int i : arr) {
			set.add(i);
		}
		System.out.println("Set'in elemanlarý: "+set);
	}

	

}
