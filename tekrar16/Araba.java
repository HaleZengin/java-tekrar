package tekrar16;

public class Araba {

	
		/*
		    1- fieldlarý(encapsulated) model(String), renk(String), motor(int), yil (int)
   			olan Araba  isimli bir class cretae ediniz.
 			2- bütün fieldlarý parametre alan bir constructor tanýmlayýnýz.
 			3- ArabaMain isminde main için bir class oluþturunuz.
 			4- Ýki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 			5- araclarýn motor gücünü 100 beygir ve üstü olmasý ve yýlýný hatalý veri girisine karsi kontrol ediniz.
		    (motor ve yýlýn oldugu set methodlarýnda yap)
		 */

	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba() {
		
	}

	public Araba(String model, String renk, int motor, int yil) { // burasý bir parametreli constructor'dýr bir tane de parametresiz constructor yapmamýz lazým
		this.model=model;
		this.renk=renk;
		//this.motor=motor;
		//this.yil=yil;
		setYil(yil);      //setYil method'unu calýþtýr der
		setMotor(motor);  //setMotor method'unu calýþtýr der
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		
		
		if (motor>=100) {
			this.motor = motor;
			System.out.println("tekerine gurban");
		} else {
			System.out.println("100'ün altýnda beygir gücü olmaz!");
		}
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		
		
		if (yil<=0) {
			System.out.println("Negatif yýl girdiniz!");
			this.yil = -yil;
		} else {
			this.yil = yil;
		}
		
	}
	
	
	

}
