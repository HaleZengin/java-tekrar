package tekrar6;


import java.util.List;
import java.util.Scanner;

public class Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String islem;
		Registration userReg = new Registration();
		 
	     List<tekrar6.User> register =userReg.register();
	     
	     boolean dongudenCikilsinMi = false;
	     while (!dongudenCikilsinMi) {
			
	    	 System.out.println("Lutfen\nKisi eklemek icin -->1\nKisi listelemek icin -->2\nSansli kisiyi bulmak icin -->3\nCikmak icin -->4 giriniz");
	 		
				islem=scan.next();
				
				switch (islem) {
				
				case "1": 
					register=(List<tekrar6.User>)userReg.register();  
					
					break;
				case "2":
					userReg.listele(register); 
					break;
				case "3":
					userReg.printHappyUsers(register);
					break;
				case "4":
					dongudenCikilsinMi=true;
					break;
				default:
					System.out.println("Hatali deger girdiniz");
				
				}
	    	 
	    	 
	    	 
		}
	     userReg.printHappyUsers(register);

	}

}
