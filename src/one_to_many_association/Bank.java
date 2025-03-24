package one_to_many_association;

public class Bank {

	Customer[] customers; // Array of 'Customer' objects

	String bankName;

	static int count = 0; // Utility variable so it is static

	public Bank(int size, String bankName) {

		customers = new Customer[size];
		this.bankName = bankName;
	}

	public void addCustomer(Customer customer) {

		if (count < customers.length) {

			customers[count++] = customer;

			System.out.println("Customer added!");
		} else {

			System.out.println("cannot add customer, array is filled!");
		}
	}

	public void displayCustomers() {

		for (int i = 0; i < count; i++) {

			System.out.println("Customer ID: "+customers[i].customerID+" Customer Name: "+customers[i].customerName);
		}
	}

	public void removeCustomer(String name) {

		for (int i = 0; i < count; i++) {

		}
	}
}
