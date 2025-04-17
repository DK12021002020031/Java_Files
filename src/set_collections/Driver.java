package set_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {
	
	public static void main(String[] args) {
		
		CompareEmployeeByName c=new CompareEmployeeByName();
			
		TreeSet<Employee> set=new TreeSet<>(c);
		
		set.add(new Employee("Rahul",9000));
		
		set.add(new Employee("Akash",5500));
		
		set.add(new Employee("Sourav",2300));
		
		set.add(new Employee("Rohan",8900));
		
		System.out.println(set);
		
//		Iterator<Employee> itr=set.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
