package exception_handling;

public class UserLogin {

	private int pin = 1234;

	public void login(int pin) {

		if (this.pin == pin) {
			
			System.out.println("User sucessfully logged in!");
		} else {
			
			throw new InvalidPinException("The user pin is invalid!");
		}
	}

	public static void main(String[] args) {

		System.out.println("Main starts!");

		UserLogin user = new UserLogin();

		try {
			
			user.login(1224);
		} 
		catch (InvalidPinException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main Ends!");
	}
}
