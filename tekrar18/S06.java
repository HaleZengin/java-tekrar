package tekrar18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class S06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek icin
		// önce hashset yap sonra treesete cevir
		// hangisi hýzlý hesapla
		
		long start1=System.currentTimeMillis();
		TreeSet<String> ts= new TreeSet<>(Arrays.asList("Ali", "Veli", "Burak", "Kazým", "Nilgün", "Ayse", "Gül", "Sait", "Gonca", "Ipek"));
		long stop1=System.currentTimeMillis();
		System.out.println("tree set hýzý: "+(stop1-start1));
		
		long start2=System.currentTimeMillis();
		HashSet<String> hs= new HashSet<>(Arrays.asList("Ali", "Veli", "Burak", "Kazým", "Nilgün", "Ayse", "Gül", "Sait", "Gonca", "Ipek"));
		TreeSet<String> ts2= new TreeSet<>(hs);
		long stop2=System.currentTimeMillis();
		System.out.println("hashset'ten treeset'e geciþ hýzý: "+(stop2-start2));
	}

}
