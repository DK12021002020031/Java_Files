package day_7;

public class Student {

	int id;

	double marks;

	String name, collegeName;

	// Constructor Overloading is possible because it is a specialized non-static method and a method can be overloaded.

	Student() {

	}

//	Student(int w, String x, String y, double z) {
//
//		id=w;
//		
//		name=x;
//		
//		collegeName=y;
//		
//		marks=z;
//	}
	
	Student(int id, String name, String collegeName, double marks) {
		
				this.id=id;
				
				this.name=name;
				
				this.collegeName=collegeName;
				
				this.marks=marks;
			}

	public void study() {

		if (name == null) {

			System.out.println("Kyu nahi ho rahi padhai!");

			return;
		}

		System.out.println(name + " is studying!");
	}

}
