package com.abstractclass;
abstract class Shape{
	
	public abstract void calculateArea();
	
	public abstract void calculatePerimeter();
}
class Circle extends Shape{
	private double radius;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public void calculateArea() {
		double area=3.142*radius*radius;
		System.out.println("Area of circle:"+area);
		
	}
	@Override
	public void calculatePerimeter() {
		double per=2*3.142*radius;
		System.out.println("Perimeter of Circle:"+per);
		
	}
	
}
class Triangle extends Shape{
	protected double height;
	protected double width;
	protected double base;
	public Triangle() {
		
	}
	public Triangle(double height,double width,double base) {
		this.height=height;
		this.width=width;
		this.base=base;
		
	}
	@Override
	public void calculateArea() {
		double area=0.5*height*width;
		System.out.println("Area:"+area);
		
	}
	@Override
	public void calculatePerimeter() {
		double per=height+width+base;
		System.out.println("Perimeter of Triangle:"+per);
	}
}
public class AbstractClassDemo2 {
	public static void main(String[] args) {
		Shape s;
		
		s=new Circle(4);
		
		s.calculateArea();
		s.calculatePerimeter();
		System.out.println("----------------------------------");
		s=new Triangle(2, 3, 5);
		s.calculateArea();
		s.calculatePerimeter();
	}
}
