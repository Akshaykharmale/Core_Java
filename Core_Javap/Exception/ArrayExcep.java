package day25_cj_exception;

import java.util.Scanner;

public class ArrayExcep 
{
	int z,res;
	int arr[]={1,2,3,4,5};
	
	public int calculate(int x,int y)
	{
		try {
			z=x/y;
			System.out.println("Result is : "+z);
			try {
				res=arr[z];
				System.out.println("\nElement of Array at position "+z+" is : "+res);
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e);
			}
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println(ae);
		}
		return 0;
	}
	public static void main(String[] args) 
	{	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a=scn.nextInt();
		System.out.println("Enter 2nd number : ");
		int b=scn.nextInt();

		ArrayExcep ae= new ArrayExcep();

		ae.calculate(a,b);
		
		scn.close();
	}

}
