package tekrar18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class S05 {

	public static void main(String[] args) {
		/*
		 Ýcinde degerleri olan bir array i arraylist e cevirecek
		    return tipi arrayList olacak bir metod yaziniz.
		    {"reha", "hakan", "haluk", "ipek", "ahsen"}

		    main metod altinda metod ile gelen listeyi kullanarak
		     HashSet, TreeSet ve linkedHashSet leri doldurun.
		 */

		  String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};
		  System.out.println("array: "+Arrays.toString(arr));
		  ArrayList<String> list = cevir(arr); 
		  System.out.println("arraylist: "+list);
		  
		  HashSet<String> hs= new HashSet<>(list);
		  LinkedHashSet<String> lhs= new LinkedHashSet<>(list);
		  TreeSet<String> ts= new TreeSet<>(list);
		  
		  System.out.println("karýsýk sýralý: "+hs);
		  System.out.println("giris sýralý: "+lhs);
		  System.out.println("dogal sýralý: "+ts);
		  
	}

	private static ArrayList<String> cevir(String[] arr) {
		ArrayList<String> Arrlist = new ArrayList<>();
		
		for (String each : arr) {
			Arrlist.add(each);
		}
		
		return Arrlist;
	}

}
