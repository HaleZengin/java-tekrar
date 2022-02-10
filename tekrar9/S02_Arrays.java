package tekrar9;


public class S02_Arrays {

	public static void main(String[] args) {

	/* Given an array of ints, 
	   return true if 6 appears as either the first or last element in the array. 
	   The array will be length 1 or more.
	 */
		
		int [] num1= {3,2,4,6};
		int [] num2= {1,3,7,9};
		int [] num3= {6,2,6,3,1,0,8};
		
		if (num1[0]==6 || num1[num1.length-1]==6 ) {
			System.out.println("num1 basında veya sonunda 6 icerir ");
		} else {
			System.out.println("num1 basında veya sonunda 6 icermez ");
		}
		if (num2[0]==6 || num2[num2.length-1]==6) {
			System.out.println("num2 basında veya sonunda 6 icerir ");
		} else {
			System.out.println("num2 basında veya sonunda 6 icermez ");
		}
		if (num3[0]==6 || num3[num3.length-1]==6) {
			System.out.println("num3 basında veya sonunda 6 icerir ");
		} else {
			System.out.println("num3 basında veya sonunda 6 icermez ");
		}

		
	}

}
