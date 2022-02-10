package tekrar9;

import java.util.Arrays;

public class S03_Arrays {

	public static void main(String[] args) {
		// Given an array of ints length 3, figure out which is larger, 
		//the first or last element in the array, and set all the other elements to be that value. 
	
		int num[]= {1,9,7};
		System.out.println("ilk array: "+Arrays.toString(num));
		int max;
		
		if (num[0]>num[num.length-1]) {
			
			max=num[0];
			
		} else {

			max=num[num.length-1];
		}
		System.out.println(max);
		
		num[0]=max;
		num[1]=max;
		num[2]=max;
		System.out.println("degistirilmis array: "+Arrays.toString(num));
	}

}
