package com.nit.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nit.model.Book;
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
		//Logic for deep cloning
		BookType cachedBooks = cacheMap.get(type);
		BookType clonedBooks = (BookType) cachedBooks.clone();  //Outer object cloning
		List<Book> clonedList = new ArrayList();  //Inner List collection and its Book object cloning
		for(Book b:cachedBooks.getBooksList()) {
			Book clonedBook = (Book) b.clone();
			clonedList.add(clonedBook);
		}
		//type cloning
		String clonedType = cachedBooks.getType();
		//Set inner cloned object to outer object BookType
		clonedBooks.setBooksList(clonedList);
		clonedBooks.setType(clonedType);
		return clonedBooks;
	}//method
}//class