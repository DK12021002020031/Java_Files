package exception_handling;

public class Child extends Parent {

//	void demo() throws ArithmeticException{
//		
//	}

	void demo() {
		
		System.out.println("Demo");

	}
	
	public static void main(String[] args) {

	}
}

/* If the super class method is throwing an exception then the subclass overridden method 
must also throw the same exception or the child type of that exception and not the parent type 
*/