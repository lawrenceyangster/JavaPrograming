package com.lawrence;

public class Example {
	public static void main(String[] args)
	{
		DataTypes.intLiterals();
		DataTypes.binaryLiterals();
		System.out.println(MoreDataTypes.sum(new int[]{1,2,3}));
		MoreDataTypes.shift();
		
		char array[] = {'a', 'd', 'e', 'b', 'f'};
		QuickSort.qs(array);
		System.out.println(array);
		
		int[] intArray = {-1, -999, 3000, 12, -135_35};
		new Outer(intArray).min();
	}
}
