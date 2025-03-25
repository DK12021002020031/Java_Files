package inheritance;

public class Car extends Vehicle {

	int price;
	
	public Car(int price,String name,String engineType) {
		
		this.price=price;
		this.name=name;
		this.engineType=engineType;
	}
}
