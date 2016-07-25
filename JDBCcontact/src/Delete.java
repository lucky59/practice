import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


public class Delete {

	public static void main(String[] args) {

		Connection con;
		try{
			
			con = DBconnect.getConnection();
			
			Statement st = con.createStatement();
			System.out.println("enter phone number to delete the record:");
			Scanner sc = new Scanner(System.in);
			long phn = sc.nextLong();
			
			String query = "delete from contact where phno = "+phn;
			
			st.executeUpdate(query);
			query = "delete from address where contact = "+phn;
			st.executeUpdate(query);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
