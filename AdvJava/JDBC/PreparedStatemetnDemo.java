import java.sql.*;
import java.util.*;

public class PreparedStatemetnDemo{
	
	public static void main(String[] args){
			try{
			// Registering the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Succeffully");
			
			//Getting the Conneciton
			Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack","root","admin");
			System.out.println("Connection Establishment Succeffully");
			
			// Create a Statment Object
			String sql = "insert into products values(?,?,?,?)";
			PreparedStatement prestmt =  conn.prepareStatement(sql);
			System.out.println("Statement Object created Succeffully");
			
			
			prestmt.setInt(1,4);
			prestmt.setString(2,"Sony Mobile");
			prestmt.setInt(3,120);
			prestmt.setInt(4,10);
					
			// Executing Stament
			System.out.println("SQL Query :: " + sql);
			prestmt.execute();
			System.out.println("Statement Execution Done");
			
			//Closing the Connection
			conn.close();
			System.out.println("Connection Closed");
			
			}catch( SQLException | ClassNotFoundException ex){
				ex.printStackTrace();
			}

		
	}
	
	
	
}