package tekrar2;

import java.util.Scanner;

public class S07_forloop {

	public static void main(String[] args) {
		/*kullanýcýnýn girdigi sayý kadar asagýdaki sekli olusturun
		 
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi=scan.nextInt();
		
		for (int i =1 ; i <=sayi; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}
