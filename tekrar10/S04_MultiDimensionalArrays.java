package tekrar10;

public class S04_MultiDimensionalArrays {

	public static void main(String[] args) {
		 // arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        // Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
		
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        
        int toplam=0;
        
        for (int i = 0; i < arr1.length; i++) {
			
        	for (int j = 0; j < arr1[i].length; j++) {
				
        		toplam=toplam + arr1[i][j];
        		
			}
        	
		}

        System.out.println("arr1'in elemanlarýnýn toplamý= "+toplam);
        
        int toplam2=0;
        
        for (int i =0; i < arr2.length; i++) {
			
        	for (int j =0; j < arr2[i].length; j++) {
				
        		toplam2=toplam2 + arr2[i][j];
			}
		}
        
        System.out.println("arr2'nin elemanlarýnýn toplamý= "+toplam2);
        
        System.out.println("genel toplam= "+toplam+toplam2);
	}

}
