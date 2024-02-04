package com.task24012024;
abstract class Book{
	
	protected String name;
	protected String type;
	//tight coupling
	public Book() {
		
	}
	public Book(String name,String type) {
		this.name=name;
		this.type=type;
	}
	//tight coupling
	public void displayBookDetails() {
		System.out.println("Book details");
	}
}
class SpiritualBook extends Book{
	protected double price;
	
	//tight coupling
	public SpiritualBook() {
		
	}
	public SpiritualBook(String name, String type,double price) {
		//tight coupling
		super(name, type);
		this.price=price;
	}
	@Override
	public void displayBookDetails() {
		System.out.println("Book name:"+name);
		System.out.println("Book Type:"+type);
		System.out.println("Price:"+price);
	}
}
public class TightCouplingDemo {
	public static void main(String[] args) {
		Book b;
		b=new SpiritualBook("Ramayana", "Spiritual", 500);
		b.displayBookDetails();
	}
}
