package tekrar13;


import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//1. isim ekle
		//2. listele
		//3. sanslý kisiyi bul
		//4. cýk
		
		Scanner scan= new Scanner(System.in);
		
		String islem;
		
		Registration userReg = new Registration();
		//Registration class'ýndakilere ulaþmak icin obje olusturmak zorundayýz
		ArrayList<User> register = null;
		// User class'ýndakilere ulaþmak icin obje olusturmak zorundayýz
		// degerleri listeler
		
		boolean cikilsinMi=false;
		
		while (!cikilsinMi) { // döngüden cýkýlmasýn demek
			
			System.out.println("Lutfen\nKisi eklemek icin -->1\nKisi listelemek icin -->2\nSansli kisiyi bulmak icin -->3\nCikmak icin -->4 giriniz");
		
			islem=scan.next();
			
			switch (islem) {
			
			case "1": 
				register=(ArrayList<User>)userReg.register();  //register degerini ArrayList olan user dan alsýn .register yap register metodu ile kullanýcý adý ve tarihi girilir
				//obje(userReg) üzerinden metodla getirilen degeri(register) 
				//register isminde bir yere assing ettik
				break;
			case "2":
				userReg.listele(register); 
				break;
			case "3":
				userReg.printHappyUsers(register);
				break;
			case "4":
				cikilsinMi=true;
				break;
			default:
				System.out.println("Hatali deger girdiniz");
			
			}
			
			
			
		}
		

	}

}
