package com.lawrence.sync;

public class SumRunnable implements Runnable {
	private static SumArray sum = new SumArray();
	private int[] array;
	Thread mThread;
	public SumRunnable(String name, int[] array)
	{
		this.array = array;
		mThread = new Thread(this, name);
		mThread.start();
	}
	@Override
	public void run()
	{
		synchronized(sum)
		{
			int total = sum.sum(array);
			System.out.println("Total is " + total + " from thread " + mThread.getName());
		}
	}
}
