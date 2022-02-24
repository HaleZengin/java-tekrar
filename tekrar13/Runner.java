package tekrar13;


import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//1. isim ekle
		//2. listele
		//3. sansl� kisiyi bul
		//4. c�k
		
		Scanner scan= new Scanner(System.in);
		
		String islem;
		
		Registration userReg = new Registration();
		//Registration class'�ndakilere ula�mak icin obje olusturmak zorunday�z
		ArrayList<User> register = null;
		// User class'�ndakilere ula�mak icin obje olusturmak zorunday�z
		// degerleri listeler
		
		boolean cikilsinMi=false;
		
		while (!cikilsinMi) { // d�ng�den c�k�lmas�n demek
			
			System.out.println("Lutfen\nKisi eklemek icin -->1\nKisi listelemek icin -->2\nSansli kisiyi bulmak icin -->3\nCikmak icin -->4 giriniz");
		
			islem=scan.next();
			
			switch (islem) {
			
			case "1": 
				register=(ArrayList<User>)userReg.register();  //register degerini ArrayList olan user dan als�n .register yap register metodu ile kullan�c� ad� ve tarihi girilir
				//obje(userReg) �zerinden metodla getirilen degeri(register) 
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
