package tekrar13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class S05_dateTime {

	public static void main(String[] args) {


		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
			// ad�	=  class'�  string'e ceviren method  format metodu:DateTimeFormatter class'�ndan ISO_DATE_TIME metodunu cal��t�r demektir 
		
		System.out.println(date);
		
		//what is the result ?

		/*
		 * A) May 04, 2014T00:00:00:000
		 * 
		 * B) 2014-05-04T00:00:00:000
		 * 
		 * C) 5/4/14T00:00:00:000
		 * 
		 * D) An exception is throw at runtime
		 */

	}
	
	// veri olarak bana tarih verdin ama format zamand�r. o y�zden cal��maz

}
