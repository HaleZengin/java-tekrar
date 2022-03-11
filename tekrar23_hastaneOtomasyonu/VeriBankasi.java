package tekrar23_hastaneOtomasyonu;

public class VeriBankasi {

	static  String[] doctorIsimleri = { "Nilson", "John", "Robert", "Marry", "Alan", "Mahesh" };
	
	static String[] doctorSoyIsimleri= { "Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen" };
	
	static String[] unvanlar = { "Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru", "Dahiliye", "Kardiolog" };
	
	static String[] hastaIsimleri = { "Warren", "Petanow", "Sophia", "Emma", "Darian", "Peter" };
	
	static String[] hastaSoyIsimleri= { "Traven", "William", "George", "Tristan", "Luis", "Cole"};
	
	static String[] durumlar= { "Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren", "Kalp hastaliklari"};
	
	static int [] hastaIDleri = {111,222,333,444,555,666};
	
	
	Doktor doktor= new Doktor();
	Hasta hasta= new Hasta();
	
	
	public String[] getDoctorIsimleri() {
		return doctorIsimleri;
	}
	@SuppressWarnings("static-access")
	public void setDoctorIsimleri(String[] doctorIsimleri) {
		this.doctorIsimleri = doctorIsimleri;
	}
	public String[] getDoctorSoyIsimleri() {
		return doctorSoyIsimleri;
	}
	@SuppressWarnings("static-access")
	public void setDoctorSoyIsimleri(String[] doctorSoyIsimleri) {
		this.doctorSoyIsimleri = doctorSoyIsimleri;
	}
	public String[] getUnvanlar() {
		return unvanlar;
	}
	@SuppressWarnings("static-access")
	public void setUnvanlar(String[] unvanlar) {
		this.unvanlar = unvanlar;
	}
	public String[] getHastaIsimleri() {
		return hastaIsimleri;
	}
	@SuppressWarnings("static-access")
	public void setHastaIsimleri(String[] hastaIsimleri) {
		this.hastaIsimleri = hastaIsimleri;
	}
	public String[] getHastaSoyIsimleri() {
		return hastaSoyIsimleri;
	}
	@SuppressWarnings("static-access")
	public void setHastaSoyIsimleri(String[] hastaSoyIsimleri) {
		this.hastaSoyIsimleri = hastaSoyIsimleri;
	}
	public String[] getDurumlar() {
		return durumlar;
	}
	@SuppressWarnings("static-access")
	public void setDurumlar(String[] durumlar) {
		this.durumlar = durumlar;
	}
	public int[] getHastaIDleri() {
		return hastaIDleri;
	}
	@SuppressWarnings("static-access")
	public void setHastaIDleri(int[] hastaIDleri) {
		this.hastaIDleri = hastaIDleri;
	}
	public Doktor getDoktor() {
		return doktor;
	}
	public void setDoktor(Doktor doktor) {
		this.doktor = doktor;
	}
	public Hasta getHasta() {
		return hasta;
	}
	public void setHasta(Hasta hasta) {
		this.hasta = hasta;
	}
	
	
}
