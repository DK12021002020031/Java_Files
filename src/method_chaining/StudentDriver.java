package method_chaining;

public class StudentDriver {

	public static void main(String[] args) {

		Student s = new Student();

		System.out.println(s);

		System.out.println(s.setName("Govind"));

		StudentDriver d = new StudentDriver();

		System.out.println(d.print());
	}

	public StudentDriver print() {

		return this;
	}

}
