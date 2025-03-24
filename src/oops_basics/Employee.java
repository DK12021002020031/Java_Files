package oops_basics;

public class Employee {

	int id, salary;

	String name, companyName;
	
	// This is the example of Constructor Chaining

	public Employee() {
		
		System.out.println("Hello Employee!");

	}

	public Employee(int id) {
		
		this();
		
		this.id = id;

		System.out.println("The id of the employee is: " + id);
	}

	public Employee(int id, String name) {

		this(id);

		this.name = name;

		System.out.println("The name of the employee is: " + name);
	}

	public Employee(int id, String name, String companyName) {

		this(id, name);

		this.companyName = companyName;

		System.out.println("The employee is working in: " + companyName);
	}

	public Employee(int id, String name, String companyName, int salary) {

		this(id, name, companyName);

		this.salary = salary;

		System.out.println("The employee gets: " + salary);
	}
}
