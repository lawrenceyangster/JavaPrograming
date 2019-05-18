package com.lawrence.package1;

public class Book {
	private String author;
	private String publishDate;
	
	public Book(String author, String publishDate)
	{
		this.author = author;
		this.publishDate = publishDate;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public String getPublishDate()
	{
		return this.publishDate;
	}
	public void setAuthor(String author){
		this.author = author;
	}

}
