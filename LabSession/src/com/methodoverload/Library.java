package com.methodoverload;

public class Library {
	public static void main(String[] args) {
		Author a1=new Author(101, "RK Narayan");
		Author a2=new Author(102, "Raj Anand");
		
		Book b1=new Book(1, "The Guide", 400, a2);
		Book b2=new Book(2, "Untouchable", 550, a1);
		System.out.println(b1);
		System.out.println(b2);
	}
}
