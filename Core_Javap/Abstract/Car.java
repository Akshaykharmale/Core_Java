package day17_cj_abstract;

abstract class Vehicle
{
	static
	{
		System.out.println("hello");
	}
	Vehicle(int a)
	{
		System.out.println("Welcome");
	}
	abstract void fuel(); //abstract method
	void speed()
	{
		System.out.println("Vehicle max speed is '220km/hr'");
	}
}

public class Car extends Vehicle
{
	Car()
	{
		super(5);
	}
	void fuel()				//implementation of abstract method
	{

		System.out.println("Fuel type of car is Diesel ");
	}

	void fCapacity()
	{

		System.out.println("Fuel Capacity of car is '40lit'");
	}
	public static void main(String[] args) 
	{
		Vehicle ref=new Car();
		ref.fuel();
		ref.speed();

		Car c=new Car();
		c.fCapacity();
	}

}
