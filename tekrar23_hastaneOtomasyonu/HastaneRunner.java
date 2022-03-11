package tekrar23_hastaneOtomasyonu;

public class HastaneRunner {

	private static Hastane hastane1= new Hastane();
	
	static String hastaDurumu = "Migren";
	
	
	
	public static void main(String[] args) {
		
		String unvan = doktorUnvan(hastaDurumu);
		hastane1.setDoktor(doktorBul(unvan));
		System.out.println(doktorBul(unvan).toString());
		hastane1.setHasta(hastaBul(hastaDurumu));
		System.out.println(hastaBul(hastaDurumu).toString());
		
	}

	private static String doktorUnvan(String aktualDurum) {
		
		if (aktualDurum.equals("Allerji")) {
			return Hastane.unvanlar[0];
		}else 
		if(aktualDurum.equals("Bas agrisi")){
			return Hastane.unvanlar[1];
		}else 
		if (aktualDurum.equals("Diabet")) {
			return Hastane.unvanlar[2];
		}else
		if (aktualDurum.equals("Soguk alginligi")) {
			return Hastane.unvanlar[3];
		}else
		if (aktualDurum.equals("Migren")) {
			return Hastane.unvanlar[4];
		}else 
		if (aktualDurum.equals("Kalp hastaligi")) {
			return Hastane.unvanlar[5];
		} 
		else	
		return "Yanlýþ unvan!";
		
	}

	public static Doktor doktorBul(String unvan) {
		
		Doktor doktor = new Doktor();
		
		for (int i = 0; i < Hastane.unvanlar.length; i++) {
			if (unvan.equals(Hastane.unvanlar[i])) {
				doktor.setIsim(Hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(Hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(unvan);
			}
		}
		return doktor;
		
		
	}
	
	public static Durum hastaDurumuBul(String aktuelDurum) {
		
		Durum hastaDurumu = new Durum();
		
		switch (aktuelDurum) {
		case "Allerji":
			hastane1.hasta.getHastaDurumu().setAciliyet(false);
			break;
		case "Bas agrisi":
			hastane1.hasta.getHastaDurumu().setAciliyet(false);
			break;
		case "Diabet":
			hastane1.hasta.getHastaDurumu().setAciliyet(false);
			break;
		case "Soguk alginligi":
			hastane1.hasta.getHastaDurumu().setAciliyet(false);
			break;
		case "Migren":
			hastane1.hasta.getHastaDurumu().setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			hastane1.hasta.getHastaDurumu().setAciliyet(true);
			break;
		default:
			System.out.println("Gecerli bir durum degil!");
			break;
		}
		
		return hastaDurumu;
	
	}
	
	public static Hasta hastaBul(String actualDurum) {
		
		Hasta hasta= new Hasta();
		for (int i = 0; i < VeriBankasi.durumlar.length; i++) {
			if (hastaDurumu.equals(VeriBankasi.durumlar[i])) {
				hasta.setHastaDurumu(hastaDurumuBul(VeriBankasi.durumlar[i]));
				hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
				hasta.setSoyIsim(VeriBankasi.hastaSoyIsimleri[i]);
				hasta.setHastaID(VeriBankasi.hastaIDleri[i]);
				
			}
		}
		return hasta;
	}
}

	
