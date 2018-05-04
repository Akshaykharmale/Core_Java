package day23_cj_innerclass;

public class StaticNestedEx 
{
	int a;
	static int j;
	void test()
	{
		System.out.println("In outer class");
	}
	
	static class Demo
	{
		int i;
		static int z;
		void demo()
		{		
			StaticNestedEx n=new StaticNestedEx();
			n.test();
			
			System.out.println("\nIn inner class");
			System.out.println("value of z : "+z);
			System.out.println("value of i : "+i);
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		StaticNestedEx.Demo n1=new StaticNestedEx.Demo();
		n1.i=20;
		Demo.z=30;
		n1.demo();
	}

}
