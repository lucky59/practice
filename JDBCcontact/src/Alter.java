import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Alter {

public static void main(String[] args) {
		
		Connection con = DBconnect.getConnection();
		
		try {
			Statement st = con.createStatement();
			String query = "alter table contact modify gender varchar(7)";
			st.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
