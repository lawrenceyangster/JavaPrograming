package com.lawrence.sync;

public class SumArray {
	private int total =0 ;
	
	public int sum(int[] array)
	{
		total=0;
		for(int j: array)
		{
			total+=j;
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		return total;
	}
}
