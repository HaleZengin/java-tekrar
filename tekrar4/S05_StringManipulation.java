package tekrar4;

public class S05_StringManipulation {

	public static void main(String[] args) {
		
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L I yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char A=pickName.charAt(pickName.indexOf("A"));
		char L=pickName.charAt(pickName.indexOf("L"));
	    char I=pickName.charAt(pickName.indexOf("I"));
	    
	    System.out.println(A+" "+L+" "+I);
	    
	}
}
