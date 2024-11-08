package blatt11_müller;

public class NoMoreRemotesException extends Exception {

	private Object remote;

	public NoMoreRemotesException(Object r) {
		remote = r;
	}

	public String getMessage() {
		return "Das Objekt " + remote + " konnte nicht hinzugefügt werden.";
	}

}
