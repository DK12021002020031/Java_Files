package exception_handling;

public class InvalidPinException extends RuntimeException{

	private String message;
	
	public InvalidPinException(String message) {
		
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		
		return message;
	}
}
