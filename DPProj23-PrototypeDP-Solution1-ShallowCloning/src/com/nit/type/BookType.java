//Abstract super class
package com.nit.type;

import java.util.ArrayList;
import java.util.List;

import com.nit.model.Book;

public abstract class BookType implements Cloneable{
	
	public String type;
	public List<Book> booksList = new ArrayList();
	
	public abstract void loadBooks();
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "BookType [type=" + type + ", booksList=" + booksList + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}