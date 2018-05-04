package day12_cj_Inheritance;

class Animal1
{
	void eat()
	{
		System.out.println("eating......");
	}
}

class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("barking......");
	}
}

class Pug extends Dog1
{
	void pug()
	{
		System.out.println("Vodafone");
	}
}

public class TestInheritance1 
{

	public static void main(String[] args) 
	{
		Pug p=new Pug();
		p.eat();
		p.bark();
		p.pug();
	}

}
