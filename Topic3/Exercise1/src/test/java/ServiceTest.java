import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import e2.services.User;
import e2.services.UserDB;

public class ServiceTest {
	
	//Test CRUD
	@Test
	public void CreateUserTest() {
		UserDB userDb = new UserDB();
		assertEquals(true,userDb.createUser(new User(5,"Gonzalo","aa","aaf")));
	}
	@Test
	public void ReadUserTest() {
		UserDB userDb = new UserDB();
		assertEquals(true,userDb.readUser(1));
	}
	@Test
	public void updateUserTest() {
		UserDB userDb = new UserDB();
		assertEquals(true,userDb.updateUser(3));
	}
	@Test
	public void deleteUserTest() {
		UserDB userDb = new UserDB();
		assertEquals(true,userDb.deleteUser(4));
	}

}
