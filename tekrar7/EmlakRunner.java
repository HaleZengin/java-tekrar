package tekrar7;

import java.util.ArrayList;
import java.util.Scanner;

public class EmlakRunner {

	static String patronId="1";
	static String patronSifre="1";
	
	
	static String calisanId="2";
	static String calisanSifre="2";
	
	static Scanner scan= new Scanner(System.in);
	
	static int listeNo=99;
	static String evTipi;
	static String il;
	static int odaSayisi;
	static double fiyat;
	static String stokDurumu;
	
	static ArrayList<Emlak> envanter=new ArrayList<Emlak>();
	static ArrayList<Emlak> satilanlar=new ArrayList<Emlak>();
	
	public static void main(String[] args) {
		
		String id="";
		String sifre="";
		boolean girisBasariliMi=true;
		
		while (girisBasariliMi) {
			
			System.out.println("IYI EMLAK Iyi g�nler diler");
			System.out.println("id'nizi giriniz: ");
			id=scan.next();
			System.out.println("Sifreinizi giriniz: ");
			sifre=scan.next();
			
			if (id.equals(patronId) && sifre.equals(patronSifre)) {
				girisBasariliMi=false;
				patron();
				
			} else if (id.equals(calisanId) && sifre.equals(calisanSifre)) {
				girisBasariliMi=false;
				calisan();
				
			} else System.out.println("Giris basar�s�z...");
			
			
		}
		
		
	}


	private static void calisan() {
		System.out.println("Sisteme hosgeldiniz");
		
		while (true) {
			System.out.println("�slem seciniz...\n1-Ekle\n2-Listele\n3-Cikis");
			int secenek=scan.nextInt();
			
			switch (secenek) {
			
			case 1: 
				Emlak emlak1= new Emlak(++listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("---------------");
				System.out.println("Envanter: ");
			
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listele();
				}
				System.out.println("Toplam emlak say�s�: "+envanter.size());
				break;
			case 3:
				System.out.println("C�k�s yap�l�yor");
				break;
			default : System.out.println("Yanl�s giris yapt�n�z");
			
			}
		}
		
		
	}


	private static void patron() {

		System.out.println("Sisteme hosgeldiniz");
		
		while (true) {
			System.out.println("�slem seciniz...\n1-Ekle\nListele\n3-Sil\n4-Duzenle\n5-C�k�s");
			int secenek=scan.nextInt();
			
			switch (secenek) {
			case 1:
				Emlak emlak1= new Emlak(++listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
			case 2:
				System.out.println("---------------");
				System.out.println("Envanter: ");
			
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listele();
				}
				System.out.println("Toplam emlak say�s�: "+envanter.size());
				break;
			case 3:
				System.out.println("Hangi ilan� silmek istiyorsunuz?Ilan noyu giriniz ");
				int silinen=scan.nextInt()-100;
				satilanlar.add(envanter.get(silinen));
				envanter.remove(silinen);
				break;
			case 4:
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listele();
				}
				System.out.println("Hangi urunu d�zenlemek istiyorsunuz?");
				int duzenlenecekUrun=scan.nextInt()-100;
				
				if (duzenlenecekUrun<envanter.size()) {
					System.out.println("Hangisini duzenlemek istiyorsunuz?\1-evTipi, 2-il, 3-odaSayisi, 4-fiyat, 5-stokDurumu");
					int neyi=scan.nextInt();
					switch (neyi) {
					case 1:
						System.out.println("Ev tipini d�zenle");
						envanter.get(duzenlenecekUrun).setEvTipi(scan.nextLine());
						
						break;
					case 2:
						System.out.println("�li d�zenle");
						envanter.get(duzenlenecekUrun).setIl(scan.next());
						break;
					case 3:
						System.out.println("Oda say�s�n� d�zenle");
						envanter.get(duzenlenecekUrun).setOdaSayisi(scan.nextInt());
						break;
					case 4:
						System.out.println("Fiyat� d�zenle");
						envanter.get(duzenlenecekUrun).setFiyat(scan.nextDouble());
						break;
					case 5:
						System.out.println("Stok durumunu d�zenle");
						envanter.get(duzenlenecekUrun).setStokDurumu(scan.nextLine());
						break;
					default : System.out.println("Yanlis giris yapt�n�z");
					
					}
					
				
				} else System.out.println("Yanl�� say� girdiniz");
				break;
				
			case 5:
				System.out.println("G�le g�le...");
				break;
			default : System.out.println("Yanlis giris yapt�n�z");
			}
			
		
		}
		
	}

}
