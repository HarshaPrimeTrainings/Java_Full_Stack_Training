import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_fullstack", "root",
					"admin");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");
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
