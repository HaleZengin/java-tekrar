package tekrar8;

public class S06_DoWhileLoop {

	public static void main(String[] args) {
		// "1234_?!abcdef" ifadesinin,
		// say�lar� ,harfleri ve di�er karakterlerinin say�lar�n� yazd�r�n
		
		String str="1234_?!abcdef";
		str=str.toLowerCase();
		
		int say�Sayac�=0;
		int harfSayac�=0;
		int digerSayac�=0;
		
		int index=0;
		
		do {
			if (str.charAt(index)>='a' && str.charAt(index)<='z') {
				harfSayac�++;
				
			} else if (str.charAt(index)>='0' && str.charAt(index)<='9') {
				say�Sayac�++;
				
			} else {
				digerSayac�++;
				
			}
			index++;
			
		} while (index<str.length());
		
		System.out.println("harfler: "+harfSayac�);
		System.out.println("say�lar: "+say�Sayac�);
		System.out.println("diger: "+digerSayac�);
		
		System.out.println();
		
		//a�ag�daki gibi de yap�labilir:
		
		String t="A532fbg!.";
		
		
		String sayilar=t.replaceAll("[^0-9]", "");
		System.out.println("String'de bulunan say�lar toplam�: "+sayilar.length() );
		
		String harfler=t.replaceAll("[^a-zA-Z]", "");
		System.out.println("String'de bulunan harfler toplam�: "+harfler.length());
		
		String digerleri=t.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("String'de bulunan karakterlerin toplam�: "+digerleri.length());
				
	}

}
