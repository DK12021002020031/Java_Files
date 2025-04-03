package exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {

		alpha();

	}

	public static void alpha() {

		System.out.println("This is alpha method!");

		beta();
	}

	public static void beta() {

		System.out.println("This is beta method!");

		gamma();
	}

	public static void gamma() {

		System.out.println("This is gamma method!");

		try {

			System.out.println(10 / 0);
			System.out.println("Check me!"); // This does not get executed because the moment the exception object is
												// created is created the control is shifted to the catch block

		} catch (ArithmeticException e) { // catch block gets executed only if the exception object is created

			System.out.println("Arithmetic Exception Handled!");
		}

		System.out.println("Gamma Ends!");
	}

}
