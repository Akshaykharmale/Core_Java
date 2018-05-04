package collection;

import java.util.ArrayDeque;

public class ArrayDeque_Ex 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(5);
		ad.add(7);
		ad.add(2);
		ad.add(9);
		ad.add(2);
		ad.add(77);
		//ad.addFirst(10);
		ad.add(5);
		
		ad.add(2);		//allows duplicates
		//ad.addLast(11);
		//ad.add(null); //no null values
		System.out.println(ad);
		
		ad.removeFirst();
		System.out.println(ad);
		
		ad.removeLast();
		System.out.println(ad);
		
		ad.removeFirstOccurrence(2);
		System.out.println(ad);
		
		ad.removeLastOccurrence(5);
		System.out.println(ad);
		
		System.out.println();
		System.out.println(ad.remove(7 ));
		System.out.println(ad);
		System.out.println(ad.remove());
	}
}
