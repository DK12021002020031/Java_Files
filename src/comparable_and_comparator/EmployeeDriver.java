package comparable_and_comparator;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Akash",1000);
		
		Employee e2=new Employee(2,"Abhishek",2000);
		
		compareBasedOnName(e1,e2);
	}
	
	public static void compareBasedOnName(Employee e1,Employee e2) {
		
		if(e1.compareTo(e2)>0) {
			System.out.println("e1 is greater!");
		}
		else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater!");
		}
		else {
			System.out.println("e1 and e2 are equal!");
		}
	}
	
   public static void compareBasedOnId(Employee e1,Employee e2) {
		
	   CompareEmployeeById compareId=new CompareEmployeeById();
	
	   if(compareId.compare(e1,e2)>0) {
			System.out.println("e1 is greater!");
		}
		else if(compareId.compare(e1,e2)<0) {
			System.out.println("e2 is greater!");
		}
		else {
			System.out.println("e1 and e2 are equal!");
		}
	}

   public static void compareBasedOnsalary(Employee e1,Employee e2) {
		
	   CompareEmployeeBySalary compareId=new CompareEmployeeBySalary();
	
	   if(compareId.compare(e1,e2)>0) {
			System.out.println("e1 is greater!");
		}
		else if(compareId.compare(e1,e2)<0) {
			System.out.println("e2 is greater!");
		}
		else {
			System.out.println("e1 and e2 are equal!");
		}
	}
}
