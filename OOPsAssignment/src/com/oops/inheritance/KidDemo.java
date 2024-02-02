package com.oops.inheritance;
class Kid{
	void readBook() {
		System.out.println("provide implementation");
	}
	void readBook(int id,String name) {
		System.out.println(id+" "+name);
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
class Teenager extends Kid{
	@Override
	void readBook() {
		System.out.println("Teenager is reading book");
	}
	@Override
	void readBook(int id,String name) {
		System.out.println(id+" "+name);
	}
}
public class KidDemo {
	public static void main(String[] args) {
		Kid k1;
		k1=new BigKid();
		k1.readBook();
		k1.readBook(1, "aabc");
		
		Kid k2;
		k2=new Teenager();
		k2.readBook();
		k2.readBook(2, "xyz");
	}
}
