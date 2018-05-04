package multithreading;

class Hii implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Hii");
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Helloo implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Helloo");
		}
	}
}

public class Thread_Implements_Runnable 
{

	public static void main(String[] args) 
	{
		Hii h=new Hii();
		Helloo hh=new Helloo();
		Thread t=new Thread(h);
		t.setName("X");
		t.start();
		
		Thread tt=new Thread(hh);
		tt.start();
		
		System.out.println("Completed");
	}

}
