package CustomException;

public class AgeInvalidException extends RuntimeException {
	String message;

	AgeInvalidException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
