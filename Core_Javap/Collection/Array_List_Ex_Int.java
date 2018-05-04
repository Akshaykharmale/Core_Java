package collection;

import java.util.ArrayList;

public class Array_List_Ex_Int 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		
		al.remove(2);
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		ArrayList<Integer> al1=new ArrayList<>();
		
		al1.addAll(al);

		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println();
		
		al1.add(2,6);
		for(Integer i:al1)
		{
			System.out.println(i);
		}
	}

}
