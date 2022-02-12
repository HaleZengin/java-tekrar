package tekrar11;

public class S06_ArrayList {

	public static void main(String[] args) {
		// Verilen array'in simetrik olup olmadýgýný yazdýrýnýz
		
		int arr[] = { 1, 2, 3, 4, 4, 3, 3,2, 1 };
		
		boolean simetrik=false;
		
		for (int i = 0; i < arr.length/2; i++) {
			
			if (arr[i]==arr[arr.length-1-i]) {
				simetrik=true;
				
			} else {
				simetrik=false;
				break;
			}
		}
		System.out.println(simetrik);
	}

}
