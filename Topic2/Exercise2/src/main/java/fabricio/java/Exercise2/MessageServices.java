package fabricio.java.Exercise2;

import java.util.ArrayList;

public class MessageServices {
	/*static ArrayList<Author> author = new ArrayList<Author>();
	public Author getAuthor(int n){
		Author ahu = null;
		if(author.get(1).equals(n))
		{
			 ahu= author.get(1);
		}
		return ahu;
	}*/
	
	
	public Author getAuthor(int position) {
		 return new Author("Fabricio", "Mensaje" + position);
		}
	static ArrayList<Author> author = new ArrayList<Author>();
	public int getLastTenMessages()
	{
		
	
		author.add(new Author("Fabricio", "Mensaje1"));
		author.add(new Author("Fabricio", "Mensaje2"));
		author.add(new Author("Fabricio", "Mensaje3"));
		author.add(new Author("Fabricio", "Mensaje4"));
		author.add(new Author("Fabricio", "Mensaje5"));
		author.add(new Author("Fabricio", "Mensaje6"));
		author.add(new Author("Fabricio", "Mensaje7"));
		author.add(new Author("Fabricio", "Mensaje8"));
		author.add(new Author("Fabricio", "Mensaje9"));
		author.add(new Author("Fabricio", "Mensaje10"));
		author.add(new Author("Fabricio", "Mensaje11"));
		return author.size();
	}
	
}
