package tekrar13;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
 
	ArrayList<User> kullanicilar = new ArrayList<>();  // su an bos bir arraylisttir

	@SuppressWarnings("resource")
	public List<User> register() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.nextLine();
		User user= new User (isim, LocalDateTime.now());
		// bu bir objedir    bunlar da objenin parametreleridir
		// esitligin sa� taraf� constructor'd�r. bu constructor User class'�daki User method'una gider buradan name'yi ve zaman� al�r
		// ismi hangi saatte girdigini verir
		kullanicilar.add(user);
		// objeleri kullanicilar arraylistine ekler
		
		return kullanicilar;
		
		
	}
	
	public void printHappyUsers(ArrayList<User> user) { //icinde isim ve zaman olan objelerden olusan Arraylist'i getirir
		
		for (User each : user) {  //her bir isimi al�r each' e atar
		//User bir class'd�r  users objedir
			if (each.registerDate.getSecond()<10) {  //user class'�ndaki her bir tarihin saniyesini ald�k
				System.out.println("sansli kisisiniz "+each.name);
			} else System.out.println("maalesef "+each.name+ "sansli degilsiniz");
		}
	
	}
	
	
	public void listele(ArrayList<User> user) {
		for(User each : user ) {
			System.out.println("Adi "+each.name+" kayit zamani: "+each.registerDate);
		}
	}
	//bu soruda yok biz ekledik. girilen kullan�c�lar� listesini yazd�rd�k
		
	
	
}
