import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetWithPreparedStatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack", "root",
					"admin");

			PreparedStatement stmt = conn.prepareStatement("select * from products where quantity >= ?");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter quantity");
			 String inputqnty = sc.nextLine();
			
			stmt.setInt(1, Integer.parseInt(inputqnty));
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				int price = rs.getInt(3);
				int qty = rs.getInt(4);
				System.out.println(
						" Pid :: " + pid + " - ProductName :: " + pname + " price :: " + price + " quntity :: " + qty);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}