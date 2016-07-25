import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Select {
	
	static Connection con;
	
	public static void main(String[] args) {
		
		con = DBconnect.getConnection();
		
		try {
				Statement st = con.createStatement();
				String query = "select * from contact,address where contact.phno = address.contact";
				
				ResultSet rs = st.executeQuery(query);
				
				System.out.println("first Name \t Last Name \t Contact \t email \t designation \t" +
									"gender \t St.No \t st.Name \t city \t state \t zip ");
				
				while(rs.next())
				{
					System.out.println(rs.getString(2) + " \t " + rs.getString(3) + "\t" +
							rs.getLong(1) + " \t " + rs.getString(5) + "\t" +
							rs.getString(6) + " \t " + rs.getString(4)+ "\t" +
							rs.getInt(7) + " \t " + rs.getString(8)+ "\t" +
							rs.getString(9) + " \t " + rs.getString(10) + "\t" +rs.getInt(11));
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
