package inheritance;

public class Parent {

	static int a=10;
	
	int b=10;
	
	static void print() {
		
	  System.out.println("This is a static method");	
	}
	
	public void message() {
		
		  System.out.println("This is a non-static method");	
	}
	
	static {
		System.out.println("This is a static initializer");
	}
	
	{
		System.out.println("This is a non-static initializer");
	}
	
	Parent(){
		
		System.out.println("This is a the constructor");
	}
}
