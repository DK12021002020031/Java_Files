package one_to_many_association;

import java.util.Scanner;

public class BankDriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size: ");

		int size = sc.nextInt();

		Bank bank = new Bank(size, "SBI");

		boolean flag = true;

		while (flag) {

			System.out.println("Enter 1 to add customer\nEnter 2 to display customers\nEnter 3 to exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();
				System.out.println("Enter customer name: ");

				String name = sc.nextLine();

				System.out.println("Enter customer ID: ");

				int id = sc.nextInt();

				Customer customer = new Customer(name, id);

				bank.addCustomer(customer);
				break;

			case 2:
				System.out.println("Here is the list of cutomers: ");
				bank.displayCustomers();
				break;
			case 3:
				System.out.println("Thank you Visit Again!");
				flag = false;
				break;
			}
		}

		sc.close();
	}
}
