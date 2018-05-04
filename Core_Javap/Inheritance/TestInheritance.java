package day12_cj_Inheritance;

class Animal
{
	void eat()
	{
		System.out.println("eat......");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("bark.......");
	}
}

public class TestInheritance 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}

}
