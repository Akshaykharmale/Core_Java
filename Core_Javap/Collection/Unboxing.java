package collection;

public class Unboxing 
{
	public static void main(String[] args) 
	{
		Integer i=7;
		System.out.println(i);
		
		int a = i.intValue();
		System.out.println(a);
		
		int b=i;
		System.out.println(b);
		
		System.out.println(i +" "+ a +" "+ b);
		
		Integer i1=10;
		int c=i1;
		System.out.println(c);
	}
}
