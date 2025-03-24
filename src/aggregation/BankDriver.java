package aggregation;

public class BankDriver {

	public static void main(String[] args) {

		Customer c1 = new Customer("Varun Seth", 1234567890, "Savings");

		Bank b1 = new Bank("State Bank of India(SBI)", "Liluah", c1);

		b1.display();
	}

}
