package day24_cj_innerclass1;

abstract class Animal
{
	abstract void jump();
	//abstract void name();
}
abstract class Person
{
	abstract void eat(String eat);
	abstract void sleep();
}

public class AnonymousClass 
{

	public static void main(String[] args) 
	{
		(new Animal(){
			void jump()
			{
				System.out.println("In Jump method");
				
			}
			
		}).jump();
		
		/*(new Animal(){
			void name()
			{
				System.out.println("In name method");
			}
		}).name();
		*/
		
		Person p = new Person() {
			void eat(String eat) 
			{
				System.out.println("\nIn eat Method : "+eat);
			}
			void sleep()
			{
				System.out.println("In sleep method");
			}
		};
		p.eat("Pizza");
		p.sleep();
	}

}
