
import java.util.*;


class Employee{
	
	int empNo;
	String empName;
	String designation;
	
}
public class SetDemo extends HashSet<Employee> {

	HashSet<Integer> eNo = new HashSet<Integer>();
	
	@Override
	public boolean add(Employee e) {
		
	    boolean con = eNo.add(e.empNo);
	    
	    if(con)
	    	return super.add(e);
	    else
	    	return false;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.empNo = 124; e1.empName = "Venkat"; e1.designation = "Programmer";
		e2.empNo = 124; e2.empName = "Veerala"; e2.designation = "System Analyst";
		e3.empNo = 125; e3.empName = "aashu"; e3.designation = "Programmer";
		
		SetDemo s = new SetDemo();
		
		boolean con = s.add(e1);
		
		System.out.println(con);
		
		con = s.add(e2);
		
		System.out.println(con);
		
		con = s.add(e3);
		
		System.out.println(con);
		
		System.out.println("set ="+s);
	}

}
