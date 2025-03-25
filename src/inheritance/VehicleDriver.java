package inheritance;

public class VehicleDriver {

	public static void main(String[] args) {

		Bike b = new Bike("Kawasaki","V4");

		Car c = new Car(10000,"Ferrari","V8");
		
		b.display();
		c.display();
		
		System.out.print(c.price);
	}
}
