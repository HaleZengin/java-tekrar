package tekrar11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S01_ArrayList {

	public static void main(String[] args) {
		 // verilen listteki isimlerden
         // icinde ‘a’ harfi bulunanlari silen bir program yaziniz

		List<String> list1= new ArrayList<>(Arrays.asList("Ali","Kemal","Nil","Yeter","Gamze"));
		
		List <String> list2= new ArrayList<>();
		
		for (String w : list1) {
			if (!w.toLowerCase().contains("a")) {
				list2.add(w);
			}
		}
		
		System.out.println(list2);
		
	}

}
