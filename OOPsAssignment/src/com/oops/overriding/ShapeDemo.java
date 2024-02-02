package com.oops.overriding;
class Shape{
	void draw() {
		System.out.println("provide implementation");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Rectangle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Square");
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Shape s;
		s=new Circle();
		s.draw();
		
		s=new Square();
		s.draw();
		
		s=new Rectangle();
		s.draw();
	}
}
