import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Insert {

public static void main(String[] args) {
		
		Connection con = DBconnect.getConnection();
		
		try {
				String fname,lname,gender,email,stname,city,state;
				long phno,stno,zip;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter phone number");
				phno = Long.parseLong(sc.nextLine());
				System.out.println("Enter first name");
				fname = sc.nextLine();
				System.out.println("Enter last name");
				lname = sc.nextLine();
				System.out.println("Enter email id");
				email = sc.nextLine();
				System.out.println("Enter Designation");
				String desig = sc.nextLine();
				System.out.println("Enter gender");
				gender = sc.nextLine();
				System.out.println("Enter street number");
				stno = Long.parseLong(sc.nextLine());
				System.out.println("Enter Street name");
				stname = sc.nextLine();
				System.out.println("Enter city name");
				city = sc.nextLine();
				System.out.println("Enter state name");
				state = sc.nextLine();
				System.out.println("Enter zipcode");
				zip = Long.parseLong(sc.nextLine());
				
				String query = "insert into contact values ("+phno+
						",'"+fname+"','"+lname+"','"+gender+"','"+email+"','"+desig+"')";
			
				Statement st = con.createStatement();
				st.executeUpdate(query);
				
				query = "insert into address values ("+stno+",'"+stname+"','"+city+"'"+
						",'"+state+"',"+zip+","+phno +")";
				
				st.executeUpdate(query);
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
