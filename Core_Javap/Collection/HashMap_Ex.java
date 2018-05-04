package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_Ex {

	public static void main(String[] args) 
	{
		Map<Integer, String> hm=new HashMap<>();
		hm.put(1,"Akshay");
		hm.put(2, "Sushant");
		hm.put(3, "Rishi");
		hm.put(4, "Sujeet");
		hm.put(5, "Abhijit");
		
		Iterator<Map.Entry<Integer, String>> itr =hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println(hm);
		System.out.println();
		for(Entry<Integer, String> i : hm.entrySet())
		{
			System.out.println(i.getKey()+ " "+i.getValue());
		}
		
		
	}

}
