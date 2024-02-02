package com.oops.covarientreturntype;
class Book{
	protected int id;
	protected String type;
	
	public Book() {
		
	}
	public Book(int id,String type) {
		this.id=id;
		this.type=type;
	}
	public Book getBook() {
		return new Book();
	}
}
class SpiritualBook extends Book{
	protected String name;
	protected double price;
	
	public SpiritualBook() {
		
	}
	public SpiritualBook(int id,String type,String name,double price) {
		super(id,type);
		this.name=name;
		this.price=price;
	}
//	@Override
//	public Book getBook() {
//		return new SpiritualBook();
//	}
	@Override
	public SpiritualBook getBook() {
		return new SpiritualBook();
	}
}
public class CovarientDemo1 {
	public static void main(String[] args) {
		SpiritualBook obj=new SpiritualBook();
//		SpiritualBook obj1=(SpiritualBook) obj.getBook();
		SpiritualBook obj1=obj.getBook();	//no need to do type-casting
	}
}
