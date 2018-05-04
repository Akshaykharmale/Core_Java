package multithreading;
class Apple
{
	int count=0;
	synchronized void add()
	{
		count++;
	}
}

public class SynchronizedEx 
{

	public static void main(String[] args) throws Exception
	{
		Apple a=new Apple();
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				for(int i=1;i<=1000;i++)
				{
					a.add();
				}
				
			}
		});
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() 
			{
				for(int i=1;i<=1000;i++)
				{
					a.add();
				}
				
			}
		});
		t.start();
		t1.start();
		
		t.join();
		t1.join();
			
		System.out.println(a.count);
	}

}
