package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Ex 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(8);
		hs.add(9);
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		hs.add(15);
		
		hs.add(48);
		hs.add(0);
		hs.add(16);
		hs.add(17);
		hs.add(64);
		hs.add(32);
		hs.add(31);
		hs.add(20);
		hs.add(null);
		hs.add(144);
		
		/*for(Integer i:hs)
		{
			System.out.println(i);
		}*/
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs);
	}

}
