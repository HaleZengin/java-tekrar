package tekrar15;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Mayýn tarlasýna hoþgeldiniz!");
		System.out.println("Lutfen oynamak istediginiz boyutlarý giriniz");
		Scanner scan= new Scanner(System.in);
		
		int row,column;
		System.out.println("Satýr sayýsý: ");
		row=scan.nextInt();
		System.out.println("Sütun sayýsý: ");
		column=scan.nextInt();
		
		MayýnTarlasý mayýn=  new MayýnTarlasý(row,column);
		mayýn.run();

		
		scan.close();
	}

}
