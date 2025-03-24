
package conditional_statements;

public class MethodOverLoading {
	
public static void main(String[] args) {
	
	add(10,20,40.56f);
	
}

public static void add(int a, int b, float c) {
	
	System.out.println(a+b+c);
	System.out.println("first");
}

public static void add(float a, float b, float c) { 
	
	System.out.println(a+b+c);
	System.out.println("second");
  }
}

 // Compiler gives priority to the method which has maximum signatures(arguments) same.