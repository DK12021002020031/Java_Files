package aggregation;

public class Phone {

	String phoneName;

	Sim s;

	public Phone(String phoneName, Sim s) {

		this.phoneName = phoneName;
		this.s = s;
	}

	public void display() {

		System.out.println(this.phoneName + " " + this.s.phoneNumber);
	}

}
