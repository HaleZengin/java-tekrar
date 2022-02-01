package tekrar2;

import java.util.Scanner;

public class S01_ifelse {

	public static void main(String[] args) {
		/*
		 kullanýcý vize sýnav notunu double degerinde girsin.
		 kullanýcý vize sýnav yuzdesi girsin double
		 kullanýcý final sýnav notunu double degerinde girsin
		 kullanýcý final sýnav yuzdesi girsin double
		 vize final ortalamasýnýn bul yazdýr
		 harf notu olaral:
		 AA ; 90-100
		 BA ; 80-90
		 BB ; 70-80
		 CB ; 60-70
		 CC ; 50-60
		 DC ; 40-50
		 DD ; 30-40
		 FF ; 0-30

		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen vize notunuzu girin");
		double vizeN=scan.nextDouble();
		System.out.println("Lutfen vize yüzdesini giriniz");
		double vizeY=scan.nextDouble();
		System.out.println("Lutfen final notunuzu girin");
		double finalN=scan.nextDouble();
		System.out.println("Lutfen final yüzdesini giriniz");
		double finalY=scan.nextDouble();
		
		
		double ortalama=(vizeN*(vizeY/100))+(finalN*(finalY/100));
		
		
		if (vizeN<0 || vizeN>100) {
			System.out.println("Yanlýs bir vize notu girdiniz");	
		}  if (finalN<0 || finalN>100) {
			System.out.println("Yanlýs bir final notu girdiniz");			
		}  if (vizeY<0 || vizeY>100) {
			System.out.println("Yanlýs bir vize yüzdesi girdiniz");			
		}  if (finalY<0 || finalY>100) {
			System.out.println("Yanlýs bir final yüzdesi girdiniz");			
		} else{
		
		  if (ortalama>=90){
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"AA");
		} else if (ortalama>=80) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"BA");
		}else if (ortalama>=70) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"BB");
		} else if (ortalama>=60) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"CB");
		} else if (ortalama>=50) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"CC");
		} else if (ortalama>=40) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"DC");
		} else if (ortalama>=30) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"DD");
		}  else  {
			if (ortalama>0) {
			System.out.println("Notunuz : "+ortalama+" Not harfiniz : "+"FF");
			}
		}
		}
		
		scan.close();
		
	}

}
