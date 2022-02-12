package tekrar11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S04_ArrayList {

	public static void main(String[] args) {
		// Bir ��retmenden girmek istedi�i kadar notu al�n�z, ve
        // ortalamay� ge�en ��renci say�s�n� bulunuz.

		Scanner scan=new Scanner(System.in);
		List<Integer> listNotlar= new ArrayList<>();
		
		String devam="";
		
		do {
			System.out.print("Not giriniz :");
			int ogrenciNotu=scan.nextInt();
			System.out.println("devamsa, E , degilse H ye bas�n�z.");
			listNotlar.add(ogrenciNotu);
			devam=scan.next();
			
		} while (devam.equalsIgnoreCase("E"));

		// ortalama hesapla;
		int toplam=0;
		
		for (int i = 0; i < listNotlar.size(); i++) {
			
			toplam+=listNotlar.get(i);
		}
		
		double ortalama=toplam/listNotlar.size();
		
		
		
		//ortalamay� gecen �grenci say�s�;
		
		int ortalamay�GecenOgr=0;
		
		for (int i = 0; i <listNotlar.size() ; i++) {
			if (listNotlar.get(i)>ortalama) {
				
				ortalamay�GecenOgr++;
				
			} 
			
		}
		
		System.out.println("Girilen say�lar�n ortalamas�: "+ortalama);
		System.out.println("Ortalamay� gecen ogrenci sayisi: "+ortalamay�GecenOgr);
		System.out.println("Ogrenci notlari listesi: "+listNotlar);
		scan.close();
	}

}
