package day13_cj_Inheritance_super;

class Animal
{
	Animal(int a,int b)
	{
		System.out.println("Animal is created");
	}
	Animal(float b)
	{
		System.out.println("hiii");
	}
}

class Dog extends Animal
{
	Dog(double a)
	{
		super(5.5f);
		
		System.out.println("Dog is created");
	}
}

public class TestSuper 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Dog d=new Dog(5);
	}

}
