package tekrar3;

import java.util.Scanner;

public class S03 {

	public static void main(String[] args) {
		/*      Kullanicidan 3 tene pozitif  tam sayi alniz. 
			    bu uc sayinin ucgen olusturma durumunu kontrol ediniz
			    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu ve ikizkenar olma durumunu da  kontrol edniz
			     
			    üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farký diger kenardan büyük olmali
				 a+b>c>a-b
				 a+c>b>a-c  
			     b+c>a>b-c  
				 a=b=c ise es kenar ucgen 
				 a=b!=c, a=c!=b, b=c!=a ise ikizkenar ücgen
				 
			 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen üç tane pozitif bir sayý giriniz. \nHer girdifiniz sayýdan sonra enter tusuna basýnýz ");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
	
		if (a==b && a==c) {
			System.out.println("Girdiginiz sayýlar eskenar ucgen olusturur");
		} else if (a==b || a==c || b==c ) {
			System.out.println("Girdiginiz sayýlar ikizkenar ucgen olusturur");
		} else if (a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c) {
			System.out.println("Girdiginiz sayýlar ucgen olusturur");
		} else {
			System.out.println("Girdiginiz sayýlar ucgen olusturmaz");
		}
		scan.close();
	}

}
