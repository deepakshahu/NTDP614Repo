package com.nit.test;

import com.nit.factory.BookFactory;
import com.nit.type.BookType;

public class PrototypeDPTest {

	public static void main(String[] args) {
		try {
			BookType fictionalBooks = BookFactory.getBook("fictional");
			System.out.println(fictionalBooks);
			System.out.println("Count :: "+fictionalBooks.getBooksList().size());
			System.out.println("-------------------------------");
			BookType NonfictionalBooks = BookFactory.getBook("Non-fictional");
			System.out.println(NonfictionalBooks);

			System.out.println("===============================");

			BookType fictionalBooks1 = BookFactory.getBook("fictional");  //cloned object
			//this time loadBooks will not be called because they will collected from cache
			System.out.println(fictionalBooks1);
			System.out.println("-------------------------------");
			BookType NonfictionalBooks1 = BookFactory.getBook("Non-fictional");  //cloned object
			//this time loadBooks will not be called because they will collected from cache
			System.out.println(NonfictionalBooks1);
			
			//Any modification done in original object or cloned object will be reflected to other object
			//because we have taken the support of deep cloning
			fictionalBooks1.getBooksList().remove(2);
			System.out.println("Cloned object data :: "+fictionalBooks1);  //reflects here
			System.out.println("Count :: "+fictionalBooks1.getBooksList().size());  //gives 4
			System.out.println("Original object data :: "+fictionalBooks);  //does not reflects here
			System.out.println("Count :: "+fictionalBooks.getBooksList().size());  //gives 5
		}
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
	}//main
}//class