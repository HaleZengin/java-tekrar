package tekrar9;

import java.util.Arrays;

public class S13_Arrays {

	public static void main(String[] args) {
		 /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
		
		String str="ade1r4d3";
		
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			 if (Character.isDigit(arr[i].charAt(0))){  //i 'nin sayý olup olmadýgýný kontrol eder.
	                toplam+=Integer.valueOf(arr[i]);    // sayi olan i 'yi integera çevirir
	            }
		}
		
		System.out.println("string ifadenin sayi degerleri toplami : "+toplam);
	}

}
