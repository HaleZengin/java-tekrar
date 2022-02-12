package tekrar11;

import java.util.Arrays;
import java.util.List;

public class S07_ArrayList {

	public static void main(String[] args) {
		//10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
        //8. elemaninin yerlerini degistirin.
		
		String[] arr= {"Elma","Armut","Portakal","Ayva","Visne","Kiraz","Muz","Kivi","Hurma","Mandalina"};
		
		List<String> liste=Arrays.asList(arr);
		System.out.println("Listenin ilk hali: "+liste);
		
		String eleman3=liste.get(2);
		String eleman8=liste.get(7);
		
		liste.set(2,eleman8 );
		liste.set(7, eleman3);
		
		System.out.println("Degistirilmis liste: "+liste);

	}

}
