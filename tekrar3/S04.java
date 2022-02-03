package tekrar3;

import java.util.Scanner;

public class S04 {

	public static void main(String[] args) {
		// Kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen üc basamaklý bir sayý yazýnýz");
		int sayi=scan.nextInt();
		
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler=sayi/100;
		
		String str=""+sayi;
		if (str.length()>3) {
			System.out.println("Girdiginiz sayý üc basamaklý olmalý");
		} 
		
		
		switch (yuzler)  {
		case 1:
			System.out.print("yuz");
			break;
		case 2:
			System.out.print("ikiyuz");
			break;
		case 3:
			System.out.print("ucyuz");
			break;
		case 4:
			System.out.print("dortyuz");
			break;
		case 5:
			System.out.print("besyuz");
			break;
		case 6:
			System.out.print("altýyuz");
			break;
		case 7:
			System.out.print("yediyuz");
			break;
		case 8:
			System.out.print("sekizyuz");
			break;
		case 9:
			System.out.print("dokuzyuz");
			break;
		default :
			System.out.println("yuzler basamagý sýfýr olamaz");
		}
		
		switch (onlar)  {
		case 1:
			System.out.print("on");
			break;
		case 2:
			System.out.print("yirmi");
			break;
		case 3:
			System.out.print("otuz");
			break;
		case 4:
			System.out.print("kýrk");
			break;
		case 5:
			System.out.print("elli");
			break;
		case 6:
			System.out.print("altmýþ");
			break;
		case 7:
			System.out.print("yetmis");
			break;
		case 8:
			System.out.print("seksen");
			break;
		case 9:
			System.out.print("doksan");
			break;
		
		}
		
		switch (birler)  {
		case 1:
			System.out.print("bir");
			break;
		case 2:
			System.out.print("iki");
			break;
		case 3:
			System.out.print("uc");
			break;
		case 4:
			System.out.print("dort");
			break;
		case 5:
			System.out.print("bes");
			break;
		case 6:
			System.out.print("altý");
			break;
		case 7:
			System.out.print("yedi");
			break;
		case 8:
			System.out.print("sekiz");
			break;
		case 9:
			System.out.print("dokuz");
			break;
		
		}
		
		scan.close();
	}

}
