package collection;

import java.util.ArrayList;

public class ArrayList_Ex 
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(5);
		al.add(6);
		al.add(7);
		al.add("Hello");
		
		System.out.println(al);
		System.out.println();
		
		// 1st way to print data
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		
		al.remove(3);
		al.add(2, "Akshay");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(al);
	}
}
