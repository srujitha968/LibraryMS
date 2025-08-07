package com.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	
	private String name;
	private int book_id;
	private String issue_date;
	private String return_date;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	
	List<User> user = new ArrayList<>();
	
	
	public void issue() {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		System.out.println("==========================");
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		u.setName(name);
		
		System.out.println("Enter the id of the book: ");
		int book_id = sc.nextInt();
		u.setBook_id(book_id);
		sc.nextLine();
		
		System.out.println("Enter the date of issue: ");
		String issue = sc.nextLine();
		u.setIssue_date(issue);
		
		user.add(u);
		
		System.out.println("Book issued to "+name +" on "+issue+", you need to submit the book after 30 days.");
		System.out.println();
	}
	
	public void retur() {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		System.out.println("--------------------");
		System.out.println("Enter the user name: ");
		String name = sc.nextLine();
		u.setName(name);
		
		System.out.println("Enter the id of the book: ");
		int id = sc.nextInt();
		u.setBook_id(id);
		sc.nextLine();
		
		System.out.println("Enter the issue date: ");
		String issue = sc.nextLine();
		u.setIssue_date(issue);
		
		System.out.println("Enter the return date: ");
		String re = sc.nextLine();
		u.setReturn_date(re);
		
		user.add(u);
		
		System.out.println("Book returned successfully, Thank you for visiting...!");
		System.out.println();
	}
}
