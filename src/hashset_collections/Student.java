package hashset_collections;

import java.util.Objects;

public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {

		return this.id + "@" + this.name;
	}

	@Override
	public boolean equals(Object o) {

		Student s = (Student) o;

		return this.id == s.id && this.name == s.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
