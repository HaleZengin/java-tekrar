package tekrar15;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		
		double bakiye = 5000;
		Scanner scan= new Scanner(System.in);

		System.out.println("Bankam�za Ho�geldiniz");
		System.out.println("G�ncel Bakiyeniz: "+bakiye+" tl' dir.");
		
		while (bakiye>0) {
			System.out.println();
			System.out.println("1- Para yat�r");
			System.out.println("2- Para �ek");
			System.out.println("3- Bakiye sorgula");
			System.out.println("4- ��k�� yap");
			System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
			int input=scan.nextInt();
			
		if (input==1) {
			System.out.println("Yat�rmak istediginiz tutar� giriniz:");
			int yat�rTutar=scan.nextInt();
			bakiye+=yat�rTutar;
			System.out.println("Yeni bakiyeniz: "+bakiye+" tl'dir.");
		} else if (input==2) {
			System.out.println("�ekmek istediginiz tutar� giriniz");
			int cekmeTutar=scan.nextInt();
			if (cekmeTutar>2000) {
				System.out.println("G�nl�k para �ekme s�n�r� 2000 tl'dir.");
			} else if (bakiye<cekmeTutar) {
				System.out.println("Bakiyenizden daha b�y�k bir tutar� �ekemezsiniz.");
			} else {
			bakiye-=cekmeTutar;
			System.out.println("Yeni bakiyeniz: "+bakiye+" tl'dir.");
			}
		} else if (input==3) {
			System.out.println("G�ncel Bakiyeniz: "+bakiye+" tl' dir.");
		} else if (input==4) {
			System.out.println("��k�� yap�l�yor...");
			break;
		} else {
			System.out.println("Yanl�� bir tu�a bast�n�z...");
			
		}
		
		
	}
		System.out.println("Tekrar bekleriz!");
		scan.close();

	}
}
