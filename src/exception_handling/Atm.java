package exception_handling;

public class Atm {

	private int pin = 1234;

	private int balance = 5000;

	public void deposit(int pin, int amount) {

		if (this.pin == pin) {
			balance += amount;
		} else {

		}
	}

	public String withdraw(int pin, int amount) {

		if (this.pin == pin) {
			if (balance >= amount) {
				return "Amount Withdraw, Current Balance: " + this.balance;
			} else {

				throw new InsufficientFundException("Insufficient Balance");
			}
		} else {

			throw new InvalidPinException("Pin is invalid!");
		}
	}


	public static void main(String[] args) {

		Atm atm = new Atm();

		System.out.println(atm.withdraw(1237, 100));
	}

}
