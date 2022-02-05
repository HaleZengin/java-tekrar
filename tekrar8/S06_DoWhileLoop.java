package tekrar8;

public class S06_DoWhileLoop {

	public static void main(String[] args) {
		// "1234_?!abcdef" ifadesinin,
		// sayýlarý ,harfleri ve diðer karakterlerinin sayýlarýný yazdýrýn
		
		String str="1234_?!abcdef";
		str=str.toLowerCase();
		
		int sayýSayacý=0;
		int harfSayacý=0;
		int digerSayacý=0;
		
		int index=0;
		
		do {
			if (str.charAt(index)>='a' && str.charAt(index)<='z') {
				harfSayacý++;
				
			} else if (str.charAt(index)>='0' && str.charAt(index)<='9') {
				sayýSayacý++;
				
			} else {
				digerSayacý++;
				
			}
			index++;
			
		} while (index<str.length());
		
		System.out.println("harfler: "+harfSayacý);
		System.out.println("sayýlar: "+sayýSayacý);
		System.out.println("diger: "+digerSayacý);
		
		System.out.println();
		
		//aþagýdaki gibi de yapýlabilir:
		
		String t="A532fbg!.";
		
		
		String sayilar=t.replaceAll("[^0-9]", "");
		System.out.println("String'de bulunan sayýlar toplamý: "+sayilar.length() );
		
		String harfler=t.replaceAll("[^a-zA-Z]", "");
		System.out.println("String'de bulunan harfler toplamý: "+harfler.length());
		
		String digerleri=t.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("String'de bulunan karakterlerin toplamý: "+digerleri.length());
				
	}

}
