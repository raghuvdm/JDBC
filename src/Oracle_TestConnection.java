import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle_TestConnection {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			System.out
					.println("Oracle DB : Connection Established Successfully...");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}// main()
}// class
