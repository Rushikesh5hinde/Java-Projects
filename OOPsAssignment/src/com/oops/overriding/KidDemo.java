package com.oops.overriding;
class Kid{
	void readBook() {
		
	}
	void readBook(int id,String name) {
		
	}
}
class BigKid extends Kid{
	@Override
	void readBook() {
		System.out.println("Big kid");
	}
	@Override
	void readBook(int id,String name) {
		System.out.println(id+" "+name);
	}
}
public class KidDemo {
	public static void main(String[] args) {
		Kid k;
		k=new BigKid();
		k.readBook();
		k.readBook(1, "aabc");
	}
}
