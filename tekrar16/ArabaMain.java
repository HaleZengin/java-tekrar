package tekrar16;

public class ArabaMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Araba honda=new Araba();  //parametresiz constructor ile honda objesi create edildi
		//honda.setMotor(1300);
		//honda.setModel("civic");
		//honda.setYil(2010);
		//honda.getModel();
		
		Araba volvo= new Araba("xc90", "beyaz", 2, -2020);
		
		
		Araba ww= new Araba("passat", "k�rm�z�", 1600, 2021);
		
		
		System.out.println("Volvo marka araban�n �zellikleri: Motoru: "+volvo.getMotor()+" Rengi: "+volvo.getRenk()+" Y�l�: "+volvo.getYil());
		
		System.out.println("WW marka araban�n �zellikleri: Motoru: "+ww.getMotor()+" Rengi: "+ww.getRenk()+" Y�l�: "+ww.getYil());

	}

}
