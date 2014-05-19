package com.lawrence;

public class ThreadTester {
	public static void testSimpleThread()
	{
		Thread thread1 = new Thread(new SimpleRunnable("tread1"));
		
		thread1.start();
		
		testMainThread();
	}
	
	private static void testMainThread()
	{
		for(int i= 0; i<10; i++)
		{
			try
			{
				System.out.println("Count = " + i + " from main thread ");
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Main thread interrupted");
			}
			
		}
		System.out.println("Main Thread dying");
	}
}
