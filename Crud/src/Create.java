import java.sql.Connection;
import java.sql.Statement;


public class Create {
public static void main(String[] args) {
		
		Connection con = DBcon.connect();

		if(con!=null)
		{
			try {
				Statement st = con.createStatement();
				String query = "create table contact(eno number(3) NOT NULL, fname varchar(10),lname varchar(10), phno number(10),email varchar(30),stno number(5), stname varchar(20), state varchar(10),zipcode number(5), PRIMARY KEY (eno))";
				boolean val = st.execute(query);
				
				if(!val)
					System.out.println("table created successfully");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
