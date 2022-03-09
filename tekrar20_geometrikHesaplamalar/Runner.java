package tekrar20_geometrikHesaplamalar;

public class Runner {

	/* 1-asagidaki hiyarasiye gore class creat ediniz...

    sekil <--Cember
    sekil <--Dikdortgen<--Kare

   2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
   3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
   */
	
	public static void main(String[] args) {
		
		Cember c= new Cember(2.5);
		c.cevreHesaplama();
		c.alanHesaplamaCember();
		System.out.println(c);
	
		Kare k= new Kare(3,3);
		k.cevreHesaplama();
		k.alanHesaplama();
		System.out.println(k);
		
		Dikdortgen d= new Dikdortgen(5.2,3.1);
		d.cevreHesaplama();
		d.alanHesaplama();
		System.out.println(d);
		
		
	}

}
