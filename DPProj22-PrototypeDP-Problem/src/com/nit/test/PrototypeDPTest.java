package com.nit.test;

import com.nit.factory.BookFactory;
import com.nit.type.BookType;

public class PrototypeDPTest {

	public static void main(String[] args) {
		
		BookType fictionalBooks = BookFactory.getBook("fictional");
		System.out.println(fictionalBooks);
		System.out.println("=------------------------------");
		BookType NonfictionalBooks = BookFactory.getBook("Non-fictional");
		System.out.println(NonfictionalBooks);
		
		System.out.println("===============================");
		
		BookType fictionalBooks1 = BookFactory.getBook("fictional");
		System.out.println(fictionalBooks1);
		System.out.println("=------------------------------");
		BookType NonfictionalBooks1 = BookFactory.getBook("Non-fictional");
		System.out.println(NonfictionalBooks1);
	}
}