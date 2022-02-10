package tekrar9;

import java.util.Arrays;

public class S04_Arrays {

	public static void main(String[] args) {
	/*	Given an array of ints, return the sum of the first 2 elements in the array. 
		If the array length is less than 2, just sum up the elements that exist, 
		returning 0 if the array is length 0.
	 */
		
		int [] num= {3,2,9,5,1,0,6};
		
		ilkIkıToplam(num);
		
		System.out.println(Arrays.toString(num));
		
	}

	public static int ilkIkıToplam(int[] num) {
		
		
		if (num.length==0) {
			return 0;
			
		} else if (num.length==1) {
			return num[0];
			
		} else {
			
			return num[0]+num[1];
			
		}
	}

}
