package day12_cj_Inheritance;

class University
{
	void university()
	{
		System.out.println("Different Universities");
	}
}

class Mumbai extends University
{
	void mumbai()
	{
		System.out.println("\nMumbai University");
	}
}
	
	class MCollege extends Mumbai
	{
		void sp()
		{
			System.out.println("Welcome to S.P.college");
		}
		void pillai()
		{
			System.out.println("Welcome to Pillai's college");
		}
	}
	
	
class Pune extends University
{
	void pune()
	{
		System.out.println("\nPune University");
	}
}

	class PCollege extends Pune
	{
		void dy()
		{
			System.out.println("Welcome to D.Y.Patil College");
		}
		void vit()
		{
			System.out.println("Welcome to VIT college");
		}
	}
	
public class TestUniversity 
{
	
	public static void main(String[] args) 
	{
		PCollege p=new PCollege();
		p.university();
		p.pune();
		p.dy();
		p.vit();
		
		MCollege m=new MCollege();
		m.mumbai();
		m.sp();
		m.pillai();
		
	}

}
