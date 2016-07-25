import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {
	
	static Connection con;
	
	public static Connection getConnection()
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
				Class.forName(driver);
				
				String url = "jdbc:oracle:thin:@localhost:1521";
				String user = "system";
				String password = "password";
				
				con = DriverManager.getConnection(url, user, password);
			}catch (Exception e) {
				e.printStackTrace();
		}
		
		return con;
	}
}
