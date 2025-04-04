package comparable_and_comparator;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person p1=new Person(47,"Harsh");
		
		Person p2=new Person(23,"Akash");
		
		
		if(p1.compareTo(p2)>0) {
			System.out.println("p1 is greater!");
		}
		else if(p1.compareTo(p2)<0) {
			System.out.println("p2 is greater!");
		}
		else {
			System.out.println("p1 is equal to p2");
		}
	}

}
