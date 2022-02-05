package tekrar8;

public class S02_WhileLoop {

	public static void main(String[] args) {

		int x=05;
		while (x<10) {
			x++;
		}
		String mesaj=(x>10) ? ("'dan daha büyük") : ("'dan daha kücük");
		System.out.println(x+mesaj);
		

	}

}
