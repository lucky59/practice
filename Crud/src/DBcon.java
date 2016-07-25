import java.sql.*;

public class DBcon {

	public static Connection connect()
	{
		Connection con = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		
	try {
			Class.forName(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521";
			String uname = "system";
			String pwd = "password";
			
			con = DriverManager.getConnection(url,uname,pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
	return con;
	}

}

