package fabricio.java.Exercise2;

import java.util.ArrayList;



public class Demo {
	 public static void main(String[] args) {
		 ArrayList<Author> blog= Blog.getInstance();
	    	Blog bl = new Blog();
	    	//bl.saveAuthor();
	    	MessageServices messageServices = new MessageServices();
	    	bl.setMessageServices(messageServices);
	    	int a=bl.saveMessage();
	    	Author au;
	    	au=bl.getMessageServices().getAuthor(2);
	    	au.getMessage();
	    	System.out.println(au.getMessage());
	    	System.out.println(a);
	 }

}
