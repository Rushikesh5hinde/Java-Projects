package com.oops.classobject;

public class Book {
	int bookid;
	String bookName;
	double bookPrice;
	
	public void setDetails(int bid,String bname,double bprice) {
		bookid=bid;
		bookName=bname;
		bookPrice=bprice;
	}
	public void showDetails() {
		System.out.println("Book Id:"+bookid);
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Price:"+bookPrice);
		System.out.println("--------------------------");
	}
}
