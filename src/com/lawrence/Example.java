package com.lawrence;

import com.lawrence.package1.Book;
import com.lawrence.package2.ThreeBookSeries;
import com.lawrence.enumeration.Transport;
import com.lawrence.general.GenericsDemo;
import com.lawrence.sync.SumArray;

import static com.lawrence.package1.SeasonUtil.*;
import com.lawrence.leetcode.*;

import java.util.ArrayList;
import java.util.List;

import com.lawrence.chapter4.UnboundLamda;
import com.lawrence.chapter4.BoundLamda;

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
//		
//		TestWaitNotify.testWaitNotify();
		
		Transport.testTransportation();
		GenericsDemo.testGen();

		new SumArray().testContinueWithLabel();
		SeasonUtil2 v = new SeasonUtil2();

		ThreeBookSeries series = new ThreeBookSeries();
		series.getNext();

		Object obj = new int[] {1, 2 };

		int[] input = new int[] {2, 7, 11, 15};

		int[] output = new TwoSum().twoSum(input, 9);
		System.out.println(output);

		List<?> unknownList = new ArrayList<>();
		unknownList.add(null);

		List<String> lstStr = new ArrayList<>();
		lstStr.add("hello");

		UnboundLamda labda = Book::getAuthor;
		labda.getAuthor(new Book("Lawrence", "Apr 1st, 2019"));

		BoundLamda bound = System.out::print;
		bound.print(new Book("Lawrence", "Apr 1st, 2019"));
	}
}
