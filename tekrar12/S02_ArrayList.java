package tekrar12;


import java.util.Scanner;

public class S02_ArrayList {

	public static void main(String[] args) {
		// Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz

		Scanner scan= new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String str=scan.nextLine();
		
		String arr[]=str.split(""); // hiçliði göre stringi bölüp herbir paçayý arrayin elemaný yaptý
		
		String enCokTekrarEden="";  //bunun yerine list de yapabilirdik
		int sayac=0;
		int maxSayac=0;
		
		for (int i = 0; i < arr.length; i++) { //karsýlastýrýlan karakter kontrolu
			
			for (int j = i+1; j < arr.length; j++) { //karsýlastýran karakter kontrolü
				
			if (arr[i].equalsIgnoreCase(arr[j])) { //esit karakterleri kontrol ettik.esit olanlarý saydýrdýk
				sayac++;
				
			   }
			
			} 									 //karsýlastýrýlan ve esit olan karakterler saydýrýldý
			if (sayac>=maxSayac) {
				maxSayac=sayac;
				enCokTekrarEden+=" "+arr[i];
				
			} 
			
			sayac=0; // eger sayacý sýfýrlamazsak ilk buldugumuz tekrar eden sayýdan sonra baþka tekrar eden varsa sýfýrdan baslasýn diye
		}
		
		System.out.println(enCokTekrarEden);
		scan.close();
	}

}
