package fabricio.java.Exercise2;

import org.easymock.EasyMock;


import junit.framework.TestCase;

public class BlogTest extends TestCase {

//Message mess = EasyMock.createMock(Message.class);
	
	public void testBl(){

	Blog bl= new Blog();
	assertEquals(3,bl.saveMessage());
	}
}
