package fabricio.java.Exercise2;

import java.util.ArrayList;
import java.util.List;





public class Blog {
	static ArrayList<Author> blog;
	public static ArrayList<Author> getInstance(){
		if(blog==null){
			blog=new ArrayList<Author>();
		}
		return blog;
	}
	public int saveMessage(){
		ArrayList<Author> blog= Blog.getInstance();
		blog.add(new Author("Fabricio", "Mensaje1"));
		blog.add(new Author("Fabricio", "Mensaje2"));
		blog.add(new Author("Alberto", "Mensaje1"));
		int size = blog.size();
		return size;
		
		
	}
	
	
}
