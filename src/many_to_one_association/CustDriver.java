package many_to_one_association;

public class CustDriver {
	public static void main(String[] args) {
		
		Bank bank=new Bank("SBI");
		
		Customer c1=new Customer(1,"Rohit",bank);
		
		Customer c2=new Customer(2,"Govind",bank);
		
		Customer c3=new Customer(3,"Naresh",bank);
		
		c1.display();
		
		c2.display();
		
		c3.display();
	}
}
