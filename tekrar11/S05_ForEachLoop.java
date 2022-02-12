package tekrar11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S05_ForEachLoop {

	public static void main(String[] args) {
		 /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         
         * INPUT : {2,3,5,4,2,9,6,3,12,8,9,7,12,30}
         */
		
		int [] arr= {2,3,5,4,2,9,6,3,12,8,9,7,12,30};
		
		List<Integer> tekrarsiz= new ArrayList <>();
		
		for (Integer each : arr) {
			
			if (!tekrarsiz.contains(each)) {
				tekrarsiz.add(each);
			}
		}
		
		Collections.sort(tekrarsiz);
		
		int[] tekrarsizArr= new int [tekrarsiz.size()];
		
		for (int i = 0; i < tekrarsizArr.length; i++) {
			tekrarsizArr[i]=tekrarsiz.get(i);
		}
		
		System.out.println(Arrays.toString(tekrarsizArr));
		
	}

}
