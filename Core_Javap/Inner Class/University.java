package day23_cj_innerclass;

public class University 
{
	int i,z=50;
	void print()
	{
		System.out.println("value of z : "+z);
	}

	class Mumbai_Univ
	{
		int j,z=60;
		void print()
		{
			System.out.println("value of z in Mumbai: "+z);
		}

		class Pune
		{
			void show()
			{
				System.out.println("value of z in Pune : "+z);
			}
		}
	}
	public static void main(String[] args) 
	{
		University u=new University();
		u.print();
		u.i=10;
		System.out.println("value of i : "+u.i);

		Mumbai_Univ mu= u.new Mumbai_Univ();
		mu.j=20;
		System.out.println("\nValue of j : "+mu.j);
		mu.print();

		Mumbai_Univ.Pune pu=mu.new Pune();
		pu.show();



	}	

}
