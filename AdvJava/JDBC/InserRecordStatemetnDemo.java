import java.sql.*;
import java.util.*;

public class InserRecordStatemetnDemo{
	
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
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Id :: ");
			Integer pid  = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Name :: ");
			String pname  = sc.nextLine();
			
			System.out.println("Enter Product Price :: ");
			Integer price  = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Quantity :: ");
			Integer quantity  = Integer.parseInt(sc.nextLine());
			
			// Executing Stament
			String sql = "insert into products values("+pid+",'"+pname+"',"+price+","+quantity+")";
			System.out.println("SQL Query :: " + sql);
			
			stmt.execute(sql);
			System.out.println("Statement Execution Done");
			
			//Closing the Connection
			conn.close();
			System.out.println("Connection Closed");
			
			}catch( SQLException | ClassNotFoundException ex){
				ex.printStackTrace();
			}

		
	}
	
	
	
}