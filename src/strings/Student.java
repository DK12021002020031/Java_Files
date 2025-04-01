package strings;

public class Student {
	
	int id;
	
	String name;
	
	String gender;
	
	double marks;
	
	public Student(int id,String name,String gender,double marks) {
		
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.marks=marks;
	}
	
	public String toString() {
		
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	public boolean equals(Object o) {
		
		if(o instanceof Student) {
			
			Student e=(Student)o;
			
			return this.id==e.id && this.marks==e.marks && this.name.equals(e.name) && this.gender.equals(e.gender);
		}
		
		return false;
	}
	
	public int hashCode() {
		
		return (int)(this.id+this.marks+this.name.hashCode()+this.gender.hashCode());
	}
}




