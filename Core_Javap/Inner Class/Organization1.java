package day23_cj_innerclass;

public class Organization1 
{
	String name,location;
	int reg_no;
	void display()
	{
		System.out.println("Org. name : "+name);
		System.out.println("Org. location : "+location);
		System.out.println("Registration number : "+reg_no);
	}
	
	class Department
	{
		int id;
		String name,dept_head;
		void display1()
		{
			display();
			System.out.println("\nDepartment Id : "+id);
			System.out.println("Department name : "+name);
			System.out.println("Department Head : "+dept_head);
		}
	}
	
	public static void main(String[] args) 
	{
		Organization1 o=new Organization1();
		o.name="TCS";
		o.location="Mumbai";
		o.reg_no=2454874;
		
		Department d=o.new Department();
		d.id=124;
		d.name="Managment";
		d.dept_head="Sushant";
		
		d.display1();
		
	}

}
