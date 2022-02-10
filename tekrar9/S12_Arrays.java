package tekrar9;

public class S12_Arrays {

	public static void main(String[] args) {
		/* (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
        * Input : {{1,2,-3},{41,55},{-61,-17,80}}
        * Output : 80
        */

		//2.yol:iki boyutlu diziyi tek boyutta yazdýralým. sort edip en büyügü alalým.
		
		int arr[][] = {{1, 2, -3}, {41, 55}, {-61, -17, 80}};

        System.out.println( maxDegerBul(arr));

    }

    private static int maxDegerBul(int[][] arr) {
        int max =arr[0][0];

        for (int kat = 0;  kat < arr.length; kat++) {
        	
            for (int daire = 0; daire <arr[kat].length; daire++){
            	
                if (arr[kat][daire]>max){
                    max=arr[kat][daire];
                }
            }
        }
		return max;
	}

}
