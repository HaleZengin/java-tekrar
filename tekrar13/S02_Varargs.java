package tekrar13;

public class S02_Varargs {

	public static void main(String[] args) {
		
		int[] arr= {17,23,6,34};

		System.out.println("array toplam�: "+arrTopla(arr));
		System.out.println("varargs ile arr topam�: "+varargsTopla(arr));
		

	}

	private static int arrTopla(int[] arr) {
		
		// bu method arr elemanlar�n� toplar
		
		int toplam=0;
		
		for (int i : arr) {
			toplam+=i;
		}
		
		return toplam;
	}
	
	

	private static int varargsTopla(int...is ) {
		// bu method da arr elemanlar�n� toplar. miktar� degisibilir
		int toplam=0;
		for (int i : is) {
			toplam+=i;
		}
		return toplam;
	}
	
	
}


