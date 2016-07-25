import java.sql.*;


public class Callable {

	public static void main(String[] args) {
		
		Connection con = DBConnect.getConnection();
		try {
			Statement cs = con.createStatement();
			String query = "create or replace procedure 'ContactNo' ( out no varchar,in serial number)"
					+ "BEGIN no = select phno from contact where sno = serial;"
					+ "END";
			
			cs.execute(query);
			String phn = null;
			CallableStatement call = con.prepareCall("{call ContactNo(?,?)}");
			call.setString(1,phn);
			call.setInt(2,123);
			call.execute();
			System.out.println(call.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
