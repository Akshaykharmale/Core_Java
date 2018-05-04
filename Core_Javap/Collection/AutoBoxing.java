package collection;

public class AutoBoxing 
{
	public static void main(String[] args) 
	{
		int a=5;
		System.out.println(a);
		
		Integer b=Integer.valueOf(a);
		System.out.println(b);
		
		Integer c=a;
		System.out.println(c);
		
		System.out.println(a +" "+ b +" "+ c);
		
		Integer d=10;
		System.out.println(d);
	}
}
