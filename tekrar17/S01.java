package tekrar17;

import java.util.HashSet;

public class S01 {

	public static void main(String[] args) {
	  /*

	    parametresi  ve adi elementEkle isminde Integer set ve integer array parametreli
	    olan bir method yaziniz (return type void)
	    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
	     */
		
		HashSet<Integer> hs= new HashSet<>();
		int arr[] = {10,14,25,21,65};
		
		elemantEkle(hs, arr);
		
		yazdir(hs);
	
	}

	
		
	private static void yazdir(HashSet<Integer> hs) {
		
		for (Integer each : hs) {
			System.out.print(each+" ");
		}
		
	}



	private static void elemantEkle(HashSet<Integer> hs, int[] arr) {
		for (int each : arr) {
			hs.add(each);
		}
		System.out.println(hs);
	}
}
