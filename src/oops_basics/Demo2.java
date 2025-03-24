package oops_basics;

public class Demo2 {

	
	public Demo2(){
		
        System.out.println(Demo1.id);
        
        Demo1 b=new Demo1();
		
		System.out.println(b.name);
	}
	
	public static void main(String[] args) {
		
		Demo2 x=new Demo2();
	}

}
