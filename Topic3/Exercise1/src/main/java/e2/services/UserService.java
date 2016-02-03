package e2.services;

public class UserService implements IUserService{
	
	public void createUser(User user){
		UserDB userDb= new UserDB();
		userDb.createUser(user);
	}
	public void readUser(int id){
		UserDB userDb= new UserDB();
		userDb.readUser(id);
	}
	public void updateUser(int id) {
		UserDB userDb= new UserDB();
		userDb.updateUser(id);
		
	}
	public void deleteUser(int id) {
		UserDB userDb= new UserDB();
		userDb.deleteUser(id);
		
	}
	
	

}
