package day25_cj_exception;

public class ExceptionDemo 
{
	int a=10,b=5,c,d,e=0;
	void add()
	{
		d=a/e;
		System.out.println(d);
	}
	void add1()
	{
		try
		{
			System.out.println("a : "+a+"  b : "+b);
			c=a/b;
			System.out.println("Value of c : "+c);
			try{
				add();
			}
			catch (ArrayIndexOutOfBoundsException ae) 
			{
				System.out.println("\n"+ae);
				System.out.println("in d");
			}
		}
		catch (ArithmeticException ae) 
		{
			System.out.println(ae);	
		}
	}
	public static void main(String[] args) 
	{
		ExceptionDemo exd=new ExceptionDemo();
		exd.add1();
	}

}
