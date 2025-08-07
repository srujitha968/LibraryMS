package com.task3;

import java.util.List;

public class Book {

	private int id;
	private String book_name;
	private String author;
	
	public Book(int id, String book_name, String author) {
		this.id =id;
		this.book_name =book_name;
		this.author= author;
	}
	
	public Book() {
		
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", author=" + author + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public static void add() {
		List<Book> li = List.of(new Book(101, "Wings Of Fire", "Arun Tiwari"), new Book( 102 , "Atomic Habits", "James Clear"), 
								new Book( 103, "Power of Subconsioucs Mind", "Joseph Murphy"), 
								new Book( 104, "Amma Dairy Lo Konni Pagelu", "Ravi Mantri"), 
								new Book( 105 , "The Courage TO Be Disliked", "Ichiro Kishimi"));
			for(Book b: li) {
				System.out.println(b.toString());
			}
	}
}
