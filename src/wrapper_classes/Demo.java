package wrapper_classes;

public class Demo {

	public static void main(String[] args) {
		
		int a=10;
		
		Integer i=new Integer(a);  // Boxing

		System.out.println(i);
		
		Integer x=Integer.valueOf(i);  // Boxing
		
		Integer y=30;  // Auto-Boxing
		
		System.out.println(y);
		
		int b =y.intValue();  // Unboxing
		
		Boolean flag=true;
		
		boolean abc=flag.booleanValue();  // Unboxing
		
		System.out.println(b+" "+abc);
		
		Character ch='a';  // Auto-Boxing
		
		char c=ch;  // Auto-Unboxing
		
		Integer ab=18,ac=18;
		
		System.out.println(ab==ac); // Here auto-unboxing happens in "ac" and "ab" and then comparison is done
	}

}
