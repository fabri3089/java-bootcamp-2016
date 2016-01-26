package fabricio.java.Exercise2;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BlogTest {


	private MessageServices messageServicesMock;
	@Before
	public void setup(){
		
		//Mocking
		messageServicesMock=createMock(MessageServices.class);
		//Stubing
		expect(messageServicesMock.getAuthor(1)).andReturn(new Author("Fabricio","Mensaje1"));
		expect(messageServicesMock.getAuthor(2)).andReturn(new Author("Fabricio","Mensaje2"));
		expect(messageServicesMock.getAuthor(3)).andReturn(new Author("Fabricio","Mensaje3"));
		expect(messageServicesMock.getLastTenMessages()).andReturn(10);
		replay(messageServicesMock);
	}
	
	@Test
	public void TestSaveMessage(){

		Blog bl= new Blog();
		bl.setMessageServices(messageServicesMock);
		assertEquals(3,bl.saveMessage());
	}
	
	@Test
	public void TestGetLastTenMessages(){
		Blog bl = new Blog();
		bl.setMessageServices(messageServicesMock);
		assertEquals(10,bl.getLastTenMessages());
	}
}
