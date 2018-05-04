package day25_cj_exception;

public class Demo 
{
		static void find(int a,int b) throws Exception
		{
			if(b==0)
			{
				throw new ArithmeticException();
			}
			else
			{
				int c=a/b;
				System.out.println(c);
			}
		}
	public static void main(String[] args) 
	{
		try {
			find(10,0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}