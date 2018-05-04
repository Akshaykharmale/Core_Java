package multithreading;

class Resource
{
	int count=1;
	synchronized public void m() throws Exception
	{
		for(int i=0;i<10;i++)
		{
			count++;
			System.out.println(Thread.currentThread().getName()+" : "+count);
			if(count%2==0)
			{
				wait();
			}
			notify();
		}
	}
}
public class InterThreadCommEx 
{

	public static void main(String[] args) 
	{	
		Resource r=new Resource();
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r.m();
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r.m();
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		t.setName("X");
		t1.setName("Y");

		t.start();
		t1.start();
	}

}
