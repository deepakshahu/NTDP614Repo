package com.nit.type;

import java.util.Random;

import com.nit.model.Book;

public class NonFictionalBooks extends BookType {

	@Override
	public void loadBooks() {
		System.out.println("NonFictionalBooks.loadBooks()");
		//Hit the DB s/w and get the books
		for(int i = 1; i <= 5; i++) {
			Book book = new Book();
			book.setBookId(i+1);
			book.setBookName("Book :: "+i);
			book.setStatus("Available");
			book.setPrice(new Random().nextInt(1000)*1.0f);
			getBooksList().add(book);
		}//for
		setType("Non-Fictional");
	}//method
}//class