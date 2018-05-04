package day12_cj_Inheritance;

class Teacher
{
	String designation="Teacher";
	static String collegename="Pillai's";
	
	void does()
	{
		System.out.println("Teaching");
	}
}

public class PhysicsTeacher extends Teacher
{	
	static String mainSubject="Physics";
	
	public static void main(String[] args) 
	{
		PhysicsTeacher obj=new PhysicsTeacher();
		System.out.println(obj.designation);
		System.out.println(collegename);
		System.out.println(mainSubject);
		obj.does();
	
	}

}
