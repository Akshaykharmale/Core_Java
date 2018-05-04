package day25_cj_exception;

public class Test 
{
	void validate(int a, int b) throws ArithmeticException,Exception
	{
		 	int c=a/b;
			System.out.println(c);

	}
	public static void main(String[] args) //throws ArithmeticException,Exception
	{
		Test t=new Test();
		try{
		t.validate(10,0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
