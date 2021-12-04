package homework;

public class TheGroupIsFullException extends Exception {

	@Override
	public String getMessage() {
		return "The Group is full";
	}
}
