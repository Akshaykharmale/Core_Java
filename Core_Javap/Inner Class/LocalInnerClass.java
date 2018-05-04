package day24_cj_innerclass1;

public class LocalInnerClass 
{
	private int i=10;
	void method()
	{	
		System.out.println("in m method");
		int f=50;
		class InnerClass
		{
			void show()
			{
				System.out.println("Local inner class method");
				System.out.println("value of i : "+i);
				System.out.println("value of f : "+f);
			}
			
		}
		InnerClass ic =new InnerClass();
		ic.show();
	}
	public static void main(String[] args) 
	{
		LocalInnerClass lic = new LocalInnerClass();
		lic.method();
	}

}