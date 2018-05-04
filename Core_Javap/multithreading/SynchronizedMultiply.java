package multithreading;

class Multiply
{
	int result;
	synchronized void mul(int a)
	{
		for(int i=1;i<=10;i++)
		{
			result=a*i;
			System.out.println(result);
		}
	}
}
public class SynchronizedMultiply 
{
	public static void main(String[] args) throws Exception
	{
		Multiply m=new Multiply();
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				m.mul(5);
				System.out.println();
			}
		});
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {	
				m.mul(7);
			}
		});
		
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println();
		System.out.println("completed");
	}
}
