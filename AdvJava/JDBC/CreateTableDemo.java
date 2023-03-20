import java.sql.*;


public class CreateTableDemo{
	
	public static void main(String[] args){
			try{
			// Registering the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Succeffully");
			
			//Getting the Conneciton
			Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack","root","admin");
			System.out.println("Connection Establishment Succeffully");
			
			// Create a Statment Object
			Statement stmt =  conn.createStatement();
			System.out.println("Statement Object created Succeffully");
			
			// Executing Stament
			stmt.execute("create table products (pid integer,pname varchar(20),price integer,quantity integer)");
			System.out.println("Statement Execution Done");
			
			//Closing the Connection
			conn.close();
			System.out.println("Connection Closed");
			
			}catch( SQLException | ClassNotFoundException ex){
				ex.printStackTrace();
			}

		
	}
	
	
	
}