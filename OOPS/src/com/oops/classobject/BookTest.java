package com.oops.classobject;

public class BookTest {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setDetails(101, "Java", 300);
		Book b2=new Book();
		b2.setDetails(102, "J2EE", 350);
		Book b3=new Book();
		b3.setDetails(103, "Spring Boot", 550);
		
		b1.showDetails();
		b2.showDetails();
		b3.showDetails();
	}
}
