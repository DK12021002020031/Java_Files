package day_7;

public class StudentDriver {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.name = "Abhishek";

		s1.collegeName = "IEM Kolkata";

		s1.id = 9;

		s1.marks = 82.9;

		if(s1.name!=null) System.out.println(s1.id + ". " + s1.name + " studies in " + s1.collegeName + " has scored " + s1.marks+" marks");

		s1.study();
		
		System.out.println();

		Student s2 = new Student();

		s2.name = "Govind";

		s2.collegeName = "IIT Kharagpur";

		s2.id = 4;

		s2.marks = 98.6;

		if(s2.name!=null) System.out.println(s2.id + ". " + s2.name + " studies in " + s2.collegeName + "has scored " + s2.marks+" marks");

		s2.study();

	}

}
