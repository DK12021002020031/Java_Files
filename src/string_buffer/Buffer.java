package string_buffer;

public class Buffer {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer();
		
		str.append(102);
		
		str.append(true);
		
		char[] ch={'b','a','c'};
		
		str.append(ch);
		
		System.out.println(str);
		
		StringBuffer s1=new StringBuffer("Hello World!");
		
		System.out.println(s1);
		
		s1.delete(0,4);
		
		System.out.println(s1);
		
		char[] arr= {'a','b','c'};
		
		StringBuffer s2=new StringBuffer(123);
		
		s2.append(arr);
		
		System.out.println(s2);
		
		System.out.println(s2.capacity());
	}

}
