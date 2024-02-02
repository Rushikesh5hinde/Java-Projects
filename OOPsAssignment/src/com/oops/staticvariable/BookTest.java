package com.oops.staticvariable;

import java.util.Scanner;

public class BookTest {
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
		
		System.out.println("Enter discount");
		double disc=sc.nextDouble();
		
		double amount=b1.calDiscount(disc);
		System.out.println(b1);
		
		System.out.println("Amount to pay:"+amount);
		System.out.println("Total Books:"+Book.bookcount);
		
		Book b2=new Book();
		enterBookDetails(b2);
		
		System.out.println("Enter discount");
		double disc1=sc.nextDouble();
		b2.calDiscount(disc1);
		amount=b2.calDiscount(disc1);
		System.out.println(b2);
		System.out.println("Amount to pay:"+amount);
		System.out.println("Total Books:"+Book.bookcount);
		
		b1.compareDiscCost(b2);
		
		
	}
}
