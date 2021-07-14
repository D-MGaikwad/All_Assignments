package company;

public class Message {
	private User user;
	private String message;
	public Message(User user, String message) {
		super();
		System.currentTimeMillis();
		this.user = user;
		this.message = message;
	}
	public String toString() {
		return  user + " : " + message;
	}

}
