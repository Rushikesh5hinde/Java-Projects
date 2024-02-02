package com.oops.interfacedemo;
interface Movable{
	void move();
}
interface Printable extends Movable{
	void displayMsg();
}
class Printer implements Printable{

	@Override
	public void move() {
		System.out.println("printer is moving at high speed");
		
	}

	@Override
	public void displayMsg() {
		System.out.println("Printer is wifi connected");
		
	}
	
}
class Car implements Movable{

	@Override
	public void move() {
		System.out.println("Car is moving at high speed");
		
	}
	
}
public class ExtendsInterface {
	public static void main(String[] args) {
		Movable m;
		m=new Printer();
		m.move();
		
		m=new Car();
		m.move();
		
		Printable p;
		
		p=new Printer();
		p.move();
		p.displayMsg();
		
//		p=new Car();
	}
}
