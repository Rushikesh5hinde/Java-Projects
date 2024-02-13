package com.lib;

import java.util.Scanner;

public class BookDriver implements Library{
	static Scanner sc=new Scanner(System.in);
	Book[] b=new Book[5];
	int id;
	String name,aname;
	double price;
	int count=0;
	@Override
	public void addBook() {
		System.out.println("Enter no of books you want to add");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			  System.out.println("Enter book id");
			  id=sc.nextInt();
			  System.out.println("Enter book name");
			  name=sc.next();
			  System.out.println("Enter book price");
			  price=sc.nextDouble();
			  System.out.println("Enter book author");
			  aname=sc.next();
			  
			b[count]=new Book(id, name, price, aname);
			count++;
		}
		
	}

	@Override
	public void updateBook() {
		System.out.println("Enter book id you want to update");
		id=sc.nextInt();
		for(int i=0;i<count;i++) {
			if(b[i]!=null && b[i].getBookId()==id) {
				System.out.println("Enter price:");
				price=sc.nextDouble();
				b[i].setBookPrice(price);
			}else {
				System.out.println("id not present");
			}
		}
		
	}

	@Override
	public boolean deleteBook() {
		System.out.println("Enter book id you want to delete");
		id=sc.nextInt();
		boolean flag=false;
		int i;
		for( i=0;i<count;i++) {
			if(b[i]!=null && b[i].getBookId()==id) {
				b[i]=null;
				flag=true;
				break;
			}
		}
		return flag;
		
		
	}

	@Override
	public void searchBookById() {
		System.out.println("Enter book id you want to search");
		id=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<count;i++) {
			if(b[i]!=null && b[i].getBookId()==id) {
				System.out.println(b[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("id not present");
		}
		
	}

	@Override
	public void searchBookByName() {
		System.out.println("Enter book name you want to search");
		name=sc.next();
		boolean flag=false;
		for(int i=0;i<count;i++) {
			if(b[i]!=null && b[i].getBookName().equalsIgnoreCase(name)) {
				System.out.println(b[i]);	
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("name not present");
		}
		
	}

	@Override
	public void showBooks() {
		for(int i=0;i<count;i++) {
			if(b[i]!=null) {
				System.out.println(b[i]);
			}
		}
		
	}

	@Override
	public void exit() {
		System.exit(0);
	}
	
	

}
