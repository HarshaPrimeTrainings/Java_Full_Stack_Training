import java.sql.*;


public class JdbcDemo{
	
	public static void main(String[] args){
			try{
			//Driver d = new com.mysql.cj.jdbc.Driver();
			//DriverManager.registerDriver(d);
			
			// Registering the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Succeffully");
			//Getting the Conneciton
			Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack","root","admin");
			System.out.println("Connection Establishment Succeffully");
			
			
			}catch( SQLException ex){
				ex.printStackTrace();
			}

		
	}
	
	
	
}