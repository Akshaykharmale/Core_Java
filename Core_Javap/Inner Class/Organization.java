package day23_cj_innerclass;

public class Organization 
{
	String name,location;
	void data()
	{
		System.out.println("Org. name : "+name);
	}
	class Employee
	{
		int emp_id;
		String emp_name;
		void data1()
		{
			data();
			System.out.println("Org. location : "+location);
			System.out.println("\nEmployee id : "+emp_id);
			System.out.println("Employee name : "+emp_name);
		}
	}
	
	public static void main(String[] args) 
	{
		Organization o= new Organization();
		o.name="TCS";
		o.location="Pune";
		
		Employee em= o.new Employee();
		em.emp_id=101;
		em.emp_name="Sushant";
		em.data1();
	}

}
