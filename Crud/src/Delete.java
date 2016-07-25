import java.sql.Connection;
import java.sql.Statement;


public class Delete {
	
	public static void main(String[] args) {
		Connection con = DBcon.connect();

		if(con!=null)
		{
			try {
				Statement st = con.createStatement();
				String query = "Drop table contact";
				int val = st.executeUpdate(query);
				
				System.out.println(val);
				if(val!= 0 )
					System.out.println("rows deleted are "+val);
				
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
