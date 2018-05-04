package day25_cj_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class TestException extends Exception 
{
	public TestException(String e) 
	{
		super(e);
	}
}

public class User_Exception 
{
	static void validate(int age, String card) throws TestException
	{
		String card1="no";
		if(age < 18 || card==card1)
		{
				throw new TestException("You are Minor");
		}
		else
		{
			System.out.println("You are eligible for voting");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = scn.nextInt();
		
		System.out.println("Do you have voting card ?");
		String card= scn.next();
		
		try {
			validate(age,card);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scn.close();
	}
}

