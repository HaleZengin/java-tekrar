package tekrar13;

public class S02_Varargs {

	public static void main(String[] args) {
		
		int[] arr= {17,23,6,34};

		System.out.println("array toplamý: "+arrTopla(arr));
		System.out.println("varargs ile arr topamý: "+varargsTopla(arr));
		

	}

	private static int arrTopla(int[] arr) {
		
		// bu method arr elemanlarýný toplar
		
		int toplam=0;
		
		for (int i : arr) {
			toplam+=i;
		}
		
		return toplam;
	}
	
	

	private static int varargsTopla(int...is ) {
		// bu method da arr elemanlarýný toplar. miktarý degisibilir
		int toplam=0;
		for (int i : is) {
			toplam+=i;
		}
		return toplam;
	}
	
	
}


