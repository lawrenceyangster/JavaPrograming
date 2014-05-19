package com.lawrence;

public class SimpleRunnable extends Thread {
	
	public SimpleRunnable(String threadName)
	{
		super(threadName);
		start();
	}
	
	public void run()
	{
		for(int i= 0; i<10; i++)
		{
			try
			{
				System.out.println("Count = " + i + " from thread " + getName());
				Thread.sleep(400);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread " + getName() + " interrupted");
			}
			
		}
		System.out.println("Thread" + getName() + " dying");
	}
}
