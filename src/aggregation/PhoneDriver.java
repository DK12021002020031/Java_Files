package aggregation;

public class PhoneDriver {

	public static void main(String[] args) {

		Sim s1 = new Sim(1234567890);

		Phone p = new Phone("Samsung", s1);

		p.display();

		p = null;

		System.out.println(s1.phoneNumber);

		// Sim object can exist without the Phone object. Thus it is a weak association.

	}

}
