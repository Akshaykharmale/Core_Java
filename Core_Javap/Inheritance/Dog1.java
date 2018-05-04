package day13_cj_Inheritance_super;

class Animal1
{
	String color="black";
}

public class Dog1 extends Animal1
{
	String color="white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	public static void main(String[] args) 
	{
		Dog1 d=new Dog1();
		d.display();
	}
}
