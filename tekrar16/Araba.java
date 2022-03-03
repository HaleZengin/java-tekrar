package tekrar16;

public class Araba {

	
		/*
		    1- fieldlar�(encapsulated) model(String), renk(String), motor(int), yil (int)
   			olan Araba  isimli bir class cretae ediniz.
 			2- b�t�n fieldlar� parametre alan bir constructor tan�mlay�n�z.
 			3- ArabaMain isminde main i�in bir class olu�turunuz.
 			4- �ki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 			5- araclar�n motor g�c�n� 100 beygir ve �st� olmas� ve y�l�n� hatal� veri girisine karsi kontrol ediniz.
		    (motor ve y�l�n oldugu set methodlar�nda yap)
		 */

	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba() {
		
	}

	public Araba(String model, String renk, int motor, int yil) { // buras� bir parametreli constructor'd�r bir tane de parametresiz constructor yapmam�z laz�m
		this.model=model;
		this.renk=renk;
		//this.motor=motor;
		//this.yil=yil;
		setYil(yil);      //setYil method'unu cal��t�r der
		setMotor(motor);  //setMotor method'unu cal��t�r der
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
			System.out.println("100'�n alt�nda beygir g�c� olmaz!");
		}
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		
		
		if (yil<=0) {
			System.out.println("Negatif y�l girdiniz!");
			this.yil = -yil;
		} else {
			this.yil = yil;
		}
		
	}
	
	
	

}
