package object_class;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
//		Employee e=new Employee(1,"Abhishek",1000);
//		
//		 System.out.println(e);
//	
//		 System.out.println(e.toString());
		

//		Employee e1=new Employee(2,"Akash",5000);
//		
//		String s=new String("Akash");
//		
//		Employee e2=new Employee(2,"Akash",5000); // Gives true in this.name==e.name in Employee class
//		
//		Employee e2=new Employee(2,s,5000); // Gives false in this.name==e.name in Employee class
//
//		System.out.println(e1==e2); // checks the equality of the addresses(references)
//	
//		System.out.println(e1.equals(e2));
		
		
		Employee e1=new Employee(1,"Sudhir",1000);
		
		Employee e2=new Employee(5,"Rakesh",2000);
		
		System.out.println(e1.hashCode());
		
		System.out.println(e2.hashCode());
		
	}

}