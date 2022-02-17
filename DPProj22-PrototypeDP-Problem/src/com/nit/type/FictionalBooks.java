package com.nit.type;

import com.nit.model.Book;

public class FictionalBooks extends BookType {

	@Override
	public void loadBooks() {
		//Hit the DB s/w and get the books
		for(int i = 1; i <= 5; i++) {
			Book book = new Book();
			book.setBookId(i+1);
			book.setBookName("Book :: "+i);
			getBooksList().add(book);
		}//for
		setType("Fictional");
	}//method
}//class