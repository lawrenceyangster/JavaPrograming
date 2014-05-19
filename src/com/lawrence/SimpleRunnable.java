package com.lawrence;

public class SimpleRunnable implements Runnable {
	private String mThreadName;
	
	public SimpleRunnable(String threadName)
	{
		mThreadName = threadName;
	}
	
	public void run()
	{
		for(int i= 0; i<10; i++)
		{
			try
			{
				System.out.println("Count = " + i + " from thread " + mThreadName);
				Thread.sleep(400);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread " + mThreadName + " interrupted");
			}
			
		}
		System.out.println("Thread" + mThreadName + " dying");
	}
}
