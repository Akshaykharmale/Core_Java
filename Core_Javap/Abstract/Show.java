package day18_cj_abstract;

abstract class Shapes
{
	
	abstract void shape();
	
}

class Rectangle extends Shapes
{
	void shape()
	{
		System.out.println("Shape is \"Rectangle\"");
	}
}

class Square extends Shapes
{
	void shape()
	{
		System.out.println("Shape is \"Square\"");
	}
}

class Circle extends Shapes
{
	void shape()
	{
		System.out.println("Shape is \"Circle\"");
	}
}

public class Show 
{

	public static void main(String[] args) 
	{
		Shapes s;
		s=new Rectangle();
		s.shape();
		
		s=new Square();
		s.shape();
		
		s=new Circle();
		s.shape();
	}

}
