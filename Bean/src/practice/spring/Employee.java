package practice.spring;

public class Employee {
	
	 private int eno;
	 private String ename;
	
	Employee()
	{
		System.out.println("This is employee constructor");
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void print()
	{
		System.out.println(eno+"  "+ename);
	}
}
