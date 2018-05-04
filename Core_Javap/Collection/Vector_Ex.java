package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Ex 
{

	public static void main(String[] args) 
	{
		Vector<Character> v=new Vector<>();
		v.add('c');
		v.add('d');
		v.add('e');
		v.add('f');
		
		Enumeration<Character> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("----------------------");
		Iterator< Character> c=v.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}

	}

}
