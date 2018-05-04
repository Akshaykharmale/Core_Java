package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet_Ex 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(5);
		lhs.add(7);
		lhs.add(8);
		lhs.add(7);
		lhs.add(3);
		lhs.add(2);
		lhs.add(null);
		lhs.add(0);
		lhs.add(15);
		lhs.add(null);
		lhs.add(0);
		
		for(Integer i: lhs)
		{
			System.out.println(i);
		}
		System.out.println();
		
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("Akshay");
		ls.add("Sushant");
		ls.add("Rishi");
		ls.add(null);
		ls.add("Sushant");
		ls.add("sujeet");
		ls.add(null);
		
		Iterator<String> itr =ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
