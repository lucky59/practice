import java.math.BigDecimal;
import java.sql.*;


public class Read {
	
	public static void main(String[] args)
	{
		
		Connection con = DBConnect.getConnection();
		
		try {
			
				PreparedStatement ps = con.prepareStatement("insert into contact values(?,?,?,?,?)");
				
				ps.setInt(1,124);
				ps.setString(2,"Ram");
				ps.setString(3,"Male");
				ps.setString(4,"8019667789");
				ps.setString(5,"ram@gmail.com");
				int status = ps.executeUpdate();
				
				if(status == 1)
					System.out.println("row is inserted");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
