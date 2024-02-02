package com.oops.staticvariable;

import java.util.Scanner;

public class Library {
	static Scanner sc=new Scanner(System.in);
	public static void enterBookDetails(Book b1) {
		System.out.println("Enter book id");
		b1.setId(sc.nextInt());
		System.out.println("Enter book name:");
		b1.setName(sc.next());
		System.out.println("Enter price:");
		b1.setPrice(sc.nextDouble());
		System.out.println("Enter category:");
		b1.setCategory(sc.next());
		
	}
	public static void main(String[] args) {
		Book b1=new Book();
		enterBookDetails(b1);
		
		Book b2=new Book();
		enterBookDetails(b2);
		System.out.println("Supplier Name:"+Book.supplier);
		System.out.println("Total Books:"+Book.bookcount);
		System.out.println(b1);
		System.out.println(b2);
	}
}
