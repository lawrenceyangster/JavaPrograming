package com.lawrence;

import com.lawrence.package1.Series;
import com.lawrence.package2.TwoBookSeries;
import com.lawrence.sync.TestSumRunnable;
import com.lawrence.sync.TestWaitNotify;
public class Example {
	public static void main(String[] args)
	{
//		DataTypes.intLiterals();
//		DataTypes.binaryLiterals();
//		System.out.println(MoreDataTypes.sum(new int[]{1,2,3}));
//		MoreDataTypes.shift();
//		
//		char array[] = {'a', 'd', 'e', 'b', 'f'};
//		QuickSort.qs(array);
//		System.out.println(array);
//		
//		int[] intArray = {-1, -999, 3000, 12, -135_35};
//		new Outer(intArray).min();
//		
//		Series s = new TwoBookSeries(100);
//		
//		int[] _array = new int[100];
//		
//		s.getArray(_array);
//		
//		for(int i=0; i<_array.length; i++)
//			System.out.println(_array[i]);
//		
//		ThreadTester.testSimpleThread();
//		
//		TestSumRunnable.testSum();
		
		TestWaitNotify.testWaitNotify();
	}
}
