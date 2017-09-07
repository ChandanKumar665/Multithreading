class NewThread extends Thread
{
	
}

class NewThread2 implements Runnable
{
	public void run()
	{
		System.out.println("This is NewThread2 class which implementts Rnnable"
		+"Interface");
	}
}

class Priority extends Thread
{ 

public void run()
	{
	
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		try
		{
			Thread.sleep(2000);
		}		
			catch(InterruptedException e)
	        {}
		}
	}	
	
	

}

class PriorityDemoMain
{
	public static void main(String[]args)
	{
		NewThread2 nt=new NewThread2();
		Thread t3=new Thread(nt);
		t3.start();
		Priority t=new Priority();
		NewThread t2=new NewThread();
		t2.start();
		Thread.currentThread().setPriority(1);
		t.setPriority(10);
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		t.start();
		for(int i=0;i<=5;i++)
		{
		System.out.println("main thread");
		
		}
		}
	}