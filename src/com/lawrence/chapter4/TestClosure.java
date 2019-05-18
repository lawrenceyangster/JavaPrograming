package com.lawrence.chapter4;

import com.lawrence.package1.Book;

public class TestClosure {
    public static void main(String[] args){
        BookHolder[] holders = new BookHolder[10];
        Book[]  books = new Book[10];

        for(int i = 0; i<10; i++){
            books[i] = new Book("author"+i, "publishDate" + i);
            final Book book = books[i];
            holders[i] = ()->{return book;};
            book.setAuthor("author changed");

        }

        for(int j = 0; j<10; j++){
            System.out.println(holders[j].getBook().getAuthor());
        }

    }
}
