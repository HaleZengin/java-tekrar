package tekrar3;

import java.util.Scanner;

public class S02 {

	public static void main(String[] args) {
	 /* 
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.

        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      
      */
		Scanner scan=new Scanner(System.in);
		System.out.println("�cgenin bir kenar�n� giriniz");
		double kenar1=scan.nextDouble();
		System.out.println("�cgenin diger kenar�n� girinz");
		double kenar2=scan.nextDouble();
		
		double hipo=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		
		System.out.println("�cgenin bir kenar uzunlugu = "+kenar1);
		System.out.println("�cgenin diger kenar uzunlugu = "+kenar2);
		System.out.println("�cgenin hipoten�s� = "+hipo);

		scan.close();
	}

}
