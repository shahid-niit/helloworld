package raza.spring;

public class HelloWorld {
	private String message;

	// set Message
	public void setMessage(String message) {
		this.message = message;
	}

	// get Message some extra line
	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
