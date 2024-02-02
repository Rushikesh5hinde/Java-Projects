package com.oops.constructor;

public class Book {
	private int bookid;
	private String bookname;
	private double bookprice;
	
	public Book() {
		
	}
	public Book(int bookid,String bookname,double bookprice) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
	}
	public void setBookId(int bookid) {
		this.bookid=bookid;
	}
	public int getBookId() {
		return bookid;
	}
	public void setBookName(String bookname) {
		this.bookname=bookname;
	}
	public String getBookName() {
		return bookname;
	}
	public void setBookPrice(double bookprice) {
		this.bookprice=bookprice;
	}
	public double getBookPrice() {
		return bookprice;
	}
	public String toString() {
		return "Book id:"+bookid+"\nBook Name:"+bookname+"\nBook Price:"+bookprice;
	}
}
