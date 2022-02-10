package tekrar9;

import java.util.Arrays;

public class S08_Arrays {

	

	public static void main(String[] args) {
		//ogrenci notlar�n�n ortalamas�n� hesaplayan bir method yaz�n. 
		//notlar� dizi icerisinzde tutup methoda diziyi g�nderin
		
		int[] notlar= {50,45,36,91,58,75,80,64,30,57};
		Arrays.sort(notlar);
		
		System.out.println("Ogrenci notlar� : "+Arrays.toString(notlar));
		
		
		System.out.println("Notlar�n ortalamas� : "+ortalama(notlar));
		
		
		

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
