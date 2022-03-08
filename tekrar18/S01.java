package tekrar18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class S01 {

	public static void main(String[] args) {
		 // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak þekilde
        // 1 den 20 e kadar olan sayýlarla doldurup yazdýrýn
        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdýrýnýz.
		
		
		HashSet<Integer> hs = setHazirla();
		System.out.println("HashSet: "+hs);
		
		List<Integer> liste = diziyeCevir(hs);
		System.out.println("Set'in List'e dönüsmüs hali: "+liste);

	}

	

	private static List<Integer> diziyeCevir(HashSet<Integer> hs) {
		List<Integer> liste1 = new ArrayList<>();
		for (Integer each : hs) {
			liste1.add(each);
		}
		return liste1;
	}



	private static HashSet<Integer> setHazirla() {
		HashSet<Integer> hs1 = new HashSet<>();
		int a=0;
		for (int i = 0; i < 10; i++) {
			a=(int) (Math.random()*20); 
			hs1.add(a);
		}
		
		return hs1;

	}

}
