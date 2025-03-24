package composition;

public class PhoneDriver {

	public static void main(String[] args) {
		
		Phone p=new Phone("Samsung","Lithium-Ion");
		
		p.display();
		
        p=null;
		
		System.out.println(p.b.batteryType); // Throws an error
		
		// Sim object cannot exist without the Phone object. Thus it is a strong association. 

	}

}
