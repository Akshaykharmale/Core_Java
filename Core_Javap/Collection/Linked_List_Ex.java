package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_Ex 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(5);
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(null);
		ll.add(5);
		ll.add(null);
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("-------------------------------");
		
		ll.remove(null);
		for(Integer i:ll)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		
		ll.add(3,2);
		ll.addFirst(9);
		ll.addLast(10);
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println(ll);
	}

}
