package com.lawrence;

public class QuickSort {
	public static void qs(char[] array)
	{
		QuickSort.qs(array, 0, array.length-1);
	}
	private static void qs(char[] array, int left, int right)
	{
		char comparand = array[(left+right)/2];
		
		int leftIndex = left;
		int rightIndex = right;
		do
		{
			while(array[leftIndex]<comparand) leftIndex++;
			while(array[rightIndex]>comparand) rightIndex--;
			
			if(leftIndex< rightIndex)
			{
				char y = array[rightIndex];
				array[rightIndex] = array[leftIndex];
				array[leftIndex] = y;
				leftIndex++;
				rightIndex--;
			}
		}
		while(leftIndex<rightIndex);
		
		if(leftIndex>left) QuickSort.qs(array, left, leftIndex-1);
		
		if(rightIndex<right) QuickSort.qs(array, rightIndex+1, right);
	}
}
