package tekrar1;

public class S01 {

	public static void main(String[] args) {
		// 12345 say�s�n�n rakam degerlerini asag�dan yukar�ya dogru yazd�rn�z
		
		int sayi=12345;
		
		int birlerB=sayi%10;
		int onlarB=(sayi/10)%10;
		int yuzlerB=(sayi/100)%10;
		int binlerB=(sayi/1000)%10;
		int onbinlerB=(sayi/10000);
	
		
		System.out.println(onbinlerB+"\n"+binlerB+"\n"+yuzlerB+"\n"+onlarB+"\n"+birlerB);
	}

}
