package tekrar13;

import java.time.LocalDateTime;

public class User {

	String name;
	LocalDateTime registerDate;

	
	public User () { 	// parametresiz consructor
		
	}
	
	
	public User (String name, LocalDateTime registerDate) {  // parametreli consructor
		this.name=name;
		this.registerDate=registerDate;
	}
	

}
