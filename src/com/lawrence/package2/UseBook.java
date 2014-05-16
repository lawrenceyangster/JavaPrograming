package com.lawrence.package2;
import com.lawrence.package1.Book;
public class UseBook {
	public static void useBook()
	{
		Book b1 = new Book("Bible", "1-1-1");
		System.out.println("Author:" + b1.getAuthor()+ " Publish Date:" + b1.getPublishDate());
	}
}
