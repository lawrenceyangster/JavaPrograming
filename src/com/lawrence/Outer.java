package com.lawrence;

public class Outer {
	private int[] array;
	
	public Outer(int[] array)
	{
		this.array = array;
	}
	public void min()
	{
		System.out.println("min value is" + new Inner().min());
	}
	private class Inner
	{
		public int min()
		{
			int minValue = Integer.MAX_VALUE;
			for(int i = 0; i<array.length; i++)
			{
				if(array[i]<minValue)
					minValue = array[i];
			}
			return minValue;
		}
	}
}
