package many_to_one_association;

public class Customer {
	
	int custID;
	
	String custName;
	
	Bank bank;
	
	public Customer(int custID,String custName,Bank bank) {
		
		this.custID=custID;
		
		this.custName=custName;
		
		this.bank=bank;
	}
	
	public void display() {
		
		System.out.println(this.custID+" "+this.custName+" "+this.bank.bankName);
	}

}
