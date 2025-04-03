package exception_handling;

public class InsufficientFundException extends RuntimeException{

	public InsufficientFundException(String message) {
		
		super(message);
	}
}
