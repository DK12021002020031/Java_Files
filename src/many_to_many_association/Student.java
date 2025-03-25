package many_to_many_association;

public class Student {

	String name;

	Course[] arr;

	int count = 0; // Not made as static variable because we need separate pointer(count) for every
					// array in every object.

	public Student(String name, int size) {

		this.name = name;
		arr = new Course[size];
	}

	public void addCourse(Course course) {

		if (count < arr.length) {

			arr[count++] = course;
		} else {
			System.out.println("Sorry,cannot add any further!");
		}
	}
}
