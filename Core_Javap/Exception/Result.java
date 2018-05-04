package day25_cj_exception;

import java.util.Scanner;

public class Result 
{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks1=scn.nextInt();
		
		System.out.println("Enter the marks : ");
		int marks2=scn.nextInt();
		try
		{
			int result=marks1/marks2;
			System.out.println("Result : "+result);
		}
		catch(Exception a)
		{
			System.out.println("You have entered Zero in marks");
		}
		
		System.out.println("Completed");
		
		scn.close();
	}

}
