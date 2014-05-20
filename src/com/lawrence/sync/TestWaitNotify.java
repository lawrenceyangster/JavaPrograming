package com.lawrence.sync;

public class TestWaitNotify {
	public static void testWaitNotify()
	{
		int count = 5; // The number of pairs of tick, tock
		
		TickTockRunnable tick = new TickTockRunnable("Tick", 5);
		TickTockRunnable tock = new TickTockRunnable("Tock", 5);
		try
		{
			tick.mThread.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Tick interrupted");
		}
		try
		{
			tock.mThread.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Tock interrupted");
		}
	}
}

class TickTockRunnable implements Runnable
{
	private static TickTock ticktock = new TickTock();
	private int count;
	Thread mThread;
	
	public TickTockRunnable(String name, int occurrence)
	{
		this.count = occurrence;
		mThread = new Thread(this, name);
		mThread.start();
	}
	public void run()
	{
		if(mThread.getName().equals("Tick"))
			ticktock.tick(count);
		
		if(mThread.getName().equals("Tock"))
			ticktock.tock(count);
			
	}
}
class TickTock
{
	private String state;
	
	synchronized void tick(int occurrence)
	{
		for(int i=0; i<occurrence; i++)
		{
			System.out.print(" Tick ");
			state = "ticked";
			notify();
			try
			{
				while(state.compareTo("tocked")!=0)
					wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("!Tick interrupted");
			}
		}
		state = "ticked";
		notify();
		
	}
	
	synchronized void tock(int occurrence)
	{
		for(int i=0; i<occurrence; i++)
		{
			System.out.print(" Tock ");
			state = "tocked";
			notify();
			try
			{
				while(state.compareTo("ticked")!=0)
					wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("!Tock interrupted");
			}
		}	
		state = "tocked";
		notify();
		
	}	
}