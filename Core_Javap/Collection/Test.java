package collection;
import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(5);
		al.add(1);
		al.add(4);
		al.add(null);
		al.add(null);
		al.add(2);
		
		ListIterator<Integer> li=al.listIterator();
		
		while(li.hasNext())
		{
			li.next();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
