package object_array;

import java.util.Scanner;

class Employee
{
	private int id;
	private String name,dept,desg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public Employee(int id, String name, String dept, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desg=" + desg + "]";
	}
	
	
}
public class Employee_Test 
{

	public static void main(String[] args) 
	{
		Employee e[]=new Employee[5];
		int id,choice=0,count=0;
		String name,dept,desg;
		Scanner scn=new Scanner(System.in);
		
		do{
			System.out.println(" 1.Add data \n 2.Update data \n 3.Delete data \n 4.Search data \n 5.View All \n 6.Exit");
			System.out.println("Enter your choice : ");
			choice=scn.nextInt();
			
			switch (choice) {
			case 1:System.out.println("Enter the employee id : ");
					id=scn.nextInt();
					System.out.println("Enter the employee name : ");
					name=scn.next();
					System.out.println("Enter the employee department : ");
					dept=scn.next();
					System.out.println("Enter the designation : ");
					desg=scn.next();
					
					e[count]=new Employee(id, name, dept, desg);
					count ++;
					System.out.println("Employee data added successfully\n");
					break;
					
			case 2:System.out.println("Enter the employee id want to be update :");
					id=scn.nextInt();
					
					for(int i=0;i<count;i++)
					{
						if(e[i]!=null && e[i].getId()==id)
						{
							System.out.println("Enter the employee name : ");
							name=scn.next();
							e[i].setName(name);
							System.out.println("Enter the employee department : ");
							dept=scn.next();
							e[i].setDept(dept);
							System.out.println("Enter the designation : ");
							desg=scn.next();
							e[i].setDesg(desg);
						}
					}
					System.out.println("Data updated successfully\n");
					break;
					
			case 3:System.out.println("Enter the employee id want to be delete :");
					id=scn.nextInt();
			
					for(int i=0;i<count;i++)
					{
						if(e[i]!=null && e[i].getId()==id)
						{
							e[i]=null;
						}
					}
					System.out.println("Employee data deleted successfully\n");
					break;
					
			case 4:System.out.println("Enter the employee id want to be search :");
					id=scn.nextInt();
			
					for(int i=0;i<count;i++)
					{
						if(e[i]!=null && e[i].getId()==id)
						{
							System.out.println(e[i]);
						}
					}
					System.out.println();
					break;
					
			case 5:System.out.println("***** All Employee Data *****");
			
					for(int i=0;i<count;i++)
					{
						if(e[i]!=null)
						{
							System.out.println(e[i].toString());
						}
					}
					System.out.println();
					break;
					
			case 6:System.out.println("----- Exited Successfully -----");
					System.exit(0);
			
			default:System.out.println("Invalid choice");
				break;
			}
		}while(choice !=6 );
		scn.close();
	}

}
