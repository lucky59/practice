import java.sql.Connection;
import java.sql.Statement;


public class Truncate {

	public static void main(String[] args) {
		
		Connection con;
		try{
			
			con = DBconnect.getConnection();
			
			Statement st = con.createStatement();
			
			String query = "truncate table contact";
			st.executeUpdate(query);
			query = "truncate table address";
			st.executeUpdate(query);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}