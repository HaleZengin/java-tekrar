package tekrar9;

import java.util.Arrays;

public class S05_Arrays {

	public static void main(String[] args) {
	/*	Given an int array, return a new array with double the length where its last element is the same as the original array, 
	 *  and all the other elements are 0. The original array will be length 1 or more. 
	 */
		
		int num[]= {2,3,8,1,6,5,2};
		System.out.println(Arrays.toString(num));
		
		int yeniArray[]=new int [2*num.length];
		
		System.out.println(Arrays.toString(yeniArray));
		
		yeniArray[yeniArray.length-1]=num[num.length-1];
		
		System.out.println(Arrays.toString(yeniArray));

	}

}
