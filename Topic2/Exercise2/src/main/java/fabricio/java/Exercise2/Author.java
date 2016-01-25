package fabricio.java.Exercise2;

public class Author {
	private String nameAuthor;
	private String message;
	
	public Author(String nameAuthor, String message) {
		super();
		this.nameAuthor = nameAuthor;
		this.message = message;
	}
	public Author() {
		
	}
	public String getNameAuthor() {
		return nameAuthor;
	}
	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
