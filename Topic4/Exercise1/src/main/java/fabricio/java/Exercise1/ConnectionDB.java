package fabricio.java.Exercise1;

import java.sql.*;

public class ConnectionDB {
	private Connection con = null;
	public static void getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school", "root", null);
			if(con!=null)
			   {
			    Statement state=con.createStatement();
			    ResultSet result= state.executeQuery("SELECT te.`lastName`, "
			    		+ "te.`firstName`, cosc.`courseName`, cosc.`scheduleTime`"
			    		+ "FROM teacher te INNER JOIN course co ON te.`lastName`=co.`asignedTeacher`"
			    		+ "INNER JOIN course_scheduletime cosc ON co.`name`=cosc.`courseName`"
			    		+ "ORDER BY cosc.`courseName`,te.`lastName`");
			while(result.next()){
				String lastName=result.getString("lastName");
		    	String firstName=result.getString("firstName");
		    	String courseName=result.getString("courseName");
		    	String courseScheduleTime=result.getString("scheduleTime");
		    	System.out.println("Teacher: "+lastName+" "+ firstName +" Course Name: "+
		    	courseName+ " Schedule: "+ courseScheduleTime);
		}
	}
	
}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
