package tekrar13;

public class S03_Varargs {

	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve
		
		concat("h","a","l","e");
		concat(" haným");

	}
	
	public static void concat(String...str) {
		
		String yeniStr="";
		
		for (String each : str) {
			yeniStr=yeniStr.concat(each);
			
		}
		
		System.out.print(yeniStr);
	}

}
