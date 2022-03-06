package tekrar17;

import java.util.ArrayList;

public class S02 {

	public static void main(String[] args) {
		
		/*  Method:
        10 ve 5 elemanli elemanlari 0-20 arasinda 2 adet  ArrayList hazirlayan ve
     elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
     sonucta bir ArrayList return eden bir method yaziniz
     main:
     1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
         elemanlari 0-20 arasinda 2 adet ArrayList olusturun
     2.  Bu iki list'in ortak elemanlarini bulunuz
     3.  Bu iki list'in farkli olan elemanlarini bulunuz
     4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

  */

		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		
		listCreat(10,0,20);
		
		list1= listCreat(5,0,10);
		list2= listCreat(3,0,10);
		System.out.println("List1'in elemanlarý: "+list1);
		System.out.println("List2'nin elemanlarý: "+list2);
		
		// bu iki listin ortak elemanlarýný bul
//		list1.retainAll(list2);
//		System.out.println("Ortak elemanlar: "+list1);
		
		//2 listteki farklý elemanlarý bul
		ArrayList<Integer> yenilist1= new ArrayList<>();
		ArrayList<Integer> yenilist2= new ArrayList<>();
		
		yenilist1=list1;
		yenilist2=list2;
		
		yenilist1.removeAll(list2);
		yenilist2.removeAll(list1);
		
		System.out.println("1de olup 2de olmayanlar: "+yenilist1);
		System.out.println("2de olup 1de olmayanlar: "+yenilist2);
		
		
		
		


		
	}

	private static ArrayList<Integer> listCreat(int boyut, int min, int max) {
		ArrayList<Integer> liste= new ArrayList<>();
		
		for (int i = 0; i < boyut; i++) {
			liste.add((int)(min +Math.random()*(max-min+1)));
		}
		return liste;
	}
	

}
