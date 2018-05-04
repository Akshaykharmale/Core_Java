package day13_cj_Inheritance_super;

class MumbaiUniv
{
	void results()
	{
		System.out.println("Mumabi University result is 75%");
	}
	void dept()
	{
		
		System.out.println("Mechanical \nElectrical \nComputer \nCivil");
	}
}

public class Colleges extends MumbaiUniv
{
	void results()
	{
		super.results();
		System.out.println("Colleges result is 80%");
	}
	
	void dept()
	{
		System.out.println("\nComputer \nCivil \n ");
	}
	
	void fest()
	{
		System.out.println("Fest of Pillai is Allegria");
		
	}
	
	public static void main(String[] args) 
	{
		Colleges c=new Colleges();
		c.results();
		c.dept();
		c.fest();
	}

}
