package day24_cj_innerclass1;

interface Animal1
{
	void sleep();
}

interface Person1
{
	void eat();
	default void show()
	{
		System.out.println("In show method");
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		(new Animal1() {
			public void sleep()
			{
				System.out.println("In sleep method");
			}
			}).sleep();
	
		
		(new Person1(){
			public void eat()
			{
				System.out.println("In eat method");
				show();
			}
		}).eat();
	}

}
