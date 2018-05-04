package day13_cj_Inheritance_super;

class Vehicle
{
	public void speed()
	{
		System.out.println("Top speed is 140km/hr ");
	}
}
public class Car extends Vehicle 
{	
	public void speed()
	{
		super.speed();
		System.out.println("Max Speed limit is 200km/hr");
	}
	
	public void average()
	{
		System.out.println("Average is 12km/l");
	}
	
	public void fuelCapacity()
	{
		
		System.out.println("Fuel capacity is 50l");
	}
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.speed();
		c.average();
		c.fuelCapacity();
	}

}
