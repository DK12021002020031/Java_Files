package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver {

	public static void main(String[] args) {

		ArrayList<Employee> arr = new ArrayList<>();

		Employee e1 = new Employee(1, "Rahul", 5000);

		Employee e2 = new Employee(2, "Sushant", 7000);

		Employee e3 = new Employee(3, "Akash", 4000);

		arr.add(e1);
		arr.add(e2);
		arr.add(e3);

		for (Employee e : arr) {

			System.out.println("Id:" + e.id + "   Name:" + e.name + "   Salary:" + e.salary);
		}
		
//		Iterator<Employee> itr1=arr.iterator();
//		
//		while(itr1.hasNext()) {
//			
//			Employee e=itr1.next();
//			
//			if(e.name.equals("Akash")) {
//				itr1.remove();
//			}
//		}
//		
//		System.out.println(arr);

		ArrayList<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);

		for (int num : nums) {
			
			if(num==5) {
				Integer x=num;
				nums.remove(x);
				break;
			}
		}
		
		System.out.println(nums);
		
		Iterator<Integer> itr=nums.iterator();
		
		while(itr.hasNext()) {
			
			int x=itr.next();
			if(x==4) {
				itr.remove();
			}
		}
		
		System.out.println(nums);
		
		ListIterator list=nums.listIterator();
		
		while(list.hasNext()) {
			
			System.out.println("Index: "+list.nextIndex()+"   "+"Element: "+list.next());
		}
		
		ListIterator list1=nums.listIterator();
		
		while(list1.hasNext()) {
			
			int element=(Integer)list1.next();
			
			if(list1.nextIndex()==1) {
				list1.add(60);
			}
			else if(element==2) {
				list1.set(100);
			}
		}
		
		System.out.println(nums);
		
		
		ArrayList arr1=new ArrayList<>();
		
		arr1.add("Shubham");
		arr1.add(12);
		arr1.add(3.142);
		arr1.add('A');
		arr1.add(true);
		arr1.add(null);
		
		System.out.println(arr1);
		
		Collections.sort(arr);
		
		for (Employee e : arr) {

			System.out.println("Id:" + e.id + "   Name:" + e.name + "   Salary:" + e.salary);
		}
	}
}

// If we are iterating a collection using a for-each loop and we try to modify the data inside it(add or delete) at the same time, then we get the "Concurrent Modification Exception". 

