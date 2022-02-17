package com.nit.model;

public class Book {
	private Integer bookId;
	private String bookName;
	private String status;
	private Float price;
	
	public Book() {
		System.out.println("Book :: 0-param constructor :: "+this.hashCode());
	}
	
	//Getters and Setters
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", status=" + status + ", price=" + price + "]";
	}
}
