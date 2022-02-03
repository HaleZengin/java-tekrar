package tekrar3;

import java.util.Scanner;

public class S03 {

	public static void main(String[] args) {
		/*      Kullanicidan 3 tene pozitif  tam sayi alniz. 
			    bu uc sayinin ucgen olusturma durumunu kontrol ediniz
			    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu ve ikizkenar olma durumunu da  kontrol edniz
			     
			    ��gen olma sarti :herhangi iki kenar toplami diger kenardan b�y�k, herhangi iki kenar fark� diger kenardan b�y�k olmali
				 a+b>c>a-b
				 a+c>b>a-c  
			     b+c>a>b-c  
				 a=b=c ise es kenar ucgen 
				 a=b!=c, a=c!=b, b=c!=a ise ikizkenar �cgen
				 
			 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen �� tane pozitif bir say� giriniz. \nHer girdifiniz say�dan sonra enter tusuna bas�n�z ");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
	
		if (a==b && a==c) {
			System.out.println("Girdiginiz say�lar eskenar ucgen olusturur");
		} else if (a==b || a==c || b==c ) {
			System.out.println("Girdiginiz say�lar ikizkenar ucgen olusturur");
		} else if (a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c) {
			System.out.println("Girdiginiz say�lar ucgen olusturur");
		} else {
			System.out.println("Girdiginiz say�lar ucgen olusturmaz");
		}
		scan.close();
	}

}
