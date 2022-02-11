package tekrar10;

import java.util.Arrays;

public class S07_Arrays {

	public static void main(String[] args) {
		/* muvaffakiyetsizleþtiricileþtiriveremeyebileceklerimizdenmissiniz kelimesini Array yontemlirini kullanarak asagidaki outputu alýn
        * input : muvaffakiyetsizleþtiricileþtiriveremeyebileceklerimizdenmissiniz
        * output: [m,u,v,a,f,f,.........,z]     ve a ve i harfini x e dönusturun
        */
		
			String str = "muvaffakiyetsizleþtiricileþtiriveremeyebileceklerimizdenmissiniz";
	        String[] arr = str.split("");
	        System.out.println(Arrays.toString(arr));
	       
	        System.out.println();
	        
	        for (int i = 0; i < arr.length-1; i++) {
	            if (arr[i].equals("i") || arr[i].equals("a") )
	                arr[i] = "x";
	            String yeni = arr[i].replaceAll(",", "");
	            System.out.print(yeni);
	        }
	        System.out.println();

		
	}

}
