package com.lawrence.package2;

import com.lawrence.package1.Series;
import com.lawrence.package1.Book;

public class TwoBookSeries implements Series{

	private Book book1 = new Book("author1", "publish date1");
	private Book book2 = new Book("author2", "publish date2");
	private int currentIndex=Series.OUT_OF_BOUNDARY;
	
	public int getNext()
	{
		if(currentIndex == Series.OUT_OF_BOUNDARY)
			return currentIndex;
		
		else
			return (currentIndex+1)%2;
		
	
	}
	public void restart()
	{
		currentIndex=0;
	}
	public int setStart(int index)
	{
		if(index<0 || index>1)
			currentIndex =  Series.OUT_OF_BOUNDARY;
		else
			currentIndex = index;
		
		return currentIndex;
		
	}
}
