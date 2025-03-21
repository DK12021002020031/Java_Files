package day_7;

public class Student {

	int id;
	
	double marks;

	String name, collegeName;
	
	Student(){
		
	}

	public void study() {

		if(name==null) {
			
			System.out.println("Kyu nahi ho rahi padhai!");
			
			return;
		}
		
		System.out.println(name+" is studying!");
	}

}
