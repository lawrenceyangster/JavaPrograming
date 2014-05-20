package com.lawrence;

public class ThreadTester {
	public static void testSimpleThread()
	{
		SimpleRunnable thread1 = new SimpleRunnable("tread1");
		SimpleRunnable thread2 = new SimpleRunnable("tread2");
		SimpleRunnable thread3 = new SimpleRunnable("tread3");		
		testMainThread();
		try
		{
			thread1.mThread.join();
			thread2.mThread.join();
			thread3.mThread.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Main thread interrupted");
		}

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
