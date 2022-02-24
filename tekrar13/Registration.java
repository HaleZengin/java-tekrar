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
		// esitligin sað tarafý constructor'dýr. bu constructor User class'ýdaki User method'una gider buradan name'yi ve zamaný alýr
		// ismi hangi saatte girdigini verir
		kullanicilar.add(user);
		// objeleri kullanicilar arraylistine ekler
		
		return kullanicilar;
		
		
	}
	
	public void printHappyUsers(ArrayList<User> user) { //icinde isim ve zaman olan objelerden olusan Arraylist'i getirir
		
		for (User each : user) {  //her bir isimi alýr each' e atar
		//User bir class'dýr  users objedir
			if (each.registerDate.getSecond()<10) {  //user class'ýndaki her bir tarihin saniyesini aldýk
				System.out.println("sansli kisisiniz "+each.name);
			} else System.out.println("maalesef "+each.name+ "sansli degilsiniz");
		}
	
	}
	
	
	public void listele(ArrayList<User> user) {
		for(User each : user ) {
			System.out.println("Adi "+each.name+" kayit zamani: "+each.registerDate);
		}
	}
	//bu soruda yok biz ekledik. girilen kullanýcýlarý listesini yazdýrdýk
		
	
	
}
