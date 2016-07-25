import java.sql.*;


public class DBConnect {
	
	static Connection con = null;
	
	public static Connection getConnection()
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
				Class.forName(driver);
				String url = "jdbc:oracle:thin:@localhost:1521";
				String user = "system";
				String pwd = "password";
				
				con = DriverManager.getConnection(url, user, pwd);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
