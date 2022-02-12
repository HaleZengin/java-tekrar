package tekrar11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S02_ArrayList {

	public static void main(String[] args) {
		 //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
        //listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.

		//Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
		
		String isim[][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
		
		yeniList(isim);
		
		
	}

	private static void yeniList(String[][] isim) {
		
		List<String> list1= new ArrayList<>();
		
		for (int i = 0; i < isim.length; i++) {
			
			for (int j = 0; j < isim[i].length; j++) {
				
				list1.add(isim[i][j]);
				
			}
		}
		System.out.println("ilk liste: "+Arrays.deepToString(isim));
		Collections.sort(list1);
		System.out.println("sýralamadan sonraki liste: "+list1);
		
		
	}

}
