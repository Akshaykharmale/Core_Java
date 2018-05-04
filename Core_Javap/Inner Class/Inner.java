package day24_cj_innerclass1;

abstract public class Inner 
{
	abstract void display();
	
	static class Test
	{
		void show()
		{
			System.out.println("In show method");
		}
	}
	
	static class Demo
	{
		void print()
		{
			System.out.println("In print method");
		}
	}
	
	public static void main(String[] args) 
	{
		new Inner(){
			void display()
			{
				System.out.println("In display method");
			}
		}.display();
		
		Inner.Test i=new Inner.Test();
		i.show();
		
		Inner.Demo td=new Demo();
		td.print();
	}

}
