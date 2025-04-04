package comparable_and_comparator;

public class Employee implements Comparable {

	int id;
	
	private String name;
	
	double salary;
	
	public Employee(int id,String name,double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		
		return id+"@"+name+"#-"+salary;
	}
	
//	@Override
//	public int compareTo(Object o) {  // comparing based on salary
//		Employee e=(Employee)o;
//		
//		return (int)(this.salary-e.salary);
//	}
	
	@Override
	public int compareTo(Object o) { // comparing based on the name
		
		Employee e=(Employee)o;
		
		System.out.println(this.name.compareTo(e.name));
		
		return this.name.compareTo(e.name);
	}
}
