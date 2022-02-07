package tekrar4;

public class S08_StringManipulation {

	public static void main(String[] args) {
		 /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= $19.99
        String str 2= $15.45
        */

		String str1="$19.99";
		String str2="$15.45";
		
		str1=str1.replace("$", "");
		str2=str2.replace("$", "");
		
		System.out.println(str1+str2); 	//19.9915.45 verir
		
		double s1=Double.parseDouble(str1);
		double s2=Double.parseDouble(str2);
		
		System.out.println(s1+s2);
		
	}

}
