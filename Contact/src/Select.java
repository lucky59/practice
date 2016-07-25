import java.sql.*;

public class Select {

	public static void main(String[] args)
	{
		
		Connection con = DBConnect.getConnection();
		
		try {
			
				PreparedStatement ps = con.prepareStatement("select * from contact where sno = ?");
				
				ps.setInt(1,123);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next())
				{
					System.out.println("sno: "+rs.getInt(1));
					System.out.println("name: "+rs.getString(2));
					System.out.println("phno: "+rs.getString(3));
					System.out.println("gender: "+rs.getString(4));
					System.out.println("email_id: "+rs.getString(5));
				}	
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
