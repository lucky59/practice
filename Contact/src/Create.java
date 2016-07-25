import java.sql.*;


public class Create {

	public static void main(String[] args)
	{
		Connection con = DBConnect.getConnection();
		try {
				Statement st = con.createStatement();
				String query = "create table contact(sno number(5),name varchar(20),gender varchar(6),phno number(10),email_id varchar(20))";
				int check = st.executeUpdate(query);
				
				if(check == 0)
					System.out.println("table created successfully");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
