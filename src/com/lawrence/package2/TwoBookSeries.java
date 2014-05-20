package com.lawrence.package2;

import com.lawrence.package1.Series;

public class TwoBookSeries implements Series{

	private int[] array;
	private int length;
	private int currentIndex=Series.OUT_OF_BOUNDARY;
	
	public TwoBookSeries(int length)
	{
		this.length = length;
		array = new int[length];
		
		for (int i=0; i<length; i++)
			array[i] = i;
	}
	
	public int getNext()
	{
		if(currentIndex == Series.OUT_OF_BOUNDARY)
			return currentIndex;
		
		else
		{
			int ret = array[currentIndex];
			currentIndex = (currentIndex + 1) % length;
			return ret;
		}
	
	}
	public void restart()
	{
		currentIndex=0;
	}
	@Override
	public int setStart(int index)
	{
		if(index<0 || index>length)
			currentIndex = Series.OUT_OF_BOUNDARY;
		else
			currentIndex = index;
		
		return currentIndex;
	}

}
