package aggregation;

public class Bank {

	String bankName;

	String branchName;

	Customer c;

	public Bank(String bankName, String branchName, Customer c) {

		this.bankName = bankName;
		this.branchName = branchName;
		this.c = c;
	}

	public void display() {

		System.out.println("Bank Name: " + this.bankName);
		System.out.println("Branch: " + this.branchName);
		System.out.println("Customer Name: " + this.c.custName);
		System.out.println("Account Number: " + this.c.accountNumber);
		System.out.println("Account Type: " + this.c.accountType);
	}

}
