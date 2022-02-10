package tekrar9;

import java.util.Arrays;
import java.util.Scanner;

public class S09_Arrays {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin

		Scanner scan=new Scanner(System.in);
		System.out.print("array'in boyutunu giriniz");
		int arrBoyutu = scan.nextInt();
		
		int [] arr = new int[arrBoyutu];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Array'in "+(i+1)+" inci elemanýný giriniz");
			
			arr[i]=scan.nextInt();
			
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Girdiginiz array'in max ve min eleman degeri farký: "+(arr[arr.length-1]-arr[0]));
		
		scan.close();
	}

}
