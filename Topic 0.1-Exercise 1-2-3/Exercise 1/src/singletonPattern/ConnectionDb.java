package singletonPattern;
import java.sql.*;
public class ConnectionDb {

	private static Connection con=null;
	private static ConnectionDb instance;
	private ConnectionDb(){
		
	}
	public static void Connect() {
		System.out.println("Connecting to MySQL...");
	}
	public static ConnectionDb getInstance(){
		if(instance==null) { //If the instance is null, I create a new instance
			System.out.print("The instance was created. ");
			instance = new ConnectionDb();
		}
		return instance;
		}
	
	
}
