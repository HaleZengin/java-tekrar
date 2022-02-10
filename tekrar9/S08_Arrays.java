package tekrar9;

import java.util.Arrays;

public class S08_Arrays {

	

	public static void main(String[] args) {
		//ogrenci notlarýnýn ortalamasýný hesaplayan bir method yazýn. 
		//notlarý dizi icerisinzde tutup methoda diziyi gönderin
		
		int[] notlar= {50,45,36,91,58,75,80,64,30,57};
		Arrays.sort(notlar);
		
		System.out.println("Ogrenci notlarý : "+Arrays.toString(notlar));
		
		
		System.out.println("Notlarýn ortalamasý : "+ortalama(notlar));
		
		
		

	}

	public static double ortalama(int[] notlar) {
		
		int ortalama=0;
		
		for (int i = 0; i < notlar.length; i++) {
			ortalama=ortalama+notlar[i];
		}
		
		ortalama=ortalama/notlar.length;
		
		return (double)ortalama;
		
		
	}

}
