import java.sql.*;
import java.util.*;

public class PreparedsStatmentwithScanner{
	
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
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Id :: ");
			Integer pid  = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Name :: ");
			String pname  = sc.nextLine();
			
			System.out.println("Enter Product Price :: ");
			Integer price  = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Quantity :: ");
			Integer quantity  = Integer.parseInt(sc.nextLine());
			
			prestmt.setInt(1,pid);
			prestmt.setString(2,pname);
			prestmt.setInt(3,price);
			prestmt.setInt(4,quantity);
					
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