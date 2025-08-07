package com.task3;

import java.util.Scanner;

public class Library {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		User u = new User();
		
		while (flag) {
			System.out.println("==========================");
			System.out.println("   Welcome to E-library");
			System.out.println("   1. View all books");
			System.out.println("   2. Book Issue");
			System.out.println("   3. Return");
			System.out.println("   4. Exit");
			System.out.println("==========================");

			int ch = sc.nextInt();
			
			switch(ch) {
					case 1:	Book.add();
							break;
							
					case 2: u.issue();
							break;
							
					case 3: u.retur();
							break;
							
					case 4: System.out.println("Thank you, visit again...!");
							flag = false;
							break;
							
					default : System.out.println("Please choose in the given options only...");
							break;
			}
		}
		sc.close();
	}
	
	

}
