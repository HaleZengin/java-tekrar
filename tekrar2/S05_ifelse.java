package tekrar2;

import java.util.Scanner;

public class S05_ifelse {

	public static void main(String[] args) {
		/*
		 Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. Bir yilda kac kg seker kullandigini hesaplayip yazdirin 
		 1 seker = 1.5 gr

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("G�nde kac cay iciyorsunuz?");
		int cay=scan.nextInt();
		System.out.println("Bir bardak caya kac seker at�yorsunuz?");
		int seker=scan.nextInt();
		
		if (seker==0) {
			System.out.println("S�f�r seker, sagl�kl� yasam");
		} else if (seker<0) {
			System.out.println("Lutfen dogru seker adeti yaz�n�z");
		} else {
			double miktar=(cay*seker*1.5*365)/1000;
			System.out.println("1 y�lda al�nan seker miktar� : "+miktar+"kg'd�r"); 
		}
		
		scan.close();
	}

}
