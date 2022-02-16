package tekrar12;


import java.util.Scanner;

public class S02_ArrayList {

	public static void main(String[] args) {
		// Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz

		Scanner scan= new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String str=scan.nextLine();
		
		String arr[]=str.split(""); // hi�li�i g�re stringi b�l�p herbir pa�ay� arrayin eleman� yapt�
		
		String enCokTekrarEden="";  //bunun yerine list de yapabilirdik
		int sayac=0;
		int maxSayac=0;
		
		for (int i = 0; i < arr.length; i++) { //kars�last�r�lan karakter kontrolu
			
			for (int j = i+1; j < arr.length; j++) { //kars�last�ran karakter kontrol�
				
			if (arr[i].equalsIgnoreCase(arr[j])) { //esit karakterleri kontrol ettik.esit olanlar� sayd�rd�k
				sayac++;
				
			   }
			
			} 									 //kars�last�r�lan ve esit olan karakterler sayd�r�ld�
			if (sayac>=maxSayac) {
				maxSayac=sayac;
				enCokTekrarEden+=" "+arr[i];
				
			} 
			
			sayac=0; // eger sayac� s�f�rlamazsak ilk buldugumuz tekrar eden say�dan sonra ba�ka tekrar eden varsa s�f�rdan baslas�n diye
		}
		
		System.out.println(enCokTekrarEden);
		scan.close();
	}

}
