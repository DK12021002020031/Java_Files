package hashset_collections;

import java.util.HashSet;

public class StudentDriver {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();

		set.add(new Student(1, "Rahul"));
		set.add(new Student(4, "Gaurav"));
		set.add(new Student(1, "Rahul"));
		set.add(new Student(3, "Sohan"));
		set.add(new Student(2, "Akash"));

		System.out.println(set);
	}

}
