package object_class;

public class Employee {
	
	int id;
	
	String name;
	
	double salary;
	
	public Employee(int id,String name,double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override // This method is overriding the actual "toString" method inside the class Object
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override // This method is overriding the actual "equals" method inside the class Object
	public boolean equals(Object o) {
		if(o instanceof Employee) {
		
			Employee e=(Employee)o;
			
			return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
		}
		
		return false;
	}
	
	public int hashCode() {
		
		return (int)(this.id+this.salary+this.name.hashCode());
	}
	
//	public int hashCode() {
//		
//		return 1;  // Worst way to override a hash function where it returns the same hash code for every object
//	}
}
