package com.lawrence.sync;

public class TestSumRunnable {
	public static void testSum()
	{
		int[] array1 = {1,3,5,7,9};
		int[] array2 = {2,4,6,8,10};
		
		new SumRunnable("thread1", array1);
		new SumRunnable("thread2", array2);
		
	}
}
