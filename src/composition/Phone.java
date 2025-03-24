package composition;

public class Phone {
	
	String phoneName="iPhone";
	
	Battery b;
	
	public Phone(String phoneName,String batteryType) {
		
		this.phoneName=phoneName;
		this.b=new Battery(batteryType);
	}
	
	public void display() {
		
		System.out.println("The phone is: "+this.phoneName+" and the battery is: "+b.batteryType);
	}

}
