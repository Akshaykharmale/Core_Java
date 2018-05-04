package day17_cj_abstract;

abstract public class Demo
{
	{
		System.out.println("hello...");
	}
	void m()
	{
		System.out.println("hieeee");
	}
	public static void main(String[] args) 
	{
		
		Demo d=new B();
		d.m();
	}

}

class B extends Demo
{
	
}
