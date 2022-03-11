package tekrar22_kitapYonetimi;


import java.util.ArrayList;
import java.util.List;


/*
 * 
1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi
	iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.

2.	Program, kitaplara 1001’den baþlayarak sýralý ve otomatik numara vermeli.
	Bunun yanýnda, her bir kitap için Kitap Adý, Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.

3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
	Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.

	========= KÝTAP PROGRAMI =============
		1: Kitap ekle
		2: Numara ile kitap sil
		3: Tüm kitaplarý listele
		4: Bitir

*/
public class Kitapci {

	static List<Kitap> kitapListe= new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		KitapMethod.varOlanKitaplar(kitapListe);
		KitapMethod.menu(kitapListe);
		
		
		
		
	}
	
	
	
}
