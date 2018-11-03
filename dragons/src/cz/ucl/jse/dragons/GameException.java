package cz.ucl.jse.dragons;

public class GameException extends Exception {
	
	private String message;
	
	public GameException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
