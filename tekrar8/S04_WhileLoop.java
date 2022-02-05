package tekrar8;

public class S04_WhileLoop {

	public static void main(String[] args) {
		
		int m=10;
		int n=2;
		int toplam=0;
		
		while (m>n) {
			m--;
			n+=2;
			toplam=toplam+m+n;
			
		}

		System.out.println(toplam);
	}

}
