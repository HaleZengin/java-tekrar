package tekrar19_galeriOtomasyon;

public class Runner {

	public static void main(String[] args) {
		
		Car araba1 = new Honda();// Car classi referansiniz oluyor
        System.out.println("Arabanin markasi "+araba1.arabaMarkasi());
        System.out.println("Arabanin modeli "+araba1.arabaModeli());
        System.out.println("Arabanin yili "+araba1.arabaYili());
        
        Car araba2 = new Honda("Jazz",2020);
        System.out.println("Arabanin markasi "+araba2.arabaMarkasi());
        System.out.println("Arabanin modeli "+araba2.arabaModeli());
        System.out.println("Arabanin yili "+araba2.arabaYili());
        
        Car araba3 = new Toyota("Yaris",2021);
        System.out.println("Arabanin markasi "+araba3.arabaMarkasi());
        System.out.println("Arabanin modeli "+araba3.arabaModeli());
        System.out.println("Arabanin yili "+araba3.arabaYili());
        

	}

}
