package e2.services;

import java.util.ArrayList;

public class UserDB {
	public static ArrayList<User> users;
	private static ArrayList<User> getUserList() {
		if(users==null){
		users= new ArrayList<User>();
		users.add(new User(1,"Fabricio","fabri89","1234"));
		users.add(new User(2,"Favio","favio0093","4321"));
		users.add(new User(3,"Erwin","erwinSC","1234"));
		users.add(new User(4,"Leandro","lea2000","1234"));
		}
		return users;
	}
	
	public boolean createUser(User user){
		ArrayList<User> us= this.getUserList();
		us.add(user);
		System.out.println("New User: "+user.getName());
		return true;
		}
	
		public boolean readUser(int id){
			ArrayList<User> us= this.getUserList();
			for (User user : us ) {
				if(user.getId()==id){
					System.out.println("User Found: "+user.getName());
					return true;		}
				
				}
			return false;
			}

		public boolean updateUser(int id) {
		ArrayList<User> us= this.getUserList();
			for (User user : us ) {
				if(user.getId()==id){
					user.setId(10);
					System.out.println("User Edit: New id:"+ user.getId()+" Name: "+user.getName());
					return true;
							}
				}
			return false;
		}

		public boolean deleteUser(int id) {
			ArrayList<User> us= this.getUserList();
			for (User user : us ) {
				if(user.getId()==id){
				 System.out.println("User delete: "+user.getName());
					us.remove(id);
					return true;
					}
			}
			return false;
		}

		
}
