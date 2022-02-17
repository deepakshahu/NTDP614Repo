package com.nit.factory;

import java.util.HashMap;
import java.util.Map;

import com.nit.type.BookType;
import com.nit.type.FictionalBooks;
import com.nit.type.NonFictionalBooks;

public class BookFactory {
	private static Map<String,BookType> cacheMap = new HashMap();
	static {
		BookType fictionalBooks = new FictionalBooks();
		fictionalBooks.loadBooks();
		BookType non_fictionalBooks = new NonFictionalBooks();
		non_fictionalBooks.loadBooks();
		cacheMap.put("fictional", fictionalBooks);
		cacheMap.put("Non-fictional", non_fictionalBooks);
	}
	
	public static BookType getBook(String type) throws CloneNotSupportedException {
		BookType clonedBooks = (BookType) cacheMap.get(type).clone();  //shallow cloning
		return clonedBooks;
	}//method
}//class