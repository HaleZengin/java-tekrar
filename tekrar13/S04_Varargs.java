package tekrar13;

public class S04_Varargs {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
		
		topla(3,6,23,54,10,17);
		
		// burada array cal���r ama arraylist cal��maz
	}
	

	private static void topla(int x, int...y) {
		
		int toplam=0;
		
		for (int each : y) {
			toplam+=each;
			
		}
		
		System.out.println("ilk say� haric toplam: "+toplam);
		
		System.out.println("ilk say� ile carp�m�: "+toplam*x);
	}
	
		

}
