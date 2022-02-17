package com.nit.factory;

import com.nit.type.BookType;
import com.nit.type.FictionalBooks;
import com.nit.type.NonFictionalBooks;

public class BookFactory {
	
	public static BookType getBook(String type) {
		BookType bType = null;
		if(type.equalsIgnoreCase("fictional")) {
			bType = new FictionalBooks();
			bType.loadBooks();
		}
		else if(type.equalsIgnoreCase("Non-Fictional")) {
			bType = new NonFictionalBooks();
			bType.loadBooks();
		}
		else
			throw new IllegalArgumentException("Invalid Book type");
		
		return bType;
	}//method
}//class