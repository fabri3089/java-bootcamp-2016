package fabricio.java.Exercise2;

import java.util.ArrayList;



public class Demo {
	 public static void main(String[] args) {
		 ArrayList<Author> blog= Blog.getInstance();
	    	Blog bl = new Blog();
	    	int a=bl.saveMessage();
	    	System.out.println(a);
	 }

}
