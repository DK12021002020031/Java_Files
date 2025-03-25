package method_chaining;

public class Student {

	String name;
	int id;

	public Student setName(String name) {

		this.name = name;

		return this; // Contains the address of currently existing object
	}

	public void display() {

		System.out.println(this.name + " " + this.id);
	}

}
