package tekrar7;

public class Students {
	
	public String name;
	public int age;
	
	public static int numofStudents;
	
	public Students() {
		this.name="Ali Can";
		this.age=12;
		numofStudents++;
	}
	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
		numofStudents++;
	}
	
	public Students(String name) {
		this.name = name;
		numofStudents++;
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
			System.out.println("std1 oluþturulmadan önce: "+numofStudents);	//0
		
			
			Students std1=new Students();
			Students std2=new Students();
			
			System.out.println("std1 oluþturulduktan sonra: "+numofStudents); //2
	
			Students std3=new Students("Veli Han, 13");
			
			System.out.println("std3 oluþturulduktan sonra: "+numofStudents); //3
			
			Students std4=new Students("Hale");
			
			System.out.println("std4 oluþturulduktan sonra: "+numofStudents); //4
	}

}
