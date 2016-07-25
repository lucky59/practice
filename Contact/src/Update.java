import java.sql.*;


public class Update {

	public static void main(String [] args)
	{
		Connection con = DBConnect.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("alter table contact add constraint sno primary key(sno)");
			ps.executeUpdate();
			System.out.println("Table has been modified");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
