package multithreading;

public class Thread_Implements_Runnable_Lambda 
{
	public static void main(String[] args) 
	{
		Runnable r= () -> { 
			for(int i=0;i<5;i++)
			{
				System.out.println("HEllo");
			}
		};
		
		Runnable r1= () -> {
			for(int i=0;i<5;i++)
			{
				System.out.println("Hii");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		Thread t1= new Thread(r1);
		t1.start();
		
		System.out.println("Completed");
	}
}
