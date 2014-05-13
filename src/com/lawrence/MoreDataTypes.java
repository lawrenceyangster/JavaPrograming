package com.lawrence;

public class MoreDataTypes {
	public static int sum(int[] array)
	{
		int sum =0;
		
		for(int i: array) sum+=i;
		
		return sum;
	}
}
