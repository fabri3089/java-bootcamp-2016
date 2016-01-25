package fabricio.java.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Blog {
	protected MessageServices messageServices;
	
	public MessageServices getMessageServices(){
		return messageServices;
	}
	public void setMessageServices(MessageServices messageServices){
		this.messageServices=messageServices;
	}
	static ArrayList<Author> blog;
	public static ArrayList<Author> getInstance(){
		if(blog==null){
			blog=new ArrayList<Author>();
		}
		return blog;
	}
	/*public void saveAuthor(){
		messageServices.saveAuthor();
	}*/
	public int saveMessage(){
		ArrayList<Author> blog= Blog.getInstance();
		blog.add(messageServices.getAuthor(1));
		blog.add(messageServices.getAuthor(2));
		blog.add(messageServices.getAuthor(3));
		int size = blog.size();
		return size;
		
		
	}
	public int getLastTenMessages()	{
		int size=messageServices.getLastTenMessages();
		return size;

	}
	
	
}
