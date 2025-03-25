package many_to_many_association;

import java.util.Arrays;

public class CourseRecordDriver {

	public static void main(String[] args) {

		Student s1 = new Student("Rohan", 3);

		Student s2 = new Student("Aakash", 2);

		Course c1 = new Course("Java", 3);

		Course c2 = new Course("C++", 2);

		Course c3 = new Course("Python", 5);

		s1.addCourse(c1);
		s1.addCourse(c2);
		s2.addCourse(c3);
		s2.addCourse(c1);

		System.out.println(Arrays.deepToString(s1.arr) + " " + Arrays.deepToString(s2.arr));
	}
}
