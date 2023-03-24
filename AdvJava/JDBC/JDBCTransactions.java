import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTransactionDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack", "root","admin");
			conn.setAutoCommit(false);
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Ammount :: ");
			Integer ammount = Integer.parseInt(sc.nextLine());
			 //Account1
			 Statement st  = conn.createStatement();
			 ResultSet rs = st.executeQuery("select * from account1");
			 rs.next();
			 Integer account1Balance = rs.getInt(1);
			 Integer newbalanceAccount1 = account1Balance - ammount;
			 
			 st.execute("update account1 set balance = " + newbalanceAccount1 + " where balance = "+ account1Balance);
			 System.out.println("Ammout Transfered from Account1");
			 //Account2
			 ResultSet rs1 = st.executeQuery("select * from account2");
			 rs1.next();
			 Integer account2Balance = rs1.getInt(1);
			 Integer newbalanceAccount2 = account2Balance + ammount;
			 st.execute("update account2 set balance = " + newbalanceAccount2 + " 2where balance = "+ account2Balance);
			 System.out.print("Ammount Recieved Succefully in Account 2");
			 
			 conn.commit();
			 conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Ammount transaction Failed Balance reverted " );
		}
		
	}
}
