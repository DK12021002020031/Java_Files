package lists;

public class Employee implements Comparable<Employee>{
	
	int  id;
	
	String name;
	
	double salary;
	
	public Employee(int id,String name,double salary){
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		int first_id=this.id;
		
		int second_id=o.id;
		
		return (second_id-first_id);
	}
}
