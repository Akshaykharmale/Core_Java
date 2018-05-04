package collection;

import java.util.TreeSet;

public class TreeSet_Ex 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Sushant");
		ts.add("Akshay");
		ts.add("Rishi");
		ts.add("Sushant");
		ts.add("Abhijit");
		ts.add(":");
		ts.add(" ");
		ts.add(".");
		ts.add("/");
		ts.add(",");
		ts.add("<");
		ts.add(";");
		ts.add("'");
		//ts.add(null);		//not accepts null values
		for(String i : ts)
		{
			System.out.println(i);
		}

	}
}
