package tekrar8;

public class S01_ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			
			for (int j = 5-i; j >1; j--) {
				System.out.print(i+j);
			}
			System.out.println();
		}

	}

}
