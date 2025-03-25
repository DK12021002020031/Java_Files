package many_to_many_association;

public class Course {

	String name;
	Student[] students;

	public Course(String name, int size) {

		this.name = name;

		students = new Student[size];
	}
}
