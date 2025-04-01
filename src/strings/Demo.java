package strings;

public class Demo {

	public static void main(String[] args) {
		
		String s1="hello";
		
		String s2=new String("hello");
		
		char[] arr= {'h','e','l','l','o'};
		
		String s3=new String(arr);
		
		System.out.println(s1+" "+s2+" "+s3);
		
		System.out.println(s1==s2);  // returns true
		
		System.out.println(s1+" "+s2+" "+s3);

	}

}
