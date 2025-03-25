package method_chaining;

public class Student {

	String name;
	int id;

	public Student setName(String name) {

		this.name = name;

		return this; // Contains the address of currently existing object
	}
	
	public Student setId(int id) {
		
		this.id=id;
		
		return this; // Contains the address of currently existing object
	}

	public Student display() {

		System.out.println("Student ID: "+this.id + "\nStudent Name: " + this.name);
		
		return this;
	}

}
