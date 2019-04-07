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
			catch(InterruptedException | NullPointerException ex)
			{
				ex.printStackTrace();
			}
		}
		return total;
	}
	public void testContinueWithLabel(){
		final int maxLoop = 10;
		final int breakPoint = 5;
		testLoop: for(int i = 0; i< maxLoop; i++)
		{
			if(i == breakPoint )
				continue testLoop;
			else
				System.out.println(i);
		}
	}
}
