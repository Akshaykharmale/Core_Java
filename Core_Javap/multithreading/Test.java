package multithreading;

class Hi extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread());
			System.out.println(this.getName());
		}
	}
}

class Hello extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread());
			System.out.println(this.getName());
		}
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Hi h=new Hi();
		Hello hh=new Hello();
		h.setName("X");
		h.setPriority(1);
		h.start();
		System.out.println(h.isAlive());
		
		try {
			h.join();
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		hh.setName("Y");
		hh.setPriority(10);
		hh.start();
		System.out.println(hh.isAlive());
		
		try {
			hh.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(h.isAlive());
		System.out.println(hh.isAlive());
		System.out.println("Completed");
		
	}

}
