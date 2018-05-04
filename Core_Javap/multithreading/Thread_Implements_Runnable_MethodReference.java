package multithreading;

class Demo implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("HEllo");
		}
	}
	
}

class Demo1 implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("HEllo");
		}
	}
	
}
public class Thread_Implements_Runnable_MethodReference 
{
	
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Thread t=new Thread(d::run);
		t.start();
		
		Demo1 d1=new Demo1();
		Thread t1=new Thread(d1::run);
		t1.start();
		
		System.out.println("completed");
	}

}
