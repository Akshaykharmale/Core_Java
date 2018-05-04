package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Int 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(null);
		al.add(null);
		al.add(5);
		
		//for loop : 1st way to print data of arrayList
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		
		//Iterator : 2nd way to print data of arrayList  
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		
		
		//Enhanced for loop/for each loop : 3rd way to print data of arrayList
		for(Integer i: al)
		{
			System.out.println(i);
		}
		System.out.println();
		
		
		//ListIterator : 4th way to print data of arrayList
		ListIterator<Integer> li=al.listIterator();
		while(li.hasNext())		//first you have to traverse in forward direction coz cursor is at -1 position
		{
			li.next();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}