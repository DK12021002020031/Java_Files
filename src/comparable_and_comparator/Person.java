package comparable_and_comparator;

public class Person implements Comparable{

	String name;
	
	int age;
	
	Person(int age,String name){
		
		this.age=age;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		
		Person p=(Person)o;
		
		int isNameSame=this.name.compareToIgnoreCase(p.name);
		
		System.out.println(isNameSame);
		
		int ageDiff=this.age-p.age;
		
		return isNameSame==0 ? ageDiff : isNameSame;
	}
}
