package com.lawrence;

public class SimpleRunnable implements Runnable {
	private Thread mThread;
	
	public SimpleRunnable(String threadName)
	{
		mThread = new Thread(this, threadName);
		mThread.start();
	}
	
	public void run()
	{
		for(int i= 0; i<10; i++)
		{
			try
			{
				System.out.println("Count = " + i + " from thread " + mThread.getName());
				Thread.sleep(400);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread " + mThread.getName() + " interrupted");
			}
			
		}
		System.out.println("Thread" + mThread.getName() + " dying");
	}
}
