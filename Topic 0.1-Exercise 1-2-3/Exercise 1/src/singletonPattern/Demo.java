package singletonPattern;
import java.sql.ResultSet;
import java.sql.Statement;


public class Demo {
public static void main(String[] args) {
		
		ConnectionDb con = ConnectionDb.getInstance();
		con.Connect();
		}

}
