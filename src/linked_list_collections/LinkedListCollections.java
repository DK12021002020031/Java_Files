package linked_list_collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollections {

	public static void main(String[] args) {
		
		LinkedList<Student> list=new LinkedList<>();
		
		list.add(new Student(21,"Rahul"));
		list.add(new Student(16,"Akash"));
		list.add(new Student(8,"Sourav"));
		list.add(new Student(21,"Gaurav"));
		list.add(new Student(21,"Lakhan"));
		list.add(new Student(5,"Tushar"));
		list.add(new Student(23,"Manav"));
//		list.add(null);
		
		System.out.print("Original List: ");
		
		Iterator<Student> itr=list.iterator();
		
		while(itr.hasNext()) {
			
			Student s=itr.next();
			
			System.out.print(s.id+" "+s.name+", ");
		}
		
		compareByIdAndName c=new compareByIdAndName();
		
		Collections.sort(list,c);
		
		System.out.println();
		
		System.out.print("Sorted List: ");
		
		Iterator<Student> itr1=list.iterator();
		
		while(itr1.hasNext()) {
			
			Student s=itr1.next();
			
			System.out.print(s.id+" "+s.name+", ");
		}
		
		System.out.println();
		
		System.out.print("Reversed List: ");
		
        Iterator<Student> itr2=list.descendingIterator();
		
		while(itr2.hasNext()) {
			
			Student s=itr2.next();
			
			System.out.print(s.id+" "+s.name+", ");
		}
		
		list.addFirst(new Student(19,"Gopal"));
		
		list.poll();
		list.pollFirst();
		list.pollLast();
		
		list.push(new Student(31,"Farhan"));
		list.pop();
		
		list.peek();
		list.peekFirst();
		list.peekLast();
	}
}
