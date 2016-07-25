import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Create {

	public static void main(String[] args) {
		
		Connection con = DBconnect.getConnection();
		
		try {
			
				String query = "create table address(hno int not null,"
						+"stname varchar(20) not null, city varchar(20) not null,"+
						"state varchar(20) not null, zip int not null,contact number(10) not null)";
				
				Statement st = con.createStatement();
				st.executeUpdate(query);
				
				query = "create table contact(phno number(10) primary key,"+
						"firstname varchar(20) not null, lastname varchar(20) not null,"+
						"gender varchar(5) not null, email varchar(30) not null,"+
						"designation varchar(10) not null)";
				
				st.executeUpdate(query);
				
				System.out.println("address and contact tables are created");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
