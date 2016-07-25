
import java.sql.*;

public class Read {

	public static void main(String[] args) {
		
		Connection con = DBcon.connect();

		if(con!=null)
		{
			try {
				Statement st = con.createStatement();
				String query = "select * from contact";
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next())
				{
					//System.out.println("Hello");
					System.out.println(rs.getString(1)+" "+rs.getString(2));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
