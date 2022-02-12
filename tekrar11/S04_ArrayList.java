package tekrar11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S04_ArrayList {

	public static void main(String[] args) {
		// Bir öðretmenden girmek istediði kadar notu alýnýz, ve
        // ortalamayý geçen öðrenci sayýsýný bulunuz.

		Scanner scan=new Scanner(System.in);
		List<Integer> listNotlar= new ArrayList<>();
		
		String devam="";
		
		do {
			System.out.print("Not giriniz :");
			int ogrenciNotu=scan.nextInt();
			System.out.println("devamsa, E , degilse H ye basýnýz.");
			listNotlar.add(ogrenciNotu);
			devam=scan.next();
			
		} while (devam.equalsIgnoreCase("E"));

		// ortalama hesapla;
		int toplam=0;
		
		for (int i = 0; i < listNotlar.size(); i++) {
			
			toplam+=listNotlar.get(i);
		}
		
		double ortalama=toplam/listNotlar.size();
		
		
		
		//ortalamayý gecen ögrenci sayýsý;
		
		int ortalamayýGecenOgr=0;
		
		for (int i = 0; i <listNotlar.size() ; i++) {
			if (listNotlar.get(i)>ortalama) {
				
				ortalamayýGecenOgr++;
				
			} 
			
		}
		
		System.out.println("Girilen sayýlarýn ortalamasý: "+ortalama);
		System.out.println("Ortalamayý gecen ogrenci sayisi: "+ortalamayýGecenOgr);
		System.out.println("Ogrenci notlari listesi: "+listNotlar);
		scan.close();
	}

}
