package tekrar6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	List<User> kullanýcýlar= new ArrayList <>();
	
	@SuppressWarnings("resource")
	public List<User> register () {
		Scanner scan= new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String isim=scan.nextLine();
		
		User user= new User(isim, LocalDateTime.now());
		
		kullanýcýlar.add(user);
		
		return kullanýcýlar;
		
		
	}

	public void printHappyUsers(List<User> register) {
		
		for (User each : register) {
			if (each.registerDate.getSecond()<=10) {
				System.out.println("Sansli kisi: "+each.name);
			} else System.out.println("Maalesef sansli kisi degilsiniz: "+each.name);
		}
	}
	
	public void listele(List<User> register) {
		for (User each : register) {
			System.out.println("Adi "+each.name+"\nKayit tarihi ve zamani: "+each.registerDate);
			
		}
	}

}
