package com.lawrence.package1;

public interface Series {
	int getNext();
	void restart();
	int setStart(int index);
	int OUT_OF_BOUNDARY = -1;
	
	default void getArray(int[] array)
	{
		restart();
		for(int i=0; i< array.length; i++)
		{
			int j = getNext();
			array[i] = j;
		}
	}
}
