package tekrar13;

import java.time.LocalDate;
import java.time.Month;

public class S08_DateTime {

	public static void main(String[] args) {

		/* Asagidaki code'un  ciktisi  nedir?
	    */

	        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
	        date.plusDays(2);  //2 gün sonraya git
	        date.plusYears(3); // 3 yýl sonraya git
	         

	        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	/*
	            A. 2018 APRIL 2
	            B. 2018 APRIL 30
	            C. 2018 MAY 2
	            D. 2021 APRIL 2
	            E. 2021 APRIL 30
	            F. 2021 MAY 2
	            G. A runtime exception is thrown.
	            
	            B
	 */

	}

}
