package com.oops.inheritance;
interface IceCream{
	void eat();
}
interface Juice{
	void drink();
}
class Mastani implements IceCream,Juice{

	@Override
	public void drink() {
		System.out.println("Drink Mastani!");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat Mastani!");
		
	}
	
}
public class IceCreamDemo {
	public static void main(String[] args) {
		Mastani obj=new Mastani();
		obj.drink();
		obj.eat();
	}
}
