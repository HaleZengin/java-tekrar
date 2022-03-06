package tekrar17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class S03 {

	public static void main(String[] args) {
		
		/*
        main islemleri
        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist olusturun
        2.  ekrana yazdirin
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu yazin
        4.  sonucu ekrana yazdirin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin
        7.  Hem Set hem de ArrayList'e method ile hazirlanacak olan 20 elemanli,
            elemanlari 0-10 arasinda random sayilardan olusan arraylist'i ekleyin
        8. Sonuc Set ve ArrayList'i yazdirin
        9. Set icinde cift olan elemanlari iterator kullanarara silin

     */
		
		ArrayList <Integer> arr1 = arrHazirla(30,0,10);
		System.out.println("ilk olusturulan arraylist: "+arr1);
		
		ArrayList <Integer> arr2 = new ArrayList<>(Arrays.asList(10, 20, 30, 30, 30, 40, 40, 40, 50, 50, 50, 60, 70, 80, 90, 10));		
		System.out.println("ikinci olusturulan arrylist: "+arr2);
		
		System.out.println("tekrarlananlar silinmis hali: "+tekrarlariSil(arr2));
		
		Set<Integer> set= seteCevir(arr1);
		System.out.println("arraylist'in set hali: "+set);
		
		System.out.println("set'in arraylist'e cevrilmis hali: "+listeCevir(set));
		
		
	}

	
	
	
	private static ArrayList<Integer> listeCevir(Set<Integer> set) {
		
		ArrayList <Integer> list = new ArrayList<>(set);
		
		return list;
		
		
	}




	private static Set<Integer> seteCevir(ArrayList<Integer> arrList) {
		
		Set<Integer> set= new HashSet<>(arrList);
		
		return set;
	}




	private static Set<Integer> tekrarlariSil(ArrayList<Integer> arr2) {
		
		Set<Integer> tekrarEdenler = new HashSet<>(arr2);
		
		return tekrarEdenler;
	}




	private static ArrayList<Integer> arrHazirla(int eleman, int min, int max) {
		ArrayList <Integer> arrList = new ArrayList<>();
		
		for (int i = 0; i < eleman; i++) {
			arrList.add((int)(min +Math.random()*(max-min+1)));
			
		}
		return arrList;
	}

}
