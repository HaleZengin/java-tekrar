package tekrar6;

import java.time.LocalDateTime;

public class User {

	String name;
	LocalDateTime registerDate;
	
	
	public User() {
		
	}
	
	
	public User (String name, LocalDateTime registerDate)  {
		this.name=name;
		this.registerDate=registerDate;
		
	}

}
