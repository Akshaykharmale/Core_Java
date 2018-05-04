package multithreading;

public class Thread_Implements_Runnable_Anonymous 
{

	public static void main(String[] args) 
	{
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println("Hey");
				}
			}
		};
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++)
				{
					System.out.println("Bye");
				}				
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		Thread t1=new Thread(r1);
		t1.start();
		System.out.println("Completed");

	}

}
