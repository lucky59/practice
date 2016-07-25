import java.sql.Connection;
import java.sql.Statement;


public class Insert {

	public static void main(String[] args) {
		Connection con = DBcon.connect();

		if(con!=null)
		{
			try {
				Statement st = con.createStatement();
				String query = "insert into contact values(101,'Preem','Racharla','8019667785','racharlaprem@gmail.com',7350,'McArdle Rd','Texas',78412)";
				int val = st.executeUpdate(query);
				
				System.out.println(val);
				if(val!= 0 )
					System.out.println("row Inserted successfully");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
