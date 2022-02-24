package tekrar13;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class S09_DateTime {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		/*
        
       Asagidaki code'un  ciktisi  nedir?
       */

       LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
       							       // yýl  ay  gun saat dak sn
       Period    p =  Period.ofDays(1).ofYears(2); 
   //  class'ý  adý=   2 yýl 1 ay'lýk periyotlar oluþturur
       // ama burada son eklenen zaman dilimi gecerlidir. yani 2 yýlda bir tekrar eden bir periyot var
       d = d.minus(p);
// minus; p kadar azalt demek
       DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

       System.out.println(d.format(f));

/*
           A. 5/9/13 11:22
           B. 5/10/13 11:22 ***
           C. 5/9/14
           D. 5/10/14
           E. The code does not compile.
           F. A runtime exception is thrown.
           
           B
*/

	}

}
