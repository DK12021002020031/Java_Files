package set_collections;

public class Employee implements Comparable<Employee>{
	
	String name;
	
	int salary;
	
	public Employee(String name,int salary) {
		
		this.name=name;
		this.salary=salary;
	}

	@Override
    public String toString() {
    	
    	return this.name+"@"+this.salary;
    }

	@Override
	public int compareTo(Employee o) {
		
		return o.salary-this.salary;
	}
}
