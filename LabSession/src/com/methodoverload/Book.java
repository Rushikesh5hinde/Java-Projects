package com.methodoverload;

public class Book {
	private int bid;
	private String bname;
	private double price;
	private Author author;
	public Book() {
		
	}
	public Book(int bid,String bname,double price,Author author) {
		this.bid=bid;
		this.bname=bname;
		this.price=price;
		this.author=author;
	}
	public void setBid(int bid) {
		this.bid=bid;
	}
	public int getBid() {
		return bid;
	}
	public void setBname(String bname) {
		this.bname=bname;
	}
	public String getBname() {
		return bname;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public Author getAuthor() {
		return author;
	}
	public String toString() {
		return "Book id"+bid+" Name:"+bname+" Price:"+price+" Author:"+author;
	}
}
