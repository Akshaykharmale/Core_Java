package day17_cj_abstract;
abstract class Animation
{
	static
	{
		System.out.println("parent class static block");
	}

	{
		System.out.println("parent class Anonymous block");
	}

	abstract void m();

	void n()
	{
		System.out.println("In n method");
	}

	Animation(int a)
	{
		System.out.println("Parent class constructor");
	}
}

class Batch extends Animation
{
	void m()
	{
		System.out.println("In overrided m method");
	}

	Batch()
	{
		super(5);
		System.out.println("Child class Constructor");
	}

	static
	{
		System.out.println("child class Static block");
	}

	{
		System.out.println("Java");
	}

}
public class Test 
{

	public static void main(String[] args) 
	{
		Animation a=new Batch();
		a.m();
		a.n();

	}

}

